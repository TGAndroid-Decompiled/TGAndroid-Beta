package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class j00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public TextView f48957a;
    public TextView f48958b;
    public org.telegram.ui.Components.og0 f48959c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f48960e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f48960e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f48959c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(64.0f));
        measureChildWithMargins(this.f48959c, i7, 0, i10, 0);
        TextView textView = this.f48957a;
        org.telegram.ui.Components.og0 og0Var = this.f48959c;
        measureChildWithMargins(textView, i7, og0Var.getMeasuredWidth(), i10, 0);
        measureChildWithMargins(this.f48958b, i7, og0Var.getMeasuredWidth(), i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f48959c.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f48959c.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
