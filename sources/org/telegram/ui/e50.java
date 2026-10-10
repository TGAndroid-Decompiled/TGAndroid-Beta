package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e50 implements DialogInterface.OnShowListener {
    public final int f37198a;
    public final org.telegram.ui.ActionBar.b2 f37199b;
    public final EditTextBoldCursor f37200c;
    public final Object d;

    public e50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37198a = i10;
        this.d = obj;
        this.f37199b = b2Var;
        this.f37200c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37198a) {
            case 0:
                ((j50) this.d).f38870b.t1(null, this.f37199b, this.f37200c, true);
                return;
            default:
                ((f50) this.d).f37496n.f38870b.t1(null, this.f37199b, this.f37200c, true);
                return;
        }
    }
}
