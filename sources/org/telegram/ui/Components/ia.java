package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class ia {
    public final int f25653a;
    public final gj0 f25654b;
    public final org.telegram.ui.Cells.z f25655c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f25656f;
    public final float f25657g;
    public final RectF h;
    public final z5 f25658i;
    public final int f25659j;
    public final int f25660k;
    public boolean f25661l;
    public int f25662m;
    public final da0 f25663n;

    public ia(da0 da0Var, int i10, int i11, int i12, int i13, String str) {
        float f10;
        this.f25663n = da0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f25658i = new z5(da0Var, 0L, 200L, mr.h);
        this.f25662m = -1;
        this.f25653a = i10;
        this.f25659j = i12;
        this.f25660k = i13;
        gj0 gj0Var = new gj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f25654b = gj0Var;
        gj0Var.f25176s0 = da0Var;
        gj0Var.H(true);
        gj0Var.h = true;
        gj0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = da0Var.f25926a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineWidth(0);
        } else {
            f10 = 0.0f;
        }
        this.f25656f = f10;
        this.f25657g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f25655c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
