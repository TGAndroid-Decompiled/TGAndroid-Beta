package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class pa {
    public final int f27289a;
    public final kj0 f27290b;
    public final org.telegram.ui.Cells.z f27291c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f27292f;
    public final float f27293g;
    public final RectF h;
    public final d6 f27294i;
    public final int f27295j;
    public final int f27296k;
    public boolean f27297l;
    public int f27298m;
    public final la0 f27299n;

    public pa(la0 la0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f27299n = la0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27294i = new d6(la0Var, 0L, 200L, qr.h);
        this.f27298m = -1;
        this.f27289a = i10;
        this.f27295j = i12;
        this.f27296k = i13;
        kj0 kj0Var = new kj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f27290b = kj0Var;
        kj0Var.R(la0Var);
        kj0Var.J(true);
        kj0Var.h = true;
        kj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = la0Var.f27530a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f27292f = f7;
        this.f27293g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27291c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
