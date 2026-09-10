package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class kl extends org.telegram.ui.Components.ec0 {
    public final eo H;

    public kl(eo eoVar, Context context, eo eoVar2, zg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.ac0 ac0Var, int i11, boolean z10) {
        super(context, eoVar2, aVar, messagePreviewParams, user, chat, i10, ac0Var, i11, z10);
        this.H = eoVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        tn tnVar;
        eo eoVar = this.H;
        tn tnVar2 = eoVar.f32395l5;
        if (tnVar2 != null && (messageObject = tnVar2.f36967a) != null && ((tnVar = eoVar.f32324f5.quote) == null || tnVar.f36967a == null || messageObject.getId() == eoVar.f32324f5.quote.f36967a.getId())) {
            return;
        }
        eoVar.f32395l5 = eoVar.f32324f5.quote;
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
        MessagePreviewParams messagePreviewParams = eoVar.f32324f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                eoVar.f32407m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = eoVar.f32324f5.forwardMessages.messages.get(i13);
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
            Bundle e = org.telegram.messenger.a2.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z10);
            if (!z10 && (messages = eoVar.f32324f5.replyMessage) != null && !messages.messages.isEmpty() && eoVar.f32324f5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            e.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(eoVar.f32324f5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != eoVar.a() && peerDialogId != eoVar.getUserConfig().getClientUserId() && i11 > 0) {
                e.putLong("reply_to_author", peerDialogId);
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = eoVar.f32324f5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            e.putInt("messagesCount", i12);
            e.putBoolean("canSelectTopics", true);
            wy wyVar = new wy(e);
            wyVar.C2 = eoVar;
            eoVar.presentFragment(wyVar);
        }
    }
}
