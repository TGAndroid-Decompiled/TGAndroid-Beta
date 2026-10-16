package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uo0 extends gt {
    public final org.telegram.ui.yy f29413d0;
    public final org.telegram.ui.iy f29414e0;

    public uo0(org.telegram.ui.iy iyVar, mm0 mm0Var, Context context, int i10, int i11, org.telegram.ui.yy yyVar) {
        super(mm0Var, context, i10, i11);
        this.f29414e0 = iyVar;
        this.f29413d0 = yyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        mo0 mo0Var = this.f29414e0.f31623g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        mo0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f25107b0)) {
            mo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            mo0Var.e.setVisibility(0);
            mo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
    }
}
