package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class gz0 extends FrameLayout {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public com.google.firebase.messaging.m I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f26901a;
    public Paint f26902b;
    public Paint f26903c;
    public Paint d;
    public boolean f26904e;
    public ci.bb f26905f;
    public TextView h;
    public TextView f26906n;
    public TextView f26907r;
    public TextView f26908s;
    public TextView v;
    public View f26909w;
    public int f26910x;
    public org.telegram.ui.Cells.ca f26911y;

    @Override
    public final void invalidate() {
        TextView textView = this.f26908s;
        TextView textView2 = this.f26907r;
        TextView textView3 = this.f26906n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f26905f.invalidate();
        int i10 = this.f26910x;
        int i11 = org.telegram.ui.ActionBar.i6.Vi;
        if (i10 != org.telegram.ui.ActionBar.i6.x0(null, i11, false)) {
            this.f26910x = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), this.f26910x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), this.f26910x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f26910x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f26910x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f26911y.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        this.f26909w.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20798d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.firebase.messaging.m mVar = this.I;
        if (mVar != null) {
            mVar.f7951a = true;
            AnimatorSet animatorSet = (AnimatorSet) mVar.f7953c;
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
            mVar.f7951a = false;
            ((AnimatorSet) mVar.f7953c).cancel();
        }
    }
}
