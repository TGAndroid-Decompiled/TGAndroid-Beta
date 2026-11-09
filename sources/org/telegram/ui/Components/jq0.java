package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class jq0 extends org.telegram.ui.cn {
    public boolean f35113td;
    public final int f35114ud;
    public final zs0 f35115vd;

    public jq0(zs0 zs0Var, Bundle bundle, int i7) {
        super(bundle);
        this.f35115vd = zs0Var;
        this.f35114ud = i7;
        this.f35113td = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        zs0 zs0Var = this.f35115vd;
        ls0 ls0Var = zs0Var.U;
        if (this.f35113td) {
            if (this.f44499j0 != null) {
                Na("");
                this.f44499j0.P(ls0Var.f35839x, false);
            }
            org.telegram.ui.ck ckVar = this.C1;
            if (ckVar != null) {
                ckVar.e(ls0Var.f35840y, false);
            }
            org.telegram.messenger.ui mediaDataController = zs0Var.f41127x1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.o0 o0Var = ls0Var.f35840y;
            String str = ls0Var.f35839x;
            ArrayList arrayList = ls0Var.f35835n;
            ArrayList arrayList2 = ls0Var.h;
            int i7 = ls0Var.f35838w;
            boolean z11 = ls0Var.f35837s;
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
            mediaDataController.f25812e1 = this.f35114ud;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.qs.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f25812e1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.f35113td = false;
        }
        super.onTransitionAnimationStart(z9, z10);
    }
}
