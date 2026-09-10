package org.telegram.ui.Components;

import android.text.TextUtils;
public final class jh implements Runnable {
    public final int f24400a;
    public final yi f24401b;

    public jh(yi yiVar, int i10) {
        this.f24400a = i10;
        this.f24401b = yiVar;
    }

    @Override
    public final void run() {
        nu nuVar;
        boolean z10;
        long j3;
        boolean G1;
        switch (this.f24400a) {
            case 0:
                yi yiVar = this.f24401b;
                if (yiVar.f29356c0) {
                    nuVar = yiVar.P0;
                } else {
                    nuVar = yiVar.E0;
                }
                if (nuVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(nuVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yiVar.M1(z10);
                return;
            case 1:
                yi yiVar2 = this.f24401b;
                of ofVar = yiVar2.f29372h0;
                if (ofVar != null) {
                    j3 = ofVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ii iiVar = yiVar2.I0;
                yiVar2.N0 = j10;
                iiVar.setEffect(j10);
                qi qiVar = yiVar2.f29427y0;
                if (qiVar != yiVar2.f29378j0 && qiVar != yiVar2.f29398q0) {
                    if (!qiVar.I(0, false, 0, yiVar2.s1(), j10)) {
                        yiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = yiVar2.G1(0, false, 0, yiVar2.s1(), j10);
                }
                of ofVar2 = yiVar2.f29372h0;
                if (ofVar2 != null) {
                    ofVar2.h(!G1);
                    yiVar2.f29372h0 = null;
                    return;
                }
                return;
            case 2:
                this.f24401b.F1();
                return;
            default:
                yi.w(this.f24401b);
                return;
        }
    }
}
