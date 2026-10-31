package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class xu extends e51 {
    public final yu e;

    public xu(yu yuVar, String str) {
        super(str, (yz0) null);
        this.e = yuVar;
    }

    @Override
    public final void onClick(View view) {
        yu yuVar = this.e;
        cv cvVar = yuVar.f32800y;
        Pattern pattern = cv.M1;
        org.telegram.messenger.vp.r1(cvVar.f21583a).v3(getURL(), yuVar.f32800y.f25162j1, 1, null);
        yuVar.f32800y.L0();
        yuVar.f32800y.dismiss();
    }
}
