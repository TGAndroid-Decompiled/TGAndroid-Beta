package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f27277a;
    public final yi0 f27278b;
    public final org.telegram.ui.Cells.z f27279c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f27280f;
    public final float f27281g;
    public final RectF h;
    public final e6 f27282i;
    public final int f27283j;
    public final int f27284k;
    public boolean f27285l;
    public int f27286m;
    public final ba0 f27287n;

    public qa(ba0 ba0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f27287n = ba0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27282i = new e6(ba0Var, 0L, 200L, rr.h);
        this.f27286m = -1;
        this.f27277a = i10;
        this.f27283j = i12;
        this.f27284k = i13;
        yi0 yi0Var = new yi0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f27278b = yi0Var;
        yi0Var.R(ba0Var);
        yi0Var.J(true);
        yi0Var.h = true;
        yi0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = ba0Var.f27590a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f27280f = f7;
        this.f27281g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27279c = org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
