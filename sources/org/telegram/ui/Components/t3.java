package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class t3 extends LinearLayout {
    public final i11 f28955a;
    public boolean f28956b;
    public i11 f28957c;
    public final s3 d;

    public t3(Context context, s3 s3Var) {
        super(context);
        this.d = s3Var;
        this.f28955a = new i11(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.f28955a.c((getWidth() - this.f28955a.f25455c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.g6.x0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f28956b != z10 || this.f28957c == null) {
                this.f28956b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f28957c = new i11(str, 18.0f, null);
            }
            this.f28957c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.g6.x0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
