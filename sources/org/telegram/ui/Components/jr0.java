package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class jr0 extends org.telegram.ui.un {
    public boolean f27557kd;
    public final int f27558ld;
    public final au0 f27559md;

    public jr0(au0 au0Var, Bundle bundle, int i10) {
        super(bundle);
        this.f27559md = au0Var;
        this.f27558ld = i10;
        this.f27557kd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        au0 au0Var = this.f27559md;
        mt0 mt0Var = au0Var.U;
        if (this.f27557kd) {
            if (this.f42102j0 != null) {
                Ga("");
                this.f42102j0.P(mt0Var.f28562x, false);
            }
            org.telegram.ui.wk wkVar = this.C1;
            if (wkVar != null) {
                wkVar.e(mt0Var.f28563y, false);
            }
            org.telegram.messenger.vi mediaDataController = au0Var.f24568x1.getMediaDataController();
            int classGuid = getClassGuid();
            sg.o0 o0Var = mt0Var.f28563y;
            String str = mt0Var.f28562x;
            ArrayList arrayList = mt0Var.f28558n;
            ArrayList arrayList2 = mt0Var.h;
            int i10 = mt0Var.f28561w;
            boolean z12 = mt0Var.f28560s;
            mediaDataController.Q0 = o0Var;
            mediaDataController.f18643d1 = str;
            boolean[] zArr = mediaDataController.X0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.Z0;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f18635a1.clear();
            mediaDataController.f18635a1.addAll(arrayList);
            mediaDataController.k2();
            int[] iArr = mediaDataController.W0;
            iArr[0] = i10;
            iArr[1] = 0;
            mediaDataController.f18645e1 = this.f27558ld;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.at.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f18645e1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.f27557kd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
