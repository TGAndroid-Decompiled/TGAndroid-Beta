package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e50 implements DialogInterface.OnShowListener {
    public final int f37243a;
    public final org.telegram.ui.ActionBar.a2 f37244b;
    public final EditTextBoldCursor f37245c;
    public final Object d;

    public e50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37243a = i10;
        this.d = obj;
        this.f37244b = a2Var;
        this.f37245c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37243a) {
            case 0:
                ((j50) this.d).f38874b.t1(null, this.f37244b, this.f37245c, true);
                return;
            default:
                ((f50) this.d).f37581n.f38874b.t1(null, this.f37244b, this.f37245c, true);
                return;
        }
    }
}
