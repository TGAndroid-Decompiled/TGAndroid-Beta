package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class b20 extends FrameLayout {
    public TextView f35326a;
    public TextView f35327b;
    public org.telegram.ui.Components.gi0 f35328c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f35329e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f35329e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f35328c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f35328c, i10, 0, i11, 0);
        TextView textView = this.f35326a;
        org.telegram.ui.Components.gi0 gi0Var = this.f35328c;
        measureChildWithMargins(textView, i10, gi0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f35327b, i10, gi0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f35328c.setOnClickListener(onClickListener);
    }
}
