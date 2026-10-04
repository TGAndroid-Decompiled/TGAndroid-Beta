package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class el extends org.telegram.ui.Components.ic0 {
    public final yn H;

    public el(yn ynVar, Context context, yn ynVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.ec0 ec0Var, int i11, boolean z10) {
        super(context, ynVar2, cVar, messagePreviewParams, user, chat, i10, ec0Var, i11, z10);
        this.H = ynVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        on onVar;
        yn ynVar = this.H;
        on onVar2 = ynVar.f43381j5;
        if (onVar2 != null && (messageObject = onVar2.f39236a) != null && ((onVar = ynVar.f43307d5.quote) == null || onVar.f39236a == null || messageObject.getId() == ynVar.f43307d5.quote.f39236a.getId())) {
            return;
        }
        ynVar.f43381j5 = ynVar.f43307d5.quote;
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
        yn ynVar = this.H;
        MessagePreviewParams messagePreviewParams = ynVar.f43307d5;
        if (messagePreviewParams != null) {
            if (!z10) {
                ynVar.f43394k5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = ynVar.f43307d5.forwardMessages.messages.get(i13);
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
                    ynVar.U5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e7 = org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true);
            e7.putBoolean("quote", !z10);
            if (!z10 && (messages = ynVar.f43307d5.replyMessage) != null && !messages.messages.isEmpty() && ynVar.f43307d5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            e7.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(ynVar.f43307d5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != ynVar.a() && peerDialogId != ynVar.getUserConfig().getClientUserId() && i11 > 0) {
                e7.putLong("reply_to_author", peerDialogId);
            }
            e7.putInt("hasPoll", i10);
            e7.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = ynVar.f43307d5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            e7.putInt("messagesCount", i12);
            e7.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(e7);
            uyVar.C2 = ynVar;
            ynVar.presentFragment(uyVar);
        }
    }
}
