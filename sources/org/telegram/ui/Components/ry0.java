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
    public Paint f28075a;
    public Paint f28076b;
    public Paint f28077c;
    public Paint d;
    public boolean e;
    public ci.bb f28078f;
    public TextView h;
    public TextView f28079n;
    public TextView f28080r;
    public TextView f28081s;
    public TextView v;
    public View f28082w;
    public int f28083x;
    public org.telegram.ui.Cells.ea f28084y;

    @Override
    public final void invalidate() {
        TextView textView = this.f28081s;
        TextView textView2 = this.f28080r;
        TextView textView3 = this.f28079n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f28078f.invalidate();
        int i10 = this.f28083x;
        int i11 = org.telegram.ui.ActionBar.h6.Vi;
        if (i10 != org.telegram.ui.ActionBar.h6.w0(null, i11, false)) {
            this.f28083x = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), this.f28083x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), this.f28083x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f28083x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f28083x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f28084y.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f28082w.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.firebase.messaging.m mVar = this.I;
        if (mVar != null) {
            mVar.f7309a = true;
            AnimatorSet animatorSet = (AnimatorSet) mVar.f7311c;
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
            mVar.f7309a = false;
            ((AnimatorSet) mVar.f7311c).cancel();
        }
    }
}
