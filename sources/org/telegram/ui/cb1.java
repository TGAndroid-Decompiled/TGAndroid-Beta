package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
public final class cb1 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Cells.ka f38415a;
    public final org.telegram.ui.Components.lp0 f38416b;
    public final int f38417c;
    public final int d;
    public final TextPaint e;
    public int f38418f;
    public int h;
    public final ThemeActivity f38419n;

    public cb1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.j5 j5Var;
        this.f38419n = themeActivity;
        this.f38417c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.lp0 lp0Var = new org.telegram.ui.Components.lp0(context);
        this.f38416b = lp0Var;
        lp0Var.setReportChanges(true);
        lp0Var.setSeparatorsCount(19);
        lp0Var.setDelegate(new uv0(this, 4));
        lp0Var.setImportantForAccessibility(2);
        addView(lp0Var, org.telegram.ui.Components.gb1.h(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        j5Var = ((org.telegram.ui.ActionBar.r2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, j5Var, 0);
        this.f38415a = kaVar;
        kaVar.setImportantForAccessibility(4);
        addView(kaVar, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f38415a.invalidate();
        this.f38416b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f38416b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f38418f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f38417c;
            this.f38416b.setProgress((i12 - i13) / (this.d - i13));
            this.f38418f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f38416b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.lp0 lp0Var = this.f38416b;
        if (lp0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false);
            if (x02 != this.h) {
                this.h = x02;
                lp0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
