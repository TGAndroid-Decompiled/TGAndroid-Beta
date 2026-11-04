package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;
public final class ng implements Runnable {
    public final int f36509a;
    public final bi f36510b;

    public ng(bi biVar, int i3) {
        this.f36509a = i3;
        this.f36510b = biVar;
    }

    @Override
    public final void run() {
        jt jtVar;
        boolean z10;
        long j10;
        boolean u12;
        th thVar;
        am amVar;
        switch (this.f36509a) {
            case 0:
                bi biVar = this.f36510b;
                if (biVar.U1) {
                    jtVar = biVar.K2;
                } else {
                    jtVar = biVar.f32299z2;
                }
                if (jtVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(jtVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                biVar.B1(z10);
                return;
            case 1:
                bi biVar2 = this.f36510b;
                biVar2.A0 = null;
                biVar2.B0 = 0;
                biVar2.K();
                return;
            case 2:
                bi biVar3 = this.f36510b;
                se seVar = biVar3.Z1;
                if (seVar != null) {
                    j10 = seVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                ih ihVar = biVar3.D2;
                biVar3.I2 = j11;
                ihVar.setEffect(j11);
                th thVar2 = biVar3.f32275t2;
                if (thVar2 != biVar3.f32215b2 && thVar2 != biVar3.f32235i2) {
                    if (!thVar2.L(false, 0, 0, j11, biVar3.f1())) {
                        biVar3.dismiss();
                    }
                    u12 = false;
                } else {
                    u12 = biVar3.u1(false, 0, 0, j11, biVar3.f1());
                }
                se seVar2 = biVar3.Z1;
                if (seVar2 != null) {
                    seVar2.g(!u12);
                    biVar3.Z1 = null;
                    return;
                }
                return;
            case 3:
                bi biVar4 = this.f36510b;
                biVar4.a(true);
                org.telegram.ui.ActionBar.d2 d2Var = biVar4.X1;
                if (d2Var != null) {
                    d2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                this.f36510b.t1();
                return;
            default:
                bi biVar5 = this.f36510b;
                biVar5.f32256o3 = null;
                th thVar3 = biVar5.f32275t2;
                if (thVar3 != biVar5.f32215b2 && (thVar = biVar5.f32279u2) != (amVar = biVar5.f32235i2) && thVar3 != thVar && thVar3 != amVar) {
                    biVar5.f28586b.removeView(thVar3);
                }
                biVar5.f32275t2.setVisibility(8);
                biVar5.f32275t2.t();
                biVar5.f32279u2.I();
                biVar5.f32275t2 = biVar5.f32279u2;
                biVar5.f32279u2 = null;
                int[] iArr = biVar5.W3;
                iArr[0] = iArr[1];
                biVar5.v1(biVar5.U1, false);
                biVar5.L1();
                return;
        }
    }
}
