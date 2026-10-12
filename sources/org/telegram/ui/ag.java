package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class ag implements Utilities.CallbackReturn {
    public final int f35792a;
    public final Object f35793b;
    public final Object f35794c;

    public ag(int i10, Object obj, Object obj2) {
        this.f35792a = i10;
        this.f35793b = obj;
        this.f35794c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f35792a) {
            case 0:
                eo eoVar = (eo) this.f35793b;
                View view = (View) this.f35794c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = eoVar.f37233d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                eoVar.X7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f35793b, (String) this.f35794c, null, null);
        }
    }
}
