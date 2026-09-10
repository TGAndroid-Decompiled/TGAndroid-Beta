package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class q3 extends LinearLayout {
    public final t01 f26308a;
    public boolean f26309b;
    public t01 f26310c;
    public final p3 d;

    public q3(Context context, p3 p3Var) {
        super(context);
        this.d = p3Var;
        this.f26308a = new t01(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        float width = (getWidth() - this.f26308a.f27247c) / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f26308a.c(width, height, 1.0f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f26309b != z10 || this.f26310c == null) {
                this.f26309b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f26310c = new t01(str, 18.0f, null);
            }
            this.f26310c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
