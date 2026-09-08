package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o91 implements View.OnClickListener {
    public final int f39177a;
    public final Context f39178b;
    public final org.telegram.ui.ActionBar.f6 f39179c;

    public o91(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f39177a = i10;
        this.f39178b = context;
        this.f39179c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39177a) {
            case 0:
                new zh.l7(this.f39178b, this.f39179c).show();
                return;
            case 1:
                new zh.l7(this.f39178b, this.f39179c).show();
                return;
            default:
                new zh.l7(this.f39178b, this.f39179c).show();
                return;
        }
    }
}
