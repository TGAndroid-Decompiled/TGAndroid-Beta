package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class lf implements Utilities.CallbackReturn {
    public final int f40124a;
    public final Object f40125b;
    public final Object f40126c;

    public lf(int i9, Object obj, Object obj2) {
        this.f40124a = i9;
        this.f40125b = obj;
        this.f40126c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f40124a) {
            case 0:
                qn qnVar = (qn) this.f40125b;
                View view = (View) this.f40126c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = qnVar.Z4;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                qnVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return zg.c.d((View) obj, (String) this.f40125b, (String) this.f40126c, null, null);
        }
    }
}
