package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class fc0 extends rf.i0 {
    public boolean f38103i0;
    public final rc0 f38104j0;

    public fc0(rc0 rc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, c6Var, false, z10, z11);
        this.f38104j0 = rc0Var;
        this.f38103i0 = true;
    }

    @Override
    public final void K() {
        this.f38104j0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        rc0 rc0Var = this.f38104j0;
        MessageObject messageObject = rc0Var.f42064x0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    lc0 lc0Var = (lc0) arrayList.get(i12);
                    if (lc0Var != null && !UserObject.isUserSelf(lc0Var.f40166c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.f38103i0 && i10 == 1) {
                rc0Var.f42040e0 = ((lc0) arrayList.get(0)).f40164a;
            }
            this.f38103i0 = false;
            org.telegram.ui.ActionBar.w0 w0Var = rc0Var.V;
            if (i10 != 1) {
                i11 = 8;
            }
            w0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
