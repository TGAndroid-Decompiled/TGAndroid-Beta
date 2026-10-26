package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class q10 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public TextView f42704a;
    public TextView f42705b;
    public org.telegram.ui.Components.wi0 f42706c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f42706c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.f42706c, i10, 0, i11, 0);
        TextView textView = this.f42704a;
        org.telegram.ui.Components.wi0 wi0Var = this.f42706c;
        measureChildWithMargins(textView, i10, wi0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f42705b, i10, wi0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f42706c.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f42706c.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Nh, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
