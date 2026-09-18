package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class oa {
    public final int f26682a;
    public final yi0 f26683b;
    public final org.telegram.ui.Cells.z f26684c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f26685f;
    public final float f26686g;
    public final RectF h;
    public final c6 f26687i;
    public final int f26688j;
    public final int f26689k;
    public boolean f26690l;
    public int f26691m;
    public final aa0 f26692n;

    public oa(aa0 aa0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f26692n = aa0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f26687i = new c6(aa0Var, 0L, 200L, qr.h);
        this.f26691m = -1;
        this.f26682a = i10;
        this.f26688j = i12;
        this.f26689k = i13;
        yi0 yi0Var = new yi0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f26683b = yi0Var;
        yi0Var.R(aa0Var);
        yi0Var.J(true);
        yi0Var.h = true;
        yi0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = aa0Var.f26970a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f26685f = f7;
        this.f26686g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f26684c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
