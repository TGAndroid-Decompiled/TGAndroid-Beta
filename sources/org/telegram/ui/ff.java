package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class ff implements org.telegram.messenger.d20 {
    public final int f45726a;
    public final Object f45727b;
    public final Object f45728c;

    public ff(int i7, Object obj, Object obj2) {
        this.f45726a = i7;
        this.f45727b = obj;
        this.f45728c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f45726a) {
            case 0:
                cn cnVar = (cn) this.f45727b;
                View view = (View) this.f45728c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.ij ijVar = cnVar.f44669t5;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) view;
                } else {
                    q1Var = null;
                }
                cnVar.k8(uRLSpan, false, ijVar, q1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f45727b, (String) this.f45728c, null, null);
        }
    }
}
