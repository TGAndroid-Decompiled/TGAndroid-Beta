package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;
public final class vg implements Runnable {
    public final int f40409a;
    public final ki f40410b;

    public vg(ki kiVar, int i7) {
        this.f40409a = i7;
        this.f40410b = kiVar;
    }

    @Override
    public final void run() {
        rt rtVar;
        boolean z10;
        long j3;
        boolean u12;
        ci ciVar;
        im imVar;
        switch (this.f40409a) {
            case 0:
                ki kiVar = this.f40410b;
                if (kiVar.X1) {
                    rtVar = kiVar.N2;
                } else {
                    rtVar = kiVar.C2;
                }
                if (rtVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(rtVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kiVar.B1(z10);
                return;
            case 1:
                ki kiVar2 = this.f40410b;
                kiVar2.A0 = null;
                kiVar2.B0 = 0;
                kiVar2.L();
                return;
            case 2:
                ki kiVar3 = this.f40410b;
                ue ueVar = kiVar3.f36442c2;
                if (ueVar != null) {
                    j3 = ueVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                sh shVar = kiVar3.G2;
                kiVar3.L2 = j10;
                shVar.setEffect(j10);
                ci ciVar2 = kiVar3.f36509w2;
                if (ciVar2 != kiVar3.f36447e2 && ciVar2 != kiVar3.f36467l2) {
                    if (!ciVar2.M(false, 0, 0, j10, kiVar3.f1())) {
                        kiVar3.dismiss();
                    }
                    u12 = false;
                } else {
                    u12 = kiVar3.u1(false, 0, 0, j10, kiVar3.f1());
                }
                ue ueVar2 = kiVar3.f36442c2;
                if (ueVar2 != null) {
                    ueVar2.h(!u12);
                    kiVar3.f36442c2 = null;
                    return;
                }
                return;
            case 3:
                ki kiVar4 = this.f40410b;
                kiVar4.a(true);
                org.telegram.ui.ActionBar.e2 e2Var = kiVar4.f36436a2;
                if (e2Var != null) {
                    e2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                this.f40410b.t1();
                return;
            default:
                ki kiVar5 = this.f40410b;
                kiVar5.f36490r3 = null;
                ci ciVar3 = kiVar5.f36509w2;
                if (ciVar3 != kiVar5.f36447e2 && (ciVar = kiVar5.f36513x2) != (imVar = kiVar5.f36467l2) && ciVar3 != ciVar && ciVar3 != imVar) {
                    kiVar5.f29682b.removeView(ciVar3);
                }
                kiVar5.f36509w2.setVisibility(8);
                kiVar5.f36509w2.t();
                kiVar5.f36513x2.J();
                kiVar5.f36509w2 = kiVar5.f36513x2;
                kiVar5.f36513x2 = null;
                int[] iArr = kiVar5.Z3;
                iArr[0] = iArr[1];
                kiVar5.v1(kiVar5.X1, false);
                kiVar5.L1();
                return;
        }
    }
}
