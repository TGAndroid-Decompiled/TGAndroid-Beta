package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f33764a;
    public final org.telegram.ui.ActionBar.b2 f33765b;
    public final EditTextBoldCursor f33766c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f33764a = i10;
        this.d = obj;
        this.f33765b = b2Var;
        this.f33766c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33764a) {
            case 0:
                ((l50) this.d).f35341b.s1(null, this.f33765b, this.f33766c, true);
                return;
            default:
                ((h50) this.d).f34158n.f35341b.s1(null, this.f33765b, this.f33766c, true);
                return;
        }
    }
}
