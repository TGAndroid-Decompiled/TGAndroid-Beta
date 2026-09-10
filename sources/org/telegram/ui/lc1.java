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
public final class lc1 extends FrameLayout {
    public final org.telegram.ui.Cells.ka f34652a;
    public final org.telegram.ui.Components.oo0 f34653b;
    public final int f34654c;
    public final int d;
    public final TextPaint e;
    public int f34655f;
    public final ThemeActivity h;

    public lc1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f5 f5Var;
        this.h = themeActivity;
        this.f34654c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.oo0 oo0Var = new org.telegram.ui.Components.oo0(context);
        this.f34653b = oo0Var;
        oo0Var.setReportChanges(true);
        oo0Var.setSeparatorsCount(19);
        oo0Var.setDelegate(new lw0(this, 4));
        oo0Var.setImportantForAccessibility(2);
        addView(oo0Var, w7.a6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        f5Var = ((org.telegram.ui.ActionBar.p2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, f5Var, 0);
        this.f34652a = kaVar;
        kaVar.setImportantForAccessibility(4);
        addView(kaVar, w7.a6.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f34652a.invalidate();
        this.f34653b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f34653b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f34655f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f34654c;
            this.f34653b.setProgress((i12 - i13) / (this.d - i13));
            this.f34655f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f34653b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
