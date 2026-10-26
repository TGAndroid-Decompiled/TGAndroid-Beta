package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class of implements Utilities.CallbackReturn {
    public final int f42173a;
    public final Object f42174b;
    public final Object f42175c;

    public of(int i10, Object obj, Object obj2) {
        this.f42173a = i10;
        this.f42174b = obj;
        this.f42175c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f42173a) {
            case 0:
                un unVar = (un) this.f42174b;
                View view = (View) this.f42175c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = unVar.f44374p5;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    s1Var = (org.telegram.ui.Cells.s1) view;
                } else {
                    s1Var = null;
                }
                unVar.b8(uRLSpan, false, messageObject, s1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f42174b, (String) this.f42175c, null, null);
        }
    }
}
