package org.telegram.ui.Components;

import android.text.TextUtils;
public final class wg implements Runnable {
    public final int f30341a;
    public final li f30342b;

    public wg(li liVar, int i10) {
        this.f30341a = i10;
        this.f30342b = liVar;
    }

    @Override
    public final void run() {
        du duVar;
        boolean z4;
        long j10;
        boolean G1;
        switch (this.f30341a) {
            case 0:
                li liVar = this.f30342b;
                if (liVar.Z) {
                    duVar = liVar.M0;
                } else {
                    duVar = liVar.B0;
                }
                if (duVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(duVar.getText().toString().trim())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                liVar.M1(z4);
                return;
            case 1:
                li liVar2 = this.f30342b;
                cf cfVar = liVar2.f26695e0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                vh vhVar = liVar2.F0;
                liVar2.K0 = j11;
                vhVar.setEffect(j11);
                di diVar = liVar2.f26748v0;
                if (diVar != liVar2.f26702g0 && diVar != liVar2.f26722n0) {
                    if (!diVar.H(0, false, 0, liVar2.s1(), j11)) {
                        liVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = liVar2.G1(0, false, 0, liVar2.s1(), j11);
                }
                cf cfVar2 = liVar2.f26695e0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    liVar2.f26695e0 = null;
                    return;
                }
                return;
            case 2:
                this.f30342b.F1();
                return;
            default:
                li.w(this.f30342b);
                return;
        }
    }
}
