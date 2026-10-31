package org.telegram.ui.Wallet;

import android.view.View;
public final class n4 implements View.OnClickListener {
    public final int f34936a;
    public final org.telegram.ui.ActionBar.z2[] f34937b;

    public n4(org.telegram.ui.ActionBar.z2[] z2VarArr, int i10) {
        this.f34936a = i10;
        this.f34937b = z2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34936a) {
            case 0:
                this.f34937b[0].dismiss();
                return;
            default:
                this.f34937b[0].dismiss();
                return;
        }
    }
}
