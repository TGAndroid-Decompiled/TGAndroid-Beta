package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e50 implements DialogInterface.OnShowListener {
    public final int f37154a;
    public final org.telegram.ui.ActionBar.b2 f37155b;
    public final EditTextBoldCursor f37156c;
    public final Object d;

    public e50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37154a = i10;
        this.d = obj;
        this.f37155b = b2Var;
        this.f37156c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37154a) {
            case 0:
                ((j50) this.d).f38826b.t1(null, this.f37155b, this.f37156c, true);
                return;
            default:
                ((f50) this.d).f37452n.f38826b.t1(null, this.f37155b, this.f37156c, true);
                return;
        }
    }
}
