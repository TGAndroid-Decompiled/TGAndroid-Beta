package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o91 implements View.OnClickListener {
    public final int f39178a;
    public final Context f39179b;
    public final org.telegram.ui.ActionBar.f6 f39180c;

    public o91(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f39178a = i10;
        this.f39179b = context;
        this.f39180c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39178a) {
            case 0:
                new zh.l7(this.f39179b, this.f39180c).show();
                return;
            case 1:
                new zh.l7(this.f39179b, this.f39180c).show();
                return;
            default:
                new zh.l7(this.f39179b, this.f39180c).show();
                return;
        }
    }
}
