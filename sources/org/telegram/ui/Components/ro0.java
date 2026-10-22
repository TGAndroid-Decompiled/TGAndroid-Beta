package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ro0 extends ct {
    public final org.telegram.ui.cy f29986d0;
    public final org.telegram.ui.lx f29987e0;

    public ro0(org.telegram.ui.lx lxVar, jm0 jm0Var, Context context, int i10, int i11, org.telegram.ui.cy cyVar) {
        super(jm0Var, context, i10, i11);
        this.f29987e0 = lxVar;
        this.f29986d0 = cyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        jo0 jo0Var = this.f29987e0.f32187g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        jo0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f25259b0)) {
            jo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            jo0Var.e.setVisibility(0);
            jo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        jo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        jo0Var.e.setVisibility(8);
    }
}
