package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class o50 implements org.telegram.ui.Components.r5 {
    public final int f36793a;
    public final Object f36794b;

    public o50(Object obj, int i10) {
        this.f36793a = i10;
        this.f36794b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f36793a) {
            case 0:
                Iterator it = ((p50) this.f36794b).f37190i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                y51 y51Var = (y51) this.f36794b;
                y51Var.getClass();
                if (!mg.g0.f14004b && y51Var.getParent() != null) {
                    ((View) y51Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
