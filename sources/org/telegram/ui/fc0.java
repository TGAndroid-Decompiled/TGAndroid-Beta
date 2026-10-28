package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class fc0 extends ig.s0 {
    public boolean m0;
    public final rc0 f39328n0;

    public fc0(rc0 rc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, u6Var, false, z10, z11);
        this.f39328n0 = rc0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f39328n0.s0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        rc0 rc0Var = this.f39328n0;
        MessageObject messageObject = rc0Var.A0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    lc0 lc0Var = (lc0) arrayList.get(i12);
                    if (lc0Var != null && !UserObject.isUserSelf(lc0Var.f41076c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                rc0Var.f42933i0 = ((lc0) arrayList.get(0)).f41074a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.w0 w0Var = rc0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            w0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
