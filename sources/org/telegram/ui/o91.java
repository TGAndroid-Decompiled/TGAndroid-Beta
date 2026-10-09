package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o91 implements View.OnClickListener {
    public final int f40443a;
    public final Context f40444b;
    public final org.telegram.ui.ActionBar.e6 f40445c;

    public o91(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f40443a = i10;
        this.f40444b = context;
        this.f40445c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40443a) {
            case 0:
                new yh.f7(this.f40444b, this.f40445c).show();
                return;
            case 1:
                new yh.f7(this.f40444b, this.f40445c).show();
                return;
            default:
                new yh.f7(this.f40444b, this.f40445c).show();
                return;
        }
    }
}
