package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class qc0 extends gg.t0 {
    public boolean m0;
    public final cd0 f36860n0;

    public qc0(cd0 cd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, d6Var, false, z10, z11);
        this.f36860n0 = cd0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f36860n0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        cd0 cd0Var = this.f36860n0;
        MessageObject messageObject = cd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    wc0 wc0Var = (wc0) arrayList.get(i12);
                    if (wc0Var != null && !UserObject.isUserSelf(wc0Var.f38957c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                cd0Var.f32667i0 = ((wc0) arrayList.get(0)).f38955a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.u0 u0Var = cd0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            u0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
