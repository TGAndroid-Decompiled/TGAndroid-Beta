package org.telegram.ui.Components;

import android.text.TextUtils;
public final class wg implements Runnable {
    public final int f34222a;
    public final ki f34223b;

    public wg(ki kiVar, int i9) {
        this.f34222a = i9;
        this.f34223b = kiVar;
    }

    @Override
    public final void run() {
        ut utVar;
        boolean z10;
        long j10;
        boolean G1;
        switch (this.f34222a) {
            case 0:
                ki kiVar = this.f34223b;
                if (kiVar.Y) {
                    utVar = kiVar.L0;
                } else {
                    utVar = kiVar.A0;
                }
                if (utVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(utVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kiVar.M1(z10);
                return;
            case 1:
                ki kiVar2 = this.f34223b;
                cf cfVar = kiVar2.f30106d0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                vh vhVar = kiVar2.E0;
                kiVar2.J0 = j11;
                vhVar.setEffect(j11);
                ci ciVar = kiVar2.f30160u0;
                if (ciVar != kiVar2.f30114f0 && ciVar != kiVar2.m0) {
                    if (!ciVar.H(0, false, 0, kiVar2.s1(), j11)) {
                        kiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = kiVar2.G1(0, false, 0, kiVar2.s1(), j11);
                }
                cf cfVar2 = kiVar2.f30106d0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    kiVar2.f30106d0 = null;
                    return;
                }
                return;
            case 2:
                this.f34223b.F1();
                return;
            default:
                ki.w(this.f34223b);
                return;
        }
    }
}
