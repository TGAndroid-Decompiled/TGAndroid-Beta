package org.telegram.ui;

import android.view.View;
public final class e51 implements View.OnClickListener {
    public final int f33178a;
    public final i51 f33179b;

    public e51(i51 i51Var, int i10) {
        this.f33178a = i10;
        this.f33179b = i51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33178a) {
            case 0:
                i51 i51Var = this.f33179b;
                if (i51Var.Y == null) {
                    i51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f33179b.dismiss();
                return;
        }
    }
}
