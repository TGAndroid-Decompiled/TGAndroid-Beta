package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l50 implements DialogInterface.OnShowListener {
    public final int f37610a;
    public final org.telegram.ui.ActionBar.a2 f37611b;
    public final EditTextBoldCursor f37612c;
    public final Object d;

    public l50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37610a = i10;
        this.d = obj;
        this.f37611b = a2Var;
        this.f37612c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37610a) {
            case 0:
                ((q50) this.d).f39065b.t1(null, this.f37611b, this.f37612c, true);
                return;
            default:
                ((m50) this.d).f37911n.f39065b.t1(null, this.f37611b, this.f37612c, true);
                return;
        }
    }
}
