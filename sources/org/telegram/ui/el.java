package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class el extends org.telegram.ui.Components.oc0 {
    public final wn H;

    public el(wn wnVar, Context context, wn wnVar2, ch.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.kc0 kc0Var, int i11, boolean z10) {
        super(context, wnVar2, bVar, messagePreviewParams, user, chat, i10, kc0Var, i11, z10);
        this.H = wnVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        mn mnVar;
        wn wnVar = this.H;
        mn mnVar2 = wnVar.B5;
        if (mnVar2 != null && (messageObject = mnVar2.f41477a) != null && ((mnVar = wnVar.f45317v5.quote) == null || mnVar.f41477a == null || messageObject.getId() == wnVar.f45317v5.quote.f41477a.getId())) {
            return;
        }
        wnVar.B5 = wnVar.f45317v5.quote;
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
        MessagePreviewParams messagePreviewParams = wnVar.f45317v5;
        if (messagePreviewParams != null) {
            if (!z10) {
                wnVar.C5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = wnVar.f45317v5.forwardMessages.messages.get(i13);
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
                    wnVar.f45203m6[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle c10 = org.telegram.messenger.wh.c(3, "onlySelect", "dialogsType", true);
            c10.putBoolean("quote", !z10);
            if (!z10 && (messages = wnVar.f45317v5.replyMessage) != null && !messages.messages.isEmpty() && wnVar.f45317v5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            c10.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(wnVar.f45317v5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != wnVar.a() && peerDialogId != wnVar.getUserConfig().getClientUserId() && i11 > 0) {
                c10.putLong("reply_to_author", peerDialogId);
            }
            c10.putInt("hasPoll", i10);
            c10.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = wnVar.f45317v5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            c10.putInt("messagesCount", i12);
            c10.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(c10);
            eyVar.C2 = wnVar;
            wnVar.presentFragment(eyVar);
        }
    }
}
