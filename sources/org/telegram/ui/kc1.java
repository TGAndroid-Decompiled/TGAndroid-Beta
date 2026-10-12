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
public final class kc1 extends FrameLayout {
    public final org.telegram.ui.Cells.ga f39451a;
    public final org.telegram.ui.Components.qp0 f39452b;
    public final int f39453c;
    public final int d;
    public final TextPaint f39454e;
    public int f39455f;
    public final ThemeActivity h;

    public kc1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b5 b5Var;
        this.h = themeActivity;
        this.f39453c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f39454e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.qp0 qp0Var = new org.telegram.ui.Components.qp0(context);
        this.f39452b = qp0Var;
        qp0Var.setReportChanges(true);
        qp0Var.setSeparatorsCount(19);
        qp0Var.setDelegate(new lw0(this, 4));
        qp0Var.setImportantForAccessibility(2);
        addView(qp0Var, w7.w5.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
        b5Var = ((org.telegram.ui.ActionBar.m2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, b5Var, 0);
        this.f39451a = gaVar;
        gaVar.setImportantForAccessibility(4);
        addView(gaVar, w7.w5.a(-2.0f, 0.0f, 53.0f, 0.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f39451a.invalidate();
        this.f39452b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I6, false);
        TextPaint textPaint = this.f39454e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f39452b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f39455f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f39453c;
            this.f39452b.setProgress((i12 - i13) / (this.d - i13));
            this.f39455f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f39452b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
