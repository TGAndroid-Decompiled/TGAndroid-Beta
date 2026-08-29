package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p40 implements DialogInterface.OnShowListener {
    public final int f41292a;
    public final org.telegram.ui.ActionBar.c2 f41293b;
    public final EditTextBoldCursor f41294c;
    public final Object d;

    public p40(Object obj, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f41292a = i10;
        this.d = obj;
        this.f41293b = c2Var;
        this.f41294c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f41292a) {
            case 0:
                ((u40) this.d).f43179b.s1(null, this.f41293b, this.f41294c, true);
                return;
            default:
                ((q40) this.d).f41532n.f43179b.s1(null, this.f41293b, this.f41294c, true);
                return;
        }
    }
}
