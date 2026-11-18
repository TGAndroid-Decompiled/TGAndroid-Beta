package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class ef implements org.telegram.messenger.y10 {
    public final int f47213a;
    public final Object f47214b;
    public final Object f47215c;

    public ef(int i7, Object obj, Object obj2) {
        this.f47213a = i7;
        this.f47214b = obj;
        this.f47215c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.r1 r1Var;
        switch (this.f47213a) {
            case 0:
                bn bnVar = (bn) this.f47214b;
                View view = (View) this.f47215c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.fj fjVar = bnVar.f46201v5;
                if (view instanceof org.telegram.ui.Cells.r1) {
                    r1Var = (org.telegram.ui.Cells.r1) view;
                } else {
                    r1Var = null;
                }
                bnVar.l8(uRLSpan, false, fjVar, r1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f47214b, (String) this.f47215c, null, null);
        }
    }
}
