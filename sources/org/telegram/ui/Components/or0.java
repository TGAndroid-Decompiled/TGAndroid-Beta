package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class or0 extends tj0 {
    public final Context f38051c;
    public final ys0 d;

    public or0(ys0 ys0Var, Context context) {
        this.d = ys0Var;
        this.f38051c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        ns0[] ns0VarArr = this.d.f42146w1;
        if (ns0VarArr[5].f37681a.size() == 0 && !ns0VarArr[5].f37686g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ns0[] ns0VarArr = this.d.f42146w1;
        if (ns0VarArr[5].f37681a.size() == 0 && !ns0VarArr[5].f37686g) {
            return 1;
        }
        return ns0VarArr[5].f37681a.size();
    }

    @Override
    public final long c(int i7) {
        return i7;
    }

    @Override
    public final int d(int i7) {
        ns0[] ns0VarArr = this.d.f42146w1;
        if (ns0VarArr[5].f37681a.size() == 0 && !ns0VarArr[5].f37686g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        char c10;
        if (e1Var.f58539f == 12) {
            ys0 ys0Var = this.d;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) ys0Var.f42146w1[5].f37681a.get(i7);
            TLRPC.Document F0 = gjVar.F0();
            if (F0 != null) {
                View view = e1Var.f58535a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(gjVar.f23819k.date, gjVar, F0);
                    boolean z10 = false;
                    if (ys0Var.F1) {
                        SparseArray[] sparseArrayArr = ys0Var.f42087c1;
                        if (org.telegram.messenger.gj.B0(gjVar.f23819k) == ys0Var.f42116m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                            z10 = true;
                        }
                        h2Var.c(z10, !ys0Var.f42093e1);
                        return;
                    }
                    h2Var.c(false, !ys0Var.f42093e1);
                }
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = ys0Var.I1;
        Context context = this.f38051c;
        if (i7 == 11) {
            p3 X = ys0.X(5, ys0Var.f42116m1, context, e6Var);
            X.setLayoutParams(new v4.p0(-1, -1));
            return new v4.e1(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, e6Var, true);
        h2Var.setCanPreviewGif(true);
        return new v4.e1(h2Var);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.h2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) view).getPhotoImage();
            if (this.d.f42119n0[0].F == 5) {
                photoImage.f22301u0 = true;
                photoImage.P0(false);
                return;
            }
            photoImage.f22301u0 = false;
            photoImage.Q0();
        }
    }
}
