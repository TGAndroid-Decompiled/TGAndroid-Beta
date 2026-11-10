package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class i61 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.z9 f46514a;
    public final org.telegram.ui.Components.mm0 f46515b;
    public final org.telegram.ui.Cells.r8 f46516c;
    public final int d;
    public final int f46517e;
    public final TextPaint f46518f;
    public int h;
    public int f46519n;
    public final ThemeActivity f46520r;

    public i61(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.r4 r4Var;
        this.f46520r = themeActivity;
        this.d = 12;
        this.f46517e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f46518f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context);
        this.f46515b = mm0Var;
        mm0Var.setReportChanges(true);
        mm0Var.setSeparatorsCount(19);
        mm0Var.setDelegate(new zr0(this, 4));
        mm0Var.setImportantForAccessibility(2);
        addView(mm0Var, c8.ha.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z9 = org.telegram.messenger.r2.f25216a;
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.f46516c = r8Var;
        r8Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
        r8Var.f(org.telegram.messenger.id.M0(2131751832, null), org.telegram.messenger.iz.H0, false);
        r8Var.setOnClickListener(new qy0(this, 7));
        r4Var = ((org.telegram.ui.ActionBar.f2) themeActivity).parentLayout;
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, r4Var, 0);
        this.f46514a = z9Var;
        z9Var.setImportantForAccessibility(4);
        addView(z9Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Jj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f46514a.invalidate();
        this.f46515b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I6, false);
        TextPaint textPaint = this.f46518f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.iz.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f46515b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.h != size) {
            int i11 = org.telegram.messenger.iz.W0;
            int i12 = this.d;
            this.f46515b.setProgress((i11 - i12) / (this.f46517e - i12));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f46515b.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.mm0 mm0Var = this.f46515b;
        if (mm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Jj, false);
            if (x02 != this.f46519n) {
                this.f46519n = x02;
                mm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
