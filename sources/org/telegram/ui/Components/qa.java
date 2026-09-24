package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f27549a;
    public final ij0 f27550b;
    public final org.telegram.ui.Cells.z f27551c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f27552f;
    public final float f27553g;
    public final RectF h;
    public final e6 f27554i;
    public final int f27555j;
    public final int f27556k;
    public boolean f27557l;
    public int f27558m;
    public final ma0 f27559n;

    public qa(ma0 ma0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f27559n = ma0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27554i = new e6(ma0Var, 0L, 200L, rr.h);
        this.f27558m = -1;
        this.f27549a = i10;
        this.f27555j = i12;
        this.f27556k = i13;
        ij0 ij0Var = new ij0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f27550b = ij0Var;
        ij0Var.R(ma0Var);
        ij0Var.J(true);
        ij0Var.h = true;
        ij0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = ma0Var.f27925a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f27552f = f7;
        this.f27553g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27551c = org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
