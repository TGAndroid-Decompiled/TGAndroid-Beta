package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class xx0 extends FrameLayout {
    public float A;
    public float B;
    public ValueAnimator C;
    public ValueAnimator D;
    public ab.m E;
    public float F;
    public boolean G;
    public org.telegram.ui.Components.voip.h H;
    public Paint f34841a;
    public Paint f34842b;
    public Paint f34843c;
    public Paint d;
    public boolean f34844e;
    public cg.h0 f34845f;
    public TextView h;
    public TextView f34846n;
    public TextView f34847r;
    public TextView f34848s;
    public TextView v;
    public View f34849w;
    public int f34850x;
    public org.telegram.ui.Cells.y9 f34851y;

    @Override
    public final void invalidate() {
        TextView textView = this.f34848s;
        TextView textView2 = this.f34847r;
        TextView textView3 = this.f34846n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f34845f.invalidate();
        int i10 = this.f34850x;
        int i11 = org.telegram.ui.ActionBar.g6.Vi;
        if (i10 != org.telegram.ui.ActionBar.g6.w0(null, i11, false)) {
            this.f34850x = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), this.f34850x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), this.f34850x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f34850x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f34850x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f34851y.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f34849w.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23063d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ab.m mVar = this.E;
        if (mVar != null) {
            mVar.f324a = true;
            AnimatorSet animatorSet = (AnimatorSet) mVar.f326c;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ab.m mVar = this.E;
        if (mVar != null) {
            mVar.f324a = false;
            ((AnimatorSet) mVar.f326c).cancel();
        }
    }
}
