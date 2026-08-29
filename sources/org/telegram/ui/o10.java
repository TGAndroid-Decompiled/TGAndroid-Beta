package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class o10 extends FrameLayout {
    public TextView f40950a;
    public TextView f40951b;
    public org.telegram.ui.Components.th0 f40952c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f40953e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f40953e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f40952c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f40952c, i10, 0, i11, 0);
        TextView textView = this.f40950a;
        org.telegram.ui.Components.th0 th0Var = this.f40952c;
        measureChildWithMargins(textView, i10, th0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f40951b, i10, th0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f40952c.setOnClickListener(onClickListener);
    }
}
