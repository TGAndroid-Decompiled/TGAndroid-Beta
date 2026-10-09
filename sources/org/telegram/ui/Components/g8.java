package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class g8 extends FrameLayout {
    public final y9[] f26613a;
    public int f26614b;
    public AnimatorSet f26615c;

    public g8(Context context) {
        super(context);
        this.f26613a = new y9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f26613a[i10] = new y9(context);
            this.f26613a[i10].getImageReceiver().setDelegate(new i2.s(this, i10, 6));
            this.f26613a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f26613a[i10].setVisibility(8);
            }
            addView(this.f26613a[i10], w7.x5.d(-1.0f, -1));
        }
    }
}
