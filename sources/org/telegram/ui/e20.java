package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e20 extends FrameLayout {
    public TextView f35886a;
    public TextView f35887b;
    public org.telegram.ui.Components.ki0 f35888c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f35889e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f35889e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.i6.f20940k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f35888c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f35888c, i10, 0, i11, 0);
        TextView textView = this.f35886a;
        org.telegram.ui.Components.ki0 ki0Var = this.f35888c;
        measureChildWithMargins(textView, i10, ki0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f35887b, i10, ki0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f35888c.setOnClickListener(onClickListener);
    }
}
