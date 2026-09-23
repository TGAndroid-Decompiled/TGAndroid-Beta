package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d50 implements DialogInterface.OnShowListener {
    public final int f32516a;
    public final org.telegram.ui.ActionBar.b2 f32517b;
    public final EditTextBoldCursor f32518c;
    public final Object d;

    public d50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32516a = i10;
        this.d = obj;
        this.f32517b = b2Var;
        this.f32518c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32516a) {
            case 0:
                ((i50) this.d).f34029b.s1(null, this.f32517b, this.f32518c, true);
                return;
            default:
                ((e50) this.d).f32811n.f34029b.s1(null, this.f32517b, this.f32518c, true);
                return;
        }
    }
}
