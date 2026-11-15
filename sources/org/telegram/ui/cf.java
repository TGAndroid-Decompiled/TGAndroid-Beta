package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class cf implements org.telegram.messenger.a20 {
    public final int f46110a;
    public final Object f46111b;
    public final Object f46112c;

    public cf(int i7, Object obj, Object obj2) {
        this.f46110a = i7;
        this.f46111b = obj;
        this.f46112c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f46110a) {
            case 0:
                an anVar = (an) this.f46111b;
                View view = (View) this.f46112c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.gj gjVar = anVar.f45381u5;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) view;
                } else {
                    q1Var = null;
                }
                anVar.l8(uRLSpan, false, gjVar, q1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f46111b, (String) this.f46112c, null, null);
        }
    }
}
