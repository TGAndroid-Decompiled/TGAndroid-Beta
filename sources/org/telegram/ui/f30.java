package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f30 implements DialogInterface.OnShowListener {
    public final int f47461a;
    public final org.telegram.ui.ActionBar.t1 f47462b;
    public final EditTextBoldCursor f47463c;
    public final Object d;

    public f30(Object obj, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f47461a = i7;
        this.d = obj;
        this.f47462b = t1Var;
        this.f47463c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47461a) {
            case 0:
                ((k30) this.d).f49189b.w1(null, this.f47462b, this.f47463c, true);
                return;
            default:
                ((g30) this.d).f47924s1.f49189b.w1(null, this.f47462b, this.f47463c, true);
                return;
        }
    }
}
