package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f33774a;
    public final org.telegram.ui.ActionBar.b2 f33775b;
    public final EditTextBoldCursor f33776c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f33774a = i10;
        this.d = obj;
        this.f33775b = b2Var;
        this.f33776c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33774a) {
            case 0:
                ((l50) this.d).f35326b.s1(null, this.f33775b, this.f33776c, true);
                return;
            default:
                ((h50) this.d).f34099n.f35326b.s1(null, this.f33775b, this.f33776c, true);
                return;
        }
    }
}
