package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a40 implements DialogInterface.OnShowListener {
    public final int f35546a;
    public final org.telegram.ui.ActionBar.x1 f35547b;
    public final EditTextBoldCursor f35548c;
    public final Object d;

    public a40(Object obj, org.telegram.ui.ActionBar.x1 x1Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f35546a = i10;
        this.d = obj;
        this.f35547b = x1Var;
        this.f35548c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35546a) {
            case 0:
                ((f40) this.d).f37176b.u1(null, this.f35547b, this.f35548c, true);
                return;
            default:
                ((b40) this.d).f35978o1.f37176b.u1(null, this.f35547b, this.f35548c, true);
                return;
        }
    }
}
