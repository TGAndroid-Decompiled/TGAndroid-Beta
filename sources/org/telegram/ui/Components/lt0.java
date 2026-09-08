package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class lt0 extends kl0 {
    public final Context f28333c;
    public final xu0 d;

    public lt0(xu0 xu0Var, Context context) {
        this.d = xu0Var;
        this.f28333c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        mu0[] mu0VarArr = this.d.f32749t1;
        if (mu0VarArr[5].f28543a.size() == 0 && !mu0VarArr[5].f28548g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        mu0[] mu0VarArr = this.d.f32749t1;
        if (mu0VarArr[5].f28543a.size() == 0 && !mu0VarArr[5].f28548g) {
            return 1;
        }
        return mu0VarArr[5].f28543a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        mu0[] mu0VarArr = this.d.f32749t1;
        if (mu0VarArr[5].f28543a.size() == 0 && !mu0VarArr[5].f28548g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f45770f == 12) {
            xu0 xu0Var = this.d;
            MessageObject messageObject = (MessageObject) xu0Var.f32749t1[5].f28543a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.f45766a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (xu0Var.C1) {
                        SparseArray[] sparseArrayArr = xu0Var.Z0;
                        if (messageObject.getDialogId() == xu0Var.f32728j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        e2Var.c(z10, !xu0Var.f32707b1);
                        return;
                    }
                    e2Var.c(false, !xu0Var.f32707b1);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        xu0 xu0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.f28333c;
        if (i10 == 11) {
            kt0 M = xu0.M(5, xu0Var.f32728j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, f6Var, true);
        e2Var.setCanPreviewGif(true);
        return new s4.c1(e2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f45766a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
            if (this.d.f32729k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
