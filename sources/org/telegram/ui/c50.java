package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class c50 implements org.telegram.ui.Components.x5 {
    public final int f35823a;
    public final Object f35824b;

    public c50(Object obj, int i10) {
        this.f35823a = i10;
        this.f35824b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f35823a) {
            case 0:
                Iterator it = ((d50) this.f35824b).f36271i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                g51 g51Var = (g51) this.f35824b;
                g51Var.getClass();
                if (!ah.x0.f901b && g51Var.getParent() != null) {
                    ((View) g51Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
