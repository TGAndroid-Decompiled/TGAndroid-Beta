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

public final class la1 extends FrameLayout {

    public final org.telegram.ui.Components.qn0 f40034a;

    public final int f40035b;

    public final TextPaint f40036c;
    public final ThemeActivity d;

    public la1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f40035b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f40036c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.qn0 qn0Var = new org.telegram.ui.Components.qn0(context);
        this.f40034a = qn0Var;
        qn0Var.setReportChanges(true);
        qn0Var.setSeparatorsCount(18);
        qn0Var.setDelegate(new gv0(this, 3));
        qn0Var.setImportantForAccessibility(2);
        addView(qn0Var, h7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f40034a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false);
        TextPaint textPaint = this.f40036c;
        textPaint.setColor(iW0);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f40034a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f40034a.setProgress(SharedConfig.bubbleRadius / this.f40035b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.f40034a.getSeekBarAccessibilityDelegate().g(this, i10, bundle);
    }
}
