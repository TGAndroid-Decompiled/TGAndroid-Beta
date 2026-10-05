package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e20 extends FrameLayout {
    public TextView f35931a;
    public TextView f35932b;
    public org.telegram.ui.Components.ki0 f35933c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f35934e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f35934e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.i6.f20950k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f35933c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f35933c, i10, 0, i11, 0);
        TextView textView = this.f35931a;
        org.telegram.ui.Components.ki0 ki0Var = this.f35933c;
        measureChildWithMargins(textView, i10, ki0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f35932b, i10, ki0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f35933c.setOnClickListener(onClickListener);
    }
}
