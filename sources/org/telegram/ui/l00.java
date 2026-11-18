package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class l00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.n5 f49396a;
    public ImageView f49397b;
    public org.telegram.ui.Components.mq f49398c;
    public int d;
    public int f49399e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29524k7));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        ImageView imageView = this.f49397b;
        int i13 = i11 - i7;
        org.telegram.ui.ActionBar.n5 n5Var = this.f49396a;
        int textHeight = ((i12 - i10) - n5Var.getTextHeight()) / 2;
        float f10 = 23.0f;
        if (org.telegram.messenger.gd.f24213a0) {
            int measuredWidth2 = getMeasuredWidth() - n5Var.getMeasuredWidth();
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
        n5Var.layout(L, textHeight, n5Var.getMeasuredWidth() + L, n5Var.getMeasuredHeight() + textHeight);
        if (!org.telegram.messenger.gd.f24213a0) {
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
        this.f49396a.measure(org.telegram.messenger.n10.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f49397b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }

    @Override
    public final void updateColors() {
        ImageView imageView = this.f49397b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof org.telegram.ui.Components.mq) {
                    org.telegram.ui.Components.mq mqVar = (org.telegram.ui.Components.mq) imageView.getDrawable();
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.N6, false);
                    int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524k7, false);
                    if (mqVar == this.f49398c && x02 == this.d && x03 == this.f49399e) {
                        return;
                    }
                    this.f49398c = mqVar;
                    this.d = x02;
                    this.f49399e = x03;
                    Drawable drawable = mqVar.f37607a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = mqVar.f37608b;
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
