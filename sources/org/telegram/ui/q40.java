package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class q40 implements DialogInterface.OnShowListener {

    public final int f41515a;

    public final org.telegram.ui.ActionBar.b2 f41516b;

    public final EditTextBoldCursor f41517c;
    public final Object d;

    public q40(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f41515a = i10;
        this.d = obj;
        this.f41516b = b2Var;
        this.f41517c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f41515a) {
            case 0:
                ((v40) this.d).f43351b.s1(null, this.f41516b, this.f41517c, true);
                break;
            default:
                ((r40) this.d).f41806n.f43351b.s1(null, this.f41516b, this.f41517c, true);
                break;
        }
    }
}
