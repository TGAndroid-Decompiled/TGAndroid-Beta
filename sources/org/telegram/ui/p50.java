package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class p50 implements org.telegram.ui.Components.w5 {
    public final int f36400a;
    public final Object f36401b;

    public p50(Object obj, int i10) {
        this.f36400a = i10;
        this.f36401b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f36400a) {
            case 0:
                Iterator it = ((q50) this.f36401b).f36793i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                j61 j61Var = (j61) this.f36401b;
                j61Var.getClass();
                if (!zg.e0.f49290b && j61Var.getParent() != null) {
                    ((View) j61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
