package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xn0 extends qs {
    public final org.telegram.ui.qy f30676a0;
    public final org.telegram.ui.zx f30677b0;

    public xn0(org.telegram.ui.zx zxVar, rl0 rl0Var, Context context, int i10, int i11, org.telegram.ui.qy qyVar) {
        super(rl0Var, context, i10, i11);
        this.f30677b0 = zxVar;
        this.f30676a0 = qyVar;
    }

    @Override
    public final void N(boolean z4) {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z4);
        pn0 pn0Var = this.f30677b0.f23986d0;
        if (!this.T && !this.U && (arrayList = this.M) != null && arrayList.isEmpty() && (arrayList2 = this.N) != null && arrayList2.isEmpty() && (arrayList3 = this.P) != null && arrayList3.isEmpty() && (arrayList4 = this.O) != null && arrayList4.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        pn0Var.e(z10, z4);
        if (TextUtils.isEmpty(this.Y)) {
            pn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            pn0Var.e.setVisibility(0);
            pn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        pn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        pn0Var.e.setVisibility(8);
    }
}
