package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class sw0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.Cells.w9 E;
    public float F;
    public float G;
    public ValueAnimator H;
    public ValueAnimator I;
    public ab.q J;
    public float K;
    public boolean L;
    public org.telegram.ui.Components.voip.n M;
    public Paint f39723a;
    public Paint f39724b;
    public Paint f39725c;
    public Paint d;
    public boolean f39726e;
    public bi.o3 f39727f;
    public TextView h;
    public TextView f39728n;
    public TextView f39729r;
    public TextView f39730s;
    public TextView f39731w;
    public View f39732x;
    public int f39733y;

    @Override
    public final void invalidate() {
        TextView textView = this.f39730s;
        TextView textView2 = this.f39729r;
        TextView textView3 = this.f39728n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f39727f.invalidate();
        int i7 = this.f39733y;
        int i10 = org.telegram.ui.ActionBar.n6.Mj;
        if (i7 != org.telegram.ui.ActionBar.n6.x0(null, i10, false)) {
            this.f39733y = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), this.f39733y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), this.f39733y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f39733y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f39733y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
        org.telegram.ui.ActionBar.u6.U(this.E.getTextView(), org.telegram.ui.ActionBar.n6.G6, null);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29452d7, this.f39732x, null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ab.q qVar = this.J;
        if (qVar != null) {
            qVar.f987a = true;
            AnimatorSet animatorSet = (AnimatorSet) qVar.f989c;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ab.q qVar = this.J;
        if (qVar != null) {
            qVar.f987a = false;
            ((AnimatorSet) qVar.f989c).cancel();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f39727f != null && this.h != null && this.f39733y != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false)) {
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
