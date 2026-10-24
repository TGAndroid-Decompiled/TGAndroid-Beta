package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class bz0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public c2.b I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f25116a;
    public Paint f25117b;
    public Paint f25118c;
    public Paint d;
    public boolean e;
    public ai.jc f25119f;
    public TextView h;
    public TextView f25120n;
    public TextView f25121r;
    public TextView f25122s;
    public TextView v;
    public View f25123w;
    public int f25124x;
    public org.telegram.ui.Cells.ca f25125y;

    @Override
    public final void invalidate() {
        TextView textView = this.f25122s;
        TextView textView2 = this.f25121r;
        TextView textView3 = this.f25120n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f25119f.invalidate();
        int i10 = this.f25124x;
        int i11 = org.telegram.ui.ActionBar.k6.Vi;
        if (i10 != org.telegram.ui.ActionBar.k6.x0(null, i11, false)) {
            this.f25124x = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), this.f25124x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), this.f25124x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), i0.a.o(this.f25124x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), i0.a.o(this.f25124x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        org.telegram.ui.ActionBar.r6.W(this.f25125y.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21185d7, this.f25123w, null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c2.b bVar = this.I;
        if (bVar != null) {
            bVar.f4493a = true;
            AnimatorSet animatorSet = (AnimatorSet) bVar.f4495c;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c2.b bVar = this.I;
        if (bVar != null) {
            bVar.f4493a = false;
            ((AnimatorSet) bVar.f4495c).cancel();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f25119f != null && this.h != null && this.f25124x != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vi, false)) {
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
