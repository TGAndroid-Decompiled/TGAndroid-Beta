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
public final class ic1 extends FrameLayout {
    public final org.telegram.ui.Cells.ga f38604a;
    public final org.telegram.ui.Components.kp0 f38605b;
    public final int f38606c;
    public final int d;
    public final TextPaint f38607e;
    public int f38608f;
    public final ThemeActivity h;

    public ic1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d5 d5Var;
        this.h = themeActivity;
        this.f38606c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f38607e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.kp0 kp0Var = new org.telegram.ui.Components.kp0(context);
        this.f38605b = kp0Var;
        kp0Var.setReportChanges(true);
        kp0Var.setSeparatorsCount(19);
        kp0Var.setDelegate(new jw0(this, 4));
        kp0Var.setImportantForAccessibility(2);
        addView(kp0Var, w7.x5.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
        d5Var = ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, d5Var, 0);
        this.f38604a = gaVar;
        gaVar.setImportantForAccessibility(4);
        addView(gaVar, w7.x5.a(-2.0f, 0.0f, 53.0f, 0.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f38604a.invalidate();
        this.f38605b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I6, false);
        TextPaint textPaint = this.f38607e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f38605b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f38608f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f38606c;
            this.f38605b.setProgress((i12 - i13) / (this.d - i13));
            this.f38608f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f38605b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
