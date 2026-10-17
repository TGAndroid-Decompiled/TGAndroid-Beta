package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class qf implements Utilities.CallbackReturn {
    public final int f40414a;
    public final Object f40415b;
    public final Object f40416c;

    public qf(int i10, Object obj, Object obj2) {
        this.f40414a = i10;
        this.f40415b = obj;
        this.f40416c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f40414a) {
            case 0:
                sn snVar = (sn) this.f40415b;
                View view = (View) this.f40416c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = snVar.f41189d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                snVar.X7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.f40415b, (String) this.f40416c, null, null);
        }
    }
}
