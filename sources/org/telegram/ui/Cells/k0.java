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
    public final int f22388a;
    public final ImageView f22389b;
    public final ImageView f22390c;
    public final j0 d;

    public k0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f22389b = imageView;
        addView(imageView, w7.x5.a(24.0f, 17.0f, 12.0f, 0.0f, 0.0f, 24, 51));
        j0 j0Var = new j0(0, context, null, true);
        this.d = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new m2.t(this, 5));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, w7.x5.a(38.0f, 54.0f, 5.0f, 54.0f, 0.0f, -1, 51));
        ImageView imageView2 = new ImageView(context);
        this.f22390c = imageView2;
        addView(imageView2, w7.x5.a(24.0f, 0.0f, 12.0f, 17.0f, 0.0f, 24, 53));
        imageView.setImageResource(R.drawable.msg_brightness_low);
        imageView2.setImageResource(R.drawable.msg_brightness_high);
        this.f22388a = 48;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = org.telegram.ui.ActionBar.h6.f20987m6;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f22389b.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f22390c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false), mode));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f22388a), 1073741824));
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
