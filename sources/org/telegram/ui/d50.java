package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d50 implements DialogInterface.OnShowListener {
    public final int f33328a;
    public final org.telegram.ui.ActionBar.d2 f33329b;
    public final EditTextBoldCursor f33330c;
    public final Object d;

    public d50(Object obj, org.telegram.ui.ActionBar.d2 d2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f33328a = i10;
        this.d = obj;
        this.f33329b = d2Var;
        this.f33330c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33328a) {
            case 0:
                ((i50) this.d).f34803b.s1(null, this.f33329b, this.f33330c, true);
                return;
            default:
                ((e50) this.d).f33612n.f34803b.s1(null, this.f33329b, this.f33330c, true);
                return;
        }
    }
}
