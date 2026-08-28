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
    public final int f24585a;
    public final ImageView f24586b;
    public final ImageView f24587c;
    public final j0 d;

    public k0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f24586b = imageView;
        addView(imageView, g7.e6.d(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        j0 j0Var = new j0(0, context, null, true);
        this.d = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new n5.a0(this, 5));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, g7.e6.d(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f24587c = imageView2;
        addView(imageView2, g7.e6.d(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(R.drawable.msg_brightness_low);
        imageView2.setImageResource(R.drawable.msg_brightness_high);
        this.f24585a = 48;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = org.telegram.ui.ActionBar.f6.f23162m6;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f24586b.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f24587c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), mode));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f24585a), 1073741824));
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (!super.performAccessibilityAction(i9, bundle) && !this.d.getSeekBarAccessibilityDelegate().g(this, i9, bundle)) {
            return false;
        }
        return true;
    }

    public void setProgress(float f10) {
        this.d.setProgress(f10);
    }
}
