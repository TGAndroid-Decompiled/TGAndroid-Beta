package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class za extends hm0 {
    public final int f32877c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f32878f;

    public za(ij ijVar, Context context) {
        this.f32877c = 1;
        this.f32878f = ijVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.i0 i0Var) {
        switch (this.f32877c) {
            case 0:
                ((hm0) this.e).B(new ya(this, i0Var));
                return;
            default:
                super.B(i0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.f32877c) {
            case 0:
                return ((hm0) this.e).D(b1Var);
            default:
                if (b1Var.f45961f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f32877c) {
            case 0:
                return ((hm0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f32877c) {
            case 0:
                bb bbVar = (bb) this.f32878f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((hm0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        switch (this.f32877c) {
            case 0:
                bb bbVar = (bb) this.f32878f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((hm0) this.e).v(b1Var, i10 - (!bbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) b1Var.f45958a;
                abVar.d(1, false, false);
                abVar.setSize(((ij) this.f32878f).f27247r);
                abVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.f32877c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.b1(new ai.ic((bb) this.f32878f, this.d));
                }
                return ((hm0) this.e).x(viewGroup, i10);
            default:
                hj hjVar = new hj(this, this.d);
                hjVar.f22022b = false;
                return new s4.b1(hjVar);
        }
    }

    public za(bb bbVar, hm0 hm0Var, Context context) {
        this.f32877c = 0;
        this.f32878f = bbVar;
        this.e = hm0Var;
        this.d = context;
    }
}
