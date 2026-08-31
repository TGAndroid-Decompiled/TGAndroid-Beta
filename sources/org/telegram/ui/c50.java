package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class c50 implements DialogInterface.OnShowListener {
    public final int f35679a;
    public final org.telegram.ui.ActionBar.d2 f35680b;
    public final EditTextBoldCursor f35681c;
    public final Object d;

    public c50(Object obj, org.telegram.ui.ActionBar.d2 d2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f35679a = i10;
        this.d = obj;
        this.f35680b = d2Var;
        this.f35681c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35679a) {
            case 0:
                ((h50) this.d).f37329b.s1(null, this.f35680b, this.f35681c, true);
                return;
            default:
                ((d50) this.d).f36006n.f37329b.s1(null, this.f35680b, this.f35681c, true);
                return;
        }
    }
}
