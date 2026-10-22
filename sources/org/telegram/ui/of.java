package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class of implements Utilities.CallbackReturn {
    public final int f39878a;
    public final Object f39879b;
    public final Object f39880c;

    public of(int i10, Object obj, Object obj2) {
        this.f39878a = i10;
        this.f39879b = obj;
        this.f39880c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f39878a) {
            case 0:
                qn qnVar = (qn) this.f39879b;
                View view = (View) this.f39880c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = qnVar.f40660d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                qnVar.X7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.f39879b, (String) this.f39880c, null, null);
        }
    }
}
