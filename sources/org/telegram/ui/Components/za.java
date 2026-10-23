package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class za extends lm0 {
    public final int f33197c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f33198f;

    public za(ij ijVar, Context context) {
        this.f33197c = 1;
        this.f33198f = ijVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.i0 i0Var) {
        switch (this.f33197c) {
            case 0:
                ((lm0) this.e).B(new ya(this, i0Var));
                return;
            default:
                super.B(i0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.f33197c) {
            case 0:
                return ((lm0) this.e).D(b1Var);
            default:
                if (b1Var.f46346f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f33197c) {
            case 0:
                return ((lm0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f33197c) {
            case 0:
                bb bbVar = (bb) this.f33198f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((lm0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        switch (this.f33197c) {
            case 0:
                bb bbVar = (bb) this.f33198f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((lm0) this.e).v(b1Var, i10 - (!bbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.bb bbVar2 = (org.telegram.ui.Cells.bb) b1Var.f46343a;
                bbVar2.d(1, false, false);
                bbVar2.setSize(((ij) this.f33198f).f27325r);
                bbVar2.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.f33197c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.b1(new ai.jc((bb) this.f33198f, this.d));
                }
                return ((lm0) this.e).x(viewGroup, i10);
            default:
                hj hjVar = new hj(this, this.d);
                hjVar.f22190b = false;
                return new s4.b1(hjVar);
        }
    }

    public za(bb bbVar, lm0 lm0Var, Context context) {
        this.f33197c = 0;
        this.f33198f = bbVar;
        this.e = lm0Var;
        this.d = context;
    }
}
