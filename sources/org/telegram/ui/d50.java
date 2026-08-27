package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

public final class d50 implements org.telegram.ui.Components.q5 {

    public final int f37265a;

    public final Object f37266b;

    public d50(Object obj, int i10) {
        this.f37265a = i10;
        this.f37266b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37265a) {
            case 0:
                Iterator it = ((e50) this.f37266b).f37630i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                j51 j51Var = (j51) this.f37266b;
                j51Var.getClass();
                if (!ig.g0.f11303b && j51Var.getParent() != null) {
                    ((View) j51Var.getParent()).invalidate();
                }
                break;
        }
    }
}
