package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class nl extends org.telegram.ui.Components.zc0 {
    public final eo H;

    public nl(eo eoVar, Context context, eo eoVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.vc0 vc0Var, int i11, boolean z10) {
        super(context, eoVar2, cVar, messagePreviewParams, user, chat, i10, vc0Var, i11, z10);
        this.H = eoVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        tn tnVar;
        eo eoVar = this.H;
        tn tnVar2 = eoVar.f37330l5;
        if (tnVar2 != null && (messageObject = tnVar2.f42242a) != null && ((tnVar = eoVar.f37259f5.quote) == null || tnVar.f42242a == null || messageObject.getId() == eoVar.f37259f5.quote.f42242a.getId())) {
            return;
        }
        eoVar.f37330l5 = eoVar.f37259f5.quote;
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
        eo eoVar = this.H;
        MessagePreviewParams messagePreviewParams = eoVar.f37259f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                eoVar.f37342m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = eoVar.f37259f5.forwardMessages.messages.get(i13);
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
                    eoVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e7 = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
            e7.putBoolean("quote", !z10);
            if (!z10 && (messages = eoVar.f37259f5.replyMessage) != null && !messages.messages.isEmpty() && eoVar.f37259f5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            e7.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(eoVar.f37259f5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != eoVar.a() && peerDialogId != eoVar.getUserConfig().getClientUserId() && i11 > 0) {
                e7.putLong("reply_to_author", peerDialogId);
            }
            e7.putInt("hasPoll", i10);
            e7.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = eoVar.f37259f5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            e7.putInt("messagesCount", i12);
            e7.putBoolean("canSelectTopics", true);
            vy vyVar = new vy(e7);
            vyVar.C2 = eoVar;
            eoVar.presentFragment(vyVar);
        }
    }
}
