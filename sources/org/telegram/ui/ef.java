package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class ef implements org.telegram.messenger.y10 {
    public final int f47212a;
    public final Object f47213b;
    public final Object f47214c;

    public ef(int i7, Object obj, Object obj2) {
        this.f47212a = i7;
        this.f47213b = obj;
        this.f47214c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f47212a) {
            case 0:
                bn bnVar = (bn) this.f47213b;
                View view = (View) this.f47214c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.fj fjVar = bnVar.f46210v5;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) view;
                } else {
                    q1Var = null;
                }
                bnVar.l8(uRLSpan, false, fjVar, q1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f47213b, (String) this.f47214c, null, null);
        }
    }
}
