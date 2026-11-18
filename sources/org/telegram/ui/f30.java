package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f30 implements DialogInterface.OnShowListener {
    public final int f47437a;
    public final org.telegram.ui.ActionBar.u1 f47438b;
    public final EditTextBoldCursor f47439c;
    public final Object d;

    public f30(Object obj, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f47437a = i7;
        this.d = obj;
        this.f47438b = u1Var;
        this.f47439c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47437a) {
            case 0:
                ((k30) this.d).f49169b.w1(null, this.f47438b, this.f47439c, true);
                return;
            default:
                ((g30) this.d).f47890s1.f49169b.w1(null, this.f47438b, this.f47439c, true);
                return;
        }
    }
}
