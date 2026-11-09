package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class q30 implements org.telegram.ui.Components.o5 {
    public final int f48877a;
    public final Object f48878b;

    public q30(Object obj, int i7) {
        this.f48877a = i7;
        this.f48878b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f48877a) {
            case 0:
                Iterator it = ((r30) this.f48878b).f49262i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                c11 c11Var = (c11) this.f48878b;
                c11Var.getClass();
                if (!ch.e0.f6230b && c11Var.getParent() != null) {
                    ((View) c11Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
