package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class pj extends FrameLayout {
    public final int f48601a;
    public final wm f48602b;

    public pj(wm wmVar, Context context, int i3) {
        super(context);
        this.f48601a = i3;
        this.f48602b = wmVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i3, int i10, int i11, int i12) {
        int i13;
        switch (this.f48601a) {
            case 1:
                wm wmVar = this.f48602b;
                if (view == wmVar.f51362j3) {
                    ImageView imageView = wmVar.f51337h3;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i13 = 66;
                    } else {
                        i13 = 18;
                    }
                    ImageView imageView2 = wmVar.i3;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i13 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i13);
                }
                super.measureChildWithMargins(view, i3, i10, i11, i12);
                return;
            default:
                super.measureChildWithMargins(view, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f48601a) {
            case 2:
                super.setTranslationY(f10);
                this.f48602b.m1.invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i3) {
        boolean z10;
        switch (this.f48601a) {
            case 0:
                super.setVisibility(i3);
                l6.n nVar = this.f48602b.f51333gd;
                boolean z11 = false;
                if (i3 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (getMeasuredWidth() > 0) {
                    z11 = true;
                }
                nVar.h(2, z10, z11);
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }
}
