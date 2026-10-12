package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class sa {
    public final int f30510a;
    public final fk0 f30511b;
    public final org.telegram.ui.Cells.z f30512c;
    public final TextPaint d;
    public final StaticLayout f30513e;
    public final float f30514f;
    public final float f30515g;
    public final RectF h;
    public final g6 f30516i;
    public final int f30517j;
    public final int f30518k;
    public boolean f30519l;
    public int f30520m;
    public final gb0 f30521n;

    public sa(gb0 gb0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f30521n = gb0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f30516i = new g6(gb0Var, 0L, 200L, js.h);
        this.f30520m = -1;
        this.f30510a = i10;
        this.f30517j = i12;
        this.f30518k = i13;
        fk0 fk0Var = new fk0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f30511b = fk0Var;
        fk0Var.R(gb0Var);
        fk0Var.J(true);
        fk0Var.h = true;
        fk0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = gb0Var.f30831a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(i14, c6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f30513e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f30514f = f7;
        this.f30515g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f30512c = org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i14, c6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
