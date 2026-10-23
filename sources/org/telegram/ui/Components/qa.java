package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class qa {
    public final int f29809a;
    public final yj0 f29810b;
    public final org.telegram.ui.Cells.y f29811c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f29812f;
    public final float f29813g;
    public final RectF h;
    public final f6 f29814i;
    public final int f29815j;
    public final int f29816k;
    public int f29817l;
    public boolean f29818m;
    public int f29819n;
    public final wa0 f29820o;

    public qa(wa0 wa0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f29820o = wa0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f29814i = new f6(wa0Var, 0L, 200L, bs.h);
        this.f29819n = -1;
        this.f29809a = i10;
        this.f29815j = i12;
        this.f29816k = i13;
        yj0 yj0Var = new yj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f29810b = yj0Var;
        yj0Var.R(wa0Var);
        yj0Var.J(true);
        yj0Var.h = true;
        yj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = wa0Var.f30133a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f29812f = f7;
        this.f29813g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
        this.f29817l = o12;
        this.f29811c = org.telegram.ui.ActionBar.k6.g0(o12, 7, AndroidUtilities.dp(16.0f));
    }
}
