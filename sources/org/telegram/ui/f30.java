package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f30 implements DialogInterface.OnShowListener {
    public final int f47393a;
    public final org.telegram.ui.ActionBar.u1 f47394b;
    public final EditTextBoldCursor f47395c;
    public final Object d;

    public f30(Object obj, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f47393a = i7;
        this.d = obj;
        this.f47394b = u1Var;
        this.f47395c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47393a) {
            case 0:
                ((k30) this.d).f49146b.w1(null, this.f47394b, this.f47395c, true);
                return;
            default:
                ((g30) this.d).f47854s1.f49146b.w1(null, this.f47394b, this.f47395c, true);
                return;
        }
    }
}
