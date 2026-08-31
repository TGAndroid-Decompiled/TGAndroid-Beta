package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class ia {
    public final int f27721a;
    public final ij0 f27722b;
    public final org.telegram.ui.Cells.z f27723c;
    public final TextPaint d;
    public final StaticLayout f27724e;
    public final float f27725f;
    public final float f27726g;
    public final RectF h;
    public final z5 f27727i;
    public final int f27728j;
    public final int f27729k;
    public boolean f27730l;
    public int f27731m;
    public final ea0 f27732n;

    public ia(ea0 ea0Var, int i10, int i11, int i12, int i13, String str) {
        float f10;
        this.f27732n = ea0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27727i = new z5(ea0Var, 0L, 200L, pr.h);
        this.f27731m = -1;
        this.f27721a = i10;
        this.f27728j = i12;
        this.f27729k = i13;
        ij0 ij0Var = new ij0(i11, AndroidUtilities.dp(29.0f), l.d.j(i11, ""), AndroidUtilities.dp(29.0f));
        this.f27722b = ij0Var;
        ij0Var.f27835s0 = ea0Var;
        ij0Var.H(true);
        ij0Var.h = true;
        ij0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = ea0Var.f28084a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f27724e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineWidth(0);
        } else {
            f10 = 0.0f;
        }
        this.f27725f = f10;
        this.f27726g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27723c = org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(i14, g6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
