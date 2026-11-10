package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class hw0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.Cells.w9 D;
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public ab.q I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.n L;
    public Paint f34467a;
    public Paint f34468b;
    public Paint f34469c;
    public Paint d;
    public boolean f34470e;
    public bi.ec f34471f;
    public TextView h;
    public TextView f34472n;
    public TextView f34473r;
    public TextView f34474s;
    public TextView f34475w;
    public View f34476x;
    public int f34477y;

    @Override
    public final void invalidate() {
        TextView textView = this.f34474s;
        TextView textView2 = this.f34473r;
        TextView textView3 = this.f34472n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f34471f.invalidate();
        int i7 = this.f34477y;
        int i10 = org.telegram.ui.ActionBar.m6.Jj;
        if (i7 != org.telegram.ui.ActionBar.m6.x0(null, i10, false)) {
            this.f34477y = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), this.f34477y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), this.f34477y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f34477y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f34477y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
        org.telegram.ui.ActionBar.t6.U(this.D.getTextView(), org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27891d7, this.f34476x, null);
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
            if (this.f34471f != null && this.h != null && this.f34477y != org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Jj, false)) {
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
