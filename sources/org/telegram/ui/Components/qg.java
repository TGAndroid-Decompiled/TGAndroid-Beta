package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;
public final class qg implements Runnable {
    public final int f37288a;
    public final di f37289b;

    public qg(di diVar, int i7) {
        this.f37288a = i7;
        this.f37289b = diVar;
    }

    @Override
    public final void run() {
        kt ktVar;
        boolean z9;
        long j3;
        boolean u12;
        vh vhVar;
        bm bmVar;
        switch (this.f37288a) {
            case 0:
                di diVar = this.f37289b;
                if (diVar.T1) {
                    ktVar = diVar.J2;
                } else {
                    ktVar = diVar.f33008y2;
                }
                if (ktVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ktVar.getText().toString().trim())) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                diVar.B1(z9);
                return;
            case 1:
                di diVar2 = this.f37289b;
                diVar2.f28655z0 = null;
                diVar2.A0 = 0;
                diVar2.K();
                return;
            case 2:
                di diVar3 = this.f37289b;
                ue ueVar = diVar3.Y1;
                if (ueVar != null) {
                    j3 = ueVar.j();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                lh lhVar = diVar3.C2;
                diVar3.H2 = j10;
                lhVar.setEffect(j10);
                vh vhVar2 = diVar3.f32984s2;
                if (vhVar2 != diVar3.f32924a2 && vhVar2 != diVar3.f32944h2) {
                    if (!vhVar2.L(false, 0, 0, j10, diVar3.f1())) {
                        diVar3.dismiss();
                    }
                    u12 = false;
                } else {
                    u12 = diVar3.u1(false, 0, 0, j10, diVar3.f1());
                }
                ue ueVar2 = diVar3.Y1;
                if (ueVar2 != null) {
                    ueVar2.g(!u12);
                    diVar3.Y1 = null;
                    return;
                }
                return;
            case 3:
                di diVar4 = this.f37289b;
                diVar4.a(true);
                org.telegram.ui.ActionBar.f2 f2Var = diVar4.W1;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                this.f37289b.t1();
                return;
            default:
                di diVar5 = this.f37289b;
                diVar5.f32966n3 = null;
                vh vhVar3 = diVar5.f32984s2;
                if (vhVar3 != diVar5.f32924a2 && (vhVar = diVar5.f32988t2) != (bmVar = diVar5.f32944h2) && vhVar3 != vhVar && vhVar3 != bmVar) {
                    diVar5.f28616b.removeView(vhVar3);
                }
                diVar5.f32984s2.setVisibility(8);
                diVar5.f32984s2.t();
                diVar5.f32988t2.I();
                diVar5.f32984s2 = diVar5.f32988t2;
                diVar5.f32988t2 = null;
                int[] iArr = diVar5.V3;
                iArr[0] = iArr[1];
                diVar5.v1(diVar5.T1, false);
                diVar5.L1();
                return;
        }
    }
}
