package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class il extends org.telegram.ui.Components.wb0 {
    public final co H;

    public il(co coVar, Context context, co coVar2, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.sb0 sb0Var, int i11, boolean z10) {
        super(context, coVar2, bVar, messagePreviewParams, user, chat, i10, sb0Var, i11, z10);
        this.H = coVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        sn snVar;
        co coVar = this.H;
        sn snVar2 = coVar.f35353l5;
        if (snVar2 != null && (messageObject = snVar2.f40504a) != null && ((snVar = coVar.f35282f5.quote) == null || snVar.f40504a == null || messageObject.getId() == coVar.f35282f5.quote.f40504a.getId())) {
            return;
        }
        coVar.f35353l5 = coVar.f35282f5.quote;
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
        co coVar = this.H;
        MessagePreviewParams messagePreviewParams = coVar.f35282f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                coVar.f35365m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = coVar.f35282f5.forwardMessages.messages.get(i13);
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
                    coVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e7 = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
            e7.putBoolean("quote", !z10);
            if (!z10 && (messages = coVar.f35282f5.replyMessage) != null && !messages.messages.isEmpty() && coVar.f35282f5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            e7.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(coVar.f35282f5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != coVar.a() && peerDialogId != coVar.getUserConfig().getClientUserId() && i11 > 0) {
                e7.putLong("reply_to_author", peerDialogId);
            }
            e7.putInt("hasPoll", i10);
            e7.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = coVar.f35282f5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            e7.putInt("messagesCount", i12);
            e7.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(e7);
            uyVar.C2 = coVar;
            coVar.presentFragment(uyVar);
        }
    }
}
