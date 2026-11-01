package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class mx0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.Cells.x9 D;
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public ac.a I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.g L;
    public Paint f28604a;
    public Paint f28605b;
    public Paint f28606c;
    public Paint d;
    public boolean e;
    public bi.t0 f28607f;
    public TextView h;
    public TextView f28608n;
    public TextView f28609r;
    public TextView f28610s;
    public TextView f28611w;
    public View f28612x;
    public int f28613y;

    @Override
    public final void invalidate() {
        TextView textView = this.f28610s;
        TextView textView2 = this.f28609r;
        TextView textView3 = this.f28608n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f28607f.invalidate();
        int i10 = this.f28613y;
        int i11 = org.telegram.ui.ActionBar.t6.Jj;
        if (i10 != org.telegram.ui.ActionBar.t6.x0(null, i11, false)) {
            this.f28613y = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), this.f28613y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), this.f28613y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), i0.b.o(this.f28613y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), i0.b.o(this.f28613y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
        }
        org.telegram.ui.ActionBar.a7.V(this.D.getTextView(), org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, this.f28612x, null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac.a aVar = this.I;
        if (aVar != null) {
            aVar.f362a = true;
            AnimatorSet animatorSet = (AnimatorSet) aVar.f364c;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac.a aVar = this.I;
        if (aVar != null) {
            aVar.f362a = false;
            ((AnimatorSet) aVar.f364c).cancel();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f28607f != null && this.h != null && this.f28613y != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Jj, false)) {
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
