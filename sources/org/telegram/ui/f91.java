package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class f91 implements View.OnClickListener {
    public final int f36235a;
    public final Context f36236b;
    public final org.telegram.ui.ActionBar.d6 f36237c;

    public f91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f36235a = i10;
        this.f36236b = context;
        this.f36237c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36235a) {
            case 0:
                new yh.p7(this.f36236b, this.f36237c).show();
                return;
            case 1:
                new yh.p7(this.f36236b, this.f36237c).show();
                return;
            default:
                new yh.p7(this.f36236b, this.f36237c).show();
                return;
        }
    }
}
