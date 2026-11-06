package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b30 implements DialogInterface.OnShowListener {
    public final int f44169a;
    public final org.telegram.ui.ActionBar.u1 f44170b;
    public final EditTextBoldCursor f44171c;
    public final Object d;

    public b30(Object obj, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f44169a = i7;
        this.d = obj;
        this.f44170b = u1Var;
        this.f44171c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f44169a) {
            case 0:
                ((h30) this.d).f46206b.v1(null, this.f44170b, this.f44171c, true);
                return;
            default:
                ((c30) this.d).f44533o1.f46206b.v1(null, this.f44170b, this.f44171c, true);
                return;
        }
    }
}
