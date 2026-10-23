package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class m10 extends FrameLayout {
    public TextView f39097a;
    public TextView f39098b;
    public org.telegram.ui.Components.ui0 f39099c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f21115k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f39099c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f39099c, i10, 0, i11, 0);
        TextView textView = this.f39097a;
        org.telegram.ui.Components.ui0 ui0Var = this.f39099c;
        measureChildWithMargins(textView, i10, ui0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f39098b, i10, ui0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f39099c.setOnClickListener(onClickListener);
    }
}
