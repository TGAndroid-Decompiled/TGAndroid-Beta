package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class cl extends org.telegram.ui.Components.nc0 {
    public final un H;

    public cl(un unVar, Context context, un unVar2, ch.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.jc0 jc0Var, int i11, boolean z10) {
        super(context, unVar2, bVar, messagePreviewParams, user, chat, i10, jc0Var, i11, z10);
        this.H = unVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        kn knVar;
        un unVar = this.H;
        kn knVar2 = unVar.f44473x5;
        if (knVar2 != null && (messageObject = knVar2.f40976a) != null && ((knVar = unVar.f44394r5.quote) == null || knVar.f40976a == null || messageObject.getId() == unVar.f44394r5.quote.f40976a.getId())) {
            return;
        }
        unVar.f44473x5 = unVar.f44394r5.quote;
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
        un unVar = this.H;
        MessagePreviewParams messagePreviewParams = unVar.f44394r5;
        if (messagePreviewParams != null) {
            if (!z10) {
                unVar.f44485y5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = unVar.f44394r5.forwardMessages.messages.get(i13);
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
                    unVar.f44285i6[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle c10 = org.telegram.messenger.vh.c(3, "onlySelect", "dialogsType", true);
            c10.putBoolean("quote", !z10);
            if (!z10 && (messages = unVar.f44394r5.replyMessage) != null && !messages.messages.isEmpty() && unVar.f44394r5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            c10.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(unVar.f44394r5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != unVar.a() && peerDialogId != unVar.getUserConfig().getClientUserId() && i11 > 0) {
                c10.putLong("reply_to_author", peerDialogId);
            }
            c10.putInt("hasPoll", i10);
            c10.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = unVar.f44394r5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            c10.putInt("messagesCount", i12);
            c10.putBoolean("canSelectTopics", true);
            cy cyVar = new cy(c10);
            cyVar.C2 = unVar;
            unVar.presentFragment(cyVar);
        }
    }
}
