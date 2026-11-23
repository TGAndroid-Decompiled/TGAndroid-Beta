package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f30 implements DialogInterface.OnShowListener {
    public final int f47465a;
    public final org.telegram.ui.ActionBar.t1 f47466b;
    public final EditTextBoldCursor f47467c;
    public final Object d;

    public f30(Object obj, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f47465a = i7;
        this.d = obj;
        this.f47466b = t1Var;
        this.f47467c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47465a) {
            case 0:
                ((k30) this.d).f49193b.w1(null, this.f47466b, this.f47467c, true);
                return;
            default:
                ((g30) this.d).f47928s1.f49193b.w1(null, this.f47466b, this.f47467c, true);
                return;
        }
    }
}
