package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class o71 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.nn0 f40166a;
    public final int f40167b;
    public final TextPaint f40168c;
    public int d;
    public final ThemeActivity e;

    public o71(ThemeActivity themeActivity, Context context) {
        super(context);
        this.e = themeActivity;
        this.f40167b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f40168c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.Components.nn0 nn0Var = new org.telegram.ui.Components.nn0(context);
        this.f40166a = nn0Var;
        nn0Var.setReportChanges(true);
        nn0Var.setSeparatorsCount(18);
        nn0Var.setDelegate(new z01(this, 2));
        nn0Var.setImportantForAccessibility(2);
        addView(nn0Var, w7.b6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f40166a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I6, false);
        TextPaint textPaint = this.f40168c;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.tz.Y0, getMeasuredWidth() - org.telegram.messenger.i0.L(39.0f), org.telegram.messenger.i0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f40166a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f40166a.setProgress(org.telegram.messenger.tz.Y0 / this.f40167b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f40166a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.nn0 nn0Var = this.f40166a;
        if (nn0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Jj, false);
            if (x02 != this.d) {
                this.d = x02;
                nn0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
