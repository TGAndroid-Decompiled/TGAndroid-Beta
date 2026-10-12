package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f37937a;
    public final org.telegram.ui.ActionBar.a2 f37938b;
    public final EditTextBoldCursor f37939c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37937a = i10;
        this.d = obj;
        this.f37938b = a2Var;
        this.f37939c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37937a) {
            case 0:
                ((l50) this.d).f39646b.t1(null, this.f37938b, this.f37939c, true);
                return;
            default:
                ((h50) this.d).f38247n.f39646b.t1(null, this.f37938b, this.f37939c, true);
                return;
        }
    }
}
