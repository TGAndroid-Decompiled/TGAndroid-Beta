package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

public final class hc0 extends pf.h0 {

    public boolean f38780i0;

    public final tc0 f38781j0;

    public hc0(tc0 tc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, c6Var, false, z10, z11);
        this.f38781j0 = tc0Var;
        this.f38780i0 = true;
    }

    @Override
    public final void K() {
        this.f38781j0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        tc0 tc0Var = this.f38781j0;
        MessageObject messageObject = tc0Var.f42887x0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    nc0 nc0Var = (nc0) arrayList.get(i11);
                    if (nc0Var != null && !UserObject.isUserSelf(nc0Var.f40731c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.f38780i0 && i10 == 1) {
                tc0Var.f42863e0 = ((nc0) arrayList.get(0)).f40729a;
            }
            this.f38780i0 = false;
            tc0Var.V.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
