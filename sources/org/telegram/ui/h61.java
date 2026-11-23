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
    public final org.telegram.ui.Cells.ba f48211a;
    public final org.telegram.ui.Components.an0 f48212b;
    public final org.telegram.ui.Cells.s8 f48213c;
    public final int d;
    public final int f48214e;
    public final TextPaint f48215f;
    public int h;
    public int f48216n;
    public final ThemeActivity f48217r;

    public h61(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.r4 r4Var;
        this.f48217r = themeActivity;
        this.d = 12;
        this.f48214e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f48215f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.an0 an0Var = new org.telegram.ui.Components.an0(context);
        this.f48212b = an0Var;
        an0Var.setReportChanges(true);
        an0Var.setSeparatorsCount(19);
        an0Var.setDelegate(new yr0(this, 4));
        an0Var.setImportantForAccessibility(2);
        addView(an0Var, c8.na.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z10 = org.telegram.messenger.s2.f26694a;
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.f48213c = s8Var;
        s8Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
        s8Var.f(org.telegram.messenger.hd.N0(2131751820, null), org.telegram.messenger.cz.H0, false);
        s8Var.setOnClickListener(new oy0(this, 7));
        r4Var = ((org.telegram.ui.ActionBar.g2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, r4Var, 0);
        this.f48211a = baVar;
        baVar.setImportantForAccessibility(4);
        addView(baVar, c8.na.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f48211a.invalidate();
        this.f48212b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I6, false);
        TextPaint textPaint = this.f48215f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.cz.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f48212b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.h != size) {
            int i11 = org.telegram.messenger.cz.W0;
            int i12 = this.d;
            this.f48212b.setProgress((i11 - i12) / (this.f48214e - i12));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f48212b.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.an0 an0Var = this.f48212b;
        if (an0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Mj, false);
            if (x02 != this.f48216n) {
                this.f48216n = x02;
                an0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
