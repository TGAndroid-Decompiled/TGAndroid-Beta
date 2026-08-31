package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class p50 implements org.telegram.ui.Components.r5 {
    public final int f39926a;
    public final Object f39927b;

    public p50(Object obj, int i10) {
        this.f39926a = i10;
        this.f39927b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f39926a) {
            case 0:
                Iterator it = ((q50) this.f39927b).f40346i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                a61 a61Var = (a61) this.f39927b;
                a61Var.getClass();
                if (!ng.g0.f16068b && a61Var.getParent() != null) {
                    ((View) a61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
