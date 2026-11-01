package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class f10 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public TextView f36955a;
    public TextView f36956b;
    public org.telegram.ui.Components.dh0 f36957c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.f36957c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(64.0f));
        measureChildWithMargins(this.f36957c, i10, 0, i11, 0);
        TextView textView = this.f36955a;
        org.telegram.ui.Components.dh0 dh0Var = this.f36957c;
        measureChildWithMargins(textView, i10, dh0Var.getMeasuredWidth(), i11, 0);
        measureChildWithMargins(this.f36956b, i10, dh0Var.getMeasuredWidth(), i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f36957c.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f36957c.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
