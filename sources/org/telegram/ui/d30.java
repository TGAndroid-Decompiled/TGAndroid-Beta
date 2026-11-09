package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d30 implements DialogInterface.OnShowListener {
    public final int f44810a;
    public final org.telegram.ui.ActionBar.u1 f44811b;
    public final EditTextBoldCursor f44812c;
    public final Object d;

    public d30(Object obj, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f44810a = i7;
        this.d = obj;
        this.f44811b = u1Var;
        this.f44812c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f44810a) {
            case 0:
                ((j30) this.d).f46823b.v1(null, this.f44811b, this.f44812c, true);
                return;
            default:
                ((e30) this.d).f45171o1.f46823b.v1(null, this.f44811b, this.f44812c, true);
                return;
        }
    }
}
