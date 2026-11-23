package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class q30 implements org.telegram.ui.Components.u5 {
    public final int f51298a;
    public final Object f51299b;

    public q30(Object obj, int i7) {
        this.f51298a = i7;
        this.f51299b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f51298a) {
            case 0:
                Iterator it = ((r30) this.f51299b).f51605i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                a11 a11Var = (a11) this.f51299b;
                a11Var.getClass();
                if (!ch.f0.f5346b && a11Var.getParent() != null) {
                    ((View) a11Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
