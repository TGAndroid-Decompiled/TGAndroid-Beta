package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class h61 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.ba f48168a;
    public final org.telegram.ui.Components.ym0 f48169b;
    public final org.telegram.ui.Cells.s8 f48170c;
    public final int d;
    public final int f48171e;
    public final TextPaint f48172f;
    public int h;
    public int f48173n;
    public final ThemeActivity f48174r;

    public h61(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.s4 s4Var;
        this.f48174r = themeActivity;
        this.d = 12;
        this.f48171e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f48172f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0(context);
        this.f48169b = ym0Var;
        ym0Var.setReportChanges(true);
        ym0Var.setSeparatorsCount(19);
        ym0Var.setDelegate(new xr0(this, 4));
        ym0Var.setImportantForAccessibility(2);
        addView(ym0Var, c8.ma.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z10 = org.telegram.messenger.s2.f26721a;
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.f48170c = s8Var;
        s8Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
        s8Var.f(org.telegram.messenger.gd.M0(2131751821, null), org.telegram.messenger.bz.H0, false);
        s8Var.setOnClickListener(new oy0(this, 7));
        s4Var = ((org.telegram.ui.ActionBar.h2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, s4Var, 0);
        this.f48168a = baVar;
        baVar.setImportantForAccessibility(4);
        addView(baVar, c8.ma.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f48168a.invalidate();
        this.f48169b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I6, false);
        TextPaint textPaint = this.f48172f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.bz.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f48169b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.h != size) {
            int i11 = org.telegram.messenger.bz.W0;
            int i12 = this.d;
            this.f48169b.setProgress((i11 - i12) / (this.f48171e - i12));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f48169b.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.ym0 ym0Var = this.f48169b;
        if (ym0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
            if (x02 != this.f48173n) {
                this.f48173n = x02;
                ym0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
