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
    public final org.telegram.ui.Cells.ia f35409a;
    public final org.telegram.ui.Components.yo0 f35410b;
    public final int f35411c;
    public final int d;
    public final TextPaint f35412e;
    public int f35413f;
    public final ThemeActivity h;

    public cc1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c5 c5Var;
        this.h = themeActivity;
        this.f35411c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f35412e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.yo0 yo0Var = new org.telegram.ui.Components.yo0(context);
        this.f35410b = yo0Var;
        yo0Var.setReportChanges(true);
        yo0Var.setSeparatorsCount(19);
        yo0Var.setDelegate(new dw0(this, 4));
        yo0Var.setImportantForAccessibility(2);
        addView(yo0Var, w7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        c5Var = ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, c5Var, 0);
        this.f35409a = iaVar;
        iaVar.setImportantForAccessibility(4);
        addView(iaVar, w7.z5.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f35409a.invalidate();
        this.f35410b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I6, false);
        TextPaint textPaint = this.f35412e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f35410b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f35413f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f35411c;
            this.f35410b.setProgress((i12 - i13) / (this.d - i13));
            this.f35413f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f35410b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
