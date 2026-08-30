package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class pf implements Utilities.CallbackReturn {
    public final int f37298a;
    public final Object f37299b;
    public final Object f37300c;

    public pf(int i10, Object obj, Object obj2) {
        this.f37298a = i10;
        this.f37299b = obj;
        this.f37300c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f37298a) {
            case 0:
                xn xnVar = (xn) this.f37299b;
                View view = (View) this.f37300c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = xnVar.f39949a5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                xnVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return eh.c.d((View) obj, (String) this.f37299b, (String) this.f37300c, null, null);
        }
    }
}
