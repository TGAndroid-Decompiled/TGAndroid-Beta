package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
public abstract class j0 extends FrameLayout {
    public final int f30865a;
    public final ImageView f30866b;
    public final ImageView f30867c;
    public final i0 d;

    public j0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f30866b = imageView;
        addView(imageView, c8.ma.d(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        i0 i0Var = new i0(0, context, null, true);
        this.d = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new h9.g1(this, 26));
        i0Var.setImportantForAccessibility(2);
        addView(i0Var, c8.ma.d(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30867c = imageView2;
        addView(imageView2, c8.ma.d(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(2131232077);
        imageView2.setImageResource(2131232076);
        this.f30865a = 48;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = org.telegram.ui.ActionBar.n6.f29559m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(this.f30866b, i7, null, mode);
        org.telegram.ui.ActionBar.u6.s(this.f30867c, i7, null, mode);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30865a), 1073741824));
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
