package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class dc0 extends hg.s0 {
    public boolean m0;
    public final pc0 f36128n0;

    public dc0(pc0 pc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, d6Var, false, z10, z11);
        this.f36128n0 = pc0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f36128n0.q0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        pc0 pc0Var = this.f36128n0;
        MessageObject messageObject = pc0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    jc0 jc0Var = (jc0) arrayList.get(i12);
                    if (jc0Var != null && !UserObject.isUserSelf(jc0Var.f38111c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                pc0Var.f40029i0 = ((jc0) arrayList.get(0)).f38109a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.u0 u0Var = pc0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            u0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
