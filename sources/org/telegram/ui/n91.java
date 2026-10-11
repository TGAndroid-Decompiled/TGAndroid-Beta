package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class n91 implements View.OnClickListener {
    public final int f40198a;
    public final Context f40199b;
    public final org.telegram.ui.ActionBar.d6 f40200c;

    public n91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f40198a = i10;
        this.f40199b = context;
        this.f40200c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40198a) {
            case 0:
                new yh.f7(this.f40199b, this.f40200c).show();
                return;
            case 1:
                new yh.f7(this.f40199b, this.f40200c).show();
                return;
            default:
                new yh.f7(this.f40199b, this.f40200c).show();
                return;
        }
    }
}
