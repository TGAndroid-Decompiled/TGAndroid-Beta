package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class ta {
    public final int f31071a;
    public final dk0 f31072b;
    public final org.telegram.ui.Cells.z f31073c;
    public final TextPaint d;
    public final StaticLayout f31074e;
    public final float f31075f;
    public final float f31076g;
    public final RectF h;
    public final g6 f31077i;
    public final int f31078j;
    public final int f31079k;
    public boolean f31080l;
    public int f31081m;
    public final db0 f31082n;

    public ta(db0 db0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f31082n = db0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f31077i = new g6(db0Var, 0L, 200L, is.h);
        this.f31081m = -1;
        this.f31071a = i10;
        this.f31078j = i12;
        this.f31079k = i13;
        dk0 dk0Var = new dk0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f31072b = dk0Var;
        dk0Var.R(db0Var);
        dk0Var.J(true);
        dk0Var.h = true;
        dk0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = db0Var.f31431a;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(i14, e6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f31074e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f31075f = f7;
        this.f31076g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f31073c = org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.m1(0.1f, org.telegram.ui.ActionBar.i6.w0(i14, e6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
