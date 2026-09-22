package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class il extends org.telegram.ui.Components.vb0 {
    public final bo H;

    public il(bo boVar, Context context, bo boVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.rb0 rb0Var, int i11, boolean z10) {
        super(context, boVar2, cVar, messagePreviewParams, user, chat, i10, rb0Var, i11, z10);
        this.H = boVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        rn rnVar;
        bo boVar = this.H;
        rn rnVar2 = boVar.f32372l5;
        if (rnVar2 != null && (messageObject = rnVar2.f37171a) != null && ((rnVar = boVar.f32301f5.quote) == null || rnVar.f37171a == null || messageObject.getId() == boVar.f32301f5.quote.f37171a.getId())) {
            return;
        }
        boVar.f32372l5 = boVar.f32301f5.quote;
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
        bo boVar = this.H;
        MessagePreviewParams messagePreviewParams = boVar.f32301f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                boVar.f32384m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = boVar.f32301f5.forwardMessages.messages.get(i13);
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
                    boVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e = org.telegram.messenger.y0.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z10);
            if (!z10 && (messages = boVar.f32301f5.replyMessage) != null && !messages.messages.isEmpty() && boVar.f32301f5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            e.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(boVar.f32301f5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != boVar.a() && peerDialogId != boVar.getUserConfig().getClientUserId() && i11 > 0) {
                e.putLong("reply_to_author", peerDialogId);
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = boVar.f32301f5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            e.putInt("messagesCount", i12);
            e.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(e);
            uyVar.C2 = boVar;
            boVar.presentFragment(uyVar);
        }
    }
}
