package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class ef implements org.telegram.messenger.z10 {
    public final int f47221a;
    public final Object f47222b;
    public final Object f47223c;

    public ef(int i7, Object obj, Object obj2) {
        this.f47221a = i7;
        this.f47222b = obj;
        this.f47223c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.r1 r1Var;
        switch (this.f47221a) {
            case 0:
                bn bnVar = (bn) this.f47222b;
                View view = (View) this.f47223c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.gj gjVar = bnVar.f46181v5;
                if (view instanceof org.telegram.ui.Cells.r1) {
                    r1Var = (org.telegram.ui.Cells.r1) view;
                } else {
                    r1Var = null;
                }
                bnVar.l8(uRLSpan, false, gjVar, r1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f47222b, (String) this.f47223c, null, null);
        }
    }
}
