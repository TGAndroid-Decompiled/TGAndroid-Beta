package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.RichQuote;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class mm extends org.telegram.ui.Cells.o9 {
    public sn f39219w0;

    @Override
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages D8;
        sn snVar = this.f39219w0;
        if (snVar != null) {
            int min = Math.min(i11, snVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (D8 = this.f39219w0.D8(messageObject.getGroupId())) != null && !D8.isDocuments) {
                messageObject = D8.captionMessage;
            }
            if (messageObject != null) {
                in c10 = in.c(messageObject, i10, min);
                if (c10.f37928i != null) {
                    hk hkVar = this.f39219w0.Y;
                    boolean z10 = false;
                    if (hkVar != null && hkVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.n2) this.f39219w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) this.f39219w0).actionBar;
                            if (kVar2.s()) {
                                this.f39219w0.C7(false);
                            }
                        }
                        this.f39219w0.Gb(messageObject, c10);
                        hk hkVar2 = this.f39219w0.Y;
                        if (hkVar2 != null) {
                            hkVar2.F0();
                            return;
                        }
                        return;
                    }
                    sn snVar2 = this.f39219w0;
                    snVar2.f41285l5 = c10;
                    snVar2.f41311n5 = messageObject;
                    if (snVar2.h != null) {
                        z10 = true;
                    }
                    snVar2.f41214f5 = new MessagePreviewParams(z10, snVar2.D9(), ChatObject.isMonoForum(this.f39219w0.e));
                    sn snVar3 = this.f39219w0;
                    snVar3.f41214f5.updateReply(snVar3.f41311n5, snVar3.D8(messageObject.getGroupId()), this.f39219w0.a(), this.f39219w0.f41285l5);
                    Bundle d = org.telegram.messenger.wh.d(3, "onlySelect", "dialogsType", true);
                    d.putBoolean("quote", true);
                    d.putInt("messagesCount", 1);
                    d.putBoolean("canSelectTopics", true);
                    ey eyVar = new ey(d);
                    sn snVar4 = this.f39219w0;
                    eyVar.C2 = snVar4;
                    snVar4.presentFragment(eyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        sn snVar;
        sn snVar2 = this.f39219w0;
        if ((snVar2 == null || snVar2.a() != 489000) && (snVar = this.f39219w0) != null) {
            if (snVar.a() >= 0 || !this.f39219w0.getMessagesController().isPeerNoForwards(this.f39219w0.a())) {
                org.telegram.ui.Cells.v9 v9Var = this.W;
                if (v9Var != null && ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void c0(sn snVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f22731p0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f39219w0 = snVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.v9 v9Var;
        boolean z10;
        sn snVar;
        org.telegram.ui.Cells.v9 v9Var2;
        TLRPC.Chat chat;
        sn snVar2 = this.f39219w0;
        if (snVar2 == null || snVar2.a() != 489000) {
            sn snVar3 = this.f39219w0;
            if ((snVar3 != null && snVar3.D9()) || ((v9Var = this.W) != null && ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f22734s0 && (snVar = this.f39219w0) != null && snVar.h == null && (((v9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null || RichQuote.canQuote(((org.telegram.ui.Cells.u1) this.W).getMessageObject())) && !this.f39219w0.f41180c9.f22732q0))) && !this.f39219w0.getMessagesController().getTranslateController().isTranslatingDialog(this.f39219w0.T5) && !UserObject.isService(this.f39219w0.T5) && (!z10 || (chat = this.f39219w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        sn snVar = this.f39219w0;
        if (snVar == null) {
            return 0;
        }
        return snVar.Ba;
    }

    @Override
    public final int p() {
        sn snVar = this.f39219w0;
        if (snVar == null) {
            return 0;
        }
        return (int) snVar.f41377s9;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 q() {
        sn snVar = this.f39219w0;
        if (snVar != null) {
            return snVar.f41205ea;
        }
        return null;
    }

    @Override
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.f39219w0.f41205ea);
    }
}
