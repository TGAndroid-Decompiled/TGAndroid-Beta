package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class s3 extends LinearLayout {
    public final f11 f30170a;
    public boolean f30171b;
    public f11 f30172c;
    public final r3 d;

    public s3(Context context, r3 r3Var) {
        super(context);
        this.d = r3Var;
        this.f30170a = new f11(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f30170a.c((getWidth() - this.f30170a.f26021c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f30171b != z10 || this.f30172c == null) {
                this.f30171b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f30172c = new f11(str, 18.0f, null);
            }
            this.f30172c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
