package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mr0 extends sj0 {
    public final Context f36238c;
    public final ws0 d;

    public mr0(ws0 ws0Var, Context context) {
        this.d = ws0Var;
        this.f36238c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        ls0[] ls0VarArr = this.d.f40136w1;
        if (ls0VarArr[5].f35854a.size() == 0 && !ls0VarArr[5].f35859g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ls0[] ls0VarArr = this.d.f40136w1;
        if (ls0VarArr[5].f35854a.size() == 0 && !ls0VarArr[5].f35859g) {
            return 1;
        }
        return ls0VarArr[5].f35854a.size();
    }

    @Override
    public final long c(int i3) {
        return i3;
    }

    @Override
    public final int d(int i3) {
        ls0[] ls0VarArr = this.d.f40136w1;
        if (ls0VarArr[5].f35854a.size() == 0 && !ls0VarArr[5].f35859g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        char c2;
        if (d1Var.f55544f == 12) {
            ws0 ws0Var = this.d;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) ws0Var.f40136w1[5].f35854a.get(i3);
            TLRPC.Document F0 = ziVar.F0();
            if (F0 != null) {
                View view = d1Var.f55540a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(ziVar.f26868k.date, ziVar, F0);
                    boolean z10 = false;
                    if (ws0Var.F1) {
                        SparseArray[] sparseArrayArr = ws0Var.f40077c1;
                        if (org.telegram.messenger.zi.B0(ziVar.f26868k) == ws0Var.m1) {
                            c2 = 0;
                        } else {
                            c2 = 1;
                        }
                        if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                            z10 = true;
                        }
                        h2Var.c(z10, !ws0Var.f40083e1);
                        return;
                    }
                    h2Var.c(false, !ws0Var.f40083e1);
                }
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ws0 ws0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.f36238c;
        if (i3 == 11) {
            p3 X = ws0.X(5, ws0Var.m1, context, e6Var);
            X.setLayoutParams(new u4.p0(-1, -1));
            return new u4.d1(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, e6Var, true);
        h2Var.setCanPreviewGif(true);
        return new u4.d1(h2Var);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.h2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) view).getPhotoImage();
            if (this.d.f40108n0[0].F == 5) {
                photoImage.f21272u0 = true;
                photoImage.P0(false);
                return;
            }
            photoImage.f21272u0 = false;
            photoImage.Q0();
        }
    }
}
