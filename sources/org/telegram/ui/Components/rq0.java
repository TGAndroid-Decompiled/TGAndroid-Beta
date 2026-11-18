package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class rq0 extends org.telegram.ui.bn {
    public boolean f39275vd;
    public final int f39276wd;
    public final gt0 f39277xd;

    public rq0(gt0 gt0Var, Bundle bundle, int i7) {
        super(bundle);
        this.f39277xd = gt0Var;
        this.f39276wd = i7;
        this.f39275vd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        gt0 gt0Var = this.f39277xd;
        ss0 ss0Var = gt0Var.V;
        if (this.f39275vd) {
            if (this.f46067k0 != null) {
                Oa("");
                this.f46067k0.Q(ss0Var.f39844x, false);
            }
            org.telegram.ui.bk bkVar = this.D1;
            if (bkVar != null) {
                bkVar.e(ss0Var.f39845y, false);
            }
            org.telegram.messenger.ri mediaDataController = gt0Var.f35642y1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.p0 p0Var = ss0Var.f39845y;
            String str = ss0Var.f39844x;
            ArrayList arrayList = ss0Var.f39840n;
            ArrayList arrayList2 = ss0Var.h;
            int i7 = ss0Var.f39843w;
            boolean z12 = ss0Var.f39842s;
            mediaDataController.R0 = p0Var;
            mediaDataController.f26611e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.f26600a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f26603b1.clear();
            mediaDataController.f26603b1.addAll(arrayList);
            mediaDataController.p2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.f26614f1 = this.f39276wd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.ks.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.e0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f26614f1), Integer.valueOf(mediaDataController.l0()), Boolean.TRUE);
            this.f39275vd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
