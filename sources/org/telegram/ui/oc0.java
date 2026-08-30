package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class oc0 extends tf.h0 {
    public boolean f36873j0;
    public final ad0 f36874k0;

    public oc0(ad0 ad0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context, i10, j10, false, f6Var, false, z4, z10);
        this.f36874k0 = ad0Var;
        this.f36873j0 = true;
    }

    @Override
    public final void K() {
        this.f36874k0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        ad0 ad0Var = this.f36874k0;
        MessageObject messageObject = ad0Var.f32554y0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    uc0 uc0Var = (uc0) arrayList.get(i12);
                    if (uc0Var != null && !UserObject.isUserSelf(uc0Var.f38908c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.f36873j0 && i10 == 1) {
                ad0Var.f32530f0 = ((uc0) arrayList.get(0)).f38906a;
            }
            this.f36873j0 = false;
            org.telegram.ui.ActionBar.w0 w0Var = ad0Var.W;
            if (i10 != 1) {
                i11 = 8;
            }
            w0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
