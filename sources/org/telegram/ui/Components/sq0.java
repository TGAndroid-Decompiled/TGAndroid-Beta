package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class sq0 extends org.telegram.ui.bn {
    public boolean f39688vd;
    public final int f39689wd;
    public final it0 f39690xd;

    public sq0(it0 it0Var, Bundle bundle, int i7) {
        super(bundle);
        this.f39690xd = it0Var;
        this.f39689wd = i7;
        this.f39688vd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        it0 it0Var = this.f39690xd;
        us0 us0Var = it0Var.V;
        if (this.f39688vd) {
            if (this.f46253k0 != null) {
                Oa("");
                this.f46253k0.Q(us0Var.f40466x, false);
            }
            org.telegram.ui.bk bkVar = this.D1;
            if (bkVar != null) {
                bkVar.e(us0Var.f40467y, false);
            }
            org.telegram.messenger.ri mediaDataController = it0Var.f36166y1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.p0 p0Var = us0Var.f40467y;
            String str = us0Var.f40466x;
            ArrayList arrayList = us0Var.f40462n;
            ArrayList arrayList2 = us0Var.h;
            int i7 = us0Var.f40465w;
            boolean z12 = us0Var.f40464s;
            mediaDataController.R0 = p0Var;
            mediaDataController.f26710e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.f26699a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f26702b1.clear();
            mediaDataController.f26702b1.addAll(arrayList);
            mediaDataController.p2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.f26713f1 = this.f39689wd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.ks.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.e0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f26713f1), Integer.valueOf(mediaDataController.l0()), Boolean.TRUE);
            this.f39688vd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
