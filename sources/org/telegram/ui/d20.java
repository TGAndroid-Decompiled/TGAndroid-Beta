package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class d20 extends FrameLayout {
    public TextView f36802a;
    public TextView f36803b;
    public org.telegram.ui.Components.cj0 f36804c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f36805e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f36805e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.i6.f20919k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f36804c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f36804c, i10, 0, i11, 0);
        TextView textView = this.f36802a;
        org.telegram.ui.Components.cj0 cj0Var = this.f36804c;
        measureChildWithMargins(textView, i10, cj0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f36803b, i10, cj0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f36804c.setOnClickListener(onClickListener);
    }
}
