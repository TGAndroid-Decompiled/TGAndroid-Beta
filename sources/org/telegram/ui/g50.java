package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f37935a;
    public final org.telegram.ui.ActionBar.a2 f37936b;
    public final EditTextBoldCursor f37937c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37935a = i10;
        this.d = obj;
        this.f37936b = a2Var;
        this.f37937c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37935a) {
            case 0:
                ((l50) this.d).f39640b.t1(null, this.f37936b, this.f37937c, true);
                return;
            default:
                ((h50) this.d).f38247n.f39640b.t1(null, this.f37936b, this.f37937c, true);
                return;
        }
    }
}
