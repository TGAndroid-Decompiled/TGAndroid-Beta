package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class ef implements org.telegram.messenger.d20 {
    public final int f45335a;
    public final Object f45336b;
    public final Object f45337c;

    public ef(int i7, Object obj, Object obj2) {
        this.f45335a = i7;
        this.f45336b = obj;
        this.f45337c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f45335a) {
            case 0:
                an anVar = (an) this.f45336b;
                View view = (View) this.f45337c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.ij ijVar = anVar.f43966t5;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) view;
                } else {
                    q1Var = null;
                }
                anVar.j8(uRLSpan, false, ijVar, q1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f45336b, (String) this.f45337c, null, null);
        }
    }
}
