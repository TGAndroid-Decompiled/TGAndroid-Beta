package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f29661a;
    public final xi0 f29662b;
    public final org.telegram.ui.Cells.z f29663c;
    public final TextPaint d;
    public final StaticLayout f29664e;
    public final float f29665f;
    public final float f29666g;
    public final RectF h;
    public final e6 f29667i;
    public final int f29668j;
    public final int f29669k;
    public boolean f29670l;
    public int f29671m;
    public final ba0 f29672n;

    public qa(ba0 ba0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f29672n = ba0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f29667i = new e6(ba0Var, 0L, 200L, pr.h);
        this.f29671m = -1;
        this.f29661a = i10;
        this.f29668j = i12;
        this.f29669k = i13;
        xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f29662b = xi0Var;
        xi0Var.f32606v0 = ba0Var;
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = ba0Var.f30024a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f29664e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f29665f = f7;
        this.f29666g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f29663c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
