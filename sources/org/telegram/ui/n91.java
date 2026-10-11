package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class n91 implements View.OnClickListener {
    public final int f40164a;
    public final Context f40165b;
    public final org.telegram.ui.ActionBar.d6 f40166c;

    public n91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f40164a = i10;
        this.f40165b = context;
        this.f40166c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40164a) {
            case 0:
                new yh.f7(this.f40165b, this.f40166c).show();
                return;
            case 1:
                new yh.f7(this.f40165b, this.f40166c).show();
                return;
            default:
                new yh.f7(this.f40165b, this.f40166c).show();
                return;
        }
    }
}
