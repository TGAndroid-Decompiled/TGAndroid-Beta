package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class bd0 extends hg.s0 {
    public boolean m0;
    public final nd0 f34516n0;

    public bd0(nd0 nd0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, c6Var, false, z10, z11);
        this.f34516n0 = nd0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f34516n0.q0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        nd0 nd0Var = this.f34516n0;
        MessageObject messageObject = nd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    hd0 hd0Var = (hd0) arrayList.get(i12);
                    if (hd0Var != null && !UserObject.isUserSelf(hd0Var.f36760c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                nd0Var.f38659i0 = ((hd0) arrayList.get(0)).f36758a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.u0 u0Var = nd0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            u0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
