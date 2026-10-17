package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class gu0 extends hm0 {
    public final Context f26668c;
    public final sv0 d;

    public gu0(sv0 sv0Var, Context context) {
        this.d = sv0Var;
        this.f26668c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        hv0[] hv0VarArr = this.d.f30384t1;
        if (hv0VarArr[5].f26942a.size() == 0 && !hv0VarArr[5].f26946g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        hv0[] hv0VarArr = this.d.f30384t1;
        if (hv0VarArr[5].f26942a.size() == 0 && !hv0VarArr[5].f26946g) {
            return 1;
        }
        return hv0VarArr[5].f26942a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        hv0[] hv0VarArr = this.d.f30384t1;
        if (hv0VarArr[5].f26942a.size() == 0 && !hv0VarArr[5].f26946g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        char c10;
        if (b1Var.f45941f == 12) {
            sv0 sv0Var = this.d;
            MessageObject messageObject = (MessageObject) sv0Var.f30384t1[5].f26942a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = b1Var.f45938a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (sv0Var.C1) {
                        SparseArray[] sparseArrayArr = sv0Var.Z0;
                        if (messageObject.getDialogId() == sv0Var.f30363j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !sv0Var.f30343b1);
                        return;
                    }
                    f2Var.c(false, !sv0Var.f30343b1);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        sv0 sv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = sv0Var.F1;
        Context context = this.f26668c;
        if (i10 == 11) {
            fu0 M = sv0.M(5, sv0Var.f30363j1, context, d6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.b1(f2Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f45938a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f30364k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
