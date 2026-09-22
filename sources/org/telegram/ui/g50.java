package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f33834a;
    public final org.telegram.ui.ActionBar.b2 f33835b;
    public final EditTextBoldCursor f33836c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f33834a = i10;
        this.d = obj;
        this.f33835b = b2Var;
        this.f33836c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33834a) {
            case 0:
                ((l50) this.d).f35324b.s1(null, this.f33835b, this.f33836c, true);
                return;
            default:
                ((h50) this.d).f34139n.f35324b.s1(null, this.f33835b, this.f33836c, true);
                return;
        }
    }
}
