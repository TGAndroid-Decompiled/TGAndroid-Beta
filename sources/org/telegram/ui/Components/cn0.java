package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cn0 extends js {
    public final org.telegram.ui.dy Z;
    public final org.telegram.ui.mx f27516a0;

    public cn0(org.telegram.ui.mx mxVar, wk0 wk0Var, Context context, int i9, int i10, org.telegram.ui.dy dyVar) {
        super(wk0Var, context, i9, i10);
        this.f27516a0 = mxVar;
        this.Z = dyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        um0 um0Var = this.f27516a0.f29137c0;
        if (!this.S && !this.T && (arrayList = this.L) != null && arrayList.isEmpty() && (arrayList2 = this.M) != null && arrayList2.isEmpty() && (arrayList3 = this.O) != null && arrayList3.isEmpty() && (arrayList4 = this.N) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        um0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.X)) {
            um0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            um0Var.f28885e.setVisibility(0);
            um0Var.f28885e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        um0Var.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var.f28885e.setVisibility(8);
    }
}
