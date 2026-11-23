package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class tw0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.Cells.x9 E;
    public float F;
    public float G;
    public ValueAnimator H;
    public ValueAnimator I;
    public ab.q J;
    public float K;
    public boolean L;
    public org.telegram.ui.Components.voip.n M;
    public Paint f40065a;
    public Paint f40066b;
    public Paint f40067c;
    public Paint d;
    public boolean f40068e;
    public bi.m3 f40069f;
    public TextView h;
    public TextView f40070n;
    public TextView f40071r;
    public TextView f40072s;
    public TextView f40073w;
    public View f40074x;
    public int f40075y;

    @Override
    public final void invalidate() {
        TextView textView = this.f40072s;
        TextView textView2 = this.f40071r;
        TextView textView3 = this.f40070n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f40069f.invalidate();
        int i7 = this.f40075y;
        int i10 = org.telegram.ui.ActionBar.m6.Mj;
        if (i7 != org.telegram.ui.ActionBar.m6.x0(null, i10, false)) {
            this.f40075y = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), this.f40075y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), this.f40075y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f40075y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f40075y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
        org.telegram.ui.ActionBar.t6.U(this.E.getTextView(), org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29382d7, this.f40074x, null);
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
            if (this.f40069f != null && this.h != null && this.f40075y != org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Mj, false)) {
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
