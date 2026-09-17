package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ey0 extends FrameLayout {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public com.google.firebase.messaging.m I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f25806a;
    public Paint f25807b;
    public Paint f25808c;
    public Paint d;
    public boolean f25809e;
    public di.eb f25810f;
    public TextView h;
    public TextView f25811n;
    public TextView f25812r;
    public TextView f25813s;
    public TextView v;
    public View f25814w;
    public int f25815x;
    public org.telegram.ui.Cells.ea f25816y;

    @Override
    public final void invalidate() {
        TextView textView = this.f25813s;
        TextView textView2 = this.f25812r;
        TextView textView3 = this.f25811n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f25810f.invalidate();
        int i10 = this.f25815x;
        int i11 = org.telegram.ui.ActionBar.j6.Vi;
        if (i10 != org.telegram.ui.ActionBar.j6.w0(null, i11, false)) {
            this.f25815x = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), this.f25815x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), this.f25815x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f25815x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f25815x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f25816y.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f25814w.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20665d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.firebase.messaging.m mVar = this.I;
        if (mVar != null) {
            mVar.f6371a = true;
            AnimatorSet animatorSet = (AnimatorSet) mVar.f6373c;
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
            mVar.f6371a = false;
            ((AnimatorSet) mVar.f6373c).cancel();
        }
    }
}
