package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class of implements Utilities.CallbackReturn {
    public final int f39879a;
    public final Object f39880b;
    public final Object f39881c;

    public of(int i10, Object obj, Object obj2) {
        this.f39879a = i10;
        this.f39880b = obj;
        this.f39881c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f39879a) {
            case 0:
                qn qnVar = (qn) this.f39880b;
                View view = (View) this.f39881c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = qnVar.f40661d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                qnVar.X7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.f39880b, (String) this.f39881c, null, null);
        }
    }
}
