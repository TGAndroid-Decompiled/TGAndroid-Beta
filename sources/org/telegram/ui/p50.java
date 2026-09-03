package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class p50 implements org.telegram.ui.Components.r5 {
    public final int f39894a;
    public final Object f39895b;

    public p50(Object obj, int i10) {
        this.f39894a = i10;
        this.f39895b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f39894a) {
            case 0:
                Iterator it = ((q50) this.f39895b).f40331i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                f61 f61Var = (f61) this.f39895b;
                f61Var.getClass();
                if (!ng.g0.f16070b && f61Var.getParent() != null) {
                    ((View) f61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
