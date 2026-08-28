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
public final class na1 extends FrameLayout {
    public final org.telegram.ui.Components.pn0 f40684a;
    public final int f40685b;
    public final TextPaint f40686c;
    public final ThemeActivity d;

    public na1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f40685b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f40686c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.pn0 pn0Var = new org.telegram.ui.Components.pn0(context);
        this.f40684a = pn0Var;
        pn0Var.setReportChanges(true);
        pn0Var.setSeparatorsCount(18);
        pn0Var.setDelegate(new fv0(this, 3));
        pn0Var.setImportantForAccessibility(2);
        addView(pn0Var, g7.e6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f40684a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false);
        TextPaint textPaint = this.f40686c;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f40684a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
        this.f40684a.setProgress(SharedConfig.bubbleRadius / this.f40685b);
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (!super.performAccessibilityAction(i9, bundle) && !this.f40684a.getSeekBarAccessibilityDelegate().g(this, i9, bundle)) {
            return false;
        }
        return true;
    }
}
