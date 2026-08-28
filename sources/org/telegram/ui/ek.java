package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class ek extends FrameLayout {
    public final int f37979a;
    public final qn f37980b;

    public ek(qn qnVar, Context context, int i9) {
        super(context);
        this.f37979a = i9;
        this.f37980b = qnVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        int i13;
        switch (this.f37979a) {
            case 1:
                qn qnVar = this.f37980b;
                if (view == qnVar.Q2) {
                    ImageView imageView = qnVar.O2;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i13 = 66;
                    } else {
                        i13 = 18;
                    }
                    ImageView imageView2 = qnVar.P2;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i13 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = AndroidUtilities.dp(i13);
                }
                super.measureChildWithMargins(view, i9, i10, i11, i12);
                return;
            default:
                super.measureChildWithMargins(view, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f37979a) {
            case 2:
                super.setTranslationY(f10);
                this.f37980b.T0.invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        boolean z10;
        switch (this.f37979a) {
            case 0:
                super.setVisibility(i9);
                d5.w wVar = this.f37980b.f42139xc;
                boolean z11 = false;
                if (i9 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (getMeasuredWidth() > 0) {
                    z11 = true;
                }
                wVar.j(2, z10, z11);
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }
}
