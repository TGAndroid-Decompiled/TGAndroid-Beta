package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;
public final class pg implements Runnable {
    public final int f36909a;
    public final ci f36910b;

    public pg(ci ciVar, int i7) {
        this.f36909a = i7;
        this.f36910b = ciVar;
    }

    @Override
    public final void run() {
        kt ktVar;
        boolean z9;
        long j3;
        boolean u12;
        uh uhVar;
        am amVar;
        switch (this.f36909a) {
            case 0:
                ci ciVar = this.f36910b;
                if (ciVar.W1) {
                    ktVar = ciVar.M2;
                } else {
                    ktVar = ciVar.B2;
                }
                if (ktVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ktVar.getText().toString().trim())) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ciVar.B1(z9);
                return;
            case 1:
                ci ciVar2 = this.f36910b;
                ciVar2.f28714z0 = null;
                ciVar2.A0 = 0;
                ciVar2.K();
                return;
            case 2:
                ci ciVar3 = this.f36910b;
                te teVar = ciVar3.f32594b2;
                if (teVar != null) {
                    j3 = teVar.j();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                kh khVar = ciVar3.F2;
                ciVar3.K2 = j10;
                khVar.setEffect(j10);
                uh uhVar2 = ciVar3.f32660v2;
                if (uhVar2 != ciVar3.d2 && uhVar2 != ciVar3.f32619k2) {
                    if (!uhVar2.L(false, 0, 0, j10, ciVar3.f1())) {
                        ciVar3.dismiss();
                    }
                    u12 = false;
                } else {
                    u12 = ciVar3.u1(false, 0, 0, j10, ciVar3.f1());
                }
                te teVar2 = ciVar3.f32594b2;
                if (teVar2 != null) {
                    teVar2.g(!u12);
                    ciVar3.f32594b2 = null;
                    return;
                }
                return;
            case 3:
                ci ciVar4 = this.f36910b;
                ciVar4.a(true);
                org.telegram.ui.ActionBar.f2 f2Var = ciVar4.Z1;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                this.f36910b.t1();
                return;
            default:
                ci ciVar5 = this.f36910b;
                ciVar5.f32641q3 = null;
                uh uhVar3 = ciVar5.f32660v2;
                if (uhVar3 != ciVar5.d2 && (uhVar = ciVar5.f32664w2) != (amVar = ciVar5.f32619k2) && uhVar3 != uhVar && uhVar3 != amVar) {
                    ciVar5.f28672b.removeView(uhVar3);
                }
                ciVar5.f32660v2.setVisibility(8);
                ciVar5.f32660v2.t();
                ciVar5.f32664w2.I();
                ciVar5.f32660v2 = ciVar5.f32664w2;
                ciVar5.f32664w2 = null;
                int[] iArr = ciVar5.Y3;
                iArr[0] = iArr[1];
                ciVar5.v1(ciVar5.W1, false);
                ciVar5.L1();
                return;
        }
    }
}
