package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f29660a;
    public final xi0 f29661b;
    public final org.telegram.ui.Cells.z f29662c;
    public final TextPaint d;
    public final StaticLayout f29663e;
    public final float f29664f;
    public final float f29665g;
    public final RectF h;
    public final e6 f29666i;
    public final int f29667j;
    public final int f29668k;
    public boolean f29669l;
    public int f29670m;
    public final ba0 f29671n;

    public qa(ba0 ba0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f29671n = ba0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f29666i = new e6(ba0Var, 0L, 200L, pr.h);
        this.f29670m = -1;
        this.f29660a = i10;
        this.f29667j = i12;
        this.f29668k = i13;
        xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f29661b = xi0Var;
        xi0Var.f32605v0 = ba0Var;
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = ba0Var.f30023a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f29663e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f29664f = f7;
        this.f29665g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f29662c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
