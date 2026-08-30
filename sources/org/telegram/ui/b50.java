package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b50 implements DialogInterface.OnShowListener {
    public final int f32795a;
    public final org.telegram.ui.ActionBar.d2 f32796b;
    public final EditTextBoldCursor f32797c;
    public final Object d;

    public b50(Object obj, org.telegram.ui.ActionBar.d2 d2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32795a = i10;
        this.d = obj;
        this.f32796b = d2Var;
        this.f32797c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32795a) {
            case 0:
                ((g50) this.d).f34449b.s1(null, this.f32796b, this.f32797c, true);
                return;
            default:
                ((c50) this.d).f33096n.f34449b.s1(null, this.f32796b, this.f32797c, true);
                return;
        }
    }
}
