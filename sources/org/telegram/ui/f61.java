package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class f61 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.ba f47702a;
    public final org.telegram.ui.Components.an0 f47703b;
    public final org.telegram.ui.Cells.r8 f47704c;
    public final int d;
    public final int f47705e;
    public final TextPaint f47706f;
    public int h;
    public int f47707n;
    public final ThemeActivity f47708r;

    public f61(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.r4 r4Var;
        this.f47708r = themeActivity;
        this.d = 12;
        this.f47705e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f47706f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.an0 an0Var = new org.telegram.ui.Components.an0(context);
        this.f47703b = an0Var;
        an0Var.setReportChanges(true);
        an0Var.setSeparatorsCount(19);
        an0Var.setDelegate(new wr0(this, 4));
        an0Var.setImportantForAccessibility(2);
        addView(an0Var, c8.na.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z10 = org.telegram.messenger.s2.f26829a;
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.f47704c = r8Var;
        r8Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
        r8Var.f(org.telegram.messenger.gd.N0(2131751820, null), org.telegram.messenger.bz.H0, false);
        r8Var.setOnClickListener(new ny0(this, 7));
        r4Var = ((org.telegram.ui.ActionBar.g2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, r4Var, 0);
        this.f47702a = baVar;
        baVar.setImportantForAccessibility(4);
        addView(baVar, c8.na.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f47702a.invalidate();
        this.f47703b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I6, false);
        TextPaint textPaint = this.f47706f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.bz.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f47703b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.h != size) {
            int i11 = org.telegram.messenger.bz.W0;
            int i12 = this.d;
            this.f47703b.setProgress((i11 - i12) / (this.f47705e - i12));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f47703b.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.an0 an0Var = this.f47703b;
        if (an0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
            if (x02 != this.f47707n) {
                this.f47707n = x02;
                an0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
