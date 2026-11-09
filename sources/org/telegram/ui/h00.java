package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class h00 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public TextView f46111a;
    public TextView f46112b;
    public org.telegram.ui.Components.bg0 f46113c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f46114e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f46114e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f46113c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(64.0f));
        measureChildWithMargins(this.f46113c, i7, 0, i10, 0);
        TextView textView = this.f46111a;
        org.telegram.ui.Components.bg0 bg0Var = this.f46113c;
        measureChildWithMargins(textView, i7, bg0Var.getMeasuredWidth(), i10, 0);
        measureChildWithMargins(this.f46112b, i7, bg0Var.getMeasuredWidth(), i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f46113c.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f46113c.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Bi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
