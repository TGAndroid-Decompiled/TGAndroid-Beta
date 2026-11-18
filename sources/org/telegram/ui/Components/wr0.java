package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class wr0 extends bk0 {
    public final Context f41763c;
    public final gt0 d;

    public wr0(gt0 gt0Var, Context context) {
        this.d = gt0Var;
        this.f41763c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        vs0[] vs0VarArr = this.d.f35636w1;
        if (vs0VarArr[5].f41412a.size() == 0 && !vs0VarArr[5].f41417g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        vs0[] vs0VarArr = this.d.f35636w1;
        if (vs0VarArr[5].f41412a.size() == 0 && !vs0VarArr[5].f41417g) {
            return 1;
        }
        return vs0VarArr[5].f41412a.size();
    }

    @Override
    public final long c(int i7) {
        return i7;
    }

    @Override
    public final int d(int i7) {
        vs0[] vs0VarArr = this.d.f35636w1;
        if (vs0VarArr[5].f41412a.size() == 0 && !vs0VarArr[5].f41417g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        char c10;
        if (f1Var.f59126f == 12) {
            gt0 gt0Var = this.d;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) gt0Var.f35636w1[5].f41412a.get(i7);
            TLRPC.Document F0 = fjVar.F0();
            if (F0 != null) {
                View view = f1Var.f59122a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(fjVar.f23968k.date, fjVar, F0);
                    boolean z10 = false;
                    if (gt0Var.F1) {
                        SparseArray[] sparseArrayArr = gt0Var.f35577c1;
                        if (org.telegram.messenger.fj.B0(fjVar.f23968k) == gt0Var.f35606m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                            z10 = true;
                        }
                        h2Var.c(z10, !gt0Var.f35583e1);
                        return;
                    }
                    h2Var.c(false, !gt0Var.f35583e1);
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        gt0 gt0Var = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.f41763c;
        if (i7 == 11) {
            x3 X = gt0.X(5, gt0Var.f35606m1, context, i6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new v4.f1(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, i6Var, true);
        h2Var.setCanPreviewGif(true);
        return new v4.f1(h2Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if (view instanceof org.telegram.ui.Cells.h2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) view).getPhotoImage();
            if (this.d.f35609n0[0].F == 5) {
                photoImage.f22667u0 = true;
                photoImage.P0(false);
                return;
            }
            photoImage.f22667u0 = false;
            photoImage.Q0();
        }
    }
}
