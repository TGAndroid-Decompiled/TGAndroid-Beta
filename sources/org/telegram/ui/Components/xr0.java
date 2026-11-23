package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class xr0 extends dk0 {
    public final Context f42162c;
    public final it0 d;

    public xr0(it0 it0Var, Context context) {
        this.d = it0Var;
        this.f42162c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        xs0[] xs0VarArr = this.d.f36160w1;
        if (xs0VarArr[5].f42165a.size() == 0 && !xs0VarArr[5].f42170g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        xs0[] xs0VarArr = this.d.f36160w1;
        if (xs0VarArr[5].f42165a.size() == 0 && !xs0VarArr[5].f42170g) {
            return 1;
        }
        return xs0VarArr[5].f42165a.size();
    }

    @Override
    public final long c(int i7) {
        return i7;
    }

    @Override
    public final int d(int i7) {
        xs0[] xs0VarArr = this.d.f36160w1;
        if (xs0VarArr[5].f42165a.size() == 0 && !xs0VarArr[5].f42170g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        char c10;
        if (f1Var.f59249f == 12) {
            it0 it0Var = this.d;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) it0Var.f36160w1[5].f42165a.get(i7);
            TLRPC.Document F0 = fjVar.F0();
            if (F0 != null) {
                View view = f1Var.f59245a;
                if (view instanceof org.telegram.ui.Cells.i2) {
                    org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
                    i2Var.d(fjVar.f24073k.date, fjVar, F0);
                    boolean z10 = false;
                    if (it0Var.F1) {
                        SparseArray[] sparseArrayArr = it0Var.f36101c1;
                        if (org.telegram.messenger.fj.B0(fjVar.f24073k) == it0Var.f36130m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                            z10 = true;
                        }
                        i2Var.c(z10, !it0Var.f36107e1);
                        return;
                    }
                    i2Var.c(false, !it0Var.f36107e1);
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        it0 it0Var = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = it0Var.I1;
        Context context = this.f42162c;
        if (i7 == 11) {
            x3 X = it0.X(5, it0Var.f36130m1, context, i6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new v4.f1(X);
        }
        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(context, i6Var, true);
        i2Var.setCanPreviewGif(true);
        return new v4.f1(i2Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.i2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.i2) view).getPhotoImage();
            if (this.d.f36133n0[0].F == 5) {
                photoImage.f22762u0 = true;
                photoImage.Q0(false);
                return;
            }
            photoImage.f22762u0 = false;
            photoImage.R0();
        }
    }
}
