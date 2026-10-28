package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class za extends mm0 {
    public final int f35303c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f35304f;

    public za(ij ijVar, Context context) {
        this.f35303c = 1;
        this.f35304f = ijVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.j0 j0Var) {
        switch (this.f35303c) {
            case 0:
                ((mm0) this.e).B(new ya(this, j0Var));
                return;
            default:
                super.B(j0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        switch (this.f35303c) {
            case 0:
                return ((mm0) this.e).D(e1Var);
            default:
                if (e1Var.f47776f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f35303c) {
            case 0:
                return ((mm0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f35303c) {
            case 0:
                bb bbVar = (bb) this.f35304f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((mm0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        switch (this.f35303c) {
            case 0:
                bb bbVar = (bb) this.f35304f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((mm0) this.e).v(e1Var, i10 - (!bbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) e1Var.f47773a;
                fbVar.d(1, false, false);
                fbVar.setSize(((ij) this.f35304f).f29341r);
                fbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        switch (this.f35303c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.e1(new bi.cc((bb) this.f35304f, this.d));
                }
                return ((mm0) this.e).x(viewGroup, i10);
            default:
                hj hjVar = new hj(this, this.d);
                hjVar.f24126b = false;
                return new s4.e1(hjVar);
        }
    }

    public za(bb bbVar, mm0 mm0Var, Context context) {
        this.f35303c = 0;
        this.f35304f = bbVar;
        this.e = mm0Var;
        this.d = context;
    }
}
