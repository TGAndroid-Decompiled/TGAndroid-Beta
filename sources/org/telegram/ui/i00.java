package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class i00 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.j5 f47857a;
    public ImageView f47858b;
    public org.telegram.ui.Components.fq f47859c;
    public int d;
    public int f47860e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28979k7));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        ImageView imageView = this.f47858b;
        int i13 = i11 - i7;
        org.telegram.ui.ActionBar.j5 j5Var = this.f47857a;
        int textHeight = ((i12 - i10) - j5Var.getTextHeight()) / 2;
        float f10 = 23.0f;
        if (org.telegram.messenger.hd.f24104a0) {
            int measuredWidth2 = getMeasuredWidth() - j5Var.getMeasuredWidth();
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
        j5Var.layout(L, textHeight, j5Var.getMeasuredWidth() + L, j5Var.getMeasuredHeight() + textHeight);
        if (!org.telegram.messenger.hd.f24104a0) {
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
        this.f47857a.measure(org.telegram.messenger.i20.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f47858b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }

    @Override
    public final void updateColors() {
        ImageView imageView = this.f47858b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof org.telegram.ui.Components.fq) {
                    org.telegram.ui.Components.fq fqVar = (org.telegram.ui.Components.fq) imageView.getDrawable();
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.N6, false);
                    int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28979k7, false);
                    if (fqVar == this.f47859c && x02 == this.d && x03 == this.f47860e) {
                        return;
                    }
                    this.f47859c = fqVar;
                    this.d = x02;
                    this.f47860e = x03;
                    Drawable drawable = fqVar.f34673a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = fqVar.f34674b;
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
