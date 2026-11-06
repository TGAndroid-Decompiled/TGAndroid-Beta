package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b30 implements DialogInterface.OnShowListener {
    public final int f44168a;
    public final org.telegram.ui.ActionBar.u1 f44169b;
    public final EditTextBoldCursor f44170c;
    public final Object d;

    public b30(Object obj, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f44168a = i7;
        this.d = obj;
        this.f44169b = u1Var;
        this.f44170c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f44168a) {
            case 0:
                ((h30) this.d).f46205b.v1(null, this.f44169b, this.f44170c, true);
                return;
            default:
                ((c30) this.d).f44532o1.f46205b.v1(null, this.f44169b, this.f44170c, true);
                return;
        }
    }
}
