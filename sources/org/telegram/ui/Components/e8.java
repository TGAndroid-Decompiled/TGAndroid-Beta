package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class e8 extends FrameLayout {
    public final w9[] f22611a;
    public int f22612b;
    public AnimatorSet f22613c;

    public e8(Context context) {
        super(context);
        this.f22611a = new w9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f22611a[i10] = new w9(context);
            this.f22611a[i10].getImageReceiver().setDelegate(new i2.s(this, i10, 5));
            this.f22611a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f22611a[i10].setVisibility(8);
            }
            addView(this.f22611a[i10], w7.a6.c(-1.0f, -1));
        }
    }
}
