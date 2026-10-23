package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class g50 implements org.telegram.ui.Components.x5 {
    public final int f37494a;
    public final Object f37495b;

    public g50(Object obj, int i10) {
        this.f37494a = i10;
        this.f37495b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37494a) {
            case 0:
                Iterator it = ((h50) this.f37495b).f37749i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                k51 k51Var = (k51) this.f37495b;
                k51Var.getClass();
                if (!ah.x0.f902b && k51Var.getParent() != null) {
                    ((View) k51Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
