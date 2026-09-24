package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class p50 implements org.telegram.ui.Components.w5 {
    public final int f36391a;
    public final Object f36392b;

    public p50(Object obj, int i10) {
        this.f36391a = i10;
        this.f36392b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f36391a) {
            case 0:
                Iterator it = ((q50) this.f36392b).f36779i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                j61 j61Var = (j61) this.f36392b;
                j61Var.getClass();
                if (!zg.e0.f49280b && j61Var.getParent() != null) {
                    ((View) j61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
