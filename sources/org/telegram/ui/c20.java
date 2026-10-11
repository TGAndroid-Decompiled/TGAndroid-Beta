package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class c20 extends FrameLayout {
    public TextView f36520a;
    public TextView f36521b;
    public org.telegram.ui.Components.ej0 f36522c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f36523e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f36523e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f20908k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f36522c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f36522c, i10, 0, i11, 0);
        TextView textView = this.f36520a;
        org.telegram.ui.Components.ej0 ej0Var = this.f36522c;
        measureChildWithMargins(textView, i10, ej0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f36521b, i10, ej0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f36522c.setOnClickListener(onClickListener);
    }
}
