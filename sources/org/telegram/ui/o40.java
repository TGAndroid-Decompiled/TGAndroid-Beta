package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class o40 implements DialogInterface.OnShowListener {
    public final int f39763a;
    public final org.telegram.ui.ActionBar.b2 f39764b;
    public final EditTextBoldCursor f39765c;
    public final Object d;

    public o40(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f39763a = i10;
        this.d = obj;
        this.f39764b = b2Var;
        this.f39765c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f39763a) {
            case 0:
                ((t40) this.d).f41586b.t1(null, this.f39764b, this.f39765c, true);
                return;
            default:
                ((p40) this.d).f40055n.f41586b.t1(null, this.f39764b, this.f39765c, true);
                return;
        }
    }
}
