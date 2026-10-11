package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class sa {
    public final int f30678a;
    public final ek0 f30679b;
    public final org.telegram.ui.Cells.z f30680c;
    public final TextPaint d;
    public final StaticLayout f30681e;
    public final float f30682f;
    public final float f30683g;
    public final RectF h;
    public final g6 f30684i;
    public final int f30685j;
    public final int f30686k;
    public boolean f30687l;
    public int f30688m;
    public final db0 f30689n;

    public sa(db0 db0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f30689n = db0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f30684i = new g6(db0Var, 0L, 200L, is.h);
        this.f30688m = -1;
        this.f30678a = i10;
        this.f30685j = i12;
        this.f30686k = i13;
        ek0 ek0Var = new ek0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f30679b = ek0Var;
        ek0Var.R(db0Var);
        ek0Var.J(true);
        ek0Var.h = true;
        ek0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = db0Var.f31067a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f30681e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f30682f = f7;
        this.f30683g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f30680c = org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
