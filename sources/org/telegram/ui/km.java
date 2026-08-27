package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class km extends org.telegram.ui.Cells.k9 {
    public rn B0;

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        MessageObject.GroupedMessages groupedMessagesY8;
        rn rnVar = this.B0;
        if (rnVar != null) {
            int iMin = Math.min(i11, rnVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (groupedMessagesY8 = this.B0.y8(messageObject.getGroupId())) != null && !groupedMessagesY8.isDocuments) {
                messageObject = groupedMessagesY8.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            hn hnVarB = hn.b(i10, iMin, messageObject);
            if (hnVarB.f38867i == null) {
                return;
            }
            ck ckVar = this.B0.U;
            if (ckVar != null && ckVar.getVisibility() == 0) {
                if (((org.telegram.ui.ActionBar.n2) this.B0).actionBar != null && ((org.telegram.ui.ActionBar.n2) this.B0).actionBar.t()) {
                    this.B0.z7(false);
                }
                this.B0.Cb(messageObject, hnVarB);
                ck ckVar2 = this.B0.U;
                if (ckVar2 != null) {
                    ckVar2.H0();
                    return;
                }
                return;
            }
            rn rnVar2 = this.B0;
            rnVar2.f42069h5 = hnVarB;
            rnVar2.f42095j5 = messageObject;
            rnVar2.f41992b5 = new MessagePreviewParams(rnVar2.h != null, rnVar2.y9(), ChatObject.isMonoForum(this.B0.f42026e));
            rn rnVar3 = this.B0;
            rnVar3.f41992b5.updateReply(rnVar3.f42095j5, rnVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.f42069h5);
            Bundle bundleE = org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true);
            bundleE.putBoolean("quote", true);
            bundleE.putInt("messagesCount", 1);
            bundleE.putBoolean("canSelectTopics", true);
            gy gyVar = new gy(bundleE);
            rn rnVar4 = this.B0;
            gyVar.f38621y2 = rnVar4;
            rnVar4.presentFragment(gyVar);
        }
    }

    @Override
    public final boolean b() {
        rn rnVar;
        rn rnVar2 = this.B0;
        if ((rnVar2 != null && rnVar2.a() == 489000) || (rnVar = this.B0) == null) {
            return true;
        }
        if (rnVar.a() < 0 && this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
            return false;
        }
        org.telegram.ui.Cells.r9 r9Var = this.W;
        return r9Var == null || ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() == null || ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void d0(rn rnVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f24598u0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = rnVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.r9 r9Var;
        rn rnVar;
        org.telegram.ui.Cells.r9 r9Var2;
        TLRPC.Chat chat;
        rn rnVar2 = this.B0;
        if (rnVar2 == null || rnVar2.a() != 489000) {
            rn rnVar3 = this.B0;
            boolean z10 = (rnVar3 != null && rnVar3.y9()) || !((r9Var = this.W) == null || ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() == null || ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.f24601x0 && (rnVar = this.B0) != null && rnVar.h == null && (((r9Var2 = this.W) == null || (((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().richLayout == null && !this.B0.Y8.f24599v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.P5) && !UserObject.isService(this.B0.P5) && (!z10 || (chat = this.B0.f42026e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int p() {
        rn rnVar = this.B0;
        if (rnVar == null) {
            return 0;
        }
        return rnVar.wa;
    }

    @Override
    public final int q() {
        rn rnVar = this.B0;
        if (rnVar == null) {
            return 0;
        }
        return (int) rnVar.f42160o9;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 r() {
        rn rnVar = this.B0;
        if (rnVar != null) {
            return rnVar.f41983aa;
        }
        return null;
    }

    @Override
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.B0.f41983aa);
    }
}
