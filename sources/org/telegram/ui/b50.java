package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b50 implements DialogInterface.OnShowListener {
    public final int f32321a;
    public final org.telegram.ui.ActionBar.a2 f32322b;
    public final EditTextBoldCursor f32323c;
    public final Object d;

    public b50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32321a = i10;
        this.d = obj;
        this.f32322b = a2Var;
        this.f32323c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32321a) {
            case 0:
                ((g50) this.d).f33829b.s1(null, this.f32322b, this.f32323c, true);
                return;
            default:
                ((c50) this.d).f32572n.f33829b.s1(null, this.f32322b, this.f32323c, true);
                return;
        }
    }
}
