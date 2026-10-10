package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o91 implements View.OnClickListener {
    public final int f40489a;
    public final Context f40490b;
    public final org.telegram.ui.ActionBar.e6 f40491c;

    public o91(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f40489a = i10;
        this.f40490b = context;
        this.f40491c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40489a) {
            case 0:
                new yh.f7(this.f40490b, this.f40491c).show();
                return;
            case 1:
                new yh.f7(this.f40490b, this.f40491c).show();
                return;
            default:
                new yh.f7(this.f40490b, this.f40491c).show();
                return;
        }
    }
}
