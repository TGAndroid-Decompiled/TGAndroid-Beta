package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class qa extends dk0 {
    public final int f38855c;
    public final Context d;
    public final Object f38856e;
    public final KeyEvent.Callback f38857f;

    public qa(hj hjVar, Context context) {
        this.f38855c = 1;
        this.f38857f = hjVar;
        this.f38856e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(v4.k0 k0Var) {
        switch (this.f38855c) {
            case 0:
                ((dk0) this.f38856e).B(new pa(this, k0Var));
                return;
            default:
                super.B(k0Var);
                return;
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.f38855c) {
            case 0:
                return ((dk0) this.f38856e).D(f1Var);
            default:
                if (f1Var.f59165f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.f38855c) {
            case 0:
                return ((dk0) this.f38856e).b() + 1;
            default:
                return ((ArrayList) this.f38856e).size();
        }
    }

    @Override
    public final int d(int i7) {
        int i10;
        switch (this.f38855c) {
            case 0:
                sa saVar = (sa) this.f38857f;
                if (saVar.K1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 == i10) {
                    return -1000;
                }
                return ((dk0) this.f38856e).d(i7 - (!saVar.K1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        switch (this.f38855c) {
            case 0:
                sa saVar = (sa) this.f38857f;
                if (saVar.K1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 != i10) {
                    ((dk0) this.f38856e).t(f1Var, i7 - (!saVar.K1 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) f1Var.f59161a;
                vaVar.d(1, false, false);
                vaVar.setSize(((hj) this.f38857f).f35922r);
                vaVar.e(1, ((ArrayList) this.f38856e).get(i7), null, 0);
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.f38855c) {
            case 0:
                if (i7 == -1000) {
                    return new v4.f1(new bi.m3((sa) this.f38857f, this.d));
                }
                return ((dk0) this.f38856e).x(viewGroup, i7);
            default:
                gj gjVar = new gj(this, this.d);
                gjVar.f32217b = false;
                return new v4.f1(gjVar);
        }
    }

    public qa(sa saVar, dk0 dk0Var, Context context) {
        this.f38855c = 0;
        this.f38857f = saVar;
        this.f38856e = dk0Var;
        this.d = context;
    }
}
