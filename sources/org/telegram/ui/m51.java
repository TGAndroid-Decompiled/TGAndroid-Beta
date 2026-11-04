package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class m51 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.pm0 f47527a;
    public final int f47528b;
    public final TextPaint f47529c;
    public int d;
    public final ThemeActivity f47530e;

    public m51(ThemeActivity themeActivity, Context context) {
        super(context);
        this.f47530e = themeActivity;
        this.f47528b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f47529c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(context);
        this.f47527a = pm0Var;
        pm0Var.setReportChanges(true);
        pm0Var.setSeparatorsCount(18);
        pm0Var.setDelegate(new mr0(this, 3));
        pm0Var.setImportantForAccessibility(2);
        addView(pm0Var, b8.mf.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f47527a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I6, false);
        TextPaint textPaint = this.f47529c;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.az.Y0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f47527a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
        this.f47527a.setProgress(org.telegram.messenger.az.Y0 / this.f47528b);
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (!super.performAccessibilityAction(i3, bundle) && !this.f47527a.getSeekBarAccessibilityDelegate().g(this, i3, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.pm0 pm0Var = this.f47527a;
        if (pm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
            if (x02 != this.d) {
                this.d = x02;
                pm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
