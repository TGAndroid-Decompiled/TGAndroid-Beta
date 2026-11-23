package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class tq0 extends org.telegram.ui.bn {
    public boolean f39995vd;
    public final int f39996wd;
    public final jt0 f39997xd;

    public tq0(jt0 jt0Var, Bundle bundle, int i7) {
        super(bundle);
        this.f39997xd = jt0Var;
        this.f39996wd = i7;
        this.f39995vd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        jt0 jt0Var = this.f39997xd;
        vs0 vs0Var = jt0Var.V;
        if (this.f39995vd) {
            if (this.f46038k0 != null) {
                Oa("");
                this.f46038k0.Q(vs0Var.f41518x, false);
            }
            org.telegram.ui.bk bkVar = this.D1;
            if (bkVar != null) {
                bkVar.e(vs0Var.f41519y, false);
            }
            org.telegram.messenger.si mediaDataController = jt0Var.f36638y1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.p0 p0Var = vs0Var.f41519y;
            String str = vs0Var.f41518x;
            ArrayList arrayList = vs0Var.f41514n;
            ArrayList arrayList2 = vs0Var.h;
            int i7 = vs0Var.f41517w;
            boolean z12 = vs0Var.f41516s;
            mediaDataController.R0 = p0Var;
            mediaDataController.f26787e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.f26776a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f26779b1.clear();
            mediaDataController.f26779b1.addAll(arrayList);
            mediaDataController.p2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.f26790f1 = this.f39996wd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.ls.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.e0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f26790f1), Integer.valueOf(mediaDataController.l0()), Boolean.TRUE);
            this.f39995vd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
