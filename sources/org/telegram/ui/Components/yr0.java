package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class yr0 extends dk0 {
    public final Context f42501c;
    public final jt0 d;

    public yr0(jt0 jt0Var, Context context) {
        this.d = jt0Var;
        this.f42501c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        ys0[] ys0VarArr = this.d.f36677w1;
        if (ys0VarArr[5].f42513a.size() == 0 && !ys0VarArr[5].f42518g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ys0[] ys0VarArr = this.d.f36677w1;
        if (ys0VarArr[5].f42513a.size() == 0 && !ys0VarArr[5].f42518g) {
            return 1;
        }
        return ys0VarArr[5].f42513a.size();
    }

    @Override
    public final long c(int i7) {
        return i7;
    }

    @Override
    public final int d(int i7) {
        ys0[] ys0VarArr = this.d.f36677w1;
        if (ys0VarArr[5].f42513a.size() == 0 && !ys0VarArr[5].f42518g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        char c10;
        if (f1Var.f59169f == 12) {
            jt0 jt0Var = this.d;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) jt0Var.f36677w1[5].f42513a.get(i7);
            TLRPC.Document F0 = gjVar.F0();
            if (F0 != null) {
                View view = f1Var.f59165a;
                if (view instanceof org.telegram.ui.Cells.i2) {
                    org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
                    i2Var.d(gjVar.f24213k.date, gjVar, F0);
                    boolean z10 = false;
                    if (jt0Var.F1) {
                        SparseArray[] sparseArrayArr = jt0Var.f36618c1;
                        if (org.telegram.messenger.gj.B0(gjVar.f24213k) == jt0Var.f36647m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                            z10 = true;
                        }
                        i2Var.c(z10, !jt0Var.f36624e1);
                        return;
                    }
                    i2Var.c(false, !jt0Var.f36624e1);
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jt0 jt0Var = this.d;
        org.telegram.ui.ActionBar.h6 h6Var = jt0Var.I1;
        Context context = this.f42501c;
        if (i7 == 11) {
            y3 X = jt0.X(5, jt0Var.f36647m1, context, h6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new v4.f1(X);
        }
        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(context, h6Var, true);
        i2Var.setCanPreviewGif(true);
        return new v4.f1(i2Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        View view = f1Var.f59165a;
        if (view instanceof org.telegram.ui.Cells.i2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.i2) view).getPhotoImage();
            if (this.d.f36650n0[0].F == 5) {
                photoImage.f22695u0 = true;
                photoImage.P0(false);
                return;
            }
            photoImage.f22695u0 = false;
            photoImage.Q0();
        }
    }
}
