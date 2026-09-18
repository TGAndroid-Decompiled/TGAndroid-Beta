package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i50 implements DialogInterface.OnShowListener {
    public final int f34438a;
    public final org.telegram.ui.ActionBar.c2 f34439b;
    public final EditTextBoldCursor f34440c;
    public final Object d;

    public i50(Object obj, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f34438a = i10;
        this.d = obj;
        this.f34439b = c2Var;
        this.f34440c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f34438a) {
            case 0:
                ((n50) this.d).f35950b.s1(null, this.f34439b, this.f34440c, true);
                return;
            default:
                ((j50) this.d).f34781n.f35950b.s1(null, this.f34439b, this.f34440c, true);
                return;
        }
    }
}
