package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class h8 extends FrameLayout {
    public final y9[] f28858a;
    public int f28859b;
    public AnimatorSet f28860c;

    public h8(Context context) {
        super(context);
        this.f28858a = new y9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f28858a[i10] = new y9(context);
            this.f28858a[i10].getImageReceiver().setDelegate(new i2.r(this, i10, 6));
            this.f28858a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f28858a[i10].setVisibility(8);
            }
            addView(this.f28858a[i10], gb1.g(-1.0f, -1));
        }
    }
}
