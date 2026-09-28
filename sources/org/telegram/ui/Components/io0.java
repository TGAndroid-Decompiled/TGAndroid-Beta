package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class io0 extends vs {
    public final org.telegram.ui.qy f25188d0;
    public final org.telegram.ui.zx f25189e0;

    public io0(org.telegram.ui.zx zxVar, yl0 yl0Var, Context context, int i10, int i11, org.telegram.ui.qy qyVar) {
        super(yl0Var, context, i10, i11);
        this.f25189e0 = zxVar;
        this.f25188d0 = qyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        ao0 ao0Var = this.f25189e0.f26824g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ao0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f29729b0)) {
            ao0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            ao0Var.e.setVisibility(0);
            ao0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        ao0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ao0Var.e.setVisibility(8);
    }
}
