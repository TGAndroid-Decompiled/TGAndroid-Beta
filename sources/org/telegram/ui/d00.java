package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class d00 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public TextView f44509a;
    public TextView f44510b;
    public org.telegram.ui.Components.dg0 f44511c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f44512e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f44512e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f44511c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(64.0f));
        measureChildWithMargins(this.f44511c, i3, 0, i10, 0);
        TextView textView = this.f44509a;
        org.telegram.ui.Components.dg0 dg0Var = this.f44511c;
        measureChildWithMargins(textView, i3, dg0Var.getMeasuredWidth(), i10, 0);
        measureChildWithMargins(this.f44510b, i3, dg0Var.getMeasuredWidth(), i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f44511c.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f44511c.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
