package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yo0 extends kt {
    public final org.telegram.ui.ty f33322d0;
    public final org.telegram.ui.dy f33323e0;

    public yo0(org.telegram.ui.dy dyVar, qm0 qm0Var, Context context, int i10, int i11, org.telegram.ui.ty tyVar) {
        super(qm0Var, context, i10, i11);
        this.f33323e0 = dyVar;
        this.f33322d0 = tyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        qo0 qo0Var = this.f33323e0.f25771g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        qo0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f28163b0)) {
            qo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            qo0Var.f24802e.setVisibility(0);
            qo0Var.f24802e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.f24802e.setVisibility(8);
    }
}
