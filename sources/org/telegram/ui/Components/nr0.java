package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class nr0 extends oj0 {
    public final Context f36407c;
    public final xs0 d;

    public nr0(xs0 xs0Var, Context context) {
        this.d = xs0Var;
        this.f36407c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        ms0[] ms0VarArr = this.d.f40434v1;
        if (ms0VarArr[5].f36063a.size() == 0 && !ms0VarArr[5].f36068g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ms0[] ms0VarArr = this.d.f40434v1;
        if (ms0VarArr[5].f36063a.size() == 0 && !ms0VarArr[5].f36068g) {
            return 1;
        }
        return ms0VarArr[5].f36063a.size();
    }

    @Override
    public final long c(int i7) {
        return i7;
    }

    @Override
    public final int d(int i7) {
        ms0[] ms0VarArr = this.d.f40434v1;
        if (ms0VarArr[5].f36063a.size() == 0 && !ms0VarArr[5].f36068g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        char c10;
        if (d1Var.f56955f == 12) {
            xs0 xs0Var = this.d;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) xs0Var.f40434v1[5].f36063a.get(i7);
            TLRPC.Document F0 = ijVar.F0();
            if (F0 != null) {
                View view = d1Var.f56951a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(ijVar.f23244k.date, ijVar, F0);
                    boolean z9 = false;
                    if (xs0Var.E1) {
                        SparseArray[] sparseArrayArr = xs0Var.f40375b1;
                        if (org.telegram.messenger.ij.B0(ijVar.f23244k) == xs0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
                            z9 = true;
                        }
                        h2Var.c(z9, !xs0Var.f40382d1);
                        return;
                    }
                    h2Var.c(false, !xs0Var.f40382d1);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        xs0 xs0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = xs0Var.H1;
        Context context = this.f36407c;
        if (i7 == 11) {
            r3 X = xs0.X(5, xs0Var.l1, context, f6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new v4.d1(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, f6Var, true);
        h2Var.setCanPreviewGif(true);
        return new v4.d1(h2Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        View view = d1Var.f56951a;
        if (view instanceof org.telegram.ui.Cells.h2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) view).getPhotoImage();
            if (this.d.m0[0].E == 5) {
                photoImage.f21217t0 = true;
                photoImage.P0(false);
                return;
            }
            photoImage.f21217t0 = false;
            photoImage.Q0();
        }
    }
}
