package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class xm0 extends fs {

    public final org.telegram.ui.px f34652e0;

    public xm0(org.telegram.ui.px pxVar, zk0 zk0Var, Context context, int i10, int i11) {
        super(zk0Var, context, i10, i11, false, null);
        this.f34652e0 = pxVar;
    }

    @Override
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        wm0 wm0Var = this.f34652e0.f29749h0;
        wm0Var.e(this.V || this.W || (arrayList = this.P) == null || !arrayList.isEmpty(), z10);
        wm0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wm0Var.f29506e.setVisibility(8);
    }
}
