package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class k00 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public TextView f49152a;
    public TextView f49153b;
    public org.telegram.ui.Components.pg0 f49154c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f49155e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f49155e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.m6.f29501k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f49154c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(64.0f));
        measureChildWithMargins(this.f49154c, i7, 0, i10, 0);
        TextView textView = this.f49152a;
        org.telegram.ui.Components.pg0 pg0Var = this.f49154c;
        measureChildWithMargins(textView, i7, pg0Var.getMeasuredWidth(), i10, 0);
        measureChildWithMargins(this.f49153b, i7, pg0Var.getMeasuredWidth(), i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f49154c.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f49154c.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
