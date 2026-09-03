package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class hy0 extends FrameLayout {
    public float B;
    public float C;
    public ValueAnimator D;
    public ValueAnimator E;
    public cb.m F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.h I;
    public Paint f27649a;
    public Paint f27650b;
    public Paint f27651c;
    public Paint d;
    public boolean f27652e;
    public fg.h0 f27653f;
    public TextView h;
    public TextView f27654n;
    public TextView f27655r;
    public TextView f27656s;
    public TextView v;
    public View f27657w;
    public int f27658x;
    public org.telegram.ui.Cells.aa f27659y;

    @Override
    public final void invalidate() {
        TextView textView = this.f27656s;
        TextView textView2 = this.f27655r;
        TextView textView3 = this.f27654n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f27653f.invalidate();
        int i10 = this.f27658x;
        int i11 = org.telegram.ui.ActionBar.k6.Vi;
        if (i10 != org.telegram.ui.ActionBar.k6.w0(null, i11, false)) {
            this.f27658x = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), this.f27658x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), this.f27658x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f27658x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f27658x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f27659y.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.f27657w.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21662d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cb.m mVar = this.F;
        if (mVar != null) {
            mVar.f2424a = true;
            AnimatorSet animatorSet = (AnimatorSet) mVar.f2426c;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cb.m mVar = this.F;
        if (mVar != null) {
            mVar.f2424a = false;
            ((AnimatorSet) mVar.f2426c).cancel();
        }
    }
}
