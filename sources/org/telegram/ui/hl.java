package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class hl extends org.telegram.ui.Components.xb0 {
    public final zn E;

    public hl(zn znVar, Context context, zn znVar2, ng.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.tb0 tb0Var, int i11, boolean z4) {
        super(context, znVar2, aVar, messagePreviewParams, user, chat, i10, tb0Var, i11, z4);
        this.E = znVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        pn pnVar;
        zn znVar = this.E;
        pn pnVar2 = znVar.f40618i5;
        if (pnVar2 != null && (messageObject = pnVar2.f37189a) != null && ((pnVar = znVar.f40542c5.quote) == null || pnVar.f37189a == null || messageObject.getId() == znVar.f40542c5.quote.f37189a.getId())) {
            return;
        }
        znVar.f40618i5 = znVar.f40542c5.quote;
    }

    @Override
    public final void c(boolean z4) {
        int i10;
        boolean z10;
        boolean z11;
        long peerDialogId;
        int i11;
        MessagePreviewParams.Messages messages;
        int i12 = 0;
        a(false);
        zn znVar = this.E;
        MessagePreviewParams messagePreviewParams = znVar.f40542c5;
        if (messagePreviewParams != null) {
            if (!z4) {
                znVar.f40630j5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z10 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = znVar.f40542c5.forwardMessages.messages.get(i13);
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
                        z10 = true;
                    }
                    znVar.T5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z10 = false;
            }
            Bundle e = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z4);
            if (!z4 && (messages = znVar.f40542c5.replyMessage) != null && !messages.messages.isEmpty() && znVar.f40542c5.quote == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            e.putBoolean("reply_to", z11);
            if (z11 && (DialogObject.getPeerDialogId(znVar.f40542c5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != znVar.a() && peerDialogId != znVar.getUserConfig().getClientUserId() && i11 > 0) {
                e.putLong("reply_to_author", peerDialogId);
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z10);
            MessagePreviewParams.Messages messages3 = znVar.f40542c5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            e.putInt("messagesCount", i12);
            e.putBoolean("canSelectTopics", true);
            qy qyVar = new qy(e);
            qyVar.f37649z2 = znVar;
            znVar.presentFragment(qyVar);
        }
    }
}
