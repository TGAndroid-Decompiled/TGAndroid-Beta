package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class n40 implements org.telegram.ui.Components.l5 {
    public final int f39823a;
    public final Object f39824b;

    public n40(Object obj, int i10) {
        this.f39823a = i10;
        this.f39824b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f39823a) {
            case 0:
                Iterator it = ((o40) this.f39824b).f40133i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                s21 s21Var = (s21) this.f39824b;
                s21Var.getClass();
                if (!sg.e0.f48320b && s21Var.getParent() != null) {
                    ((View) s21Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
