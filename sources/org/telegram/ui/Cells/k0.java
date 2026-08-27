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

    public final int f24552a;

    public final ImageView f24553b;

    public final ImageView f24554c;
    public final j0 d;

    public k0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f24553b = imageView;
        addView(imageView, h7.z5.d(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        j0 j0Var = new j0(0, context, null, true);
        this.d = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new n2.b0(this, 7));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, h7.z5.d(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f24554c = imageView2;
        addView(imageView2, h7.z5.d(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(R.drawable.msg_brightness_low);
        imageView2.setImageResource(R.drawable.msg_brightness_high);
        this.f24552a = 48;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = org.telegram.ui.ActionBar.g6.f23215m6;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f24553b.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        this.f24554c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), mode));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f24552a), 1073741824));
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.d.getSeekBarAccessibilityDelegate().g(this, i10, bundle);
    }

    public void setProgress(float f10) {
        this.d.setProgress(f10);
    }
}
