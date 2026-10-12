package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ep0 extends nt {
    public final org.telegram.ui.vy f25741d0;
    public final org.telegram.ui.fy f25742e0;

    public ep0(org.telegram.ui.fy fyVar, wm0 wm0Var, Context context, int i10, int i11, org.telegram.ui.vy vyVar) {
        super(wm0Var, context, i10, i11);
        this.f25742e0 = fyVar;
        this.f25741d0 = vyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        wo0 wo0Var = this.f25742e0.f27603g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        wo0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f28965b0)) {
            wo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            wo0Var.f26561e.setVisibility(0);
            wo0Var.f26561e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        wo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wo0Var.f26561e.setVisibility(8);
    }
}
