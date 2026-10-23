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
public final class lm extends org.telegram.ui.Cells.p9 {
    public sn f39274w0;

    @Override
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages D8;
        sn snVar = this.f39274w0;
        if (snVar != null) {
            int min = Math.min(i11, snVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (D8 = this.f39274w0.D8(messageObject.getGroupId())) != null && !D8.isDocuments) {
                messageObject = D8.captionMessage;
            }
            if (messageObject != null) {
                in c10 = in.c(messageObject, i10, min);
                if (c10.f38275i != null) {
                    gk gkVar = this.f39274w0.Y;
                    boolean z10 = false;
                    if (gkVar != null && gkVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.o2) this.f39274w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.o2) this.f39274w0).actionBar;
                            if (kVar2.s()) {
                                this.f39274w0.C7(false);
                            }
                        }
                        this.f39274w0.Ib(messageObject, c10);
                        gk gkVar2 = this.f39274w0.Y;
                        if (gkVar2 != null) {
                            gkVar2.F0();
                            return;
                        }
                        return;
                    }
                    sn snVar2 = this.f39274w0;
                    snVar2.f41742x5 = c10;
                    snVar2.f41767z5 = messageObject;
                    if (snVar2.h != null) {
                        z10 = true;
                    }
                    snVar2.f41663r5 = new MessagePreviewParams(z10, snVar2.D9(), ChatObject.isMonoForum(this.f39274w0.e));
                    sn snVar3 = this.f39274w0;
                    snVar3.f41663r5.updateReply(snVar3.f41767z5, snVar3.D8(messageObject.getGroupId()), this.f39274w0.a(), this.f39274w0.f41742x5);
                    Bundle e = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
                    e.putBoolean("quote", true);
                    e.putInt("messagesCount", 1);
                    e.putBoolean("canSelectTopics", true);
                    ey eyVar = new ey(e);
                    sn snVar4 = this.f39274w0;
                    eyVar.C2 = snVar4;
                    snVar4.presentFragment(eyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        sn snVar;
        sn snVar2 = this.f39274w0;
        if ((snVar2 == null || snVar2.a() != 489000) && (snVar = this.f39274w0) != null) {
            if (DialogObject.isEncryptedDialog(snVar.a()) || !this.f39274w0.D9()) {
                org.telegram.ui.Cells.w9 w9Var = this.W;
                if (w9Var != null && ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards) {
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
            SparseArray sparseArray = this.f22900p0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f39274w0 = snVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.w9 w9Var;
        boolean z10;
        sn snVar;
        org.telegram.ui.Cells.w9 w9Var2;
        TLRPC.Chat chat;
        sn snVar2 = this.f39274w0;
        if (snVar2 == null || snVar2.a() != 489000) {
            sn snVar3 = this.f39274w0;
            if ((snVar3 != null && snVar3.D9()) || ((w9Var = this.W) != null && ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f22903s0 && (snVar = this.f39274w0) != null && snVar.h == null && (((w9Var2 = this.W) == null || (((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null || RichQuote.canQuote(((org.telegram.ui.Cells.t1) this.W).getMessageObject())) && !this.f39274w0.f41632o9.f22901q0))) && !this.f39274w0.getMessagesController().getTranslateController().isTranslatingDialog(this.f39274w0.f41519f6) && !UserObject.isService(this.f39274w0.f41519f6) && (!z10 || (chat = this.f39274w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        sn snVar = this.f39274w0;
        if (snVar == null) {
            return 0;
        }
        return snVar.Na;
    }

    @Override
    public final int p() {
        sn snVar = this.f39274w0;
        if (snVar == null) {
            return 0;
        }
        return (int) snVar.E9;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 q() {
        sn snVar = this.f39274w0;
        if (snVar != null) {
            return snVar.f41654qa;
        }
        return null;
    }

    @Override
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.k6.w0(i10, this.f39274w0.f41654qa);
    }
}
