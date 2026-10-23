package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class bc0 extends hg.s0 {
    public boolean m0;
    public final nc0 f35576n0;

    public bc0(nc0 nc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, d6Var, false, z10, z11);
        this.f35576n0 = nc0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f35576n0.q0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        nc0 nc0Var = this.f35576n0;
        MessageObject messageObject = nc0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    hc0 hc0Var = (hc0) arrayList.get(i12);
                    if (hc0Var != null && !UserObject.isUserSelf(hc0Var.f37576c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                nc0Var.f39514i0 = ((hc0) arrayList.get(0)).f37574a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.u0 u0Var = nc0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            u0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
