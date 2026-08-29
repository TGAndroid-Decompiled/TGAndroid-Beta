package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class lm extends org.telegram.ui.Cells.l9 {
    public tn B0;

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        MessageObject.GroupedMessages y8;
        tn tnVar = this.B0;
        if (tnVar != null) {
            int min = Math.min(i11, tnVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y8 = this.B0.y8(messageObject.getGroupId())) != null && !y8.isDocuments) {
                messageObject = y8.captionMessage;
            }
            if (messageObject != null) {
                jn b10 = jn.b(i10, min, messageObject);
                if (b10.f39596i != null) {
                    dk dkVar = this.B0.U;
                    boolean z10 = false;
                    if (dkVar != null && dkVar.getVisibility() == 0) {
                        lVar = ((org.telegram.ui.ActionBar.o2) this.B0).actionBar;
                        if (lVar != null) {
                            lVar2 = ((org.telegram.ui.ActionBar.o2) this.B0).actionBar;
                            if (lVar2.s()) {
                                this.B0.z7(false);
                            }
                        }
                        this.B0.Cb(messageObject, b10);
                        dk dkVar2 = this.B0.U;
                        if (dkVar2 != null) {
                            dkVar2.H0();
                            return;
                        }
                        return;
                    }
                    tn tnVar2 = this.B0;
                    tnVar2.f42831h5 = b10;
                    tnVar2.f42856j5 = messageObject;
                    if (tnVar2.h != null) {
                        z10 = true;
                    }
                    tnVar2.f42755b5 = new MessagePreviewParams(z10, tnVar2.y9(), ChatObject.isMonoForum(this.B0.f42787e));
                    tn tnVar3 = this.B0;
                    tnVar3.f42755b5.updateReply(tnVar3.f42856j5, tnVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.f42831h5);
                    Bundle e10 = org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true);
                    e10.putBoolean("quote", true);
                    e10.putInt("messagesCount", 1);
                    e10.putBoolean("canSelectTopics", true);
                    fy fyVar = new fy(e10);
                    tn tnVar4 = this.B0;
                    fyVar.f38379y2 = tnVar4;
                    tnVar4.presentFragment(fyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        tn tnVar;
        tn tnVar2 = this.B0;
        if ((tnVar2 == null || tnVar2.a() != 489000) && (tnVar = this.B0) != null) {
            if (tnVar.a() >= 0 || !this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
                org.telegram.ui.Cells.s9 s9Var = this.W;
                if (s9Var != null && ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(tn tnVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f24651u0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = tnVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.s9 s9Var;
        boolean z10;
        tn tnVar;
        org.telegram.ui.Cells.s9 s9Var2;
        TLRPC.Chat chat;
        tn tnVar2 = this.B0;
        if (tnVar2 == null || tnVar2.a() != 489000) {
            tn tnVar3 = this.B0;
            if ((tnVar3 != null && tnVar3.y9()) || ((s9Var = this.W) != null && ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f24654x0 && (tnVar = this.B0) != null && tnVar.h == null && (((s9Var2 = this.W) == null || (((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().richLayout == null && !this.B0.Y8.f24652v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.P5) && !UserObject.isService(this.B0.P5) && (!z10 || (chat = this.B0.f42787e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int p() {
        tn tnVar = this.B0;
        if (tnVar == null) {
            return 0;
        }
        return tnVar.f43023wa;
    }

    @Override
    public final int q() {
        tn tnVar = this.B0;
        if (tnVar == null) {
            return 0;
        }
        return (int) tnVar.f42921o9;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 r() {
        tn tnVar = this.B0;
        if (tnVar != null) {
            return tnVar.f42746aa;
        }
        return null;
    }

    @Override
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.B0.f42746aa);
    }
}
