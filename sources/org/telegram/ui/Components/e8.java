package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class e8 extends FrameLayout {
    public final w9[] f23872a;
    public int f23873b;
    public AnimatorSet f23874c;

    public e8(Context context) {
        super(context);
        this.f23872a = new w9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f23872a[i10] = new w9(context);
            this.f23872a[i10].getImageReceiver().setDelegate(new i2.s(this, i10, 6));
            this.f23872a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f23872a[i10].setVisibility(8);
            }
            addView(this.f23872a[i10], w7.y5.c(-1.0f, -1));
        }
    }
}
