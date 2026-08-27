package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

public final class gk extends FrameLayout {

    public final int f38436a;

    public final rn f38437b;

    public gk(rn rnVar, Context context, int i10) {
        super(context);
        this.f38436a = i10;
        this.f38437b = rnVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        switch (this.f38436a) {
            case 1:
                rn rnVar = this.f38437b;
                if (view == rnVar.Q2) {
                    ImageView imageView = rnVar.O2;
                    int i14 = (imageView == null || imageView.getVisibility() == 8) ? 18 : 66;
                    ImageView imageView2 = rnVar.P2;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i14 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = AndroidUtilities.dp(i14);
                }
                super.measureChildWithMargins(view, i10, i11, i12, i13);
                break;
            default:
                super.measureChildWithMargins(view, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f38436a) {
            case 2:
                super.setTranslationY(f10);
                this.f38437b.T0.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f38436a) {
            case 0:
                super.setVisibility(i10);
                this.f38437b.f42275xc.j(2, i10 == 0, getMeasuredWidth() > 0);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
