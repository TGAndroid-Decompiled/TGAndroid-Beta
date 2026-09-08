package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f20 extends FrameLayout {
    public TextView f36264a;
    public TextView f36265b;
    public org.telegram.ui.Components.xh0 f36266c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f36267e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f36267e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f20812k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f36266c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f36266c, i10, 0, i11, 0);
        TextView textView = this.f36264a;
        org.telegram.ui.Components.xh0 xh0Var = this.f36266c;
        measureChildWithMargins(textView, i10, xh0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f36265b, i10, xh0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f36266c.setOnClickListener(onClickListener);
    }
}
