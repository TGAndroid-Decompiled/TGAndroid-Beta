package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ap0 extends lt {
    public final org.telegram.ui.sy f24553d0;
    public final org.telegram.ui.cy f24554e0;

    public ap0(org.telegram.ui.cy cyVar, sm0 sm0Var, Context context, int i10, int i11, org.telegram.ui.sy syVar) {
        super(sm0Var, context, i10, i11);
        this.f24554e0 = cyVar;
        this.f24553d0 = syVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        so0 so0Var = this.f24554e0.f26442g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        so0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f28456b0)) {
            so0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            so0Var.f25351e.setVisibility(0);
            so0Var.f25351e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        so0Var.d.setText(LocaleController.getString(R.string.NoResult));
        so0Var.f25351e.setVisibility(8);
    }
}
