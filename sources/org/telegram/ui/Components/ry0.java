package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ry0 extends FrameLayout {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public com.google.firebase.messaging.m I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f26786a;
    public Paint f26787b;
    public Paint f26788c;
    public Paint d;
    public boolean e;
    public bi.nc f26789f;
    public TextView h;
    public TextView f26790n;
    public TextView f26791r;
    public TextView f26792s;
    public TextView v;
    public View f26793w;
    public int f26794x;
    public org.telegram.ui.Cells.ga f26795y;

    @Override
    public final void invalidate() {
        TextView textView = this.f26792s;
        TextView textView2 = this.f26791r;
        TextView textView3 = this.f26790n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f26789f.invalidate();
        int i10 = this.f26794x;
        int i11 = org.telegram.ui.ActionBar.j6.Vi;
        if (i10 != org.telegram.ui.ActionBar.j6.w0(null, i11, false)) {
            this.f26794x = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), this.f26794x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), this.f26794x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f26794x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f26794x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f26795y.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f26793w.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17929d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.firebase.messaging.m mVar = this.I;
        if (mVar != null) {
            mVar.f6100a = true;
            AnimatorSet animatorSet = (AnimatorSet) mVar.f6102c;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.firebase.messaging.m mVar = this.I;
        if (mVar != null) {
            mVar.f6100a = false;
            ((AnimatorSet) mVar.f6102c).cancel();
        }
    }
}
