package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class p3 extends LinearLayout {
    public final h01 f26923a;
    public boolean f26924b;
    public h01 f26925c;
    public final o3 d;

    public p3(Context context, o3 o3Var) {
        super(context);
        this.d = o3Var;
        this.f26923a = new h01(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        float width = (getWidth() - this.f26923a.f24442c) / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f26923a.c(width, height, 1.0f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f26924b != z10 || this.f26925c == null) {
                this.f26924b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f26925c = new h01(str, 18.0f, null);
            }
            this.f26925c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
