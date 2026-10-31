package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;
public final class mg implements Runnable {
    public final int f28434a;
    public final bi f28435b;

    public mg(bi biVar, int i10) {
        this.f28434a = i10;
        this.f28435b = biVar;
    }

    @Override
    public final void run() {
        wt wtVar;
        boolean z10;
        long j10;
        boolean t12;
        uh uhVar;
        jm jmVar;
        switch (this.f28434a) {
            case 0:
                bi biVar = this.f28435b;
                if (biVar.T1) {
                    wtVar = biVar.J2;
                } else {
                    wtVar = biVar.f24745y2;
                }
                if (wtVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(wtVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                biVar.A1(z10);
                return;
            case 1:
                bi biVar2 = this.f28435b;
                biVar2.f21624z0 = null;
                biVar2.A0 = 0;
                biVar2.L();
                return;
            case 2:
                bi biVar3 = this.f28435b;
                pe peVar = biVar3.Y1;
                if (peVar != null) {
                    j10 = peVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                ih ihVar = biVar3.C2;
                biVar3.H2 = j11;
                ihVar.setEffect(j11);
                uh uhVar2 = biVar3.f24721s2;
                if (uhVar2 != biVar3.a2 && uhVar2 != biVar3.f24679h2) {
                    if (!uhVar2.J(false, 0, 0, j11, biVar3.e1())) {
                        biVar3.dismiss();
                    }
                    t12 = false;
                } else {
                    t12 = biVar3.t1(false, 0, 0, j11, biVar3.e1());
                }
                pe peVar2 = biVar3.Y1;
                if (peVar2 != null) {
                    peVar2.g(!t12);
                    biVar3.Y1 = null;
                    return;
                }
                return;
            case 3:
                bi biVar4 = this.f28435b;
                biVar4.a(true);
                org.telegram.ui.ActionBar.k2 k2Var = biVar4.W1;
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                this.f28435b.s1();
                return;
            default:
                bi biVar5 = this.f28435b;
                biVar5.f24702n3 = null;
                uh uhVar3 = biVar5.f24721s2;
                if (uhVar3 != biVar5.a2 && (uhVar = biVar5.f24725t2) != (jmVar = biVar5.f24679h2) && uhVar3 != uhVar && uhVar3 != jmVar) {
                    biVar5.f21586b.removeView(uhVar3);
                }
                biVar5.f24721s2.setVisibility(8);
                biVar5.f24721s2.s();
                biVar5.f24725t2.H();
                biVar5.f24721s2 = biVar5.f24725t2;
                biVar5.f24725t2 = null;
                int[] iArr = biVar5.V3;
                iArr[0] = iArr[1];
                biVar5.u1(biVar5.T1, false);
                biVar5.K1();
                return;
        }
    }
}
