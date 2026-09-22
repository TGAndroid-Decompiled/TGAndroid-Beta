package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class xa extends kl0 {
    public final int f29908c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f29909f;

    public xa(jj jjVar, Context context) {
        this.f29908c = 1;
        this.f29909f = jjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.j0 j0Var) {
        switch (this.f29908c) {
            case 0:
                ((kl0) this.e).B(new wa(this, j0Var));
                return;
            default:
                super.B(j0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f29908c) {
            case 0:
                return ((kl0) this.e).D(c1Var);
            default:
                if (c1Var.f42674f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f29908c) {
            case 0:
                return ((kl0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f29908c) {
            case 0:
                za zaVar = (za) this.f29909f;
                if (zaVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((kl0) this.e).j(i10 - (!zaVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        switch (this.f29908c) {
            case 0:
                za zaVar = (za) this.f29909f;
                if (zaVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((kl0) this.e).v(c1Var, i10 - (!zaVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) c1Var.f42671a;
                fbVar.d(1, false, false);
                fbVar.setSize(((jj) this.f29909f).f25352r);
                fbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f29908c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.c1(new ci.eb((za) this.f29909f, this.d));
                }
                return ((kl0) this.e).x(viewGroup, i10);
            default:
                ij ijVar = new ij(this, this.d);
                ijVar.f20096b = false;
                return new s4.c1(ijVar);
        }
    }

    public xa(za zaVar, kl0 kl0Var, Context context) {
        this.f29908c = 0;
        this.f29909f = zaVar;
        this.e = kl0Var;
        this.d = context;
    }
}
