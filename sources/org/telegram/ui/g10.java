package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class g10 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.ActionBar.u5 f37269a;
    public ImageView f37270b;
    public org.telegram.ui.Components.eq f37271c;
    public int d;
    public int e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21060k7));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        int measuredWidth;
        ImageView imageView = this.f37270b;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.u5 u5Var = this.f37269a;
        int textHeight = ((i13 - i11) - u5Var.getTextHeight()) / 2;
        float f7 = 23.0f;
        if (org.telegram.messenger.dd.X) {
            int measuredWidth2 = getMeasuredWidth() - u5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f7 = 64.0f;
            }
            L = measuredWidth2 - org.telegram.messenger.i0.L(f7);
        } else {
            if (imageView.getVisibility() == 0) {
                f7 = 64.0f;
            }
            L = org.telegram.messenger.i0.L(f7);
        }
        u5Var.layout(L, textHeight, u5Var.getMeasuredWidth() + L, u5Var.getMeasuredHeight() + textHeight);
        if (!org.telegram.messenger.dd.X) {
            measuredWidth = org.telegram.messenger.i0.L(20.0f);
        } else {
            measuredWidth = (i14 - imageView.getMeasuredWidth()) - org.telegram.messenger.i0.L(20.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        org.telegram.messenger.i0.L(48.0f);
        this.f37269a.measure(org.telegram.messenger.a30.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        this.f37270b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
        setMeasuredDimension(size, org.telegram.messenger.i0.L(50.0f));
    }

    @Override
    public final void updateColors() {
        ImageView imageView = this.f37270b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof org.telegram.ui.Components.eq) {
                    org.telegram.ui.Components.eq eqVar = (org.telegram.ui.Components.eq) imageView.getDrawable();
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.N6, false);
                    int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21060k7, false);
                    if (eqVar == this.f37271c && x02 == this.d && x03 == this.e) {
                        return;
                    }
                    this.f37271c = eqVar;
                    this.d = x02;
                    this.e = x03;
                    Drawable drawable = eqVar.f25901a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = eqVar.f25902b;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
                    }
                    imageView.invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
