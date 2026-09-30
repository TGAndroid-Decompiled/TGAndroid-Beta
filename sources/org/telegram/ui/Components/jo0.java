package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jo0 extends ws {
    public final org.telegram.ui.qy f25526d0;
    public final org.telegram.ui.zx f25527e0;

    public jo0(org.telegram.ui.zx zxVar, zl0 zl0Var, Context context, int i10, int i11, org.telegram.ui.qy qyVar) {
        super(zl0Var, context, i10, i11);
        this.f25527e0 = zxVar;
        this.f25526d0 = qyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        bo0 bo0Var = this.f25527e0.f27141g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        bo0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f30051b0)) {
            bo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            bo0Var.e.setVisibility(0);
            bo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        bo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        bo0Var.e.setVisibility(8);
    }
}
