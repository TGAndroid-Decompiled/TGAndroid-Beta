package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class pk extends FrameLayout {
    public final int f40678a;
    public final un f40679b;

    public pk(un unVar, Context context, int i10) {
        super(context);
        this.f40678a = i10;
        this.f40679b = unVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        int i14;
        switch (this.f40678a) {
            case 1:
                un unVar = this.f40679b;
                if (view == unVar.f42282i3) {
                    ImageView imageView = unVar.f42259g3;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i14 = 66;
                    } else {
                        i14 = 18;
                    }
                    ImageView imageView2 = unVar.f42270h3;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i14 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(i14);
                }
                super.measureChildWithMargins(view, i10, i11, i12, i13);
                return;
            default:
                super.measureChildWithMargins(view, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f40678a) {
            case 2:
                super.setTranslationY(f7);
                this.f40679b.l1.invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        switch (this.f40678a) {
            case 0:
                super.setVisibility(i10);
                j6.m mVar = this.f40679b.Xc;
                boolean z11 = false;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (getMeasuredWidth() > 0) {
                    z11 = true;
                }
                mVar.h(2, z10, z11);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
