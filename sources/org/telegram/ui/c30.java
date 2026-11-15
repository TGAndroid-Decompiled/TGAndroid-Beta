package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class c30 implements DialogInterface.OnShowListener {
    public final int f45888a;
    public final org.telegram.ui.ActionBar.t1 f45889b;
    public final EditTextBoldCursor f45890c;
    public final Object d;

    public c30(Object obj, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f45888a = i7;
        this.d = obj;
        this.f45889b = t1Var;
        this.f45890c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f45888a) {
            case 0:
                ((h30) this.d).f47598b.v1(null, this.f45889b, this.f45890c, true);
                return;
            default:
                ((d30) this.d).f46298s1.f47598b.v1(null, this.f45889b, this.f45890c, true);
                return;
        }
    }
}
