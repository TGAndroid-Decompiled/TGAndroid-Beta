package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ns0 extends sk0 {
    public final Context f28886c;
    public final zt0 d;

    public ns0(zt0 zt0Var, Context context) {
        this.d = zt0Var;
        this.f28886c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        ot0[] ot0VarArr = this.d.f33234v1;
        if (ot0VarArr[5].f29177a.size() == 0 && !ot0VarArr[5].f29181g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ot0[] ot0VarArr = this.d.f33234v1;
        if (ot0VarArr[5].f29177a.size() == 0 && !ot0VarArr[5].f29181g) {
            return 1;
        }
        return ot0VarArr[5].f29177a.size();
    }

    @Override
    public final long c(int i10) {
        return i10;
    }

    @Override
    public final int d(int i10) {
        ot0[] ot0VarArr = this.d.f33234v1;
        if (ot0VarArr[5].f29177a.size() == 0 && !ot0VarArr[5].f29181g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f47901f == 12) {
            zt0 zt0Var = this.d;
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) zt0Var.f33234v1[5].f29177a.get(i10);
            TLRPC.Document F0 = jjVar.F0();
            if (F0 != null) {
                View view = c1Var.f47898a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(jjVar.f16337k.date, jjVar, F0);
                    boolean z10 = false;
                    if (zt0Var.E1) {
                        SparseArray[] sparseArrayArr = zt0Var.f33174b1;
                        if (org.telegram.messenger.jj.B0(jjVar.f16337k) == zt0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                            z10 = true;
                        }
                        h2Var.c(z10, !zt0Var.f33181d1);
                        return;
                    }
                    h2Var.c(false, !zt0Var.f33181d1);
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        zt0 zt0Var = this.d;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.f28886c;
        if (i10 == 11) {
            p3 V = zt0.V(5, zt0Var.l1, context, p6Var);
            V.setLayoutParams(new s4.o0(-1, -1));
            return new s4.c1(V);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, p6Var, true);
        h2Var.setCanPreviewGif(true);
        return new s4.c1(h2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.h2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) view).getPhotoImage();
            if (this.d.m0[0].E == 5) {
                photoImage.f14408t0 = true;
                photoImage.P0(false);
                return;
            }
            photoImage.f14408t0 = false;
            photoImage.Q0();
        }
    }
}
