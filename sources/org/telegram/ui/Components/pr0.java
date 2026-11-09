package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class pr0 extends pj0 {
    public final Context f37072c;
    public final zs0 d;

    public pr0(zs0 zs0Var, Context context) {
        this.d = zs0Var;
        this.f37072c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        os0[] os0VarArr = this.d.f41121v1;
        if (os0VarArr[5].f36778a.size() == 0 && !os0VarArr[5].f36783g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        os0[] os0VarArr = this.d.f41121v1;
        if (os0VarArr[5].f36778a.size() == 0 && !os0VarArr[5].f36783g) {
            return 1;
        }
        return os0VarArr[5].f36778a.size();
    }

    @Override
    public final long c(int i7) {
        return i7;
    }

    @Override
    public final int d(int i7) {
        os0[] os0VarArr = this.d.f41121v1;
        if (os0VarArr[5].f36778a.size() == 0 && !os0VarArr[5].f36783g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        char c10;
        if (d1Var.f57060f == 12) {
            zs0 zs0Var = this.d;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) zs0Var.f41121v1[5].f36778a.get(i7);
            TLRPC.Document F0 = ijVar.F0();
            if (F0 != null) {
                View view = d1Var.f57056a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(ijVar.f23262k.date, ijVar, F0);
                    boolean z9 = false;
                    if (zs0Var.E1) {
                        SparseArray[] sparseArrayArr = zs0Var.f41062b1;
                        if (org.telegram.messenger.ij.B0(ijVar.f23262k) == zs0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0) {
                            z9 = true;
                        }
                        h2Var.c(z9, !zs0Var.f41069d1);
                        return;
                    }
                    h2Var.c(false, !zs0Var.f41069d1);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        zs0 zs0Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = zs0Var.H1;
        Context context = this.f37072c;
        if (i7 == 11) {
            r3 X = zs0.X(5, zs0Var.l1, context, g6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new v4.d1(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, g6Var, true);
        h2Var.setCanPreviewGif(true);
        return new v4.d1(h2Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.h2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) view).getPhotoImage();
            if (this.d.m0[0].E == 5) {
                photoImage.f21220t0 = true;
                photoImage.P0(false);
                return;
            }
            photoImage.f21220t0 = false;
            photoImage.Q0();
        }
    }
}
