package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class pf implements Utilities.CallbackReturn {
    public final int f40026a;
    public final Object f40027b;
    public final Object f40028c;

    public pf(int i10, Object obj, Object obj2) {
        this.f40026a = i10;
        this.f40027b = obj;
        this.f40028c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f40026a) {
            case 0:
                xn xnVar = (xn) this.f40027b;
                View view = (View) this.f40028c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = xnVar.f43117a5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                xnVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return fh.c.d((View) obj, (String) this.f40027b, (String) this.f40028c, null, null);
        }
    }
}
