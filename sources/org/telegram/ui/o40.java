package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class o40 implements DialogInterface.OnShowListener {
    public final int f39773a;
    public final org.telegram.ui.ActionBar.b2 f39774b;
    public final EditTextBoldCursor f39775c;
    public final Object d;

    public o40(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f39773a = i10;
        this.d = obj;
        this.f39774b = b2Var;
        this.f39775c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f39773a) {
            case 0:
                ((t40) this.d).f41596b.t1(null, this.f39774b, this.f39775c, true);
                return;
            default:
                ((p40) this.d).f40065n.f41596b.t1(null, this.f39774b, this.f39775c, true);
                return;
        }
    }
}
