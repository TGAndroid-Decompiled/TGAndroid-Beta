package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class i50 implements org.telegram.ui.Components.z5 {
    public final int f40045a;
    public final Object f40046b;

    public i50(Object obj, int i10) {
        this.f40045a = i10;
        this.f40046b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f40045a) {
            case 0:
                Iterator it = ((j50) this.f40046b).f40438i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                o51 o51Var = (o51) this.f40046b;
                o51Var.getClass();
                if (!bh.m0.f4082b && o51Var.getParent() != null) {
                    ((View) o51Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
