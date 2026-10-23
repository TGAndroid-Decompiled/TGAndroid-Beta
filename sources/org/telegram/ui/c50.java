package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class c50 implements org.telegram.ui.Components.x5 {
    public final int f35824a;
    public final Object f35825b;

    public c50(Object obj, int i10) {
        this.f35824a = i10;
        this.f35825b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f35824a) {
            case 0:
                Iterator it = ((d50) this.f35825b).f36272i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                g51 g51Var = (g51) this.f35825b;
                g51Var.getClass();
                if (!ah.x0.f901b && g51Var.getParent() != null) {
                    ((View) g51Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
