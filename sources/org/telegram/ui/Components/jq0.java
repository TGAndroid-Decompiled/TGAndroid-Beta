package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class jq0 extends org.telegram.ui.an {
    public boolean f36152ud;
    public final int f36153vd;
    public final ys0 f36154wd;

    public jq0(ys0 ys0Var, Bundle bundle, int i7) {
        super(bundle);
        this.f36154wd = ys0Var;
        this.f36153vd = i7;
        this.f36152ud = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ys0 ys0Var = this.f36154wd;
        ks0 ks0Var = ys0Var.V;
        if (this.f36152ud) {
            if (this.f45252k0 != null) {
                Oa("");
                this.f45252k0.Q(ks0Var.f36601x, false);
            }
            org.telegram.ui.ak akVar = this.D1;
            if (akVar != null) {
                akVar.e(ks0Var.f36602y, false);
            }
            org.telegram.messenger.si mediaDataController = ys0Var.f42152y1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.p0 p0Var = ks0Var.f36602y;
            String str = ks0Var.f36601x;
            ArrayList arrayList = ks0Var.f36597n;
            ArrayList arrayList2 = ks0Var.h;
            int i7 = ks0Var.f36600w;
            boolean z12 = ks0Var.f36599s;
            mediaDataController.R0 = p0Var;
            mediaDataController.f26481e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.f26470a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f26473b1.clear();
            mediaDataController.f26473b1.addAll(arrayList);
            mediaDataController.k2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.f26484f1 = this.f36153vd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.ns.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f26484f1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.f36152ud = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
