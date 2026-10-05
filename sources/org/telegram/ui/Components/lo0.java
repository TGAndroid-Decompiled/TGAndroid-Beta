package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lo0 extends ws {
    public final org.telegram.ui.uy f28507d0;
    public final org.telegram.ui.dy f28508e0;

    public lo0(org.telegram.ui.dy dyVar, zl0 zl0Var, Context context, int i10, int i11, org.telegram.ui.uy uyVar) {
        super(zl0Var, context, i10, i11);
        this.f28508e0 = dyVar;
        this.f28507d0 = uyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        do0 do0Var = this.f28508e0.f30152i0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        do0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f32702b0)) {
            do0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            do0Var.f31551e.setVisibility(0);
            do0Var.f31551e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        do0Var.d.setText(LocaleController.getString(R.string.NoResult));
        do0Var.f31551e.setVisibility(8);
    }
}
