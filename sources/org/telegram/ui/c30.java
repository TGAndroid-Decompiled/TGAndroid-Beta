package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class c30 implements DialogInterface.OnShowListener {
    public final int f45877a;
    public final org.telegram.ui.ActionBar.t1 f45878b;
    public final EditTextBoldCursor f45879c;
    public final Object d;

    public c30(Object obj, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f45877a = i7;
        this.d = obj;
        this.f45878b = t1Var;
        this.f45879c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f45877a) {
            case 0:
                ((h30) this.d).f47588b.v1(null, this.f45878b, this.f45879c, true);
                return;
            default:
                ((d30) this.d).f46270s1.f47588b.v1(null, this.f45878b, this.f45879c, true);
                return;
        }
    }
}
