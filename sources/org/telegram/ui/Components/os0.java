package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class os0 extends tk0 {
    public final Context f29226c;
    public final au0 d;

    public os0(au0 au0Var, Context context) {
        this.d = au0Var;
        this.f29226c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        pt0[] pt0VarArr = this.d.f24562v1;
        if (pt0VarArr[5].f29532a.size() == 0 && !pt0VarArr[5].f29536g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        pt0[] pt0VarArr = this.d.f24562v1;
        if (pt0VarArr[5].f29532a.size() == 0 && !pt0VarArr[5].f29536g) {
            return 1;
        }
        return pt0VarArr[5].f29532a.size();
    }

    @Override
    public final long c(int i10) {
        return i10;
    }

    @Override
    public final int d(int i10) {
        pt0[] pt0VarArr = this.d.f24562v1;
        if (pt0VarArr[5].f29532a.size() == 0 && !pt0VarArr[5].f29536g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f47912f == 12) {
            au0 au0Var = this.d;
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) au0Var.f24562v1[5].f29532a.get(i10);
            TLRPC.Document F0 = kjVar.F0();
            if (F0 != null) {
                View view = c1Var.f47909a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(kjVar.f16690k.date, kjVar, F0);
                    boolean z10 = false;
                    if (au0Var.E1) {
                        SparseArray[] sparseArrayArr = au0Var.f24502b1;
                        if (org.telegram.messenger.kj.B0(kjVar.f16690k) == au0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                            z10 = true;
                        }
                        h2Var.c(z10, !au0Var.f24509d1);
                        return;
                    }
                    h2Var.c(false, !au0Var.f24509d1);
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        au0 au0Var = this.d;
        org.telegram.ui.ActionBar.p6 p6Var = au0Var.H1;
        Context context = this.f29226c;
        if (i10 == 11) {
            p3 W = au0.W(5, au0Var.l1, context, p6Var);
            W.setLayoutParams(new s4.o0(-1, -1));
            return new s4.c1(W);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, p6Var, true);
        h2Var.setCanPreviewGif(true);
        return new s4.c1(h2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.h2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) view).getPhotoImage();
            if (this.d.m0[0].E == 5) {
                photoImage.f14409t0 = true;
                photoImage.P0(false);
                return;
            }
            photoImage.f14409t0 = false;
            photoImage.Q0();
        }
    }
}
