package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class t3 extends LinearLayout {
    public final q11 f32816a;
    public boolean f32817b;
    public q11 f32818c;
    public final s3 d;

    public t3(Context context, s3 s3Var) {
        super(context);
        this.d = s3Var;
        this.f32816a = new q11(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.f32816a.c((getWidth() - this.f32816a.f31788c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.y6.x0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f32817b != z10 || this.f32818c == null) {
                this.f32817b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f32818c = new q11(str, 18.0f, null);
            }
            this.f32818c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.y6.x0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
