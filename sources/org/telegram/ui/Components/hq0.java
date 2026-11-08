package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class hq0 extends org.telegram.ui.an {
    public boolean f34327rd;
    public final int f34328sd;
    public final xs0 f34329td;

    public hq0(xs0 xs0Var, Bundle bundle, int i7) {
        super(bundle);
        this.f34329td = xs0Var;
        this.f34328sd = i7;
        this.f34327rd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        xs0 xs0Var = this.f34329td;
        js0 js0Var = xs0Var.U;
        if (this.f34327rd) {
            if (this.f43843j0 != null) {
                La("");
                this.f43843j0.P(js0Var.f35089x, false);
            }
            org.telegram.ui.ak akVar = this.C1;
            if (akVar != null) {
                akVar.e(js0Var.f35090y, false);
            }
            org.telegram.messenger.ui mediaDataController = xs0Var.f40461x1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.o0 o0Var = js0Var.f35090y;
            String str = js0Var.f35089x;
            ArrayList arrayList = js0Var.f35085n;
            ArrayList arrayList2 = js0Var.h;
            int i7 = js0Var.f35088w;
            boolean z11 = js0Var.f35087s;
            mediaDataController.Q0 = o0Var;
            mediaDataController.f25809d1 = str;
            boolean[] zArr = mediaDataController.X0;
            zArr[0] = z11;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.Z0;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f25801a1.clear();
            mediaDataController.f25801a1.addAll(arrayList);
            mediaDataController.k2();
            int[] iArr = mediaDataController.W0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.f25812e1 = this.f34328sd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.qs.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f25812e1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.f34327rd = false;
        }
        super.onTransitionAnimationStart(z9, z10);
    }
}
