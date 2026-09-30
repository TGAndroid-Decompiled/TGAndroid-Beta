package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b50 implements DialogInterface.OnShowListener {
    public final int f32393a;
    public final org.telegram.ui.ActionBar.a2 f32394b;
    public final EditTextBoldCursor f32395c;
    public final Object d;

    public b50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32393a = i10;
        this.d = obj;
        this.f32394b = a2Var;
        this.f32395c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32393a) {
            case 0:
                ((g50) this.d).f33969b.s1(null, this.f32394b, this.f32395c, true);
                return;
            default:
                ((c50) this.d).f32656n.f33969b.s1(null, this.f32394b, this.f32395c, true);
                return;
        }
    }
}
