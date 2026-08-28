package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class mx0 extends FrameLayout {
    public float A;
    public float B;
    public ValueAnimator C;
    public ValueAnimator D;
    public com.google.firebase.messaging.l E;
    public float F;
    public boolean G;
    public org.telegram.ui.Components.voip.h H;
    public Paint f30933a;
    public Paint f30934b;
    public Paint f30935c;
    public Paint d;
    public boolean f30936e;
    public fh.l2 f30937f;
    public TextView h;
    public TextView f30938n;
    public TextView f30939r;
    public TextView f30940s;
    public TextView v;
    public View f30941w;
    public int f30942x;
    public org.telegram.ui.Cells.ba f30943y;

    @Override
    public final void invalidate() {
        TextView textView = this.f30940s;
        TextView textView2 = this.f30939r;
        TextView textView3 = this.f30938n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f30937f.invalidate();
        int i9 = this.f30942x;
        int i10 = org.telegram.ui.ActionBar.f6.Vi;
        if (i9 != org.telegram.ui.ActionBar.f6.w0(null, i10, false)) {
            this.f30942x = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), this.f30942x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), this.f30942x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f30942x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.f30942x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f30943y.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        this.f30941w.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23002d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.firebase.messaging.l lVar = this.E;
        if (lVar != null) {
            lVar.f4157a = true;
            AnimatorSet animatorSet = (AnimatorSet) lVar.f4159c;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.firebase.messaging.l lVar = this.E;
        if (lVar != null) {
            lVar.f4157a = false;
            ((AnimatorSet) lVar.f4159c).cancel();
        }
    }
}
