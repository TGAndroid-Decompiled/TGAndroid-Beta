package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class t3 extends LinearLayout {
    public final l11 f30980a;
    public boolean f30981b;
    public l11 f30982c;
    public final s3 d;

    public t3(Context context, s3 s3Var) {
        super(context);
        this.d = s3Var;
        this.f30980a = new l11(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.f30980a.c((getWidth() - this.f30980a.f28222c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.i6.x0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f30981b != z10 || this.f30982c == null) {
                this.f30981b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f30982c = new l11(str, 18.0f, null);
            }
            this.f30982c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.i6.x0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
