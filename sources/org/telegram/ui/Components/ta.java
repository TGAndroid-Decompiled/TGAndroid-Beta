package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class ta {
    public final int f31099a;
    public final ck0 f31100b;
    public final org.telegram.ui.Cells.z f31101c;
    public final TextPaint d;
    public final StaticLayout f31102e;
    public final float f31103f;
    public final float f31104g;
    public final RectF h;
    public final g6 f31105i;
    public final int f31106j;
    public final int f31107k;
    public boolean f31108l;
    public int f31109m;
    public final cb0 f31110n;

    public ta(cb0 cb0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f31110n = cb0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f31105i = new g6(cb0Var, 0L, 200L, hs.h);
        this.f31109m = -1;
        this.f31099a = i10;
        this.f31106j = i12;
        this.f31107k = i13;
        ck0 ck0Var = new ck0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f31100b = ck0Var;
        ck0Var.R(cb0Var);
        ck0Var.J(true);
        ck0Var.h = true;
        ck0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = cb0Var.f31400a;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(i14, e6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f31102e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f31103f = f7;
        this.f31104g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f31101c = org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.m1(0.1f, org.telegram.ui.ActionBar.i6.w0(i14, e6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
