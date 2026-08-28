package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class m10 extends FrameLayout {
    public TextView f40294a;
    public TextView f40295b;
    public org.telegram.ui.Components.jh0 f40296c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested f40297e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.f40297e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f40296c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f40296c, i9, 0, i10, 0);
        TextView textView = this.f40294a;
        org.telegram.ui.Components.jh0 jh0Var = this.f40296c;
        measureChildWithMargins(textView, i9, jh0Var.getMeasuredWidth(), i10, 0);
        measureChildWithMargins(this.f40295b, i9, jh0Var.getMeasuredWidth(), i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f40296c.setOnClickListener(onClickListener);
    }
}
