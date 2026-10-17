package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q40 implements DialogInterface.OnShowListener {
    public final int f40309a;
    public final org.telegram.ui.ActionBar.b2 f40310b;
    public final EditTextBoldCursor f40311c;
    public final Object d;

    public q40(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f40309a = i10;
        this.d = obj;
        this.f40310b = b2Var;
        this.f40311c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40309a) {
            case 0:
                ((v40) this.d).f42118b.t1(null, this.f40310b, this.f40311c, true);
                return;
            default:
                ((r40) this.d).f40572n.f42118b.t1(null, this.f40310b, this.f40311c, true);
                return;
        }
    }
}
