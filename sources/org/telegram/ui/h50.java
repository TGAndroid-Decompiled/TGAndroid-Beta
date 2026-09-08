package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class h50 implements DialogInterface.OnShowListener {
    public final int f36912a;
    public final org.telegram.ui.ActionBar.b2 f36913b;
    public final EditTextBoldCursor f36914c;
    public final Object d;

    public h50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f36912a = i10;
        this.d = obj;
        this.f36913b = b2Var;
        this.f36914c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36912a) {
            case 0:
                ((m50) this.d).f38601b.s1(null, this.f36913b, this.f36914c, true);
                return;
            default:
                ((i50) this.d).f37270n.f38601b.s1(null, this.f36913b, this.f36914c, true);
                return;
        }
    }
}
