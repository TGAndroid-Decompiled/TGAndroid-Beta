package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ou0 extends lm0 {
    public final Context f31378c;
    public final aw0 d;

    public ou0(aw0 aw0Var, Context context) {
        this.d = aw0Var;
        this.f31378c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        pv0[] pv0VarArr = this.d.f26696v1;
        if (pv0VarArr[5].f31704a.size() == 0 && !pv0VarArr[5].f31708g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        pv0[] pv0VarArr = this.d.f26696v1;
        if (pv0VarArr[5].f31704a.size() == 0 && !pv0VarArr[5].f31708g) {
            return 1;
        }
        return pv0VarArr[5].f31704a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        pv0[] pv0VarArr = this.d.f26696v1;
        if (pv0VarArr[5].f31704a.size() == 0 && !pv0VarArr[5].f31708g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        char c10;
        if (e1Var.f47738f == 12) {
            aw0 aw0Var = this.d;
            MessageObject messageObject = (MessageObject) aw0Var.f26696v1[5].f31704a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = e1Var.f47735a;
                if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    d2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (aw0Var.E1) {
                        SparseArray[] sparseArrayArr = aw0Var.f26639b1;
                        if (messageObject.getDialogId() == aw0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        d2Var.c(z10, !aw0Var.f26646d1);
                        return;
                    }
                    d2Var.c(false, !aw0Var.f26646d1);
                }
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        aw0 aw0Var = this.d;
        org.telegram.ui.ActionBar.u6 u6Var = aw0Var.H1;
        Context context = this.f31378c;
        if (i10 == 11) {
            nu0 U = aw0.U(5, aw0Var.l1, context, u6Var);
            U.setLayoutParams(new s4.q0(-1, -1));
            return new s4.e1(U);
        }
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, u6Var, true);
        d2Var.setCanPreviewGif(true);
        return new s4.e1(d2Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        if (view instanceof org.telegram.ui.Cells.d2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) view).getPhotoImage();
            if (this.d.m0[0].E == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
