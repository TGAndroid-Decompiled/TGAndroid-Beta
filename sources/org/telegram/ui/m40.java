package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class m40 implements org.telegram.ui.Components.l5 {
    public final int f39428a;
    public final Object f39429b;

    public m40(Object obj, int i10) {
        this.f39428a = i10;
        this.f39429b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f39428a) {
            case 0:
                Iterator it = ((n40) this.f39429b).f39691i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                q21 q21Var = (q21) this.f39429b;
                q21Var.getClass();
                if (!sg.e0.f48331b && q21Var.getParent() != null) {
                    ((View) q21Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
