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
public final class pb1 extends FrameLayout {
    public final org.telegram.ui.Components.zo0 f39462a;
    public final int f39463b;
    public final TextPaint f39464c;
    public final ThemeActivity d;

    public pb1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f39463b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f39464c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.zo0 zo0Var = new org.telegram.ui.Components.zo0(context);
        this.f39462a = zo0Var;
        zo0Var.setReportChanges(true);
        zo0Var.setSeparatorsCount(18);
        zo0Var.setDelegate(new dw0(this, 3));
        zo0Var.setImportantForAccessibility(2);
        addView(zo0Var, w7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f39462a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I6, false);
        TextPaint textPaint = this.f39464c;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f39462a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f39462a.setProgress(SharedConfig.bubbleRadius / this.f39463b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f39462a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
