package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class p3 extends LinearLayout {
    public final g01 f26939a;
    public boolean f26940b;
    public g01 f26941c;
    public final o3 d;

    public p3(Context context, o3 o3Var) {
        super(context);
        this.d = o3Var;
        this.f26939a = new g01(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        float width = (getWidth() - this.f26939a.f24149c) / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.f26939a.c(width, height, 1.0f, org.telegram.ui.ActionBar.i6.w0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f26940b != z10 || this.f26941c == null) {
                this.f26940b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f26941c = new g01(str, 18.0f, null);
            }
            this.f26941c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.i6.w0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
