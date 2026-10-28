package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class nf implements Utilities.CallbackReturn {
    public final int f41786a;
    public final Object f41787b;
    public final Object f41788c;

    public nf(int i10, Object obj, Object obj2) {
        this.f41786a = i10;
        this.f41787b = obj;
        this.f41788c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f41786a) {
            case 0:
                wn wnVar = (wn) this.f41787b;
                View view = (View) this.f41788c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = wnVar.f45291t5;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    s1Var = (org.telegram.ui.Cells.s1) view;
                } else {
                    s1Var = null;
                }
                wnVar.d8(uRLSpan, false, messageObject, s1Var);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.f41787b, (String) this.f41788c, null, null);
        }
    }
}
