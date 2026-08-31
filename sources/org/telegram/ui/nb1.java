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
public final class nb1 extends FrameLayout {
    public final org.telegram.ui.Cells.ea f39373a;
    public final org.telegram.ui.Components.lo0 f39374b;
    public final int f39375c;
    public final int d;
    public final TextPaint f39376e;
    public int f39377f;
    public final ThemeActivity h;

    public nb1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f5 f5Var;
        this.h = themeActivity;
        this.f39375c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f39376e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.lo0 lo0Var = new org.telegram.ui.Components.lo0(context);
        this.f39374b = lo0Var;
        lo0Var.setReportChanges(true);
        lo0Var.setSeparatorsCount(19);
        lo0Var.setDelegate(new qv0(this, 4));
        lo0Var.setImportantForAccessibility(2);
        addView(lo0Var, k7.c6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        f5Var = ((org.telegram.ui.ActionBar.p2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, f5Var, 0);
        this.f39373a = eaVar;
        eaVar.setImportantForAccessibility(4);
        addView(eaVar, k7.c6.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f39373a.invalidate();
        this.f39374b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false);
        TextPaint textPaint = this.f39376e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f39374b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f39377f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f39375c;
            this.f39374b.setProgress((i12 - i13) / (this.d - i13));
            this.f39377f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f39374b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
