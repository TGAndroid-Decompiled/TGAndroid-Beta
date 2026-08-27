package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class pa extends yk0 {

    public final int f31571c;
    public final Context d;

    public final Object f31572e;

    public final KeyEvent.Callback f31573f;

    public pa(ui uiVar, Context context) {
        this.f31571c = 1;
        this.f31573f = uiVar;
        this.f31572e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(f2.s0 s0Var) {
        switch (this.f31571c) {
            case 0:
                ((yk0) this.f31572e).B(new oa(this, s0Var));
                break;
            default:
                super.B(s0Var);
                break;
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        switch (this.f31571c) {
            case 0:
                return ((yk0) this.f31572e).D(o1Var);
            default:
                return o1Var.f5793f == 0;
        }
    }

    @Override
    public final int h() {
        switch (this.f31571c) {
            case 0:
                return ((yk0) this.f31572e).h() + 1;
            default:
                return ((ArrayList) this.f31572e).size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f31571c) {
            case 0:
                qa qaVar = (qa) this.f31573f;
                if (i10 == (qaVar.M ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((yk0) this.f31572e).j(i10 - (!qaVar.M ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        switch (this.f31571c) {
            case 0:
                qa qaVar = (qa) this.f31573f;
                if (i10 != (qaVar.M ? h() - 1 : 0)) {
                    ((yk0) this.f31572e).v(o1Var, i10 - (!qaVar.M ? 1 : 0));
                }
                break;
            default:
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) o1Var.f5789a;
                waVar.d(1, false, false);
                waVar.setSize(((ui) this.f31573f).f33087r);
                waVar.e(1, ((ArrayList) this.f31572e).get(i10), null, 0);
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        switch (this.f31571c) {
            case 0:
                return i10 == -1000 ? new lk0(new ag.s0((qa) this.f31573f, this.d)) : ((yk0) this.f31572e).x(viewGroup, i10);
            default:
                ti tiVar = new ti(this, this.d);
                tiVar.f25901b = false;
                return new lk0(tiVar);
        }
    }

    public pa(qa qaVar, yk0 yk0Var, Context context) {
        this.f31571c = 0;
        this.f31573f = qaVar;
        this.f31572e = yk0Var;
        this.d = context;
    }
}
