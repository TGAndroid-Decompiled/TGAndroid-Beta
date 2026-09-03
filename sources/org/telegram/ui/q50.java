package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class q50 implements org.telegram.ui.Components.r5 {
    public final int f37307a;
    public final Object f37308b;

    public q50(Object obj, int i10) {
        this.f37307a = i10;
        this.f37308b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37307a) {
            case 0:
                Iterator it = ((r50) this.f37308b).f37707i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                f61 f61Var = (f61) this.f37308b;
                f61Var.getClass();
                if (!mg.g0.f13992b && f61Var.getParent() != null) {
                    ((View) f61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
