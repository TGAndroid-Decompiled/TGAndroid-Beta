package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class xa extends km0 {
    public final int f32557c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f32558f;

    public xa(gj gjVar, Context context) {
        this.f32557c = 1;
        this.f32558f = gjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.i0 i0Var) {
        switch (this.f32557c) {
            case 0:
                ((km0) this.e).B(new wa(this, i0Var));
                return;
            default:
                super.B(i0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.f32557c) {
            case 0:
                return ((km0) this.e).D(b1Var);
            default:
                if (b1Var.f46345f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f32557c) {
            case 0:
                return ((km0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f32557c) {
            case 0:
                za zaVar = (za) this.f32558f;
                if (zaVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((km0) this.e).j(i10 - (!zaVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        switch (this.f32557c) {
            case 0:
                za zaVar = (za) this.f32558f;
                if (zaVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((km0) this.e).v(b1Var, i10 - (!zaVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) b1Var.f46342a;
                bbVar.d(1, false, false);
                bbVar.setSize(((gj) this.f32558f).f26699r);
                bbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.f32557c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.b1(new ai.jc((za) this.f32558f, this.d));
                }
                return ((km0) this.e).x(viewGroup, i10);
            default:
                fj fjVar = new fj(this, this.d);
                fjVar.f22191b = false;
                return new s4.b1(fjVar);
        }
    }

    public xa(za zaVar, km0 km0Var, Context context) {
        this.f32557c = 0;
        this.f32558f = zaVar;
        this.e = km0Var;
        this.d = context;
    }
}
