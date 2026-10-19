package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qo0 extends ct {
    public final org.telegram.ui.cy f29675d0;
    public final org.telegram.ui.lx f29676e0;

    public qo0(org.telegram.ui.lx lxVar, im0 im0Var, Context context, int i10, int i11, org.telegram.ui.cy cyVar) {
        super(im0Var, context, i10, i11);
        this.f29676e0 = lxVar;
        this.f29675d0 = cyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        io0 io0Var = this.f29676e0.f31356g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        io0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f25341b0)) {
            io0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            io0Var.e.setVisibility(0);
            io0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        io0Var.d.setText(LocaleController.getString(R.string.NoResult));
        io0Var.e.setVisibility(8);
    }
}
