package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class fl extends org.telegram.ui.Components.yb0 {
    public final xn E;

    public fl(xn xnVar, Context context, xn xnVar2, og.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.ub0 ub0Var, int i11, boolean z4) {
        super(context, xnVar2, aVar, messagePreviewParams, user, chat, i10, ub0Var, i11, z4);
        this.E = xnVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        nn nnVar;
        xn xnVar = this.E;
        nn nnVar2 = xnVar.f43199i5;
        if (nnVar2 != null && (messageObject = nnVar2.f39405a) != null && ((nnVar = xnVar.f43122c5.quote) == null || nnVar.f39405a == null || messageObject.getId() == xnVar.f43122c5.quote.f39405a.getId())) {
            return;
        }
        xnVar.f43199i5 = xnVar.f43122c5.quote;
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
        xn xnVar = this.E;
        MessagePreviewParams messagePreviewParams = xnVar.f43122c5;
        if (messagePreviewParams != null) {
            if (!z4) {
                xnVar.f43211j5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z10 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = xnVar.f43122c5.forwardMessages.messages.get(i13);
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
                    xnVar.T5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z10 = false;
            }
            Bundle e6 = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
            e6.putBoolean("quote", !z4);
            if (!z4 && (messages = xnVar.f43122c5.replyMessage) != null && !messages.messages.isEmpty() && xnVar.f43122c5.quote == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            e6.putBoolean("reply_to", z11);
            if (z11 && (DialogObject.getPeerDialogId(xnVar.f43122c5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != xnVar.a() && peerDialogId != xnVar.getUserConfig().getClientUserId() && i11 > 0) {
                e6.putLong("reply_to_author", peerDialogId);
            }
            e6.putInt("hasPoll", i10);
            e6.putBoolean("hasInvoice", z10);
            MessagePreviewParams.Messages messages3 = xnVar.f43122c5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            e6.putInt("messagesCount", i12);
            e6.putBoolean("canSelectTopics", true);
            py pyVar = new py(e6);
            pyVar.f40278z2 = xnVar;
            xnVar.presentFragment(pyVar);
        }
    }
}
