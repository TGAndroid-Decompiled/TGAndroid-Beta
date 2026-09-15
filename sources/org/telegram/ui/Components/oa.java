package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class oa {
    public final int f26731a;
    public final xi0 f26732b;
    public final org.telegram.ui.Cells.z f26733c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f26734f;
    public final float f26735g;
    public final RectF h;
    public final c6 f26736i;
    public final int f26737j;
    public final int f26738k;
    public boolean f26739l;
    public int f26740m;
    public final aa0 f26741n;

    public oa(aa0 aa0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f26741n = aa0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f26736i = new c6(aa0Var, 0L, 200L, qr.h);
        this.f26740m = -1;
        this.f26731a = i10;
        this.f26737j = i12;
        this.f26738k = i13;
        xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f26732b = xi0Var;
        xi0Var.f29972v0 = aa0Var;
        xi0Var.J(true);
        xi0Var.h = true;
        xi0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = aa0Var.f26980a;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f26734f = f7;
        this.f26735g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f26733c = org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i14, e6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
