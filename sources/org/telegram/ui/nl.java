package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class nl extends org.telegram.ui.Components.vc0 {
    public final fo H;

    public nl(fo foVar, Context context, fo foVar2, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.rc0 rc0Var, int i11, boolean z10) {
        super(context, foVar2, bVar, messagePreviewParams, user, chat, i10, rc0Var, i11, z10);
        this.H = foVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        un unVar;
        fo foVar = this.H;
        un unVar2 = foVar.f35713l5;
        if (unVar2 != null && (messageObject = unVar2.f40445a) != null && ((unVar = foVar.f35642f5.quote) == null || unVar.f40445a == null || messageObject.getId() == foVar.f35642f5.quote.f40445a.getId())) {
            return;
        }
        foVar.f35713l5 = foVar.f35642f5.quote;
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
        fo foVar = this.H;
        MessagePreviewParams messagePreviewParams = foVar.f35642f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                foVar.f35725m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = foVar.f35642f5.forwardMessages.messages.get(i13);
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
                    foVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle d = org.telegram.messenger.sk.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", !z10);
            if (!z10 && (messages = foVar.f35642f5.replyMessage) != null && !messages.messages.isEmpty() && foVar.f35642f5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            d.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(foVar.f35642f5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != foVar.a() && peerDialogId != foVar.getUserConfig().getClientUserId() && i11 > 0) {
                d.putLong("reply_to_author", peerDialogId);
            }
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = foVar.f35642f5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            d.putInt("messagesCount", i12);
            d.putBoolean("canSelectTopics", true);
            yy yyVar = new yy(d);
            yyVar.C2 = foVar;
            foVar.presentFragment(yyVar);
        }
    }
}
