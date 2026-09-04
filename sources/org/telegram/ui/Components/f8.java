package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class f8 extends FrameLayout {
    public final x9[] f25952a;
    public int f25953b;
    public AnimatorSet f25954c;

    public f8(Context context) {
        super(context);
        this.f25952a = new x9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f25952a[i10] = new x9(context);
            this.f25952a[i10].getImageReceiver().setDelegate(new i2.t(this, i10, 5));
            this.f25952a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f25952a[i10].setVisibility(8);
            }
            addView(this.f25952a[i10], w7.x5.c(-1.0f, -1));
        }
    }
}
