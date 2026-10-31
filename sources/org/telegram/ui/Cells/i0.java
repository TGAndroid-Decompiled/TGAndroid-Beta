package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
public abstract class i0 extends FrameLayout {
    public final int f22022a;
    public final ImageView f22023b;
    public final ImageView f22024c;
    public final h0 d;

    public i0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f22023b = imageView;
        addView(imageView, w7.b6.d(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        h0 h0Var = new h0(0, context, null, true);
        this.d = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new k2.m0(this));
        h0Var.setImportantForAccessibility(2);
        addView(h0Var, w7.b6.d(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f22024c = imageView2;
        addView(imageView2, w7.b6.d(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(2131232074);
        imageView2.setImageResource(2131232073);
        this.f22022a = 48;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = org.telegram.ui.ActionBar.t6.f21095m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(this.f22023b, i10, null, mode);
        org.telegram.ui.ActionBar.a7.t(this.f22024c, i10, null, mode);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.f22022a), 1073741824));
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.d.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setProgress(float f7) {
        this.d.setProgress(f7);
    }
}
