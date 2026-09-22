package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class qk extends FrameLayout {
    public final int f36948a;
    public final zn f36949b;

    public qk(zn znVar, Context context, int i10) {
        super(context);
        this.f36948a = i10;
        this.f36949b = znVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        int i14;
        switch (this.f36948a) {
            case 1:
                zn znVar = this.f36949b;
                if (view == znVar.U2) {
                    ImageView imageView = znVar.S2;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i14 = 66;
                    } else {
                        i14 = 18;
                    }
                    ImageView imageView2 = znVar.T2;
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
        switch (this.f36948a) {
            case 2:
                super.setTranslationY(f7);
                this.f36949b.X0.invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        switch (this.f36948a) {
            case 0:
                super.setVisibility(i10);
                j6.l lVar = this.f36949b.Ac;
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
