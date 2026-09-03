package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class ia {
    public final int f27754a;
    public final hj0 f27755b;
    public final org.telegram.ui.Cells.z f27756c;
    public final TextPaint d;
    public final StaticLayout f27757e;
    public final float f27758f;
    public final float f27759g;
    public final RectF h;
    public final z5 f27760i;
    public final int f27761j;
    public final int f27762k;
    public boolean f27763l;
    public int f27764m;
    public final ea0 f27765n;

    public ia(ea0 ea0Var, int i10, int i11, int i12, int i13, String str) {
        float f10;
        this.f27765n = ea0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27760i = new z5(ea0Var, 0L, 200L, pr.h);
        this.f27764m = -1;
        this.f27754a = i10;
        this.f27761j = i12;
        this.f27762k = i13;
        hj0 hj0Var = new hj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f27755b = hj0Var;
        hj0Var.f27542s0 = ea0Var;
        hj0Var.H(true);
        hj0Var.h = true;
        hj0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = ea0Var.f28071a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f27757e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineWidth(0);
        } else {
            f10 = 0.0f;
        }
        this.f27758f = f10;
        this.f27759g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27756c = org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(i14, g6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
