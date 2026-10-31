package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class fa extends sk0 {
    public final int f26020c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f26021f;

    public fa(qi qiVar, Context context) {
        this.f26020c = 1;
        this.f26021f = qiVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.i0 i0Var) {
        switch (this.f26020c) {
            case 0:
                ((sk0) this.e).B(new ea(this, i0Var));
                return;
            default:
                super.B(i0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f26020c) {
            case 0:
                return ((sk0) this.e).D(c1Var);
            default:
                if (c1Var.f47901f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.f26020c) {
            case 0:
                return ((sk0) this.e).b() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int d(int i10) {
        int i11;
        switch (this.f26020c) {
            case 0:
                ha haVar = (ha) this.f26021f;
                if (haVar.G1) {
                    i11 = b() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((sk0) this.e).d(i10 - (!haVar.G1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        switch (this.f26020c) {
            case 0:
                ha haVar = (ha) this.f26021f;
                if (haVar.G1) {
                    i11 = b() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((sk0) this.e).t(c1Var, i10 - (!haVar.G1 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) c1Var.f47898a;
                uaVar.d(1, false, false);
                uaVar.setSize(((qi) this.f26021f).f29660r);
                uaVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        switch (this.f26020c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.c1(new bi.t0((ha) this.f26021f, this.d));
                }
                return ((sk0) this.e).w(viewGroup, i10);
            default:
                pi piVar = new pi(this, this.d);
                piVar.f23151b = false;
                return new s4.c1(piVar);
        }
    }

    public fa(ha haVar, sk0 sk0Var, Context context) {
        this.f26020c = 0;
        this.f26021f = haVar;
        this.e = sk0Var;
        this.d = context;
    }
}
