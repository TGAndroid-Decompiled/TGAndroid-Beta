package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zo0 extends lt {
    public final org.telegram.ui.ty f33644d0;
    public final org.telegram.ui.dy f33645e0;

    public zo0(org.telegram.ui.dy dyVar, rm0 rm0Var, Context context, int i10, int i11, org.telegram.ui.ty tyVar) {
        super(rm0Var, context, i10, i11);
        this.f33645e0 = dyVar;
        this.f33644d0 = tyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        ro0 ro0Var = this.f33645e0.f26132g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ro0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f28539b0)) {
            ro0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            ro0Var.f25085e.setVisibility(0);
            ro0Var.f25085e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var.f25085e.setVisibility(8);
    }
}
