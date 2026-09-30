package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class ra {
    public final int f27926a;
    public final lj0 f27927b;
    public final org.telegram.ui.Cells.z f27928c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f27929f;
    public final float f27930g;
    public final RectF h;
    public final e6 f27931i;
    public final int f27932j;
    public final int f27933k;
    public boolean f27934l;
    public int f27935m;
    public final pa0 f27936n;

    public ra(pa0 pa0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f27936n = pa0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27931i = new e6(pa0Var, 0L, 200L, tr.h);
        this.f27935m = -1;
        this.f27926a = i10;
        this.f27932j = i12;
        this.f27933k = i13;
        lj0 lj0Var = new lj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f27927b = lj0Var;
        lj0Var.R(pa0Var);
        lj0Var.J(true);
        lj0Var.h = true;
        lj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = pa0Var.f28225a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f27929f = f7;
        this.f27930g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27928c = org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
