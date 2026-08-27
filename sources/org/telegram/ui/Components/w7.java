package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public abstract class w7 extends FrameLayout {

    public final n9[] f34129a;

    public int f34130b;

    public AnimatorSet f34131c;

    public w7(Context context) {
        super(context);
        this.f34129a = new n9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f34129a[i10] = new n9(context);
            this.f34129a[i10].getImageReceiver().setDelegate(new cg.p2(this, i10, 4));
            this.f34129a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f34129a[i10].setVisibility(8);
            }
            addView(this.f34129a[i10], h7.z5.c(-1.0f, -1));
        }
    }
}
