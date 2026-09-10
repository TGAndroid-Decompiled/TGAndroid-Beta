package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ya extends ul0 {
    public final int f29284c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f29285f;

    public ya(mj mjVar, Context context) {
        this.f29284c = 1;
        this.f29285f = mjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.j0 j0Var) {
        switch (this.f29284c) {
            case 0:
                ((ul0) this.e).B(new xa(this, j0Var));
                return;
            default:
                super.B(j0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f29284c) {
            case 0:
                return ((ul0) this.e).D(c1Var);
            default:
                if (c1Var.f41613f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f29284c) {
            case 0:
                return ((ul0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f29284c) {
            case 0:
                ab abVar = (ab) this.f29285f;
                if (abVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((ul0) this.e).j(i10 - (!abVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        switch (this.f29284c) {
            case 0:
                ab abVar = (ab) this.f29285f;
                if (abVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((ul0) this.e).v(c1Var, i10 - (!abVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.gb gbVar = (org.telegram.ui.Cells.gb) c1Var.f41610a;
                gbVar.d(1, false, false);
                gbVar.setSize(((mj) this.f29285f).f25240r);
                gbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f29284c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.c1(new bi.nc((ab) this.f29285f, this.d));
                }
                return ((ul0) this.e).x(viewGroup, i10);
            default:
                lj ljVar = new lj(this, this.d);
                ljVar.f19230b = false;
                return new s4.c1(ljVar);
        }
    }

    public ya(ab abVar, ul0 ul0Var, Context context) {
        this.f29284c = 0;
        this.f29285f = abVar;
        this.e = ul0Var;
        this.d = context;
    }
}
