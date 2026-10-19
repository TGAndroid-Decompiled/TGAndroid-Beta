package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class o40 implements DialogInterface.OnShowListener {
    public final int f39764a;
    public final org.telegram.ui.ActionBar.b2 f39765b;
    public final EditTextBoldCursor f39766c;
    public final Object d;

    public o40(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f39764a = i10;
        this.d = obj;
        this.f39765b = b2Var;
        this.f39766c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f39764a) {
            case 0:
                ((t40) this.d).f41587b.t1(null, this.f39765b, this.f39766c, true);
                return;
            default:
                ((p40) this.d).f40064n.f41587b.t1(null, this.f39765b, this.f39766c, true);
                return;
        }
    }
}
