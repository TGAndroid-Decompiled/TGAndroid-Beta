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
public final class ka1 extends FrameLayout {
    public final org.telegram.ui.Components.dp0 f38500a;
    public final int f38501b;
    public final TextPaint f38502c;
    public final ThemeActivity d;

    public ka1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f38501b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f38502c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.dp0 dp0Var = new org.telegram.ui.Components.dp0(context);
        this.f38500a = dp0Var;
        dp0Var.setReportChanges(true);
        dp0Var.setSeparatorsCount(18);
        dp0Var.setDelegate(new ko0(this, 4));
        dp0Var.setImportantForAccessibility(2);
        addView(dp0Var, w7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f38500a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I6, false);
        TextPaint textPaint = this.f38502c;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f38500a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f38500a.setProgress(SharedConfig.bubbleRadius / this.f38501b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f38500a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
