package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class d91 implements View.OnClickListener {
    public final int f32543a;
    public final Context f32544b;
    public final org.telegram.ui.ActionBar.d6 f32545c;

    public d91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f32543a = i10;
        this.f32544b = context;
        this.f32545c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32543a) {
            case 0:
                new yh.m7(this.f32544b, this.f32545c).show();
                return;
            case 1:
                new yh.m7(this.f32544b, this.f32545c).show();
                return;
            default:
                new yh.m7(this.f32544b, this.f32545c).show();
                return;
        }
    }
}
