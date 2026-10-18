package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q40 implements DialogInterface.OnShowListener {
    public final int f40315a;
    public final org.telegram.ui.ActionBar.b2 f40316b;
    public final EditTextBoldCursor f40317c;
    public final Object d;

    public q40(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f40315a = i10;
        this.d = obj;
        this.f40316b = b2Var;
        this.f40317c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40315a) {
            case 0:
                ((v40) this.d).f42135b.t1(null, this.f40316b, this.f40317c, true);
                return;
            default:
                ((r40) this.d).f40597n.f42135b.t1(null, this.f40316b, this.f40317c, true);
                return;
        }
    }
}
