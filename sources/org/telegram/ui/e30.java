package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e30 implements DialogInterface.OnShowListener {
    public final int f45112a;
    public final org.telegram.ui.ActionBar.u1 f45113b;
    public final EditTextBoldCursor f45114c;
    public final Object d;

    public e30(Object obj, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f45112a = i7;
        this.d = obj;
        this.f45113b = u1Var;
        this.f45114c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f45112a) {
            case 0:
                ((k30) this.d).f47153b.v1(null, this.f45113b, this.f45114c, true);
                return;
            default:
                ((f30) this.d).f45497r1.f47153b.v1(null, this.f45113b, this.f45114c, true);
                return;
        }
    }
}
