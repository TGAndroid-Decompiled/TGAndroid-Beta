package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e50 implements DialogInterface.OnShowListener {
    public final int f37209a;
    public final org.telegram.ui.ActionBar.a2 f37210b;
    public final EditTextBoldCursor f37211c;
    public final Object d;

    public e50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37209a = i10;
        this.d = obj;
        this.f37210b = a2Var;
        this.f37211c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37209a) {
            case 0:
                ((j50) this.d).f38840b.t1(null, this.f37210b, this.f37211c, true);
                return;
            default:
                ((f50) this.d).f37547n.f38840b.t1(null, this.f37210b, this.f37211c, true);
                return;
        }
    }
}
