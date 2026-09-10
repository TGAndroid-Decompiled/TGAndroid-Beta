package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class pa {
    public final int f26062a;
    public final hj0 f26063b;
    public final org.telegram.ui.Cells.z f26064c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f26065f;
    public final float f26066g;
    public final RectF h;
    public final d6 f26067i;
    public final int f26068j;
    public final int f26069k;
    public boolean f26070l;
    public int f26071m;
    public final ka0 f26072n;

    public pa(ka0 ka0Var, int i10, int i11, int i12, int i13, String str) {
        float f7;
        this.f26072n = ka0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.f26067i = new d6(ka0Var, 0L, 200L, wr.h);
        this.f26071m = -1;
        this.f26062a = i10;
        this.f26068j = i12;
        this.f26069k = i13;
        hj0 hj0Var = new hj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.f26063b = hj0Var;
        hj0Var.f23672v0 = ka0Var;
        hj0Var.J(true);
        hj0Var.h = true;
        hj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = ka0Var.f26377a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f26065f = f7;
        this.f26066g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f26064c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
