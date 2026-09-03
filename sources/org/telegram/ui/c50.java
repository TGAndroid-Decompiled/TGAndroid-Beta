package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class c50 implements DialogInterface.OnShowListener {
    public final int f35691a;
    public final org.telegram.ui.ActionBar.d2 f35692b;
    public final EditTextBoldCursor f35693c;
    public final Object d;

    public c50(Object obj, org.telegram.ui.ActionBar.d2 d2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f35691a = i10;
        this.d = obj;
        this.f35692b = d2Var;
        this.f35693c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35691a) {
            case 0:
                ((h50) this.d).f37225b.s1(null, this.f35692b, this.f35693c, true);
                return;
            default:
                ((d50) this.d).f35981n.f37225b.s1(null, this.f35692b, this.f35693c, true);
                return;
        }
    }
}
