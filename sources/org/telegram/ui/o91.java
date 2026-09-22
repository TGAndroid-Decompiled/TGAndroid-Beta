package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o91 implements View.OnClickListener {
    public final int f36239a;
    public final Context f36240b;
    public final org.telegram.ui.ActionBar.f6 f36241c;

    public o91(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f36239a = i10;
        this.f36240b = context;
        this.f36241c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36239a) {
            case 0:
                new yh.m7(this.f36240b, this.f36241c).show();
                return;
            case 1:
                new yh.m7(this.f36240b, this.f36241c).show();
                return;
            default:
                new yh.m7(this.f36240b, this.f36241c).show();
                return;
        }
    }
}
