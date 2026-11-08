package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class o30 implements org.telegram.ui.Components.o5 {
    public final int f48247a;
    public final Object f48248b;

    public o30(Object obj, int i7) {
        this.f48247a = i7;
        this.f48248b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f48247a) {
            case 0:
                Iterator it = ((p30) this.f48248b).f48598i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                a11 a11Var = (a11) this.f48248b;
                a11Var.getClass();
                if (!ch.e0.f6232b && a11Var.getParent() != null) {
                    ((View) a11Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
