package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class o40 implements DialogInterface.OnShowListener {
    public final int f39772a;
    public final org.telegram.ui.ActionBar.b2 f39773b;
    public final EditTextBoldCursor f39774c;
    public final Object d;

    public o40(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f39772a = i10;
        this.d = obj;
        this.f39773b = b2Var;
        this.f39774c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f39772a) {
            case 0:
                ((t40) this.d).f41595b.t1(null, this.f39773b, this.f39774c, true);
                return;
            default:
                ((p40) this.d).f40064n.f41595b.t1(null, this.f39773b, this.f39774c, true);
                return;
        }
    }
}
