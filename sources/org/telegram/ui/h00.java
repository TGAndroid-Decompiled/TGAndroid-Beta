package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class h00 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public TextView f47564a;
    public TextView f47565b;
    public org.telegram.ui.Components.dg0 f47566c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f47567e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f47567e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f47566c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(64.0f));
        measureChildWithMargins(this.f47566c, i7, 0, i10, 0);
        TextView textView = this.f47564a;
        org.telegram.ui.Components.dg0 dg0Var = this.f47566c;
        measureChildWithMargins(textView, i7, dg0Var.getMeasuredWidth(), i10, 0);
        measureChildWithMargins(this.f47565b, i7, dg0Var.getMeasuredWidth(), i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f47566c.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f47566c.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ei, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
