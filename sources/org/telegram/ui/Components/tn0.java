package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tn0 extends ss {
    public final org.telegram.ui.uy f30693d0;
    public final org.telegram.ui.ey f30694e0;

    public tn0(org.telegram.ui.ey eyVar, ll0 ll0Var, Context context, int i10, int i11, org.telegram.ui.uy uyVar) {
        super(ll0Var, context, i10, i11);
        this.f30694e0 = eyVar;
        this.f30693d0 = uyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        ln0 ln0Var = this.f30694e0.f32982g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ln0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f30433b0)) {
            ln0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            ln0Var.f32782e.setVisibility(0);
            ln0Var.f32782e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.f32782e.setVisibility(8);
    }
}
