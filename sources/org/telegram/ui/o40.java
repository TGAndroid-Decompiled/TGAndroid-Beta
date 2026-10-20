package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class o40 implements DialogInterface.OnShowListener {
    public final int f39769a;
    public final org.telegram.ui.ActionBar.b2 f39770b;
    public final EditTextBoldCursor f39771c;
    public final Object d;

    public o40(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f39769a = i10;
        this.d = obj;
        this.f39770b = b2Var;
        this.f39771c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f39769a) {
            case 0:
                ((t40) this.d).f41592b.t1(null, this.f39770b, this.f39771c, true);
                return;
            default:
                ((p40) this.d).f40061n.f41592b.t1(null, this.f39770b, this.f39771c, true);
                return;
        }
    }
}
