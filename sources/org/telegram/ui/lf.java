package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

public final class lf implements Utilities.CallbackReturn {

    public final int f40071a;

    public final Object f40072b;

    public final Object f40073c;

    public lf(int i10, Object obj, Object obj2) {
        this.f40071a = i10;
        this.f40072b = obj;
        this.f40073c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f40071a) {
            case 0:
                rn rnVar = (rn) this.f40072b;
                View view = (View) this.f40073c;
                rnVar.U7((URLSpan) obj, false, rnVar.Z4, view instanceof org.telegram.ui.Cells.s1 ? (org.telegram.ui.Cells.s1) view : null);
                return Boolean.TRUE;
            default:
                return ah.c.d((View) obj, (String) this.f40072b, (String) this.f40073c, null, null);
        }
    }
}
