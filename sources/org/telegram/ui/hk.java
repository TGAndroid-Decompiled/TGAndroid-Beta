package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class hk extends FrameLayout {
    public final int f38945a;
    public final tn f38946b;

    public hk(tn tnVar, Context context, int i10) {
        super(context);
        this.f38945a = i10;
        this.f38946b = tnVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        int i14;
        switch (this.f38945a) {
            case 1:
                tn tnVar = this.f38946b;
                if (view == tnVar.Q2) {
                    ImageView imageView = tnVar.O2;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i14 = 66;
                    } else {
                        i14 = 18;
                    }
                    ImageView imageView2 = tnVar.P2;
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
    public void setTranslationY(float f9) {
        switch (this.f38945a) {
            case 2:
                super.setTranslationY(f9);
                this.f38946b.T0.invalidate();
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        switch (this.f38945a) {
            case 0:
                super.setVisibility(i10);
                f5.u uVar = this.f38946b.f43036xc;
                boolean z11 = false;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (getMeasuredWidth() > 0) {
                    z11 = true;
                }
                uVar.j(2, z10, z11);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
