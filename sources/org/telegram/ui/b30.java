package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b30 implements DialogInterface.OnShowListener {
    public final int f44174a;
    public final org.telegram.ui.ActionBar.u1 f44175b;
    public final EditTextBoldCursor f44176c;
    public final Object d;

    public b30(Object obj, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f44174a = i7;
        this.d = obj;
        this.f44175b = u1Var;
        this.f44176c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f44174a) {
            case 0:
                ((h30) this.d).f46207b.v1(null, this.f44175b, this.f44176c, true);
                return;
            default:
                ((c30) this.d).f44535o1.f46207b.v1(null, this.f44175b, this.f44176c, true);
                return;
        }
    }
}
