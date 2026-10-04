package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f36499a;
    public final org.telegram.ui.ActionBar.b2 f36500b;
    public final EditTextBoldCursor f36501c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f36499a = i10;
        this.d = obj;
        this.f36500b = b2Var;
        this.f36501c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36499a) {
            case 0:
                ((l50) this.d).f38164b.s1(null, this.f36500b, this.f36501c, true);
                return;
            default:
                ((h50) this.d).f36868n.f38164b.s1(null, this.f36500b, this.f36501c, true);
                return;
        }
    }
}
