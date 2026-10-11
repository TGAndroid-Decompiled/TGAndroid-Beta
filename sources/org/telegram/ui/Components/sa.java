package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class sa {
    public final int f30808a;
    public final dk0 f30809b;
    public final org.telegram.ui.Cells.z f30810c;
    public final TextPaint d;
    public final StaticLayout f30811e;
    public final float f30812f;
    public final float f30813g;
    public final RectF h;
    public final g6 f30814i;
    public final int f30815j;
    public final int f30816k;
    public boolean f30817l;
    public int f30818m;
    public final cb0 f30819n;

    public sa(cb0 cb0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f30819n = cb0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f30814i = new g6(cb0Var, 0L, 200L, is.h);
        this.f30818m = -1;
        this.f30808a = i10;
        this.f30815j = i12;
        this.f30816k = i13;
        dk0 dk0Var = new dk0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f30809b = dk0Var;
        dk0Var.R(cb0Var);
        dk0Var.J(true);
        dk0Var.h = true;
        dk0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = cb0Var.f31185a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f30811e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f30812f = f7;
        this.f30813g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f30810c = org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
