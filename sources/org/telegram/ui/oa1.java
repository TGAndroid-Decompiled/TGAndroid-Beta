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
public final class oa1 extends FrameLayout {
    public final org.telegram.ui.Components.ao0 f41039a;
    public final int f41040b;
    public final TextPaint f41041c;
    public final ThemeActivity d;

    public oa1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f41040b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f41041c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.ao0 ao0Var = new org.telegram.ui.Components.ao0(context);
        this.f41039a = ao0Var;
        ao0Var.setReportChanges(true);
        ao0Var.setSeparatorsCount(18);
        ao0Var.setDelegate(new fv0(this, 3));
        ao0Var.setImportantForAccessibility(2);
        addView(ao0Var, i7.f6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f41039a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false);
        TextPaint textPaint = this.f41041c;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f41039a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f41039a.setProgress(SharedConfig.bubbleRadius / this.f41040b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f41039a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
