package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class bf implements org.telegram.messenger.v10 {
    public final int f44031a;
    public final Object f44032b;
    public final Object f44033c;

    public bf(int i3, Object obj, Object obj2) {
        this.f44031a = i3;
        this.f44032b = obj;
        this.f44033c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f44031a) {
            case 0:
                wm wmVar = (wm) this.f44032b;
                View view = (View) this.f44033c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.zi ziVar = wmVar.f51500u5;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) view;
                } else {
                    q1Var = null;
                }
                wmVar.j8(uRLSpan, false, ziVar, q1Var);
                return Boolean.TRUE;
            default:
                return uh.c.d((View) obj, (String) this.f44032b, (String) this.f44033c, null, null);
        }
    }
}
