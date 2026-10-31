package org.telegram.ui;

import android.view.View;
public final class d11 implements View.OnClickListener {
    public final int f36589a;
    public final i11 f36590b;

    public d11(i11 i11Var, int i10) {
        this.f36589a = i10;
        this.f36590b = i11Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36589a) {
            case 0:
                i11 i11Var = this.f36590b;
                if (i11Var.Y == null) {
                    i11Var.dismiss();
                    return;
                }
                return;
            default:
                this.f36590b.dismiss();
                return;
        }
    }
}
