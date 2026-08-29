package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class hf implements Utilities.CallbackReturn {
    public final int f38890a;
    public final Object f38891b;
    public final Object f38892c;

    public hf(int i10, Object obj, Object obj2) {
        this.f38890a = i10;
        this.f38891b = obj;
        this.f38892c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f38890a) {
            case 0:
                tn tnVar = (tn) this.f38891b;
                View view = (View) this.f38892c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = tnVar.Z4;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    s1Var = (org.telegram.ui.Cells.s1) view;
                } else {
                    s1Var = null;
                }
                tnVar.U7(uRLSpan, false, messageObject, s1Var);
                return Boolean.TRUE;
            default:
                return ch.c.d((View) obj, (String) this.f38891b, (String) this.f38892c, null, null);
        }
    }
}
