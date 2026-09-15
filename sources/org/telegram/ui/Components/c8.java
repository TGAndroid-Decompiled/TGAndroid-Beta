package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class c8 extends FrameLayout {
    public final u9[] f22972a;
    public int f22973b;
    public AnimatorSet f22974c;

    public c8(Context context) {
        super(context);
        this.f22972a = new u9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f22972a[i10] = new u9(context);
            this.f22972a[i10].getImageReceiver().setDelegate(new i2.s(this, i10, 5));
            this.f22972a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f22972a[i10].setVisibility(8);
            }
            addView(this.f22972a[i10], w7.x5.c(-1.0f, -1));
        }
    }
}
