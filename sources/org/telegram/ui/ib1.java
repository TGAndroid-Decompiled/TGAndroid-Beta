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
public final class ib1 extends FrameLayout {
    public final org.telegram.ui.Components.ko0 f37619a;
    public final int f37620b;
    public final TextPaint f37621c;
    public final ThemeActivity d;

    public ib1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f37620b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f37621c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.ko0 ko0Var = new org.telegram.ui.Components.ko0(context);
        this.f37619a = ko0Var;
        ko0Var.setReportChanges(true);
        ko0Var.setSeparatorsCount(18);
        ko0Var.setDelegate(new vv0(this, 3));
        ko0Var.setImportantForAccessibility(2);
        addView(ko0Var, k7.c6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f37619a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false);
        TextPaint textPaint = this.f37621c;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f37619a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f37619a.setProgress(SharedConfig.bubbleRadius / this.f37620b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f37619a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
