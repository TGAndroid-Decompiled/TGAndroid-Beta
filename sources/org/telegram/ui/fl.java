package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class fl extends org.telegram.ui.Components.ub0 {
    public final xn H;

    public fl(xn xnVar, Context context, xn xnVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.qb0 qb0Var, int i11, boolean z10) {
        super(context, xnVar2, cVar, messagePreviewParams, user, chat, i10, qb0Var, i11, z10);
        this.H = xnVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        nn nnVar;
        xn xnVar = this.H;
        nn nnVar2 = xnVar.f39449l5;
        if (nnVar2 != null && (messageObject = nnVar2.f35557a) != null && ((nnVar = xnVar.f39378f5.quote) == null || nnVar.f35557a == null || messageObject.getId() == xnVar.f39378f5.quote.f35557a.getId())) {
            return;
        }
        xnVar.f39449l5 = xnVar.f39378f5.quote;
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
        xn xnVar = this.H;
        MessagePreviewParams messagePreviewParams = xnVar.f39378f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                xnVar.f39461m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = xnVar.f39378f5.forwardMessages.messages.get(i13);
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
                    xnVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e = org.telegram.messenger.z0.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z10);
            if (!z10 && (messages = xnVar.f39378f5.replyMessage) != null && !messages.messages.isEmpty() && xnVar.f39378f5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            e.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(xnVar.f39378f5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != xnVar.a() && peerDialogId != xnVar.getUserConfig().getClientUserId() && i11 > 0) {
                e.putLong("reply_to_author", peerDialogId);
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = xnVar.f39378f5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            e.putInt("messagesCount", i12);
            e.putBoolean("canSelectTopics", true);
            ry ryVar = new ry(e);
            ryVar.C2 = xnVar;
            xnVar.presentFragment(ryVar);
        }
    }
}
