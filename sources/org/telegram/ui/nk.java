package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class nk extends FrameLayout {
    public final int f36678a;
    public final xn f36679b;

    public nk(xn xnVar, Context context, int i10) {
        super(context);
        this.f36678a = i10;
        this.f36679b = xnVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        int i14;
        switch (this.f36678a) {
            case 1:
                xn xnVar = this.f36679b;
                if (view == xnVar.R2) {
                    ImageView imageView = xnVar.P2;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i14 = 66;
                    } else {
                        i14 = 18;
                    }
                    ImageView imageView2 = xnVar.Q2;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i14 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = AndroidUtilities.dp(i14);
                }
                super.measureChildWithMargins(view, i10, i11, i12, i13);
                return;
            default:
                super.measureChildWithMargins(view, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f36678a) {
            case 2:
                super.setTranslationY(f10);
                this.f36679b.U0.invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z4;
        switch (this.f36678a) {
            case 0:
                super.setVisibility(i10);
                h5.u uVar = this.f36679b.f40260yc;
                boolean z10 = false;
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (getMeasuredWidth() > 0) {
                    z10 = true;
                }
                uVar.h(2, z4, z10);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
