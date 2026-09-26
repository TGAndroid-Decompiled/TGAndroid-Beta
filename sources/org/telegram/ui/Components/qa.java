package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f27616a;
    public final jj0 f27617b;
    public final org.telegram.ui.Cells.z f27618c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f27619f;
    public final float f27620g;
    public final RectF h;
    public final e6 f27621i;
    public final int f27622j;
    public final int f27623k;
    public boolean f27624l;
    public int f27625m;
    public final na0 f27626n;

    public qa(na0 na0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f27626n = na0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27621i = new e6(na0Var, 0L, 200L, sr.h);
        this.f27625m = -1;
        this.f27616a = i10;
        this.f27622j = i12;
        this.f27623k = i13;
        jj0 jj0Var = new jj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f27617b = jj0Var;
        jj0Var.R(na0Var);
        jj0Var.J(true);
        jj0Var.h = true;
        jj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = na0Var.f27878a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f27619f = f7;
        this.f27620g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27618c = org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
