package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class g50 implements org.telegram.ui.Components.z5 {
    public final int f39549a;
    public final Object f39550b;

    public g50(Object obj, int i10) {
        this.f39549a = i10;
        this.f39550b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f39549a) {
            case 0:
                Iterator it = ((h50) this.f39550b).f39897i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                l51 l51Var = (l51) this.f39550b;
                l51Var.getClass();
                if (!bh.m0.f4082b && l51Var.getParent() != null) {
                    ((View) l51Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
