package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class ef implements org.telegram.messenger.z10 {
    public final int f47252a;
    public final Object f47253b;
    public final Object f47254c;

    public ef(int i7, Object obj, Object obj2) {
        this.f47252a = i7;
        this.f47253b = obj;
        this.f47254c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.r1 r1Var;
        switch (this.f47252a) {
            case 0:
                bn bnVar = (bn) this.f47253b;
                View view = (View) this.f47254c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.gj gjVar = bnVar.f46228v5;
                if (view instanceof org.telegram.ui.Cells.r1) {
                    r1Var = (org.telegram.ui.Cells.r1) view;
                } else {
                    r1Var = null;
                }
                bnVar.l8(uRLSpan, false, gjVar, r1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f47253b, (String) this.f47254c, null, null);
        }
    }
}
