package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class pu0 extends mm0 {
    public final Context f31716c;
    public final bw0 d;

    public pu0(bw0 bw0Var, Context context) {
        this.d = bw0Var;
        this.f31716c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        qv0[] qv0VarArr = this.d.f26986v1;
        if (qv0VarArr[5].f32033a.size() == 0 && !qv0VarArr[5].f32037g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        qv0[] qv0VarArr = this.d.f26986v1;
        if (qv0VarArr[5].f32033a.size() == 0 && !qv0VarArr[5].f32037g) {
            return 1;
        }
        return qv0VarArr[5].f32033a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        qv0[] qv0VarArr = this.d.f26986v1;
        if (qv0VarArr[5].f32033a.size() == 0 && !qv0VarArr[5].f32037g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        char c10;
        if (e1Var.f47776f == 12) {
            bw0 bw0Var = this.d;
            MessageObject messageObject = (MessageObject) bw0Var.f26986v1[5].f32033a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = e1Var.f47773a;
                if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    d2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (bw0Var.E1) {
                        SparseArray[] sparseArrayArr = bw0Var.f26929b1;
                        if (messageObject.getDialogId() == bw0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        d2Var.c(z10, !bw0Var.f26936d1);
                        return;
                    }
                    d2Var.c(false, !bw0Var.f26936d1);
                }
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        bw0 bw0Var = this.d;
        org.telegram.ui.ActionBar.u6 u6Var = bw0Var.H1;
        Context context = this.f31716c;
        if (i10 == 11) {
            ou0 U = bw0.U(5, bw0Var.l1, context, u6Var);
            U.setLayoutParams(new s4.q0(-1, -1));
            return new s4.e1(U);
        }
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, u6Var, true);
        d2Var.setCanPreviewGif(true);
        return new s4.e1(d2Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        View view = e1Var.f47773a;
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
