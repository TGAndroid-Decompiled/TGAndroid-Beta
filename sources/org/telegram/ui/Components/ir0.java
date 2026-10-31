package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class ir0 extends org.telegram.ui.un {
    public boolean f27069jd;
    public final int f27070kd;
    public final zt0 f27071ld;

    public ir0(zt0 zt0Var, Bundle bundle, int i10) {
        super(bundle);
        this.f27071ld = zt0Var;
        this.f27070kd = i10;
        this.f27069jd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        zt0 zt0Var = this.f27071ld;
        lt0 lt0Var = zt0Var.U;
        if (this.f27069jd) {
            if (this.f42291j0 != null) {
                Ba("");
                this.f42291j0.P(lt0Var.f28188x, false);
            }
            org.telegram.ui.wk wkVar = this.C1;
            if (wkVar != null) {
                wkVar.e(lt0Var.f28189y, false);
            }
            org.telegram.messenger.ui mediaDataController = zt0Var.f33240x1.getMediaDataController();
            int classGuid = getClassGuid();
            sg.o0 o0Var = lt0Var.f28189y;
            String str = lt0Var.f28188x;
            ArrayList arrayList = lt0Var.f28184n;
            ArrayList arrayList2 = lt0Var.h;
            int i10 = lt0Var.f28187w;
            boolean z12 = lt0Var.f28186s;
            mediaDataController.Q0 = o0Var;
            mediaDataController.f18314d1 = str;
            boolean[] zArr = mediaDataController.X0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.Z0;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f18306a1.clear();
            mediaDataController.f18306a1.addAll(arrayList);
            mediaDataController.k2();
            int[] iArr = mediaDataController.W0;
            iArr[0] = i10;
            iArr[1] = 0;
            mediaDataController.f18316e1 = this.f27070kd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.zs.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f18316e1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.f27069jd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
