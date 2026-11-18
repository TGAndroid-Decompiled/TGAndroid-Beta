package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class k00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public TextView f49142a;
    public TextView f49143b;
    public org.telegram.ui.Components.ng0 f49144c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f49145e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f49145e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f49144c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(64.0f));
        measureChildWithMargins(this.f49144c, i7, 0, i10, 0);
        TextView textView = this.f49142a;
        org.telegram.ui.Components.ng0 ng0Var = this.f49144c;
        measureChildWithMargins(textView, i7, ng0Var.getMeasuredWidth(), i10, 0);
        measureChildWithMargins(this.f49143b, i7, ng0Var.getMeasuredWidth(), i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f49144c.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f49144c.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
