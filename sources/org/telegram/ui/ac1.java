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
public final class ac1 extends FrameLayout {
    public final org.telegram.ui.Components.oo0 f30888a;
    public final int f30889b;
    public final TextPaint f30890c;
    public final ThemeActivity d;

    public ac1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f30889b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f30890c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.oo0 oo0Var = new org.telegram.ui.Components.oo0(context);
        this.f30888a = oo0Var;
        oo0Var.setReportChanges(true);
        oo0Var.setSeparatorsCount(18);
        oo0Var.setDelegate(new lw0(this, 3));
        oo0Var.setImportantForAccessibility(2);
        addView(oo0Var, w7.a6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30888a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false);
        TextPaint textPaint = this.f30890c;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f30888a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f30888a.setProgress(SharedConfig.bubbleRadius / this.f30889b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f30888a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
