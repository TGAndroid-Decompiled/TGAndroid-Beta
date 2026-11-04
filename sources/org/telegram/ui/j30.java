package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class j30 implements org.telegram.ui.Components.m5 {
    public final int f46490a;
    public final Object f46491b;

    public j30(Object obj, int i3) {
        this.f46490a = i3;
        this.f46491b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f46490a) {
            case 0:
                Iterator it = ((k30) this.f46491b).f46753i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                q01 q01Var = (q01) this.f46491b;
                q01Var.getClass();
                if (!dh.d0.f8983b && q01Var.getParent() != null) {
                    ((View) q01Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
