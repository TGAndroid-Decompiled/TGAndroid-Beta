package org.telegram.ui;

import android.view.View;
public final class dt0 implements View.OnClickListener {
    public final int f36677a;
    public final org.telegram.ui.Components.z60 f36678b;

    public dt0(org.telegram.ui.Components.z60 z60Var, int i10) {
        this.f36677a = i10;
        this.f36678b = z60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36677a) {
            case 0:
                org.telegram.ui.Components.wb.e();
                this.f36678b.s();
                return;
            default:
                org.telegram.ui.Components.wb.e();
                this.f36678b.s();
                return;
        }
    }
}
