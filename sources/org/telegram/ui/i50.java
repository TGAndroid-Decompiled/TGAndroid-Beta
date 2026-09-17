package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i50 implements DialogInterface.OnShowListener {
    public final int f34433a;
    public final org.telegram.ui.ActionBar.c2 f34434b;
    public final EditTextBoldCursor f34435c;
    public final Object d;

    public i50(Object obj, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f34433a = i10;
        this.d = obj;
        this.f34434b = c2Var;
        this.f34435c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f34433a) {
            case 0:
                ((n50) this.d).f35945b.s1(null, this.f34434b, this.f34435c, true);
                return;
            default:
                ((j50) this.d).f34776n.f35945b.s1(null, this.f34434b, this.f34435c, true);
                return;
        }
    }
}
