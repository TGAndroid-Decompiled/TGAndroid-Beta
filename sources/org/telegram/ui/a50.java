package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class a50 implements org.telegram.ui.Components.q5 {
    public final int f36364a;
    public final Object f36365b;

    public a50(Object obj, int i9) {
        this.f36364a = i9;
        this.f36365b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f36364a) {
            case 0:
                Iterator it = ((b50) this.f36365b).f36651i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                k51 k51Var = (k51) this.f36365b;
                k51Var.getClass();
                if (!hg.h0.f10609b && k51Var.getParent() != null) {
                    ((View) k51Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
