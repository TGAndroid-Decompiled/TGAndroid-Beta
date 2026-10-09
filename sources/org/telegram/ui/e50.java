package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e50 implements DialogInterface.OnShowListener {
    public final int f37152a;
    public final org.telegram.ui.ActionBar.b2 f37153b;
    public final EditTextBoldCursor f37154c;
    public final Object d;

    public e50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37152a = i10;
        this.d = obj;
        this.f37153b = b2Var;
        this.f37154c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37152a) {
            case 0:
                ((j50) this.d).f38824b.t1(null, this.f37153b, this.f37154c, true);
                return;
            default:
                ((f50) this.d).f37450n.f38824b.t1(null, this.f37153b, this.f37154c, true);
                return;
        }
    }
}
