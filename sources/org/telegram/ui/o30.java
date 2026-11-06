package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class o30 implements org.telegram.ui.Components.o5 {
    public final int f48219a;
    public final Object f48220b;

    public o30(Object obj, int i7) {
        this.f48219a = i7;
        this.f48220b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f48219a) {
            case 0:
                Iterator it = ((p30) this.f48220b).f48610i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                a11 a11Var = (a11) this.f48220b;
                a11Var.getClass();
                if (!ch.e0.f6232b && a11Var.getParent() != null) {
                    ((View) a11Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
