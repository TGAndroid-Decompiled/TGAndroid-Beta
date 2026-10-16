package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class h8 extends FrameLayout {
    public final z9[] f25198a;
    public int f25199b;
    public AnimatorSet f25200c;

    public h8(Context context) {
        super(context);
        this.f25198a = new z9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f25198a[i10] = new z9(context);
            this.f25198a[i10].getImageReceiver().setDelegate(new i2.r(this, i10, 6));
            this.f25198a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f25198a[i10].setVisibility(8);
            }
            addView(this.f25198a[i10], w7.z5.d(-1.0f, -1));
        }
    }
}
