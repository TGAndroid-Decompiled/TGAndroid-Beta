package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f27530a;
    public final ij0 f27531b;
    public final org.telegram.ui.Cells.z f27532c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f27533f;
    public final float f27534g;
    public final RectF h;
    public final e6 f27535i;
    public final int f27536j;
    public final int f27537k;
    public boolean f27538l;
    public int f27539m;
    public final ja0 f27540n;

    public qa(ja0 ja0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f27540n = ja0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27535i = new e6(ja0Var, 0L, 200L, qr.h);
        this.f27539m = -1;
        this.f27530a = i10;
        this.f27536j = i12;
        this.f27537k = i13;
        ij0 ij0Var = new ij0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f27531b = ij0Var;
        ij0Var.R(ja0Var);
        ij0Var.J(true);
        ij0Var.h = true;
        ij0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = ja0Var.f27862a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, e6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f27533f = f7;
        this.f27534g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27532c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, e6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
