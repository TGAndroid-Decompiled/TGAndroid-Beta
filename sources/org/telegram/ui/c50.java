package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class c50 implements org.telegram.ui.Components.v5 {
    public final int f37002a;
    public final Object f37003b;

    public c50(Object obj, int i10) {
        this.f37002a = i10;
        this.f37003b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37002a) {
            case 0:
                Iterator it = ((d50) this.f37003b).f37305i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                m51 m51Var = (m51) this.f37003b;
                m51Var.getClass();
                if (!kg.g0.f13716b && m51Var.getParent() != null) {
                    ((View) m51Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
