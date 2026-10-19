package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f29574a;
    public final uj0 f29575b;
    public final org.telegram.ui.Cells.z f29576c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f29577f;
    public final float f29578g;
    public final RectF h;
    public final f6 f29579i;
    public final int f29580j;
    public final int f29581k;
    public boolean f29582l;
    public int f29583m;
    public final va0 f29584n;

    public qa(va0 va0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f29584n = va0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f29579i = new f6(va0Var, 0L, 200L, bs.h);
        this.f29583m = -1;
        this.f29574a = i10;
        this.f29580j = i12;
        this.f29581k = i13;
        uj0 uj0Var = new uj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f29575b = uj0Var;
        uj0Var.R(va0Var);
        uj0Var.J(true);
        uj0Var.h = true;
        uj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = va0Var.f29914a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f29577f = f7;
        this.f29578g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f29576c = org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
