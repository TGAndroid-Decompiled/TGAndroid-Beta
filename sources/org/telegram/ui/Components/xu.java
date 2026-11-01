package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class xu extends f51 {
    public final yu e;

    public xu(yu yuVar, String str) {
        super(str, (zz0) null);
        this.e = yuVar;
    }

    @Override
    public final void onClick(View view) {
        yu yuVar = this.e;
        cv cvVar = yuVar.f32915y;
        Pattern pattern = cv.M1;
        org.telegram.messenger.wp.r1(cvVar.f21584a).v3(getURL(), yuVar.f32915y.f25243j1, 1, null);
        yuVar.f32915y.L0();
        yuVar.f32915y.dismiss();
    }
}
