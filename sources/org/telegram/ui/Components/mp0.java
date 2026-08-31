package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class mp0 extends f2.a1 {
    public final int f29181a;
    public final mq0 f29182b;

    public mp0(mq0 mq0Var, int i10) {
        this.f29181a = i10;
        this.f29182b = mq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        nb nbVar;
        switch (this.f29181a) {
            case 0:
                if (i11 != 0) {
                    mq0 mq0Var = this.f29182b;
                    mq0.s0(mq0Var);
                    mq0Var.f29213n0 = mq0Var.m0;
                    return;
                }
                return;
            case 1:
                mq0 mq0Var2 = this.f29182b;
                if (i11 != 0) {
                    mq0.s0(mq0Var2);
                    mq0Var2.f29213n0 = mq0Var2.m0;
                }
                ic icVar = ic.f27737w;
                if (icVar != null && (nbVar = icVar.f27741e) != null && (nbVar.getParent() instanceof View) && ((View) ic.f27737w.f27741e.getParent()).getParent() == mq0Var2.f29224w) {
                    ic.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = mq0Var2.L0) != null) {
                    eVar.f(i10, i11);
                    mq0.A0(mq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    mq0 mq0Var3 = this.f29182b;
                    mq0.s0(mq0Var3);
                    mq0Var3.f29213n0 = mq0Var3.m0;
                    return;
                }
                return;
        }
    }
}
