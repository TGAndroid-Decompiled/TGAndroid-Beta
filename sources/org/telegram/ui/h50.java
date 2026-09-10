package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class h50 implements DialogInterface.OnShowListener {
    public final int f33275a;
    public final org.telegram.ui.ActionBar.d2 f33276b;
    public final EditTextBoldCursor f33277c;
    public final Object d;

    public h50(Object obj, org.telegram.ui.ActionBar.d2 d2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f33275a = i10;
        this.d = obj;
        this.f33276b = d2Var;
        this.f33277c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33275a) {
            case 0:
                ((m50) this.d).f34847b.s1(null, this.f33276b, this.f33277c, true);
                return;
            default:
                ((i50) this.d).f33537n.f34847b.s1(null, this.f33276b, this.f33277c, true);
                return;
        }
    }
}
