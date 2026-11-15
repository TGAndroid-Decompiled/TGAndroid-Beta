package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class kw0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.Cells.v9 E;
    public float F;
    public float G;
    public ValueAnimator H;
    public ValueAnimator I;
    public ab.q J;
    public float K;
    public boolean L;
    public org.telegram.ui.Components.voip.n M;
    public Paint f36636a;
    public Paint f36637b;
    public Paint f36638c;
    public Paint d;
    public boolean f36639e;
    public bi.o2 f36640f;
    public TextView h;
    public TextView f36641n;
    public TextView f36642r;
    public TextView f36643s;
    public TextView f36644w;
    public View f36645x;
    public int f36646y;

    @Override
    public final void invalidate() {
        TextView textView = this.f36643s;
        TextView textView2 = this.f36642r;
        TextView textView3 = this.f36641n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f36640f.invalidate();
        int i7 = this.f36646y;
        int i10 = org.telegram.ui.ActionBar.j6.Mj;
        if (i7 != org.telegram.ui.ActionBar.j6.x0(null, i10, false)) {
            this.f36646y = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), this.f36646y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), this.f36646y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f36646y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.f36646y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
        org.telegram.ui.ActionBar.q6.U(this.E.getTextView(), org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, this.f36645x, null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ab.q qVar = this.J;
        if (qVar != null) {
            qVar.f988a = true;
            AnimatorSet animatorSet = (AnimatorSet) qVar.f990c;
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
            qVar.f988a = false;
            ((AnimatorSet) qVar.f990c).cancel();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f36640f != null && this.h != null && this.f36646y != org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false)) {
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
