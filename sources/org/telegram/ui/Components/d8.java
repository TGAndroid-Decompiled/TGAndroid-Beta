package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class d8 extends FrameLayout {
    public final u9[] f25618a;
    public int f25619b;
    public AnimatorSet f25620c;

    public d8(Context context) {
        super(context);
        this.f25618a = new u9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f25618a[i10] = new u9(context);
            this.f25618a[i10].getImageReceiver().setDelegate(new i2.r(this, i10, 6));
            this.f25618a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f25618a[i10].setVisibility(8);
            }
            addView(this.f25618a[i10], w7.z5.c(-1.0f, -1));
        }
    }
}
