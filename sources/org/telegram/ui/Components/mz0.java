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
public final class mz0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public c2.b I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f30676a;
    public Paint f30677b;
    public Paint f30678c;
    public Paint d;
    public boolean e;
    public bi.cc f30679f;
    public TextView h;
    public TextView f30680n;
    public TextView f30681r;
    public TextView f30682s;
    public TextView v;
    public View f30683w;
    public int f30684x;
    public org.telegram.ui.Cells.ga f30685y;

    @Override
    public final void invalidate() {
        TextView textView = this.f30682s;
        TextView textView2 = this.f30681r;
        TextView textView3 = this.f30680n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f30679f.invalidate();
        int i10 = this.f30684x;
        int i11 = org.telegram.ui.ActionBar.y6.Vi;
        if (i10 != org.telegram.ui.ActionBar.y6.x0(null, i11, false)) {
            this.f30684x = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), this.f30684x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), this.f30684x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), i0.a.o(this.f30684x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), i0.a.o(this.f30684x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        org.telegram.ui.ActionBar.f7.V(this.f30685y.getTextView(), org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23358d7, this.f30683w, null);
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
            if (this.f30679f != null && this.h != null && this.f30684x != org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false)) {
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
