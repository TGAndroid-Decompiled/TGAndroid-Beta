package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class ef implements org.telegram.messenger.d20 {
    public final int f45402a;
    public final Object f45403b;
    public final Object f45404c;

    public ef(int i7, Object obj, Object obj2) {
        this.f45402a = i7;
        this.f45403b = obj;
        this.f45404c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f45402a) {
            case 0:
                cn cnVar = (cn) this.f45403b;
                View view = (View) this.f45404c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.ij ijVar = cnVar.f44628t5;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) view;
                } else {
                    q1Var = null;
                }
                cnVar.k8(uRLSpan, false, ijVar, q1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f45403b, (String) this.f45404c, null, null);
        }
    }
}
