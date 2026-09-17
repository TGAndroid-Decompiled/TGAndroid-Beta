package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o91 implements View.OnClickListener {
    public final int f39151a;
    public final Context f39152b;
    public final org.telegram.ui.ActionBar.f6 f39153c;

    public o91(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f39151a = i10;
        this.f39152b = context;
        this.f39153c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39151a) {
            case 0:
                new zh.l7(this.f39152b, this.f39153c).show();
                return;
            case 1:
                new zh.l7(this.f39152b, this.f39153c).show();
                return;
            default:
                new zh.l7(this.f39152b, this.f39153c).show();
                return;
        }
    }
}
