package org.telegram.ui.Components;

import android.text.TextUtils;

public final class sg implements Runnable {

    public final int f32436a;

    public final gi f32437b;

    public sg(gi giVar, int i10) {
        this.f32436a = i10;
        this.f32437b = giVar;
    }

    @Override
    public final void run() {
        boolean zG1;
        switch (this.f32436a) {
            case 0:
                gi giVar = this.f32437b;
                tt ttVar = giVar.Y ? giVar.L0 : giVar.A0;
                giVar.M1(ttVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ttVar.getText().toString().trim()));
                break;
            case 1:
                gi giVar2 = this.f32437b;
                ye yeVar = giVar2.f28642d0;
                long jK = yeVar != null ? yeVar.k() : 0L;
                rh rhVar = giVar2.E0;
                giVar2.J0 = jK;
                rhVar.setEffect(jK);
                yh yhVar = giVar2.f28696u0;
                if (yhVar == giVar2.f28650f0 || yhVar == giVar2.m0) {
                    zG1 = giVar2.G1(0, false, 0, giVar2.s1(), jK);
                } else {
                    if (!yhVar.I(0, false, 0, giVar2.s1(), jK)) {
                        giVar2.dismiss();
                    }
                    zG1 = false;
                }
                ye yeVar2 = giVar2.f28642d0;
                if (yeVar2 != null) {
                    yeVar2.h(!zG1);
                    giVar2.f28642d0 = null;
                }
                break;
            case 2:
                this.f32437b.F1();
                break;
            default:
                gi.x(this.f32437b);
                break;
        }
    }
}
