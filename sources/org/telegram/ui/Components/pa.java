package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class pa {
    public final int f27232a;
    public final hj0 f27233b;
    public final org.telegram.ui.Cells.z f27234c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f27235f;
    public final float f27236g;
    public final RectF h;
    public final d6 f27237i;
    public final int f27238j;
    public final int f27239k;
    public boolean f27240l;
    public int f27241m;
    public final ia0 f27242n;

    public pa(ia0 ia0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f27242n = ia0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f27237i = new d6(ia0Var, 0L, 200L, qr.h);
        this.f27241m = -1;
        this.f27232a = i10;
        this.f27238j = i12;
        this.f27239k = i13;
        hj0 hj0Var = new hj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f27233b = hj0Var;
        hj0Var.R(ia0Var);
        hj0Var.J(true);
        hj0Var.h = true;
        hj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = ia0Var.f27550a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f27235f = f7;
        this.f27236g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f27234c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
