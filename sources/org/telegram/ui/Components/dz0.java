package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class dz0 extends FrameLayout {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public c2.b I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f24204a;
    public Paint f24205b;
    public Paint f24206c;
    public Paint d;
    public boolean e;
    public di.ab f24207f;
    public TextView h;
    public TextView f24208n;
    public TextView f24209r;
    public TextView f24210s;
    public TextView v;
    public View f24211w;
    public int f24212x;
    public org.telegram.ui.Cells.ca f24213y;

    @Override
    public final void invalidate() {
        TextView textView = this.f24210s;
        TextView textView2 = this.f24209r;
        TextView textView3 = this.f24208n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f24207f.invalidate();
        int i10 = this.f24212x;
        int i11 = org.telegram.ui.ActionBar.g6.Vi;
        if (i10 != org.telegram.ui.ActionBar.g6.x0(null, i11, false)) {
            this.f24212x = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), this.f24212x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), this.f24212x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f24212x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f24212x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f24213y.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f24211w.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19602d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c2.b bVar = this.I;
        if (bVar != null) {
            bVar.f4122a = true;
            AnimatorSet animatorSet = (AnimatorSet) bVar.f4124c;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c2.b bVar = this.I;
        if (bVar != null) {
            bVar.f4122a = false;
            ((AnimatorSet) bVar.f4124c).cancel();
        }
    }
}
