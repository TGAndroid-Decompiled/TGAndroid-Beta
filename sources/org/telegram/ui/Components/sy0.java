package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sy0 extends FrameLayout {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public com.google.firebase.messaging.m I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f28370a;
    public Paint f28371b;
    public Paint f28372c;
    public Paint d;
    public boolean e;
    public ci.bb f28373f;
    public TextView h;
    public TextView f28374n;
    public TextView f28375r;
    public TextView f28376s;
    public TextView v;
    public View f28377w;
    public int f28378x;
    public org.telegram.ui.Cells.ea f28379y;

    @Override
    public final void invalidate() {
        TextView textView = this.f28376s;
        TextView textView2 = this.f28375r;
        TextView textView3 = this.f28374n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f28373f.invalidate();
        int i10 = this.f28378x;
        int i11 = org.telegram.ui.ActionBar.h6.Vi;
        if (i10 != org.telegram.ui.ActionBar.h6.w0(null, i11, false)) {
            this.f28378x = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), this.f28378x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), this.f28378x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f28378x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f28378x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f28379y.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f28377w.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19077d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.firebase.messaging.m mVar = this.I;
        if (mVar != null) {
            mVar.f7321a = true;
            AnimatorSet animatorSet = (AnimatorSet) mVar.f7323c;
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
            mVar.f7321a = false;
            ((AnimatorSet) mVar.f7323c).cancel();
        }
    }
}
