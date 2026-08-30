package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yn0 extends rs {
    public final org.telegram.ui.oy f31061a0;
    public final org.telegram.ui.xx f31062b0;

    public yn0(org.telegram.ui.xx xxVar, sl0 sl0Var, Context context, int i10, int i11, org.telegram.ui.oy oyVar) {
        super(sl0Var, context, i10, i11);
        this.f31062b0 = xxVar;
        this.f31061a0 = oyVar;
    }

    @Override
    public final void N(boolean z4) {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z4);
        qn0 qn0Var = this.f31062b0.f24320d0;
        if (!this.T && !this.U && (arrayList = this.M) != null && arrayList.isEmpty() && (arrayList2 = this.N) != null && arrayList2.isEmpty() && (arrayList3 = this.P) != null && arrayList3.isEmpty() && (arrayList4 = this.O) != null && arrayList4.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        qn0Var.e(z10, z4);
        if (TextUtils.isEmpty(this.Y)) {
            qn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            qn0Var.e.setVisibility(0);
            qn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        qn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qn0Var.e.setVisibility(8);
    }
}
