package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class h50 implements DialogInterface.OnShowListener {
    public final int f36885a;
    public final org.telegram.ui.ActionBar.b2 f36886b;
    public final EditTextBoldCursor f36887c;
    public final Object d;

    public h50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f36885a = i10;
        this.d = obj;
        this.f36886b = b2Var;
        this.f36887c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36885a) {
            case 0:
                ((m50) this.d).f38574b.s1(null, this.f36886b, this.f36887c, true);
                return;
            default:
                ((i50) this.d).f37243n.f38574b.s1(null, this.f36886b, this.f36887c, true);
                return;
        }
    }
}
