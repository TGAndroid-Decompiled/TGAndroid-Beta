package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ra extends vk0 {
    public final int f32120c;
    public final Context d;
    public final Object f32121e;
    public final KeyEvent.Callback f32122f;

    public ra(yi yiVar, Context context) {
        this.f32120c = 1;
        this.f32122f = yiVar;
        this.f32121e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(f2.t0 t0Var) {
        switch (this.f32120c) {
            case 0:
                ((vk0) this.f32121e).B(new qa(this, t0Var));
                return;
            default:
                super.B(t0Var);
                return;
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        switch (this.f32120c) {
            case 0:
                return ((vk0) this.f32121e).D(q1Var);
            default:
                if (q1Var.f5505f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f32120c) {
            case 0:
                return ((vk0) this.f32121e).h() + 1;
            default:
                return ((ArrayList) this.f32121e).size();
        }
    }

    @Override
    public final int j(int i9) {
        int i10;
        switch (this.f32120c) {
            case 0:
                sa saVar = (sa) this.f32122f;
                if (saVar.M) {
                    i10 = h() - 1;
                } else {
                    i10 = 0;
                }
                if (i9 == i10) {
                    return -1000;
                }
                return ((vk0) this.f32121e).j(i9 - (!saVar.M ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        switch (this.f32120c) {
            case 0:
                sa saVar = (sa) this.f32122f;
                if (saVar.M) {
                    i10 = h() - 1;
                } else {
                    i10 = 0;
                }
                if (i9 != i10) {
                    ((vk0) this.f32121e).v(q1Var, i9 - (!saVar.M ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) q1Var.f5501a;
                zaVar.d(1, false, false);
                zaVar.setSize(((yi) this.f32122f).f34974r);
                zaVar.e(1, ((ArrayList) this.f32121e).get(i9), null, 0);
                return;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        switch (this.f32120c) {
            case 0:
                if (i9 == -1000) {
                    return new f2.q1(new fh.l2((sa) this.f32122f, this.d));
                }
                return ((vk0) this.f32121e).x(viewGroup, i9);
            default:
                xi xiVar = new xi(this, this.d);
                xiVar.f26049b = false;
                return new f2.q1(xiVar);
        }
    }

    public ra(sa saVar, vk0 vk0Var, Context context) {
        this.f32120c = 0;
        this.f32122f = saVar;
        this.f32121e = vk0Var;
        this.d = context;
    }
}
