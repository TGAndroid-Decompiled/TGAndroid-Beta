package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class za extends im0 {
    public final int f32868c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f32869f;

    public za(ij ijVar, Context context) {
        this.f32868c = 1;
        this.f32869f = ijVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.i0 i0Var) {
        switch (this.f32868c) {
            case 0:
                ((im0) this.e).B(new ya(this, i0Var));
                return;
            default:
                super.B(i0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.f32868c) {
            case 0:
                return ((im0) this.e).D(b1Var);
            default:
                if (b1Var.f45924f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f32868c) {
            case 0:
                return ((im0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f32868c) {
            case 0:
                bb bbVar = (bb) this.f32869f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((im0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        switch (this.f32868c) {
            case 0:
                bb bbVar = (bb) this.f32869f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((im0) this.e).v(b1Var, i10 - (!bbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) b1Var.f45921a;
                abVar.d(1, false, false);
                abVar.setSize(((ij) this.f32869f).f27284r);
                abVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.f32868c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.b1(new ai.ic((bb) this.f32869f, this.d));
                }
                return ((im0) this.e).x(viewGroup, i10);
            default:
                hj hjVar = new hj(this, this.d);
                hjVar.f22023b = false;
                return new s4.b1(hjVar);
        }
    }

    public za(bb bbVar, im0 im0Var, Context context) {
        this.f32868c = 0;
        this.f32869f = bbVar;
        this.e = im0Var;
        this.d = context;
    }
}
