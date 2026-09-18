package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class m91 implements View.OnClickListener {
    public final int f35735a;
    public final Context f35736b;
    public final org.telegram.ui.ActionBar.f6 f35737c;

    public m91(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f35735a = i10;
        this.f35736b = context;
        this.f35737c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35735a) {
            case 0:
                new yh.o7(this.f35736b, this.f35737c).show();
                return;
            case 1:
                new yh.o7(this.f35736b, this.f35737c).show();
                return;
            default:
                new yh.o7(this.f35736b, this.f35737c).show();
                return;
        }
    }
}
