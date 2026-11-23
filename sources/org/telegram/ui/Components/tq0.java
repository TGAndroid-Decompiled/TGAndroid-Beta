package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
public final class tq0 extends org.telegram.ui.bn {
    public boolean f40016vd;
    public final int f40017wd;
    public final jt0 f40018xd;

    public tq0(jt0 jt0Var, Bundle bundle, int i7) {
        super(bundle);
        this.f40018xd = jt0Var;
        this.f40017wd = i7;
        this.f40016vd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        jt0 jt0Var = this.f40018xd;
        vs0 vs0Var = jt0Var.V;
        if (this.f40016vd) {
            if (this.f46085k0 != null) {
                Oa("");
                this.f46085k0.Q(vs0Var.f41556x, false);
            }
            org.telegram.ui.bk bkVar = this.D1;
            if (bkVar != null) {
                bkVar.e(vs0Var.f41557y, false);
            }
            org.telegram.messenger.si mediaDataController = jt0Var.f36683y1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.p0 p0Var = vs0Var.f41557y;
            String str = vs0Var.f41556x;
            ArrayList arrayList = vs0Var.f41552n;
            ArrayList arrayList2 = vs0Var.h;
            int i7 = vs0Var.f41555w;
            boolean z12 = vs0Var.f41554s;
            mediaDataController.R0 = p0Var;
            mediaDataController.f26823e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.f26812a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.f26815b1.clear();
            mediaDataController.f26815b1.addAll(arrayList);
            mediaDataController.p2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.f26826f1 = this.f40017wd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.ls.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.e0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f26826f1), Integer.valueOf(mediaDataController.l0()), Boolean.TRUE);
            this.f40016vd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
