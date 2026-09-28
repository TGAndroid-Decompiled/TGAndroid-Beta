package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b50 implements DialogInterface.OnShowListener {
    public final int f32318a;
    public final org.telegram.ui.ActionBar.a2 f32319b;
    public final EditTextBoldCursor f32320c;
    public final Object d;

    public b50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32318a = i10;
        this.d = obj;
        this.f32319b = a2Var;
        this.f32320c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32318a) {
            case 0:
                ((g50) this.d).f33828b.s1(null, this.f32319b, this.f32320c, true);
                return;
            default:
                ((c50) this.d).f32570n.f33828b.s1(null, this.f32319b, this.f32320c, true);
                return;
        }
    }
}
