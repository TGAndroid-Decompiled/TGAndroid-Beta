package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class sa {
    public final int f28777a;
    public final yj0 f28778b;
    public final org.telegram.ui.Cells.z f28779c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f28780f;
    public final float f28781g;
    public final RectF h;
    public final g6 f28782i;
    public final int f28783j;
    public final int f28784k;
    public boolean f28785l;
    public int f28786m;
    public final bb0 f28787n;

    public sa(bb0 bb0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f28787n = bb0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f28782i = new g6(bb0Var, 0L, 200L, es.h);
        this.f28786m = -1;
        this.f28777a = i10;
        this.f28783j = i12;
        this.f28784k = i13;
        yj0 yj0Var = new yj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f28778b = yj0Var;
        yj0Var.R(bb0Var);
        yj0Var.J(true);
        yj0Var.h = true;
        yj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = bb0Var.f29004a;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f28780f = f7;
        this.f28781g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f28779c = org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(i14, c6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
