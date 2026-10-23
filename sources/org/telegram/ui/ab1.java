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
public final class ab1 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.ga f35638a;
    public final org.telegram.ui.Components.hp0 f35639b;
    public final int f35640c;
    public final int d;
    public final TextPaint e;
    public int f35641f;
    public int h;
    public final ThemeActivity f35642n;

    public ab1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.h5 h5Var;
        this.f35642n = themeActivity;
        this.f35640c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.hp0 hp0Var = new org.telegram.ui.Components.hp0(context);
        this.f35639b = hp0Var;
        hp0Var.setReportChanges(true);
        hp0Var.setSeparatorsCount(19);
        hp0Var.setDelegate(new rv0(this, 4));
        hp0Var.setImportantForAccessibility(2);
        addView(hp0Var, w7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        h5Var = ((org.telegram.ui.ActionBar.o2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, h5Var, 0);
        this.f35638a = gaVar;
        gaVar.setImportantForAccessibility(4);
        addView(gaVar, w7.z5.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vi));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f35638a.invalidate();
        this.f35639b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f35639b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f35641f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f35640c;
            this.f35639b.setProgress((i12 - i13) / (this.d - i13));
            this.f35641f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f35639b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.hp0 hp0Var = this.f35639b;
        if (hp0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vi, false);
            if (x02 != this.h) {
                this.h = x02;
                hp0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
