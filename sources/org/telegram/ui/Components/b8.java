package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class b8 extends FrameLayout {
    public final t9[] f27000a;
    public int f27001b;
    public AnimatorSet f27002c;

    public b8(Context context) {
        super(context);
        this.f27000a = new t9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f27000a[i10] = new t9(context);
            this.f27000a[i10].getImageReceiver().setDelegate(new eg.n2(this, i10, 4));
            this.f27000a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f27000a[i10].setVisibility(8);
            }
            addView(this.f27000a[i10], i7.f6.c(-1.0f, -1));
        }
    }
}
