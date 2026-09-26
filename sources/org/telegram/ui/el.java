package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class el extends org.telegram.ui.Components.fc0 {
    public final wn H;

    public el(wn wnVar, Context context, wn wnVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.bc0 bc0Var, int i11, boolean z10) {
        super(context, wnVar2, cVar, messagePreviewParams, user, chat, i10, bc0Var, i11, z10);
        this.H = wnVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        mn mnVar;
        wn wnVar = this.H;
        mn mnVar2 = wnVar.f39548l5;
        if (mnVar2 != null && (messageObject = mnVar2.f35624a) != null && ((mnVar = wnVar.f39477f5.quote) == null || mnVar.f35624a == null || messageObject.getId() == wnVar.f39477f5.quote.f35624a.getId())) {
            return;
        }
        wnVar.f39548l5 = wnVar.f39477f5.quote;
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
        wn wnVar = this.H;
        MessagePreviewParams messagePreviewParams = wnVar.f39477f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                wnVar.f39560m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = wnVar.f39477f5.forwardMessages.messages.get(i13);
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
                    wnVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e = org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z10);
            if (!z10 && (messages = wnVar.f39477f5.replyMessage) != null && !messages.messages.isEmpty() && wnVar.f39477f5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            e.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(wnVar.f39477f5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != wnVar.a() && peerDialogId != wnVar.getUserConfig().getClientUserId() && i11 > 0) {
                e.putLong("reply_to_author", peerDialogId);
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = wnVar.f39477f5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            e.putInt("messagesCount", i12);
            e.putBoolean("canSelectTopics", true);
            qy qyVar = new qy(e);
            qyVar.C2 = wnVar;
            wnVar.presentFragment(qyVar);
        }
    }
}
