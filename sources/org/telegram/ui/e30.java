package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e30 implements DialogInterface.OnShowListener {
    public final int f47308a;
    public final org.telegram.ui.ActionBar.t1 f47309b;
    public final EditTextBoldCursor f47310c;
    public final Object d;

    public e30(Object obj, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f47308a = i7;
        this.d = obj;
        this.f47309b = t1Var;
        this.f47310c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47308a) {
            case 0:
                ((j30) this.d).f48977b.w1(null, this.f47309b, this.f47310c, true);
                return;
            default:
                ((f30) this.d).f47674s1.f48977b.w1(null, this.f47309b, this.f47310c, true);
                return;
        }
    }
}
