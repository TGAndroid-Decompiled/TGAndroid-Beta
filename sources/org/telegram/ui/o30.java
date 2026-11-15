package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class o30 implements org.telegram.ui.Components.m5 {
    public final int f49798a;
    public final Object f49799b;

    public o30(Object obj, int i7) {
        this.f49798a = i7;
        this.f49799b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f49798a) {
            case 0:
                Iterator it = ((p30) this.f49799b).f50126i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                x01 x01Var = (x01) this.f49799b;
                x01Var.getClass();
                if (!ch.f0.f5065b && x01Var.getParent() != null) {
                    ((View) x01Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
