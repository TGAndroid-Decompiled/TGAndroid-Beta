package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class hw0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public org.telegram.ui.Cells.w9 D;
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public ab.q I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.n L;
    public Paint f34438a;
    public Paint f34439b;
    public Paint f34440c;
    public Paint d;
    public boolean f34441e;
    public bi.ec f34442f;
    public TextView h;
    public TextView f34443n;
    public TextView f34444r;
    public TextView f34445s;
    public TextView f34446w;
    public View f34447x;
    public int f34448y;

    @Override
    public final void invalidate() {
        TextView textView = this.f34445s;
        TextView textView2 = this.f34444r;
        TextView textView3 = this.f34443n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f34442f.invalidate();
        int i7 = this.f34448y;
        int i10 = org.telegram.ui.ActionBar.k6.Jj;
        if (i7 != org.telegram.ui.ActionBar.k6.x0(null, i10, false)) {
            this.f34448y = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), this.f34448y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), this.f34448y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f34448y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f34448y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
        org.telegram.ui.ActionBar.r6.V(this.D.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d7, this.f34447x, null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ab.q qVar = this.I;
        if (qVar != null) {
            qVar.f989a = true;
            AnimatorSet animatorSet = (AnimatorSet) qVar.f991c;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ab.q qVar = this.I;
        if (qVar != null) {
            qVar.f989a = false;
            ((AnimatorSet) qVar.f991c).cancel();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f34442f != null && this.h != null && this.f34448y != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false)) {
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
