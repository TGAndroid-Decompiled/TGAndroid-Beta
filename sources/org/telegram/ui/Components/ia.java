package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class ia {
    public final int f25654a;
    public final gj0 f25655b;
    public final org.telegram.ui.Cells.z f25656c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f25657f;
    public final float f25658g;
    public final RectF h;
    public final z5 f25659i;
    public final int f25660j;
    public final int f25661k;
    public boolean f25662l;
    public int f25663m;
    public final ca0 f25664n;

    public ia(ca0 ca0Var, int i10, int i11, int i12, int i13, String str) {
        float f10;
        this.f25664n = ca0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f25659i = new z5(ca0Var, 0L, 200L, nr.h);
        this.f25663m = -1;
        this.f25654a = i10;
        this.f25660j = i12;
        this.f25661k = i13;
        gj0 gj0Var = new gj0(i11, AndroidUtilities.dp(29.0f), kh.a2.j(i11, ""), AndroidUtilities.dp(29.0f));
        this.f25655b = gj0Var;
        gj0Var.f25170s0 = ca0Var;
        gj0Var.H(true);
        gj0Var.h = true;
        gj0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = ca0Var.f25942a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineWidth(0);
        } else {
            f10 = 0.0f;
        }
        this.f25657f = f10;
        this.f25658g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f25656c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
