package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.RichQuote;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class km extends org.telegram.ui.Cells.o9 {
    public qn f38638w0;

    @Override
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages D8;
        qn qnVar = this.f38638w0;
        if (qnVar != null) {
            int min = Math.min(i11, qnVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (D8 = this.f38638w0.D8(messageObject.getGroupId())) != null && !D8.isDocuments) {
                messageObject = D8.captionMessage;
            }
            if (messageObject != null) {
                gn c10 = gn.c(messageObject, i10, min);
                if (c10.f37362i != null) {
                    fk fkVar = this.f38638w0.Y;
                    boolean z10 = false;
                    if (fkVar != null && fkVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.n2) this.f38638w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) this.f38638w0).actionBar;
                            if (kVar2.t()) {
                                this.f38638w0.C7(false);
                            }
                        }
                        this.f38638w0.Hb(messageObject, c10);
                        fk fkVar2 = this.f38638w0.Y;
                        if (fkVar2 != null) {
                            fkVar2.F0();
                            return;
                        }
                        return;
                    }
                    qn qnVar2 = this.f38638w0;
                    qnVar2.f40753l5 = c10;
                    qnVar2.f40779n5 = messageObject;
                    if (qnVar2.h != null) {
                        z10 = true;
                    }
                    qnVar2.f40682f5 = new MessagePreviewParams(z10, qnVar2.D9(), ChatObject.isMonoForum(this.f38638w0.e));
                    qn qnVar3 = this.f38638w0;
                    qnVar3.f40682f5.updateReply(qnVar3.f40779n5, qnVar3.D8(messageObject.getGroupId()), this.f38638w0.a(), this.f38638w0.f40753l5);
                    Bundle d = org.telegram.messenger.mk.d(3, "onlySelect", "dialogsType", true);
                    d.putBoolean("quote", true);
                    d.putInt("messagesCount", 1);
                    d.putBoolean("canSelectTopics", true);
                    cy cyVar = new cy(d);
                    qn qnVar4 = this.f38638w0;
                    cyVar.C2 = qnVar4;
                    qnVar4.presentFragment(cyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        qn qnVar;
        qn qnVar2 = this.f38638w0;
        if ((qnVar2 == null || qnVar2.a() != 489000) && (qnVar = this.f38638w0) != null) {
            if (DialogObject.isEncryptedDialog(qnVar.a()) || !this.f38638w0.D9()) {
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

    public final void c0(qn qnVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f22732p0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f38638w0 = qnVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.v9 v9Var;
        boolean z10;
        qn qnVar;
        org.telegram.ui.Cells.v9 v9Var2;
        TLRPC.Chat chat;
        qn qnVar2 = this.f38638w0;
        if (qnVar2 == null || qnVar2.a() != 489000) {
            qn qnVar3 = this.f38638w0;
            if ((qnVar3 != null && qnVar3.D9()) || ((v9Var = this.W) != null && ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f22735s0 && (qnVar = this.f38638w0) != null && qnVar.h == null && (((v9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null || RichQuote.canQuote(((org.telegram.ui.Cells.u1) this.W).getMessageObject())) && !this.f38638w0.f40648c9.f22733q0))) && !this.f38638w0.getMessagesController().getTranslateController().isTranslatingDialog(this.f38638w0.T5) && !UserObject.isService(this.f38638w0.T5) && (!z10 || (chat = this.f38638w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        qn qnVar = this.f38638w0;
        if (qnVar == null) {
            return 0;
        }
        return qnVar.Ba;
    }

    @Override
    public final int p() {
        qn qnVar = this.f38638w0;
        if (qnVar == null) {
            return 0;
        }
        return (int) qnVar.f40845s9;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 q() {
        qn qnVar = this.f38638w0;
        if (qnVar != null) {
            return qnVar.f40673ea;
        }
        return null;
    }

    @Override
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.f38638w0.f40673ea);
    }
}
