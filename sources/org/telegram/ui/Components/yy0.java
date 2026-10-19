package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yy0 extends FrameLayout {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public c2.b I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.h L;
    public Paint f32775a;
    public Paint f32776b;
    public Paint f32777c;
    public Paint d;
    public boolean e;
    public ai.ic f32778f;
    public TextView h;
    public TextView f32779n;
    public TextView f32780r;
    public TextView f32781s;
    public TextView v;
    public View f32782w;
    public int f32783x;
    public org.telegram.ui.Cells.ba f32784y;

    @Override
    public final void invalidate() {
        TextView textView = this.f32781s;
        TextView textView2 = this.f32780r;
        TextView textView3 = this.f32779n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f32778f.invalidate();
        int i10 = this.f32783x;
        int i11 = org.telegram.ui.ActionBar.h6.Vi;
        if (i10 != org.telegram.ui.ActionBar.h6.x0(null, i11, false)) {
            this.f32783x = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), this.f32783x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), this.f32783x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.o(this.f32783x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.o(this.f32783x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.f32784y.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f32782w.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20988d7, false));
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
