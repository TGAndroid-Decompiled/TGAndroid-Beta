package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class za extends kl0 {
    public final int f33140c;
    public final Context d;
    public final Object f33141e;
    public final KeyEvent.Callback f33142f;

    public za(jj jjVar, Context context) {
        this.f33140c = 1;
        this.f33142f = jjVar;
        this.f33141e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.j0 j0Var) {
        switch (this.f33140c) {
            case 0:
                ((kl0) this.f33141e).B(new ya(this, j0Var));
                return;
            default:
                super.B(j0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f33140c) {
            case 0:
                return ((kl0) this.f33141e).D(c1Var);
            default:
                if (c1Var.f45771f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f33140c) {
            case 0:
                return ((kl0) this.f33141e).h() + 1;
            default:
                return ((ArrayList) this.f33141e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f33140c) {
            case 0:
                bb bbVar = (bb) this.f33142f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((kl0) this.f33141e).j(i10 - (!bbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        switch (this.f33140c) {
            case 0:
                bb bbVar = (bb) this.f33142f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((kl0) this.f33141e).v(c1Var, i10 - (!bbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) c1Var.f45767a;
                ebVar.d(1, false, false);
                ebVar.setSize(((jj) this.f33142f).f27542r);
                ebVar.e(1, ((ArrayList) this.f33141e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f33140c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.c1(new di.eb((bb) this.f33142f, this.d));
                }
                return ((kl0) this.f33141e).x(viewGroup, i10);
            default:
                ij ijVar = new ij(this, this.d);
                ijVar.f21914b = false;
                return new s4.c1(ijVar);
        }
    }

    public za(bb bbVar, kl0 kl0Var, Context context) {
        this.f33140c = 0;
        this.f33142f = bbVar;
        this.f33141e = kl0Var;
        this.d = context;
    }
}
