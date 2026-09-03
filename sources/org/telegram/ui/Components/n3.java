package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class n3 extends LinearLayout {
    public final k01 f29371a;
    public boolean f29372b;
    public k01 f29373c;
    public final m3 d;

    public n3(Context context, m3 m3Var) {
        super(context);
        this.d = m3Var;
        this.f29371a = new k01(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        String str;
        float width = (getWidth() - this.f29371a.f28227c) / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.f29371a.c(width, height, 1.0f, org.telegram.ui.ActionBar.k6.w0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.f29372b != z4 || this.f29373c == null) {
                this.f29372b = z4;
                if (z4) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f29373c = new k01(str, 18.0f, null);
            }
            this.f29373c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.k6.w0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
