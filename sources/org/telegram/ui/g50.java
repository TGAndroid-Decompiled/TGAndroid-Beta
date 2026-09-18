package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g50 implements DialogInterface.OnShowListener {
    public final int f33699a;
    public final org.telegram.ui.ActionBar.b2 f33700b;
    public final EditTextBoldCursor f33701c;
    public final Object d;

    public g50(Object obj, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f33699a = i10;
        this.d = obj;
        this.f33700b = b2Var;
        this.f33701c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33699a) {
            case 0:
                ((l50) this.d).f35254b.s1(null, this.f33700b, this.f33701c, true);
                return;
            default:
                ((h50) this.d).f34081n.f35254b.s1(null, this.f33700b, this.f33701c, true);
                return;
        }
    }
}
