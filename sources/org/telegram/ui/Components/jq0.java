package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class jq0 extends org.telegram.ui.an {
    public boolean f36162ud;
    public final int f36163vd;
    public final ys0 f36164wd;

    public jq0(ys0 ys0Var, Bundle bundle, int i7) {
        super(bundle);
        this.f36164wd = ys0Var;
        this.f36163vd = i7;
        this.f36162ud = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ys0 ys0Var = this.f36164wd;
        ks0 ks0Var = ys0Var.V;
        if (this.f36162ud) {
            if (this.f45253k0 != null) {
                Oa("");
                this.f45253k0.Q(ks0Var.f36613x, false);
            }
            org.telegram.ui.ak akVar = this.D1;
            if (akVar != null) {
                akVar.e(ks0Var.f36614y, false);
            }
            org.telegram.messenger.si mediaDataController = ys0Var.f42150y1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.p0 p0Var = ks0Var.f36614y;
            String str = ks0Var.f36613x;
            ArrayList arrayList = ks0Var.f36609n;
            ArrayList arrayList2 = ks0Var.h;
            int i7 = ks0Var.f36612w;
            boolean z12 = ks0Var.f36611s;
            mediaDataController.R0 = p0Var;
            mediaDataController.f26471e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.f26460a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f26463b1.clear();
            mediaDataController.f26463b1.addAll(arrayList);
            mediaDataController.k2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.f26474f1 = this.f36163vd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.ns.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f26474f1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.f36162ud = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
