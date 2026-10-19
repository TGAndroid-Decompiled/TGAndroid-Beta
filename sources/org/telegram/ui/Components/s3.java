package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class s3 extends LinearLayout {
    public final e11 f30156a;
    public boolean f30157b;
    public e11 f30158c;
    public final r3 d;

    public s3(Context context, r3 r3Var) {
        super(context);
        this.d = r3Var;
        this.f30156a = new e11(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f30156a.c((getWidth() - this.f30156a.f25728c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f30157b != z10 || this.f30158c == null) {
                this.f30157b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f30158c = new e11(str, 18.0f, null);
            }
            this.f30158c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
