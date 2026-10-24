package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class g50 implements org.telegram.ui.Components.v5 {
    public final int f37455a;
    public final Object f37456b;

    public g50(Object obj, int i10) {
        this.f37455a = i10;
        this.f37456b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37455a) {
            case 0:
                Iterator it = ((h50) this.f37456b).f37754i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                j51 j51Var = (j51) this.f37456b;
                j51Var.getClass();
                if (!ah.x0.f902b && j51Var.getParent() != null) {
                    ((View) j51Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
