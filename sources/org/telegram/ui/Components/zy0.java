package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class zy0 extends FrameLayout {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public c2.b I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f33057a;
    public Paint f33058b;
    public Paint f33059c;
    public Paint d;
    public boolean e;
    public ai.ic f33060f;
    public TextView h;
    public TextView f33061n;
    public TextView f33062r;
    public TextView f33063s;
    public TextView v;
    public View f33064w;
    public int f33065x;
    public org.telegram.ui.Cells.ba f33066y;

    @Override
    public final void invalidate() {
        TextView textView = this.f33063s;
        TextView textView2 = this.f33062r;
        TextView textView3 = this.f33061n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f33060f.invalidate();
        int i10 = this.f33065x;
        int i11 = org.telegram.ui.ActionBar.h6.Vi;
        if (i10 != org.telegram.ui.ActionBar.h6.x0(null, i11, false)) {
            this.f33065x = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), this.f33065x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), this.f33065x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.o(this.f33065x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.o(this.f33065x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f33066y.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f33064w.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20991d7, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c2.b bVar = this.I;
        if (bVar != null) {
            bVar.f4489a = true;
            AnimatorSet animatorSet = (AnimatorSet) bVar.f4491c;
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
            bVar.f4489a = false;
            ((AnimatorSet) bVar.f4491c).cancel();
        }
    }
}
