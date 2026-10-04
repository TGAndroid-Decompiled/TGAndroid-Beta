package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f36504a;
    public final org.telegram.ui.ActionBar.b2 f36505b;
    public final EditTextBoldCursor f36506c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f36504a = i10;
        this.d = obj;
        this.f36505b = b2Var;
        this.f36506c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36504a) {
            case 0:
                ((l50) this.d).f38169b.s1(null, this.f36505b, this.f36506c, true);
                return;
            default:
                ((h50) this.d).f36873n.f38169b.s1(null, this.f36505b, this.f36506c, true);
                return;
        }
    }
}
