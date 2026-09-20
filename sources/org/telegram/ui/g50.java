package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f33806a;
    public final org.telegram.ui.ActionBar.b2 f33807b;
    public final EditTextBoldCursor f33808c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f33806a = i10;
        this.d = obj;
        this.f33807b = b2Var;
        this.f33808c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33806a) {
            case 0:
                ((l50) this.d).f35306b.s1(null, this.f33807b, this.f33808c, true);
                return;
            default:
                ((h50) this.d).f34123n.f35306b.s1(null, this.f33807b, this.f33808c, true);
                return;
        }
    }
}
