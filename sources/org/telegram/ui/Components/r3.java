package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class r3 extends LinearLayout {
    public final f01 f29936a;
    public boolean f29937b;
    public f01 f29938c;
    public final q3 d;

    public r3(Context context, q3 q3Var) {
        super(context);
        this.d = q3Var;
        this.f29936a = new f01(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        float width = (getWidth() - this.f29936a.f25875c) / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f29936a.c(width, height, 1.0f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f29937b != z10 || this.f29938c == null) {
                this.f29937b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f29938c = new f01(str, 18.0f, null);
            }
            this.f29938c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
