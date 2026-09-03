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
    public Paint f25515a;
    public Paint f25516b;
    public Paint f25517c;
    public Paint d;
    public boolean e;
    public eg.h0 f25518f;
    public TextView h;
    public TextView f25519n;
    public TextView f25520r;
    public TextView f25521s;
    public TextView v;
    public View f25522w;
    public int f25523x;
    public org.telegram.ui.Cells.z9 f25524y;

    @Override
    public final void invalidate() {
        TextView textView = this.f25521s;
        TextView textView2 = this.f25520r;
        TextView textView3 = this.f25519n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f25518f.invalidate();
        int i10 = this.f25523x;
        int i11 = org.telegram.ui.ActionBar.j6.Vi;
        if (i10 != org.telegram.ui.ActionBar.j6.w0(null, i11, false)) {
            this.f25523x = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), this.f25523x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), this.f25523x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f25523x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f25523x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f25524y.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f25522w.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19882d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cb.m mVar = this.F;
        if (mVar != null) {
            mVar.f2255a = true;
            AnimatorSet animatorSet = (AnimatorSet) mVar.f2257c;
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
            mVar.f2255a = false;
            ((AnimatorSet) mVar.f2257c).cancel();
        }
    }
}
