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
public final class ob1 extends FrameLayout {
    public final org.telegram.ui.Components.vo0 f36268a;
    public final int f36269b;
    public final TextPaint f36270c;
    public final ThemeActivity d;

    public ob1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f36269b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f36270c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.vo0 vo0Var = new org.telegram.ui.Components.vo0(context);
        this.f36268a = vo0Var;
        vo0Var.setReportChanges(true);
        vo0Var.setSeparatorsCount(18);
        vo0Var.setDelegate(new aw0(this, 3));
        vo0Var.setImportantForAccessibility(2);
        addView(vo0Var, w7.y5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f36268a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false);
        TextPaint textPaint = this.f36270c;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f36268a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f36268a.setProgress(SharedConfig.bubbleRadius / this.f36269b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f36268a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
