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
public final class lz0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public c2.b I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f30336a;
    public Paint f30337b;
    public Paint f30338c;
    public Paint d;
    public boolean e;
    public bi.cc f30339f;
    public TextView h;
    public TextView f30340n;
    public TextView f30341r;
    public TextView f30342s;
    public TextView v;
    public View f30343w;
    public int f30344x;
    public org.telegram.ui.Cells.ga f30345y;

    @Override
    public final void invalidate() {
        TextView textView = this.f30342s;
        TextView textView2 = this.f30341r;
        TextView textView3 = this.f30340n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f30339f.invalidate();
        int i10 = this.f30344x;
        int i11 = org.telegram.ui.ActionBar.y6.Vi;
        if (i10 != org.telegram.ui.ActionBar.y6.x0(null, i11, false)) {
            this.f30344x = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), this.f30344x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), this.f30344x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), i0.a.o(this.f30344x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), i0.a.o(this.f30344x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        org.telegram.ui.ActionBar.f7.V(this.f30345y.getTextView(), org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d7, this.f30343w, null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c2.b bVar = this.I;
        if (bVar != null) {
            bVar.f5929a = true;
            AnimatorSet animatorSet = (AnimatorSet) bVar.f5931c;
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
            bVar.f5929a = false;
            ((AnimatorSet) bVar.f5931c).cancel();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f30339f != null && this.h != null && this.f30344x != org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false)) {
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
