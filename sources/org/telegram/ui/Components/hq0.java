package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class hq0 extends org.telegram.ui.wm {
    public boolean f34482sd;
    public final int f34483td;
    public final ws0 f34484ud;

    public hq0(ws0 ws0Var, Bundle bundle, int i3) {
        super(bundle);
        this.f34484ud = ws0Var;
        this.f34483td = i3;
        this.f34482sd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ws0 ws0Var = this.f34484ud;
        is0 is0Var = ws0Var.V;
        if (this.f34482sd) {
            if (this.f51371k0 != null) {
                La("");
                this.f51371k0.P(is0Var.f34823x, false);
            }
            org.telegram.ui.wj wjVar = this.D1;
            if (wjVar != null) {
                wjVar.e(is0Var.f34824y, false);
            }
            org.telegram.messenger.li mediaDataController = ws0Var.f40142y1.getMediaDataController();
            int classGuid = getClassGuid();
            dh.n0 n0Var = is0Var.f34824y;
            String str = is0Var.f34823x;
            ArrayList arrayList = is0Var.f34819n;
            ArrayList arrayList2 = is0Var.h;
            int i3 = is0Var.f34822w;
            boolean z12 = is0Var.f34821s;
            mediaDataController.R0 = n0Var;
            mediaDataController.f24021e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.f24010a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f24013b1.clear();
            mediaDataController.f24013b1.addAll(arrayList);
            mediaDataController.k2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i3;
            iArr[1] = 0;
            mediaDataController.f24024f1 = this.f34483td;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.hs.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f24024f1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.f34482sd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
