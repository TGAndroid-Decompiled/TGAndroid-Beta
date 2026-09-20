package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class d8 extends FrameLayout {
    public final v9[] f23512a;
    public int f23513b;
    public AnimatorSet f23514c;

    public d8(Context context) {
        super(context);
        this.f23512a = new v9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f23512a[i10] = new v9(context);
            this.f23512a[i10].getImageReceiver().setDelegate(new i2.s(this, i10, 5));
            this.f23512a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f23512a[i10].setVisibility(8);
            }
            addView(this.f23512a[i10], w7.y5.c(-1.0f, -1));
        }
    }
}
