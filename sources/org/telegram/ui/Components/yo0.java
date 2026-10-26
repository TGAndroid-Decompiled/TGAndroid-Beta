package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yo0 extends et {
    public final org.telegram.ui.cy f35089f0;
    public final org.telegram.ui.jx f35090g0;

    public yo0(org.telegram.ui.jx jxVar, mm0 mm0Var, Context context, int i10, int i11, org.telegram.ui.cy cyVar) {
        super(mm0Var, context, i10, i11);
        this.f35090g0 = jxVar;
        this.f35089f0 = cyVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        qo0 qo0Var = this.f35090g0.f27941i0;
        if (!this.Y && !this.Z && (arrayList = this.R) != null && arrayList.isEmpty() && (arrayList2 = this.S) != null && arrayList2.isEmpty() && (arrayList3 = this.U) != null && arrayList3.isEmpty() && (arrayList4 = this.T) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        qo0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f27982d0)) {
            qo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            qo0Var.e.setVisibility(0);
            qo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.e.setVisibility(8);
    }
}
