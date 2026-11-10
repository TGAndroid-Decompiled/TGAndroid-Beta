package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class or0 extends oj0 {
    public final Context f36671c;
    public final ys0 d;

    public or0(ys0 ys0Var, Context context) {
        this.d = ys0Var;
        this.f36671c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        ns0[] ns0VarArr = this.d.f40713v1;
        if (ns0VarArr[5].f36369a.size() == 0 && !ns0VarArr[5].f36374g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ns0[] ns0VarArr = this.d.f40713v1;
        if (ns0VarArr[5].f36369a.size() == 0 && !ns0VarArr[5].f36374g) {
            return 1;
        }
        return ns0VarArr[5].f36369a.size();
    }

    @Override
    public final long c(int i7) {
        return i7;
    }

    @Override
    public final int d(int i7) {
        ns0[] ns0VarArr = this.d.f40713v1;
        if (ns0VarArr[5].f36369a.size() == 0 && !ns0VarArr[5].f36374g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        char c10;
        if (d1Var.f57056f == 12) {
            ys0 ys0Var = this.d;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) ys0Var.f40713v1[5].f36369a.get(i7);
            TLRPC.Document F0 = ijVar.F0();
            if (F0 != null) {
                View view = d1Var.f57052a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(ijVar.f23266k.date, ijVar, F0);
                    boolean z9 = false;
                    if (ys0Var.E1) {
                        SparseArray[] sparseArrayArr = ys0Var.f40654b1;
                        if (org.telegram.messenger.ij.B0(ijVar.f23266k) == ys0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0) {
                            z9 = true;
                        }
                        h2Var.c(z9, !ys0Var.f40661d1);
                        return;
                    }
                    h2Var.c(false, !ys0Var.f40661d1);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.d;
        org.telegram.ui.ActionBar.h6 h6Var = ys0Var.H1;
        Context context = this.f36671c;
        if (i7 == 11) {
            q3 X = ys0.X(5, ys0Var.l1, context, h6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new v4.d1(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, h6Var, true);
        h2Var.setCanPreviewGif(true);
        return new v4.d1(h2Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.h2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) view).getPhotoImage();
            if (this.d.m0[0].E == 5) {
                photoImage.f21225t0 = true;
                photoImage.P0(false);
                return;
            }
            photoImage.f21225t0 = false;
            photoImage.Q0();
        }
    }
}
