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
    public final org.telegram.ui.Cells.ba f48244a;
    public final org.telegram.ui.Components.bn0 f48245b;
    public final org.telegram.ui.Cells.s8 f48246c;
    public final int d;
    public final int f48247e;
    public final TextPaint f48248f;
    public int h;
    public int f48249n;
    public final ThemeActivity f48250r;

    public h61(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.r4 r4Var;
        this.f48250r = themeActivity;
        this.d = 12;
        this.f48247e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f48248f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.bn0 bn0Var = new org.telegram.ui.Components.bn0(context);
        this.f48245b = bn0Var;
        bn0Var.setReportChanges(true);
        bn0Var.setSeparatorsCount(19);
        bn0Var.setDelegate(new xr0(this, 4));
        bn0Var.setImportantForAccessibility(2);
        addView(bn0Var, c8.ma.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z10 = org.telegram.messenger.s2.f26749a;
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.f48246c = s8Var;
        s8Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
        s8Var.f(org.telegram.messenger.gd.N0(2131751820, null), org.telegram.messenger.bz.H0, false);
        s8Var.setOnClickListener(new oy0(this, 7));
        r4Var = ((org.telegram.ui.ActionBar.g2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, r4Var, 0);
        this.f48244a = baVar;
        baVar.setImportantForAccessibility(4);
        addView(baVar, c8.ma.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f48244a.invalidate();
        this.f48245b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I6, false);
        TextPaint textPaint = this.f48248f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.bz.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f48245b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.h != size) {
            int i11 = org.telegram.messenger.bz.W0;
            int i12 = this.d;
            this.f48245b.setProgress((i11 - i12) / (this.f48247e - i12));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f48245b.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.bn0 bn0Var = this.f48245b;
        if (bn0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Mj, false);
            if (x02 != this.f48249n) {
                this.f48249n = x02;
                bn0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
