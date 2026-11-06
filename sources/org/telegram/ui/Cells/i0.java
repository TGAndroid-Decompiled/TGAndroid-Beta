package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
public abstract class i0 extends FrameLayout {
    public final int f29297a;
    public final ImageView f29298b;
    public final ImageView f29299c;
    public final h0 d;

    public i0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f29298b = imageView;
        addView(imageView, c8.ha.d(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        h0 h0Var = new h0(0, context, null, true);
        this.d = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new gf.g(this, 26));
        h0Var.setImportantForAccessibility(2);
        addView(h0Var, c8.ha.d(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f29299c = imageView2;
        addView(imageView2, c8.ha.d(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(2131232075);
        imageView2.setImageResource(2131232074);
        this.f29297a = 48;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = org.telegram.ui.ActionBar.k6.f28014m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(this.f29298b, i7, null, mode);
        org.telegram.ui.ActionBar.r6.t(this.f29299c, i7, null, mode);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f29297a), 1073741824));
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.d.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    public void setProgress(float f10) {
        this.d.setProgress(f10);
    }
}
