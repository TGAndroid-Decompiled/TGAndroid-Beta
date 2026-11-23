package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f30 implements DialogInterface.OnShowListener {
    public final int f47427a;
    public final org.telegram.ui.ActionBar.t1 f47428b;
    public final EditTextBoldCursor f47429c;
    public final Object d;

    public f30(Object obj, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f47427a = i7;
        this.d = obj;
        this.f47428b = t1Var;
        this.f47429c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47427a) {
            case 0:
                ((k30) this.d).f49147b.w1(null, this.f47428b, this.f47429c, true);
                return;
            default:
                ((g30) this.d).f47875s1.f49147b.w1(null, this.f47428b, this.f47429c, true);
                return;
        }
    }
}
