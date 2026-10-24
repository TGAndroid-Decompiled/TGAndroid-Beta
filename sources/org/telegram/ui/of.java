package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class of implements Utilities.CallbackReturn {
    public final int f40171a;
    public final Object f40172b;
    public final Object f40173c;

    public of(int i10, Object obj, Object obj2) {
        this.f40171a = i10;
        this.f40172b = obj;
        this.f40173c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f40171a) {
            case 0:
                sn snVar = (sn) this.f40172b;
                View view = (View) this.f40173c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = snVar.p5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                snVar.X7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.f40172b, (String) this.f40173c, null, null);
        }
    }
}
