package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class r3 extends LinearLayout {
    public final u01 f27820a;
    public boolean f27821b;
    public u01 f27822c;
    public final q3 d;

    public r3(Context context, q3 q3Var) {
        super(context);
        this.d = q3Var;
        this.f27820a = new u01(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        float width = (getWidth() - this.f27820a.f28649c) / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f27820a.c(width, height, 1.0f, org.telegram.ui.ActionBar.h6.w0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f27821b != z10 || this.f27822c == null) {
                this.f27821b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f27822c = new u01(str, 18.0f, null);
            }
            this.f27822c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.h6.w0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
