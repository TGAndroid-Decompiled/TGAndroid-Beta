package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class ra {
    public final int f30324a;
    public final kj0 f30325b;
    public final org.telegram.ui.Cells.z f30326c;
    public final TextPaint d;
    public final StaticLayout f30327e;
    public final float f30328f;
    public final float f30329g;
    public final RectF h;
    public final e6 f30330i;
    public final int f30331j;
    public final int f30332k;
    public boolean f30333l;
    public int f30334m;
    public final oa0 f30335n;

    public ra(oa0 oa0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f30335n = oa0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f30330i = new e6(oa0Var, 0L, 200L, tr.h);
        this.f30334m = -1;
        this.f30324a = i10;
        this.f30331j = i12;
        this.f30332k = i13;
        kj0 kj0Var = new kj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f30325b = kj0Var;
        kj0Var.R(oa0Var);
        kj0Var.J(true);
        kj0Var.h = true;
        kj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = oa0Var.f30675a;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f30327e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f30328f = f7;
        this.f30329g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f30326c = org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
