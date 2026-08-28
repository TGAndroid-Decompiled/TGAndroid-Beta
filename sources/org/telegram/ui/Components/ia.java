package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class ia {
    public final int f29397a;
    public final mi0 f29398b;
    public final org.telegram.ui.Cells.z f29399c;
    public final TextPaint d;
    public final StaticLayout f29400e;
    public final float f29401f;
    public final float f29402g;
    public final RectF h;
    public final y5 f29403i;
    public final int f29404j;
    public final int f29405k;
    public boolean f29406l;
    public int f29407m;
    public final j90 f29408n;

    public ia(j90 j90Var, int i9, int i10, int i11, int i12, String str) {
        float f10;
        this.f29408n = j90Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f29403i = new y5(j90Var, 0L, 200L, gr.h);
        this.f29407m = -1;
        this.f29397a = i9;
        this.f29404j = i11;
        this.f29405k = i12;
        mi0 mi0Var = new mi0(i10, AndroidUtilities.dp(29.0f), j3.r0.l(i10, ""), AndroidUtilities.dp(29.0f));
        this.f29398b = mi0Var;
        mi0Var.f30863r0 = j90Var;
        mi0Var.H(true);
        mi0Var.h = true;
        mi0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = j90Var.f29672a;
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f29400e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineWidth(0);
        } else {
            f10 = 0.0f;
        }
        this.f29401f = f10;
        this.f29402g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f29399c = org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i13, b6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
