package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class e50 implements org.telegram.ui.Components.x5 {
    public final int f36402a;
    public final Object f36403b;

    public e50(Object obj, int i10) {
        this.f36402a = i10;
        this.f36403b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f36402a) {
            case 0:
                Iterator it = ((f50) this.f36403b).f36827i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                i51 i51Var = (i51) this.f36403b;
                i51Var.getClass();
                if (!ah.x0.f903b && i51Var.getParent() != null) {
                    ((View) i51Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
