package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class cl extends org.telegram.ui.Components.oc0 {
    public final sn H;

    public cl(sn snVar, Context context, sn snVar2, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.kc0 kc0Var, int i11, boolean z10) {
        super(context, snVar2, bVar, messagePreviewParams, user, chat, i10, kc0Var, i11, z10);
        this.H = snVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        in inVar;
        sn snVar = this.H;
        in inVar2 = snVar.f41271l5;
        if (inVar2 != null && (messageObject = inVar2.f37919a) != null && ((inVar = snVar.f41200f5.quote) == null || inVar.f37919a == null || messageObject.getId() == snVar.f41200f5.quote.f37919a.getId())) {
            return;
        }
        snVar.f41271l5 = snVar.f41200f5.quote;
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
        sn snVar = this.H;
        MessagePreviewParams messagePreviewParams = snVar.f41200f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                snVar.f41283m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = snVar.f41200f5.forwardMessages.messages.get(i13);
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
                    snVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle d = org.telegram.messenger.lk.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", !z10);
            if (!z10 && (messages = snVar.f41200f5.replyMessage) != null && !messages.messages.isEmpty() && snVar.f41200f5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            d.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(snVar.f41200f5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != snVar.a() && peerDialogId != snVar.getUserConfig().getClientUserId() && i11 > 0) {
                d.putLong("reply_to_author", peerDialogId);
            }
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = snVar.f41200f5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            d.putInt("messagesCount", i12);
            d.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(d);
            eyVar.C2 = snVar;
            snVar.presentFragment(eyVar);
        }
    }
}
