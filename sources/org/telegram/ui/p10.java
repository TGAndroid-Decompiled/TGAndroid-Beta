package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class p10 extends FrameLayout {

    public TextView f41243a;

    public TextView f41244b;

    public org.telegram.ui.Components.lh0 f41245c;
    public boolean d;

    public TLRPC.TL_dialogFilterSuggested f41246e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f41246e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f41245c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f41245c, i10, 0, i11, 0);
        TextView textView = this.f41243a;
        org.telegram.ui.Components.lh0 lh0Var = this.f41245c;
        measureChildWithMargins(textView, i10, lh0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f41244b, i10, lh0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f41245c.setOnClickListener(onClickListener);
    }
}
