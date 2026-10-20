package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class of implements Utilities.CallbackReturn {
    public final int f39875a;
    public final Object f39876b;
    public final Object f39877c;

    public of(int i10, Object obj, Object obj2) {
        this.f39875a = i10;
        this.f39876b = obj;
        this.f39877c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f39875a) {
            case 0:
                qn qnVar = (qn) this.f39876b;
                View view = (View) this.f39877c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = qnVar.f40657d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                qnVar.X7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.f39876b, (String) this.f39877c, null, null);
        }
    }
}
