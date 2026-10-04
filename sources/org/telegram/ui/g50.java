package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f36498a;
    public final org.telegram.ui.ActionBar.b2 f36499b;
    public final EditTextBoldCursor f36500c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f36498a = i10;
        this.d = obj;
        this.f36499b = b2Var;
        this.f36500c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36498a) {
            case 0:
                ((l50) this.d).f38163b.s1(null, this.f36499b, this.f36500c, true);
                return;
            default:
                ((h50) this.d).f36867n.f38163b.s1(null, this.f36499b, this.f36500c, true);
                return;
        }
    }
}
