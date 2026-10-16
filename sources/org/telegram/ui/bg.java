package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class bg implements Utilities.CallbackReturn {
    public final int f34324a;
    public final Object f34325b;
    public final Object f34326c;

    public bg(int i10, Object obj, Object obj2) {
        this.f34324a = i10;
        this.f34325b = obj;
        this.f34326c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f34324a) {
            case 0:
                fo foVar = (fo) this.f34325b;
                View view = (View) this.f34326c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = foVar.f35617d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                foVar.X7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.f34325b, (String) this.f34326c, null, null);
        }
    }
}
