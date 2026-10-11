package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class jl extends org.telegram.ui.Components.wc0 {
    public final zn H;

    public jl(zn znVar, Context context, zn znVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.sc0 sc0Var, int i11, boolean z10) {
        super(context, znVar2, cVar, messagePreviewParams, user, chat, i10, sc0Var, i11, z10);
        this.H = znVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        pn pnVar;
        zn znVar = this.H;
        pn pnVar2 = znVar.f44841l5;
        if (pnVar2 != null && (messageObject = pnVar2.f40912a) != null && ((pnVar = znVar.f44770f5.quote) == null || pnVar.f40912a == null || messageObject.getId() == znVar.f44770f5.quote.f40912a.getId())) {
            return;
        }
        znVar.f44841l5 = znVar.f44770f5.quote;
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
        zn znVar = this.H;
        MessagePreviewParams messagePreviewParams = znVar.f44770f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                znVar.f44853m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = znVar.f44770f5.forwardMessages.messages.get(i13);
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
                    znVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle d = org.telegram.messenger.ai.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", !z10);
            if (!z10 && (messages = znVar.f44770f5.replyMessage) != null && !messages.messages.isEmpty() && znVar.f44770f5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            d.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(znVar.f44770f5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != znVar.a() && peerDialogId != znVar.getUserConfig().getClientUserId() && i11 > 0) {
                d.putLong("reply_to_author", peerDialogId);
            }
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = znVar.f44770f5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            d.putInt("messagesCount", i12);
            d.putBoolean("canSelectTopics", true);
            sy syVar = new sy(d);
            syVar.C2 = znVar;
            znVar.presentFragment(syVar);
        }
    }
}
