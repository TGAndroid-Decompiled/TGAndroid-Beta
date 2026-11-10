package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class j00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.m5 f46782a;
    public ImageView f46783b;
    public org.telegram.ui.Components.xp f46784c;
    public int d;
    public int f46785e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28020k7));
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        ImageView imageView = this.f46783b;
        int i13 = i11 - i7;
        org.telegram.ui.ActionBar.m5 m5Var = this.f46782a;
        int textHeight = ((i12 - i10) - m5Var.getTextHeight()) / 2;
        float f10 = 23.0f;
        if (org.telegram.messenger.id.f23161a0) {
            int measuredWidth2 = getMeasuredWidth() - m5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f10 = 64.0f;
            }
            L = measuredWidth2 - org.telegram.messenger.g0.L(f10);
        } else {
            if (imageView.getVisibility() == 0) {
                f10 = 64.0f;
            }
            L = org.telegram.messenger.g0.L(f10);
        }
        m5Var.layout(L, textHeight, m5Var.getMeasuredWidth() + L, m5Var.getMeasuredHeight() + textHeight);
        if (!org.telegram.messenger.id.f23161a0) {
            measuredWidth = org.telegram.messenger.g0.L(20.0f);
        } else {
            measuredWidth = (i13 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(20.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.messenger.g0.L(48.0f);
        this.f46782a.measure(org.telegram.messenger.camera.q.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f46783b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }

    @Override
    public final void updateColors() {
        ImageView imageView = this.f46783b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof org.telegram.ui.Components.xp) {
                    org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) imageView.getDrawable();
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.N6, false);
                    int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28020k7, false);
                    if (xpVar == this.f46784c && x02 == this.d && x03 == this.f46785e) {
                        return;
                    }
                    this.f46784c = xpVar;
                    this.d = x02;
                    this.f46785e = x03;
                    Drawable drawable = xpVar.f40374a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = xpVar.f40375b;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
                    }
                    imageView.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
