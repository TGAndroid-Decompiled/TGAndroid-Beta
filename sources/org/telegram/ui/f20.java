package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f20 extends FrameLayout {
    public TextView f37597a;
    public TextView f37598b;
    public org.telegram.ui.Components.ej0 f37599c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f37600e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f37600e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f20681k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f37599c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f37599c, i10, 0, i11, 0);
        TextView textView = this.f37597a;
        org.telegram.ui.Components.ej0 ej0Var = this.f37599c;
        measureChildWithMargins(textView, i10, ej0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f37598b, i10, ej0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f37599c.setOnClickListener(onClickListener);
    }
}
