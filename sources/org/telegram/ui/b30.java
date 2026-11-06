package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b30 implements DialogInterface.OnShowListener {
    public final int f44153a;
    public final org.telegram.ui.ActionBar.u1 f44154b;
    public final EditTextBoldCursor f44155c;
    public final Object d;

    public b30(Object obj, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f44153a = i7;
        this.d = obj;
        this.f44154b = u1Var;
        this.f44155c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f44153a) {
            case 0:
                ((h30) this.d).f46186b.v1(null, this.f44154b, this.f44155c, true);
                return;
            default:
                ((c30) this.d).f44512o1.f46186b.v1(null, this.f44154b, this.f44155c, true);
                return;
        }
    }
}
