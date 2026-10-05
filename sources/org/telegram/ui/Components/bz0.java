package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class bz0 extends FrameLayout {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public com.google.firebase.messaging.m I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f25142a;
    public Paint f25143b;
    public Paint f25144c;
    public Paint d;
    public boolean f25145e;
    public ci.ab f25146f;
    public TextView h;
    public TextView f25147n;
    public TextView f25148r;
    public TextView f25149s;
    public TextView v;
    public View f25150w;
    public int f25151x;
    public org.telegram.ui.Cells.ea f25152y;

    @Override
    public final void invalidate() {
        TextView textView = this.f25149s;
        TextView textView2 = this.f25148r;
        TextView textView3 = this.f25147n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f25146f.invalidate();
        int i10 = this.f25151x;
        int i11 = org.telegram.ui.ActionBar.i6.Vi;
        if (i10 != org.telegram.ui.ActionBar.i6.w0(null, i11, false)) {
            this.f25151x = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), this.f25151x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), this.f25151x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f25151x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f25151x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f25152y.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        this.f25150w.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20828d7, false));
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
