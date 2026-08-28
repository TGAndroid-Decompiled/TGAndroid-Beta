package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class m40 implements DialogInterface.OnShowListener {
    public final int f40317a;
    public final org.telegram.ui.ActionBar.c2 f40318b;
    public final EditTextBoldCursor f40319c;
    public final Object d;

    public m40(Object obj, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, int i9) {
        this.f40317a = i9;
        this.d = obj;
        this.f40318b = c2Var;
        this.f40319c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40317a) {
            case 0:
                ((r40) this.d).f42265b.s1(null, this.f40318b, this.f40319c, true);
                return;
            default:
                ((n40) this.d).f40589n.f42265b.s1(null, this.f40318b, this.f40319c, true);
                return;
        }
    }
}
