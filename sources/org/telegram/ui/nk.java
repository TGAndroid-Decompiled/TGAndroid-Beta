package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class nk extends FrameLayout {
    public final int f35914a;
    public final wn f35915b;

    public nk(wn wnVar, Context context, int i10) {
        super(context);
        this.f35914a = i10;
        this.f35915b = wnVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        int i14;
        switch (this.f35914a) {
            case 1:
                wn wnVar = this.f35915b;
                if (view == wnVar.U2) {
                    ImageView imageView = wnVar.S2;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i14 = 66;
                    } else {
                        i14 = 18;
                    }
                    ImageView imageView2 = wnVar.T2;
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
        switch (this.f35914a) {
            case 2:
                super.setTranslationY(f7);
                this.f35915b.X0.invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        switch (this.f35914a) {
            case 0:
                super.setVisibility(i10);
                j6.l lVar = this.f35915b.Ac;
                boolean z11 = false;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (getMeasuredWidth() > 0) {
                    z11 = true;
                }
                lVar.j(2, z10, z11);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
