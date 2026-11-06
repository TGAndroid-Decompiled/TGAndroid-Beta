package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class ef implements org.telegram.messenger.d20 {
    public final int f45305a;
    public final Object f45306b;
    public final Object f45307c;

    public ef(int i7, Object obj, Object obj2) {
        this.f45305a = i7;
        this.f45306b = obj;
        this.f45307c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f45305a) {
            case 0:
                an anVar = (an) this.f45306b;
                View view = (View) this.f45307c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.ij ijVar = anVar.f43941t5;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) view;
                } else {
                    q1Var = null;
                }
                anVar.j8(uRLSpan, false, ijVar, q1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f45306b, (String) this.f45307c, null, null);
        }
    }
}
