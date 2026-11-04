package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class gw0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.Cells.v9 E;
    public float F;
    public float G;
    public ValueAnimator H;
    public ValueAnimator I;
    public b4.n J;
    public float K;
    public boolean L;
    public org.telegram.ui.Components.voip.g M;
    public Paint f34211a;
    public Paint f34212b;
    public Paint f34213c;
    public Paint d;
    public boolean f34214e;
    public ai.x2 f34215f;
    public TextView h;
    public TextView f34216n;
    public TextView f34217r;
    public TextView f34218s;
    public TextView f34219w;
    public View f34220x;
    public int f34221y;

    @Override
    public final void invalidate() {
        TextView textView = this.f34218s;
        TextView textView2 = this.f34217r;
        TextView textView3 = this.f34216n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f34215f.invalidate();
        int i3 = this.f34221y;
        int i10 = org.telegram.ui.ActionBar.k6.Jj;
        if (i3 != org.telegram.ui.ActionBar.k6.x0(null, i10, false)) {
            this.f34221y = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), this.f34221y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), this.f34221y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f34221y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f34221y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
        org.telegram.ui.ActionBar.r6.V(this.E.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, this.f34220x, null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b4.n nVar = this.J;
        if (nVar != null) {
            nVar.f2377a = true;
            AnimatorSet animatorSet = (AnimatorSet) nVar.f2379c;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b4.n nVar = this.J;
        if (nVar != null) {
            nVar.f2377a = false;
            ((AnimatorSet) nVar.f2379c).cancel();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f34215f != null && this.h != null && this.f34221y != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false)) {
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
