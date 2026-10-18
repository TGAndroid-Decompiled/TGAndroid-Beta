package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q40 implements DialogInterface.OnShowListener {
    public final int f40273a;
    public final org.telegram.ui.ActionBar.b2 f40274b;
    public final EditTextBoldCursor f40275c;
    public final Object d;

    public q40(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f40273a = i10;
        this.d = obj;
        this.f40274b = b2Var;
        this.f40275c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40273a) {
            case 0:
                ((v40) this.d).f42093b.t1(null, this.f40274b, this.f40275c, true);
                return;
            default:
                ((r40) this.d).f40563n.f42093b.t1(null, this.f40274b, this.f40275c, true);
                return;
        }
    }
}
