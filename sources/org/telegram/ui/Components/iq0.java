package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class iq0 extends org.telegram.ui.cn {
    public boolean f34721td;
    public final int f34722ud;
    public final ys0 f34723vd;

    public iq0(ys0 ys0Var, Bundle bundle, int i7) {
        super(bundle);
        this.f34723vd = ys0Var;
        this.f34722ud = i7;
        this.f34721td = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        ys0 ys0Var = this.f34723vd;
        ks0 ks0Var = ys0Var.U;
        if (this.f34721td) {
            if (this.f44540j0 != null) {
                Na("");
                this.f44540j0.P(ks0Var.f35431x, false);
            }
            org.telegram.ui.ck ckVar = this.C1;
            if (ckVar != null) {
                ckVar.e(ks0Var.f35432y, false);
            }
            org.telegram.messenger.ui mediaDataController = ys0Var.f40719x1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.o0 o0Var = ks0Var.f35432y;
            String str = ks0Var.f35431x;
            ArrayList arrayList = ks0Var.f35427n;
            ArrayList arrayList2 = ks0Var.h;
            int i7 = ks0Var.f35430w;
            boolean z11 = ks0Var.f35429s;
            mediaDataController.Q0 = o0Var;
            mediaDataController.f25813d1 = str;
            boolean[] zArr = mediaDataController.X0;
            zArr[0] = z11;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.Z0;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f25805a1.clear();
            mediaDataController.f25805a1.addAll(arrayList);
            mediaDataController.k2();
            int[] iArr = mediaDataController.W0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.f25816e1 = this.f34722ud;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.qs.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f25816e1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.f34721td = false;
        }
        super.onTransitionAnimationStart(z9, z10);
    }
}
