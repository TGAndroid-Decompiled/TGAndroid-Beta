package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b50 implements DialogInterface.OnShowListener {
    public final int f32319a;
    public final org.telegram.ui.ActionBar.a2 f32320b;
    public final EditTextBoldCursor f32321c;
    public final Object d;

    public b50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32319a = i10;
        this.d = obj;
        this.f32320b = a2Var;
        this.f32321c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32319a) {
            case 0:
                ((g50) this.d).f33829b.s1(null, this.f32320b, this.f32321c, true);
                return;
            default:
                ((c50) this.d).f32571n.f33829b.s1(null, this.f32320b, this.f32321c, true);
                return;
        }
    }
}
