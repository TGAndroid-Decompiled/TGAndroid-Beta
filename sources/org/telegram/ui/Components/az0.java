package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class az0 extends FrameLayout {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public com.google.firebase.messaging.m I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f24727a;
    public Paint f24728b;
    public Paint f24729c;
    public Paint d;
    public boolean f24730e;
    public ci.ab f24731f;
    public TextView h;
    public TextView f24732n;
    public TextView f24733r;
    public TextView f24734s;
    public TextView v;
    public View f24735w;
    public int f24736x;
    public org.telegram.ui.Cells.ea f24737y;

    @Override
    public final void invalidate() {
        TextView textView = this.f24734s;
        TextView textView2 = this.f24733r;
        TextView textView3 = this.f24732n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f24731f.invalidate();
        int i10 = this.f24736x;
        int i11 = org.telegram.ui.ActionBar.i6.Vi;
        if (i10 != org.telegram.ui.ActionBar.i6.w0(null, i11, false)) {
            this.f24736x = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), this.f24736x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), this.f24736x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f24736x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f24736x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f24737y.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        this.f24735w.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20823d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.firebase.messaging.m mVar = this.I;
        if (mVar != null) {
            mVar.f7902a = true;
            AnimatorSet animatorSet = (AnimatorSet) mVar.f7904c;
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
            mVar.f7902a = false;
            ((AnimatorSet) mVar.f7904c).cancel();
        }
    }
}
