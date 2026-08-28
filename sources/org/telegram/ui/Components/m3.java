package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class m3 extends LinearLayout {
    public final nz0 f30679a;
    public boolean f30680b;
    public nz0 f30681c;
    public final l3 d;

    public m3(Context context, l3 l3Var) {
        super(context);
        this.d = l3Var;
        this.f30679a = new nz0(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        float width = (getWidth() - this.f30679a.f31223c) / 2.0f;
        float height = getHeight() / 2.0f;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        this.f30679a.c(width, height, 1.0f, org.telegram.ui.ActionBar.f6.w0(null, i9, false), canvas);
        if (!LocaleController.is24HourFormat) {
            if (this.d.getValue() % 24 < 12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f30680b != z10 || this.f30681c == null) {
                this.f30680b = z10;
                if (z10) {
                    str = "AM";
                } else {
                    str = "PM";
                }
                this.f30681c = new nz0(str, 18.0f, null);
            }
            this.f30681c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.f6.w0(null, i9, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
