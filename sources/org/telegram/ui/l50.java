package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l50 implements DialogInterface.OnShowListener {
    public final int f37844a;
    public final org.telegram.ui.ActionBar.a2 f37845b;
    public final EditTextBoldCursor f37846c;
    public final Object d;

    public l50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37844a = i10;
        this.d = obj;
        this.f37845b = a2Var;
        this.f37846c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37844a) {
            case 0:
                ((q50) this.d).f39344b.t1(null, this.f37845b, this.f37846c, true);
                return;
            default:
                ((m50) this.d).f38165n.f39344b.t1(null, this.f37845b, this.f37846c, true);
                return;
        }
    }
}
