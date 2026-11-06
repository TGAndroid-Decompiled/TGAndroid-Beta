package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class g61 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Cells.z9 f45872a;
    public final org.telegram.ui.Components.mm0 f45873b;
    public final org.telegram.ui.Cells.r8 f45874c;
    public final int d;
    public final int f45875e;
    public final TextPaint f45876f;
    public int h;
    public int f45877n;
    public final ThemeActivity f45878r;

    public g61(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.q4 q4Var;
        this.f45878r = themeActivity;
        this.d = 12;
        this.f45875e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f45876f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context);
        this.f45873b = mm0Var;
        mm0Var.setReportChanges(true);
        mm0Var.setSeparatorsCount(19);
        mm0Var.setDelegate(new wr0(this, 4));
        mm0Var.setImportantForAccessibility(2);
        addView(mm0Var, c8.ha.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z9 = org.telegram.messenger.r2.f25199a;
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.f45874c = r8Var;
        r8Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
        r8Var.f(org.telegram.messenger.hd.M0(2131751832, null), org.telegram.messenger.iz.H0, false);
        r8Var.setOnClickListener(new my0(this, 7));
        q4Var = ((org.telegram.ui.ActionBar.f2) themeActivity).parentLayout;
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, q4Var, 0);
        this.f45872a = z9Var;
        z9Var.setImportantForAccessibility(4);
        addView(z9Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f45872a.invalidate();
        this.f45873b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I6, false);
        TextPaint textPaint = this.f45876f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.iz.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f45873b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.h != size) {
            int i11 = org.telegram.messenger.iz.W0;
            int i12 = this.d;
            this.f45873b.setProgress((i11 - i12) / (this.f45875e - i12));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f45873b.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.mm0 mm0Var = this.f45873b;
        if (mm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
            if (x02 != this.f45877n) {
                this.f45877n = x02;
                mm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
