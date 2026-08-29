package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class na {
    public final int f30943a;
    public final xi0 f30944b;
    public final org.telegram.ui.Cells.z f30945c;
    public final TextPaint d;
    public final StaticLayout f30946e;
    public final float f30947f;
    public final float f30948g;
    public final RectF h;
    public final d6 f30949i;
    public final int f30950j;
    public final int f30951k;
    public boolean f30952l;
    public int f30953m;
    public final x90 f30954n;

    public na(x90 x90Var, int i10, int i11, int i12, int i13, String str) {
        float f9;
        this.f30954n = x90Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f30949i = new d6(x90Var, 0L, 200L, jr.h);
        this.f30953m = -1;
        this.f30943a = i10;
        this.f30950j = i12;
        this.f30951k = i13;
        xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(29.0f), j7.l1.k(i11, ""), AndroidUtilities.dp(29.0f));
        this.f30944b = xi0Var;
        xi0Var.f34753r0 = x90Var;
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = x90Var.f31320a;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f30946e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f9 = staticLayout.getLineWidth(0);
        } else {
            f9 = 0.0f;
        }
        this.f30947f = f9;
        this.f30948g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f30945c = org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i14, c6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
