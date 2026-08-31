package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class k0 extends FrameLayout {
    public final int f23040a;
    public final ImageView f23041b;
    public final ImageView f23042c;
    public final j0 d;

    public k0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f23041b = imageView;
        addView(imageView, k7.c6.d(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        j0 j0Var = new j0(0, context, null, true);
        this.d = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new androidx.biometric.f0(this, 24));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, k7.c6.d(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f23042c = imageView2;
        addView(imageView2, k7.c6.d(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(R.drawable.msg_brightness_low);
        imageView2.setImageResource(R.drawable.msg_brightness_high);
        this.f23040a = 48;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = org.telegram.ui.ActionBar.k6.f21821m6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f23041b.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f23042c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), mode));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f23040a), 1073741824));
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.d.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setProgress(float f10) {
        this.d.setProgress(f10);
    }
}
