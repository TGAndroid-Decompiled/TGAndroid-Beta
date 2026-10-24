package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class j0 extends FrameLayout {
    public final int f22561a;
    public final ImageView f22562b;
    public final ImageView f22563c;
    public final i0 d;

    public j0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f22562b = imageView;
        addView(imageView, w7.z5.d(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        i0 i0Var = new i0(0, context, null, true);
        this.d = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new l2.f(this, 7));
        i0Var.setImportantForAccessibility(2);
        addView(i0Var, w7.z5.d(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f22563c = imageView2;
        addView(imageView2, w7.z5.d(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(R.drawable.msg_brightness_low);
        imageView2.setImageResource(R.drawable.msg_brightness_high);
        this.f22561a = 48;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = org.telegram.ui.ActionBar.k6.f21347m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(this.f22562b, i10, null, mode);
        org.telegram.ui.ActionBar.r6.t(this.f22563c, i10, null, mode);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f22561a), 1073741824));
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
