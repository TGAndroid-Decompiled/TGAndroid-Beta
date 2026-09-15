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
public final class gc1 extends FrameLayout {
    public final org.telegram.ui.Cells.ja f33861a;
    public final org.telegram.ui.Components.fo0 f33862b;
    public final int f33863c;
    public final int d;
    public final TextPaint e;
    public int f33864f;
    public final ThemeActivity h;

    public gc1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d5 d5Var;
        this.h = themeActivity;
        this.f33863c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(context);
        this.f33862b = fo0Var;
        fo0Var.setReportChanges(true);
        fo0Var.setSeparatorsCount(19);
        fo0Var.setDelegate(new jw0(this, 4));
        fo0Var.setImportantForAccessibility(2);
        addView(fo0Var, w7.x5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        d5Var = ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context, d5Var, 0);
        this.f33861a = jaVar;
        jaVar.setImportantForAccessibility(4);
        addView(jaVar, w7.x5.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f33861a.invalidate();
        this.f33862b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f33862b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f33864f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f33863c;
            this.f33862b.setProgress((i12 - i13) / (this.d - i13));
            this.f33864f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f33862b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
