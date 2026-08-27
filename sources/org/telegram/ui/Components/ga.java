package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

public final class ga {

    public final int f28557a;

    public final oi0 f28558b;

    public final org.telegram.ui.Cells.z f28559c;
    public final TextPaint d;

    public final StaticLayout f28560e;

    public final float f28561f;

    public final float f28562g;
    public final RectF h;

    public final y5 f28563i;

    public final int f28564j;

    public final int f28565k;

    public boolean f28566l;

    public int f28567m;

    public final n90 f28568n;

    public ga(n90 n90Var, int i10, int i11, int i12, int i13, String str) {
        this.f28568n = n90Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f28563i = new y5(n90Var, 0L, 200L, er.h);
        this.f28567m = -1;
        this.f28557a = i10;
        this.f28564j = i12;
        this.f28565k = i13;
        oi0 oi0Var = new oi0(i11, AndroidUtilities.dp(29.0f), i0.a.k(i11, ""), AndroidUtilities.dp(29.0f));
        this.f28558b = oi0Var;
        oi0Var.f31328r0 = n90Var;
        oi0Var.H(true);
        oi0Var.h = true;
        oi0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = n90Var.f28949a;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f28560e = staticLayout;
        this.f28561f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.f28562g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f28559c = org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i14, c6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
