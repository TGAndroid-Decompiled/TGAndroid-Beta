package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class t3 extends LinearLayout {
    public final m11 f30963a;
    public boolean f30964b;
    public m11 f30965c;
    public final s3 d;

    public t3(Context context, s3 s3Var) {
        super(context);
        this.d = s3Var;
        this.f30963a = new m11(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.f30963a.c((getWidth() - this.f30963a.f28602c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.i6.x0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f30964b != z10 || this.f30965c == null) {
                this.f30964b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f30965c = new m11(str, 18.0f, null);
            }
            this.f30965c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.i6.x0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
