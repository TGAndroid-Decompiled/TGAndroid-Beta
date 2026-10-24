package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class q3 extends LinearLayout {
    public final h11 f29777a;
    public boolean f29778b;
    public h11 f29779c;
    public final p3 d;

    public q3(Context context, p3 p3Var) {
        super(context);
        this.d = p3Var;
        this.f29777a = new h11(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.f29777a.c((getWidth() - this.f29777a.f26843c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f29778b != z10 || this.f29779c == null) {
                this.f29778b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f29779c = new h11(str, 18.0f, null);
            }
            this.f29779c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
