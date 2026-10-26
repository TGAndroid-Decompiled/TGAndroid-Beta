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
public final class nm extends org.telegram.ui.Cells.t9 {
    public un f41953w0;

    @Override
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages H8;
        un unVar = this.f41953w0;
        if (unVar != null) {
            int min = Math.min(i11, unVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (H8 = this.f41953w0.H8(messageObject.getGroupId())) != null && !H8.isDocuments) {
                messageObject = H8.captionMessage;
            }
            if (messageObject != null) {
                kn c10 = kn.c(messageObject, i10, min);
                if (c10.f40984i != null) {
                    hk hkVar = this.f41953w0.Y;
                    boolean z10 = false;
                    if (hkVar != null && hkVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.r2) this.f41953w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.r2) this.f41953w0).actionBar;
                            if (kVar2.q()) {
                                this.f41953w0.G7(false);
                            }
                        }
                        this.f41953w0.Ob(messageObject, c10);
                        hk hkVar2 = this.f41953w0.Y;
                        if (hkVar2 != null) {
                            hkVar2.F0();
                            return;
                        }
                        return;
                    }
                    un unVar2 = this.f41953w0;
                    unVar2.f44476x5 = c10;
                    unVar2.f44501z5 = messageObject;
                    if (unVar2.h != null) {
                        z10 = true;
                    }
                    unVar2.f44397r5 = new MessagePreviewParams(z10, unVar2.H9(), ChatObject.isMonoForum(this.f41953w0.e));
                    un unVar3 = this.f41953w0;
                    unVar3.f44397r5.updateReply(unVar3.f44501z5, unVar3.H8(messageObject.getGroupId()), this.f41953w0.a(), this.f41953w0.f44476x5);
                    Bundle c11 = org.telegram.messenger.vh.c(3, "onlySelect", "dialogsType", true);
                    c11.putBoolean("quote", true);
                    c11.putInt("messagesCount", 1);
                    c11.putBoolean("canSelectTopics", true);
                    cy cyVar = new cy(c11);
                    un unVar4 = this.f41953w0;
                    cyVar.C2 = unVar4;
                    unVar4.presentFragment(cyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        un unVar;
        un unVar2 = this.f41953w0;
        if ((unVar2 == null || unVar2.a() != 489000) && (unVar = this.f41953w0) != null) {
            if (DialogObject.isEncryptedDialog(unVar.a()) || !this.f41953w0.H9()) {
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

    public final void c0(un unVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f25459p0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f41953w0 = unVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.aa aaVar;
        boolean z10;
        un unVar;
        org.telegram.ui.Cells.aa aaVar2;
        TLRPC.Chat chat;
        un unVar2 = this.f41953w0;
        if (unVar2 == null || unVar2.a() != 489000) {
            un unVar3 = this.f41953w0;
            if ((unVar3 != null && unVar3.H9()) || ((aaVar = this.W) != null && ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f25462s0 && (unVar = this.f41953w0) != null && unVar.h == null && (((aaVar2 = this.W) == null || (((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isInvoice() && ((((org.telegram.ui.Cells.s1) this.W).getMessageObject().richLayout == null || RichQuote.canQuote(((org.telegram.ui.Cells.s1) this.W).getMessageObject())) && !this.f41953w0.f44365o9.f25460q0))) && !this.f41953w0.getMessagesController().getTranslateController().isTranslatingDialog(this.f41953w0.f44252f6) && !UserObject.isService(this.f41953w0.f44252f6) && (!z10 || (chat = this.f41953w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        un unVar = this.f41953w0;
        if (unVar == null) {
            return 0;
        }
        return unVar.Na;
    }

    @Override
    public final int p() {
        un unVar = this.f41953w0;
        if (unVar == null) {
            return 0;
        }
        return (int) unVar.E9;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 q() {
        un unVar = this.f41953w0;
        if (unVar != null) {
            return unVar.f44388qa;
        }
        return null;
    }

    @Override
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.f41953w0.f44388qa);
    }
}
