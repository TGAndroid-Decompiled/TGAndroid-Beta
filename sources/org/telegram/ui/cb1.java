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
public final class cb1 extends FrameLayout {
    public final org.telegram.ui.Components.lo0 f35761a;
    public final int f35762b;
    public final TextPaint f35763c;
    public final ThemeActivity d;

    public cb1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f35762b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f35763c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.lo0 lo0Var = new org.telegram.ui.Components.lo0(context);
        this.f35761a = lo0Var;
        lo0Var.setReportChanges(true);
        lo0Var.setSeparatorsCount(18);
        lo0Var.setDelegate(new qv0(this, 3));
        lo0Var.setImportantForAccessibility(2);
        addView(lo0Var, k7.c6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f35761a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false);
        TextPaint textPaint = this.f35763c;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f35761a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f35761a.setProgress(SharedConfig.bubbleRadius / this.f35762b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f35761a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
