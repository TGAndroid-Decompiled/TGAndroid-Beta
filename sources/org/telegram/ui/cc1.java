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
public final class cc1 extends FrameLayout {
    public final org.telegram.ui.Components.gp0 f34558a;
    public final int f34559b;
    public final TextPaint f34560c;
    public final ThemeActivity d;

    public cc1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f34559b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f34560c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(context);
        this.f34558a = gp0Var;
        gp0Var.setReportChanges(true);
        gp0Var.setSeparatorsCount(18);
        gp0Var.setDelegate(new ow0(this, 3));
        gp0Var.setImportantForAccessibility(2);
        addView(gp0Var, w7.z5.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f34558a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I6, false);
        TextPaint textPaint = this.f34560c;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f34558a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f34558a.setProgress(SharedConfig.bubbleRadius / this.f34559b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f34558a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
