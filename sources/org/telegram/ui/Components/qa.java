package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f27621a;
    public final kj0 f27622b;
    public final org.telegram.ui.Cells.z f27623c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f27624f;
    public final float f27625g;
    public final RectF h;
    public final e6 f27626i;
    public final int f27627j;
    public final int f27628k;
    public boolean f27629l;
    public int f27630m;
    public final oa0 f27631n;

    public qa(oa0 oa0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f27631n = oa0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27626i = new e6(oa0Var, 0L, 200L, sr.h);
        this.f27630m = -1;
        this.f27621a = i10;
        this.f27627j = i12;
        this.f27628k = i13;
        kj0 kj0Var = new kj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f27622b = kj0Var;
        kj0Var.R(oa0Var);
        kj0Var.J(true);
        kj0Var.h = true;
        kj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = oa0Var.f27930a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f27624f = f7;
        this.f27625g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27623c = org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
