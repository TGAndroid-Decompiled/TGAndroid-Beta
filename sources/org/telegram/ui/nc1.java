package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class nc1 extends FrameLayout {
    public final org.telegram.ui.Cells.ga f38642a;
    public final org.telegram.ui.Components.gp0 f38643b;
    public final int f38644c;
    public final int d;
    public final TextPaint e;
    public int f38645f;
    public final ThemeActivity h;

    public nc1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b5 b5Var;
        this.h = themeActivity;
        this.f38644c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(context);
        this.f38643b = gp0Var;
        gp0Var.setReportChanges(true);
        gp0Var.setSeparatorsCount(19);
        gp0Var.setDelegate(new pw0(this, 4));
        gp0Var.setImportantForAccessibility(2);
        addView(gp0Var, w7.a6.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
        b5Var = ((org.telegram.ui.ActionBar.m2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, b5Var, 0);
        this.f38642a = gaVar;
        gaVar.setImportantForAccessibility(4);
        addView(gaVar, w7.a6.a(-2.0f, 0.0f, 53.0f, 0.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f38642a.invalidate();
        this.f38643b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f38643b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f38645f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f38644c;
            this.f38643b.setProgress((i12 - i13) / (this.d - i13));
            this.f38645f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f38643b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
