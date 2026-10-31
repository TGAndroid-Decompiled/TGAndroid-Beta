package org.telegram.ui;

import android.view.View;
public final class ft0 implements View.OnClickListener {
    public final int f37343a;
    public final org.telegram.ui.Components.z60 f37344b;

    public ft0(org.telegram.ui.Components.z60 z60Var, int i10) {
        this.f37343a = i10;
        this.f37344b = z60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37343a) {
            case 0:
                org.telegram.ui.Components.wb.e();
                this.f37344b.s();
                return;
            default:
                org.telegram.ui.Components.wb.e();
                this.f37344b.s();
                return;
        }
    }
}
