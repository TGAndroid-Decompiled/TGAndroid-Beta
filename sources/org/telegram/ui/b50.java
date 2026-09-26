package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b50 implements DialogInterface.OnShowListener {
    public final int f32317a;
    public final org.telegram.ui.ActionBar.a2 f32318b;
    public final EditTextBoldCursor f32319c;
    public final Object d;

    public b50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32317a = i10;
        this.d = obj;
        this.f32318b = a2Var;
        this.f32319c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32317a) {
            case 0:
                ((g50) this.d).f33827b.s1(null, this.f32318b, this.f32319c, true);
                return;
            default:
                ((c50) this.d).f32569n.f33827b.s1(null, this.f32318b, this.f32319c, true);
                return;
        }
    }
}
