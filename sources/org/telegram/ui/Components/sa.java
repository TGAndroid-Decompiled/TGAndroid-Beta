package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class sa {
    public final int f30514a;
    public final fk0 f30515b;
    public final org.telegram.ui.Cells.z f30516c;
    public final TextPaint d;
    public final StaticLayout f30517e;
    public final float f30518f;
    public final float f30519g;
    public final RectF h;
    public final g6 f30520i;
    public final int f30521j;
    public final int f30522k;
    public boolean f30523l;
    public int f30524m;
    public final gb0 f30525n;

    public sa(gb0 gb0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f30525n = gb0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f30520i = new g6(gb0Var, 0L, 200L, js.h);
        this.f30524m = -1;
        this.f30514a = i10;
        this.f30521j = i12;
        this.f30522k = i13;
        fk0 fk0Var = new fk0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f30515b = fk0Var;
        fk0Var.R(gb0Var);
        fk0Var.J(true);
        fk0Var.h = true;
        fk0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = gb0Var.f30828a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(i14, c6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f30517e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f30518f = f7;
        this.f30519g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f30516c = org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i14, c6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
