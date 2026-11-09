package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class iw0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.Cells.w9 D;
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public ab.q I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.n L;
    public Paint f34866a;
    public Paint f34867b;
    public Paint f34868c;
    public Paint d;
    public boolean f34869e;
    public bi.ec f34870f;
    public TextView h;
    public TextView f34871n;
    public TextView f34872r;
    public TextView f34873s;
    public TextView f34874w;
    public View f34875x;
    public int f34876y;

    @Override
    public final void invalidate() {
        TextView textView = this.f34873s;
        TextView textView2 = this.f34872r;
        TextView textView3 = this.f34871n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f34870f.invalidate();
        int i7 = this.f34876y;
        int i10 = org.telegram.ui.ActionBar.l6.Jj;
        if (i7 != org.telegram.ui.ActionBar.l6.x0(null, i10, false)) {
            this.f34876y = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(10.0f), this.f34876y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(10.0f), this.f34876y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f34876y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f34876y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
        org.telegram.ui.ActionBar.s6.U(this.D.getTextView(), org.telegram.ui.ActionBar.l6.G6, null);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27866d7, this.f34875x, null);
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
            if (this.f34870f != null && this.h != null && this.f34876y != org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Jj, false)) {
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
