package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class s3 extends LinearLayout {
    public final d11 f30175a;
    public boolean f30176b;
    public d11 f30177c;
    public final r3 d;

    public s3(Context context, r3 r3Var) {
        super(context);
        this.d = r3Var;
        this.f30175a = new d11(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f30175a.c((getWidth() - this.f30175a.f25437c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f30176b != z10 || this.f30177c == null) {
                this.f30176b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f30177c = new d11(str, 18.0f, null);
            }
            this.f30177c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
