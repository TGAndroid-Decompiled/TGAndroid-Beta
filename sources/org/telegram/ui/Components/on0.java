package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class on0 extends ns {
    public final org.telegram.ui.fy Z;
    public final org.telegram.ui.ox f31439a0;

    public on0(org.telegram.ui.ox oxVar, jl0 jl0Var, Context context, int i10, int i11, org.telegram.ui.fy fyVar) {
        super(jl0Var, context, i10, i11);
        this.f31439a0 = oxVar;
        this.Z = fyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        gn0 gn0Var = this.f31439a0.f32990c0;
        if (!this.S && !this.T && (arrayList = this.L) != null && arrayList.isEmpty() && (arrayList2 = this.M) != null && arrayList2.isEmpty() && (arrayList3 = this.O) != null && arrayList3.isEmpty() && (arrayList4 = this.N) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        gn0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.X)) {
            gn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            gn0Var.f32122e.setVisibility(0);
            gn0Var.f32122e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        gn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var.f32122e.setVisibility(8);
    }
}
