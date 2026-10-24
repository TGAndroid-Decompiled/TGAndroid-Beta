package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class oa {
    public final int f29180a;
    public final xj0 f29181b;
    public final org.telegram.ui.Cells.y f29182c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f29183f;
    public final float f29184g;
    public final RectF h;
    public final d6 f29185i;
    public final int f29186j;
    public final int f29187k;
    public int f29188l;
    public boolean f29189m;
    public int f29190n;
    public final ua0 f29191o;

    public oa(ua0 ua0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f29191o = ua0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f29185i = new d6(ua0Var, 0L, 200L, zr.h);
        this.f29190n = -1;
        this.f29180a = i10;
        this.f29186j = i12;
        this.f29187k = i13;
        xj0 xj0Var = new xj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f29181b = xj0Var;
        xj0Var.R(ua0Var);
        xj0Var.J(true);
        xj0Var.h = true;
        xj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = ua0Var.f29527a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f29183f = f7;
        this.f29184g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
        this.f29188l = o12;
        this.f29182c = org.telegram.ui.ActionBar.k6.g0(o12, 7, AndroidUtilities.dp(16.0f));
    }
}
