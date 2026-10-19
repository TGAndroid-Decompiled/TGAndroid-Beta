package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class al extends org.telegram.ui.Components.oc0 {
    public final qn H;

    public al(qn qnVar, Context context, qn qnVar2, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.kc0 kc0Var, int i11, boolean z10) {
        super(context, qnVar2, bVar, messagePreviewParams, user, chat, i10, kc0Var, i11, z10);
        this.H = qnVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        gn gnVar;
        qn qnVar = this.H;
        gn gnVar2 = qnVar.f40755l5;
        if (gnVar2 != null && (messageObject = gnVar2.f37377a) != null && ((gnVar = qnVar.f40684f5.quote) == null || gnVar.f37377a == null || messageObject.getId() == qnVar.f40684f5.quote.f37377a.getId())) {
            return;
        }
        qnVar.f40755l5 = qnVar.f40684f5.quote;
    }

    @Override
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        long peerDialogId;
        int i11;
        MessagePreviewParams.Messages messages;
        int i12 = 0;
        a(false);
        qn qnVar = this.H;
        MessagePreviewParams messagePreviewParams = qnVar.f40684f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                qnVar.f40767m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = qnVar.f40684f5.forwardMessages.messages.get(i13);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            if (messageObject.isPublicPoll()) {
                                i10 = 2;
                            } else {
                                i10 = 1;
                            }
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    qnVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle d = org.telegram.messenger.lk.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", !z10);
            if (!z10 && (messages = qnVar.f40684f5.replyMessage) != null && !messages.messages.isEmpty() && qnVar.f40684f5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            d.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(qnVar.f40684f5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != qnVar.a() && peerDialogId != qnVar.getUserConfig().getClientUserId() && i11 > 0) {
                d.putLong("reply_to_author", peerDialogId);
            }
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = qnVar.f40684f5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            d.putInt("messagesCount", i12);
            d.putBoolean("canSelectTopics", true);
            cy cyVar = new cy(d);
            cyVar.C2 = qnVar;
            qnVar.presentFragment(cyVar);
        }
    }
}
