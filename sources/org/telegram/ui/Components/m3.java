package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class m3 extends LinearLayout {

    public final pz0 f30542a;

    public boolean f30543b;

    public pz0 f30544c;
    public final l3 d;

    public m3(Context context, l3 l3Var) {
        super(context);
        this.d = l3Var;
        this.f30542a = new pz0(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = (getWidth() - this.f30542a.f31697c) / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.f30542a.c(width, height, 1.0f, org.telegram.ui.ActionBar.g6.w0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            boolean z10 = this.d.getValue() % 24 < 12;
            if (this.f30543b != z10 || this.f30544c == null) {
                this.f30543b = z10;
                this.f30544c = new pz0(z10 ? "AM" : "PM", 18.0f, null);
            }
            this.f30544c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.g6.w0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
