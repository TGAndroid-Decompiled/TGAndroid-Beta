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
public final class pm extends org.telegram.ui.Cells.t9 {
    public wn f42456w0;

    @Override
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages K8;
        wn wnVar = this.f42456w0;
        if (wnVar != null) {
            int min = Math.min(i11, wnVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (K8 = this.f42456w0.K8(messageObject.getGroupId())) != null && !K8.isDocuments) {
                messageObject = K8.captionMessage;
            }
            if (messageObject != null) {
                mn c10 = mn.c(messageObject, i10, min);
                if (c10.f41482i != null) {
                    jk jkVar = this.f42456w0.Y;
                    boolean z10 = false;
                    if (jkVar != null && jkVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.r2) this.f42456w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.r2) this.f42456w0).actionBar;
                            if (kVar2.q()) {
                                this.f42456w0.I7(false);
                            }
                        }
                        this.f42456w0.Sb(messageObject, c10);
                        jk jkVar2 = this.f42456w0.Y;
                        if (jkVar2 != null) {
                            jkVar2.E0();
                            return;
                        }
                        return;
                    }
                    wn wnVar2 = this.f42456w0;
                    wnVar2.B5 = c10;
                    wnVar2.D5 = messageObject;
                    if (wnVar2.h != null) {
                        z10 = true;
                    }
                    wnVar2.f45317v5 = new MessagePreviewParams(z10, wnVar2.K9(), ChatObject.isMonoForum(this.f42456w0.e));
                    wn wnVar3 = this.f42456w0;
                    wnVar3.f45317v5.updateReply(wnVar3.D5, wnVar3.K8(messageObject.getGroupId()), this.f42456w0.a(), this.f42456w0.B5);
                    Bundle c11 = org.telegram.messenger.wh.c(3, "onlySelect", "dialogsType", true);
                    c11.putBoolean("quote", true);
                    c11.putInt("messagesCount", 1);
                    c11.putBoolean("canSelectTopics", true);
                    ey eyVar = new ey(c11);
                    wn wnVar4 = this.f42456w0;
                    eyVar.C2 = wnVar4;
                    wnVar4.presentFragment(eyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        wn wnVar;
        wn wnVar2 = this.f42456w0;
        if ((wnVar2 == null || wnVar2.a() != 489000) && (wnVar = this.f42456w0) != null) {
            if (DialogObject.isEncryptedDialog(wnVar.a()) || !this.f42456w0.K9()) {
                org.telegram.ui.Cells.aa aaVar = this.W;
                if (aaVar != null && ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void c0(wn wnVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f25461p0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f42456w0 = wnVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.aa aaVar;
        boolean z10;
        wn wnVar;
        org.telegram.ui.Cells.aa aaVar2;
        TLRPC.Chat chat;
        wn wnVar2 = this.f42456w0;
        if (wnVar2 == null || wnVar2.a() != 489000) {
            wn wnVar3 = this.f42456w0;
            if ((wnVar3 != null && wnVar3.K9()) || ((aaVar = this.W) != null && ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f25464s0 && (wnVar = this.f42456w0) != null && wnVar.h == null && (((aaVar2 = this.W) == null || (((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isInvoice() && ((((org.telegram.ui.Cells.s1) this.W).getMessageObject().richLayout == null || RichQuote.canQuote(((org.telegram.ui.Cells.s1) this.W).getMessageObject())) && !this.f42456w0.f45282s9.f25462q0))) && !this.f42456w0.getMessagesController().getTranslateController().isTranslatingDialog(this.f42456w0.f45168j6) && !UserObject.isService(this.f42456w0.f45168j6) && (!z10 || (chat = this.f42456w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        wn wnVar = this.f42456w0;
        if (wnVar == null) {
            return 0;
        }
        return wnVar.Ra;
    }

    @Override
    public final int p() {
        wn wnVar = this.f42456w0;
        if (wnVar == null) {
            return 0;
        }
        return (int) wnVar.I9;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 q() {
        wn wnVar = this.f42456w0;
        if (wnVar != null) {
            return wnVar.f45309ua;
        }
        return null;
    }

    @Override
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.f42456w0.f45309ua);
    }
}
