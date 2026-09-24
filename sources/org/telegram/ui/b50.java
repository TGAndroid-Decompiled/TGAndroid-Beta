package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b50 implements DialogInterface.OnShowListener {
    public final int f32305a;
    public final org.telegram.ui.ActionBar.a2 f32306b;
    public final EditTextBoldCursor f32307c;
    public final Object d;

    public b50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32305a = i10;
        this.d = obj;
        this.f32306b = a2Var;
        this.f32307c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32305a) {
            case 0:
                ((g50) this.d).f33813b.s1(null, this.f32306b, this.f32307c, true);
                return;
            default:
                ((c50) this.d).f32556n.f33813b.s1(null, this.f32306b, this.f32307c, true);
                return;
        }
    }
}
