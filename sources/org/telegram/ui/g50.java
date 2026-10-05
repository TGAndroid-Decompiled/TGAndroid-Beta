package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f36511a;
    public final org.telegram.ui.ActionBar.b2 f36512b;
    public final EditTextBoldCursor f36513c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f36511a = i10;
        this.d = obj;
        this.f36512b = b2Var;
        this.f36513c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36511a) {
            case 0:
                ((l50) this.d).f38233b.s1(null, this.f36512b, this.f36513c, true);
                return;
            default:
                ((h50) this.d).f36898n.f38233b.s1(null, this.f36512b, this.f36513c, true);
                return;
        }
    }
}
