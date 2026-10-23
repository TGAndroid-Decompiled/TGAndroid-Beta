package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class gc0 extends hg.s0 {
    public boolean m0;
    public final sc0 f37567n0;

    public gc0(sc0 sc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, g6Var, false, z10, z11);
        this.f37567n0 = sc0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f37567n0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        sc0 sc0Var = this.f37567n0;
        MessageObject messageObject = sc0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    mc0 mc0Var = (mc0) arrayList.get(i12);
                    if (mc0Var != null && !UserObject.isUserSelf(mc0Var.f39469c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                sc0Var.f41359i0 = ((mc0) arrayList.get(0)).f39467a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.u0 u0Var = sc0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            u0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
