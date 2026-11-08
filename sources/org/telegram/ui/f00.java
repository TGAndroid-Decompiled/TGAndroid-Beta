package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class f00 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public TextView f45413a;
    public TextView f45414b;
    public org.telegram.ui.Components.ag0 f45415c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f45416e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f45416e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f45415c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(64.0f));
        measureChildWithMargins(this.f45415c, i7, 0, i10, 0);
        TextView textView = this.f45413a;
        org.telegram.ui.Components.ag0 ag0Var = this.f45415c;
        measureChildWithMargins(textView, i7, ag0Var.getMeasuredWidth(), i10, 0);
        measureChildWithMargins(this.f45414b, i7, ag0Var.getMeasuredWidth(), i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f45415c.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f45415c.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
