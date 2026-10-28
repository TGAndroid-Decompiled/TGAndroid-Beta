package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class mk extends FrameLayout {
    public final int f41455a;
    public final wn f41456b;

    public mk(wn wnVar, Context context, int i10) {
        super(context);
        this.f41455a = i10;
        this.f41456b = wnVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        int i14;
        switch (this.f41455a) {
            case 1:
                wn wnVar = this.f41456b;
                if (view == wnVar.f45129g3) {
                    ImageView imageView = wnVar.f45104e3;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i14 = 66;
                    } else {
                        i14 = 18;
                    }
                    ImageView imageView2 = wnVar.f45117f3;
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
    public void setTranslationY(float f7) {
        switch (this.f41455a) {
            case 2:
                super.setTranslationY(f7);
                this.f41456b.f45163j1.invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        switch (this.f41455a) {
            case 0:
                super.setVisibility(i10);
                k6.m mVar = this.f41456b.f45086cd;
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
