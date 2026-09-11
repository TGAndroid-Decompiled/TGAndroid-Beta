package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o91 implements View.OnClickListener {
    public final int f39150a;
    public final Context f39151b;
    public final org.telegram.ui.ActionBar.f6 f39152c;

    public o91(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f39150a = i10;
        this.f39151b = context;
        this.f39152c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39150a) {
            case 0:
                new zh.l7(this.f39151b, this.f39152c).show();
                return;
            case 1:
                new zh.l7(this.f39151b, this.f39152c).show();
                return;
            default:
                new zh.l7(this.f39151b, this.f39152c).show();
                return;
        }
    }
}
