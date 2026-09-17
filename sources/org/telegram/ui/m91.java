package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class m91 implements View.OnClickListener {
    public final int f35730a;
    public final Context f35731b;
    public final org.telegram.ui.ActionBar.f6 f35732c;

    public m91(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f35730a = i10;
        this.f35731b = context;
        this.f35732c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35730a) {
            case 0:
                new yh.o7(this.f35731b, this.f35732c).show();
                return;
            case 1:
                new yh.o7(this.f35731b, this.f35732c).show();
                return;
            default:
                new yh.o7(this.f35731b, this.f35732c).show();
                return;
        }
    }
}
