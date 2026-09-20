package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o91 implements View.OnClickListener {
    public final int f36221a;
    public final Context f36222b;
    public final org.telegram.ui.ActionBar.f6 f36223c;

    public o91(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f36221a = i10;
        this.f36222b = context;
        this.f36223c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36221a) {
            case 0:
                new yh.m7(this.f36222b, this.f36223c).show();
                return;
            case 1:
                new yh.m7(this.f36222b, this.f36223c).show();
                return;
            default:
                new yh.m7(this.f36222b, this.f36223c).show();
                return;
        }
    }
}
