package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e20 extends FrameLayout {
    public TextView f35887a;
    public TextView f35888b;
    public org.telegram.ui.Components.ki0 f35889c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f35890e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f35890e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.i6.f20941k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f35889c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f35889c, i10, 0, i11, 0);
        TextView textView = this.f35887a;
        org.telegram.ui.Components.ki0 ki0Var = this.f35889c;
        measureChildWithMargins(textView, i10, ki0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f35888b, i10, ki0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f35889c.setOnClickListener(onClickListener);
    }
}
