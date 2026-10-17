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
public final class ma1 extends FrameLayout {
    public final org.telegram.ui.Components.cp0 f39081a;
    public final int f39082b;
    public final TextPaint f39083c;
    public final ThemeActivity d;

    public ma1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f39082b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f39083c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.cp0 cp0Var = new org.telegram.ui.Components.cp0(context);
        this.f39081a = cp0Var;
        cp0Var.setReportChanges(true);
        cp0Var.setSeparatorsCount(18);
        cp0Var.setDelegate(new lo0(this, 4));
        cp0Var.setImportantForAccessibility(2);
        addView(cp0Var, w7.z5.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f39081a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I6, false);
        TextPaint textPaint = this.f39083c;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f39081a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f39081a.setProgress(SharedConfig.bubbleRadius / this.f39082b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f39081a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
