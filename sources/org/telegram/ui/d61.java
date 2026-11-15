package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class d61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Cells.z9 f46315a;
    public final org.telegram.ui.Components.qm0 f46316b;
    public final org.telegram.ui.Cells.q8 f46317c;
    public final int d;
    public final int f46318e;
    public final TextPaint f46319f;
    public int h;
    public int f46320n;
    public final ThemeActivity f46321r;

    public d61(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.o4 o4Var;
        this.f46321r = themeActivity;
        this.d = 12;
        this.f46318e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f46319f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context);
        this.f46316b = qm0Var;
        qm0Var.setReportChanges(true);
        qm0Var.setSeparatorsCount(19);
        qm0Var.setDelegate(new ur0(this, 4));
        qm0Var.setImportantForAccessibility(2);
        addView(qm0Var, c8.ja.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z10 = org.telegram.messenger.r2.f26198a;
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.f46317c = q8Var;
        q8Var.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
        q8Var.f(org.telegram.messenger.hd.M0(2131751832, null), org.telegram.messenger.gz.H0, false);
        q8Var.setOnClickListener(new ky0(this, 7));
        o4Var = ((org.telegram.ui.ActionBar.e2) themeActivity).parentLayout;
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, o4Var, 0);
        this.f46315a = z9Var;
        z9Var.setImportantForAccessibility(4);
        addView(z9Var, c8.ja.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f46315a.invalidate();
        this.f46316b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.I6, false);
        TextPaint textPaint = this.f46319f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.gz.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f46316b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.h != size) {
            int i11 = org.telegram.messenger.gz.W0;
            int i12 = this.d;
            this.f46316b.setProgress((i11 - i12) / (this.f46318e - i12));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f46316b.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.qm0 qm0Var = this.f46316b;
        if (qm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false);
            if (x02 != this.f46320n) {
                this.f46320n = x02;
                qm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
