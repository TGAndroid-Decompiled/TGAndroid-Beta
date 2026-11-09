package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class h61 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.z9 f46174a;
    public final org.telegram.ui.Components.nm0 f46175b;
    public final org.telegram.ui.Cells.r8 f46176c;
    public final int d;
    public final int f46177e;
    public final TextPaint f46178f;
    public int h;
    public int f46179n;
    public final ThemeActivity f46180r;

    public h61(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.q4 q4Var;
        this.f46180r = themeActivity;
        this.d = 12;
        this.f46177e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f46178f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context);
        this.f46175b = nm0Var;
        nm0Var.setReportChanges(true);
        nm0Var.setSeparatorsCount(19);
        nm0Var.setDelegate(new yr0(this, 4));
        nm0Var.setImportantForAccessibility(2);
        addView(nm0Var, c8.ha.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z9 = org.telegram.messenger.r2.f25212a;
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.f46176c = r8Var;
        r8Var.setBackground(org.telegram.ui.ActionBar.l6.N0(false));
        r8Var.f(org.telegram.messenger.id.M0(2131751832, null), org.telegram.messenger.iz.H0, false);
        r8Var.setOnClickListener(new py0(this, 7));
        q4Var = ((org.telegram.ui.ActionBar.f2) themeActivity).parentLayout;
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, q4Var, 0);
        this.f46174a = z9Var;
        z9Var.setImportantForAccessibility(4);
        addView(z9Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Jj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f46174a.invalidate();
        this.f46175b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.I6, false);
        TextPaint textPaint = this.f46178f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.iz.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f46175b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.h != size) {
            int i11 = org.telegram.messenger.iz.W0;
            int i12 = this.d;
            this.f46175b.setProgress((i11 - i12) / (this.f46177e - i12));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f46175b.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.nm0 nm0Var = this.f46175b;
        if (nm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Jj, false);
            if (x02 != this.f46179n) {
                this.f46179n = x02;
                nm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
