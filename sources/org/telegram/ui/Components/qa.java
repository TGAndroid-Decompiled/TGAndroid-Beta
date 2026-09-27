package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f27672a;
    public final kj0 f27673b;
    public final org.telegram.ui.Cells.z f27674c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f27675f;
    public final float f27676g;
    public final RectF h;
    public final e6 f27677i;
    public final int f27678j;
    public final int f27679k;
    public boolean f27680l;
    public int f27681m;
    public final na0 f27682n;

    public qa(na0 na0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f27682n = na0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27677i = new e6(na0Var, 0L, 200L, sr.h);
        this.f27681m = -1;
        this.f27672a = i10;
        this.f27678j = i12;
        this.f27679k = i13;
        kj0 kj0Var = new kj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f27673b = kj0Var;
        kj0Var.R(na0Var);
        kj0Var.J(true);
        kj0Var.h = true;
        kj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = na0Var.f27931a;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f27675f = f7;
        this.f27676g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27674c = org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i14, e6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
