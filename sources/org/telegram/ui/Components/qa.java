package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f29572a;
    public final uj0 f29573b;
    public final org.telegram.ui.Cells.z f29574c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f29575f;
    public final float f29576g;
    public final RectF h;
    public final f6 f29577i;
    public final int f29578j;
    public final int f29579k;
    public boolean f29580l;
    public int f29581m;
    public final va0 f29582n;

    public qa(va0 va0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f29582n = va0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f29577i = new f6(va0Var, 0L, 200L, bs.h);
        this.f29581m = -1;
        this.f29572a = i10;
        this.f29578j = i12;
        this.f29579k = i13;
        uj0 uj0Var = new uj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f29573b = uj0Var;
        uj0Var.R(va0Var);
        uj0Var.J(true);
        uj0Var.h = true;
        uj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = va0Var.f29912a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f29575f = f7;
        this.f29576g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f29574c = org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
