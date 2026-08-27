package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class ox0 extends FrameLayout {
    public float A;
    public float B;
    public ValueAnimator C;
    public ValueAnimator D;
    public com.google.firebase.messaging.l E;
    public float F;
    public boolean G;
    public org.telegram.ui.Components.voip.h H;

    public Paint f31434a;

    public Paint f31435b;

    public Paint f31436c;
    public Paint d;

    public boolean f31437e;

    public ag.s0 f31438f;
    public TextView h;

    public TextView f31439n;

    public TextView f31440r;

    public TextView f31441s;
    public TextView v;

    public View f31442w;

    public int f31443x;

    public org.telegram.ui.Cells.x9 f31444y;

    @Override
    public final void invalidate() {
        TextView textView = this.f31441s;
        TextView textView2 = this.f31440r;
        TextView textView3 = this.f31439n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f31438f.invalidate();
        int i10 = this.f31443x;
        int i11 = org.telegram.ui.ActionBar.g6.Vi;
        if (i10 != org.telegram.ui.ActionBar.g6.w0(null, i11, false)) {
            this.f31443x = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), this.f31443x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), this.f31443x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.b.k(this.f31443x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.b.k(this.f31443x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f31444y.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f31442w.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23054d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.firebase.messaging.l lVar = this.E;
        if (lVar != null) {
            lVar.f4599a = true;
            AnimatorSet animatorSet = (AnimatorSet) lVar.f4601c;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.firebase.messaging.l lVar = this.E;
        if (lVar != null) {
            lVar.f4599a = false;
            ((AnimatorSet) lVar.f4601c).cancel();
        }
    }
}
