package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e50 implements DialogInterface.OnShowListener {
    public final int f33133a;
    public final org.telegram.ui.ActionBar.c2 f33134b;
    public final EditTextBoldCursor f33135c;
    public final Object d;

    public e50(Object obj, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f33133a = i10;
        this.d = obj;
        this.f33134b = c2Var;
        this.f33135c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33133a) {
            case 0:
                ((j50) this.d).f34637b.s1(null, this.f33134b, this.f33135c, true);
                return;
            default:
                ((f50) this.d).f33428n.f34637b.s1(null, this.f33134b, this.f33135c, true);
                return;
        }
    }
}
