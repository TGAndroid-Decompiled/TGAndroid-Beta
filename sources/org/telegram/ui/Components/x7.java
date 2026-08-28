package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class x7 extends FrameLayout {
    public final o9[] f34593a;
    public int f34594b;
    public AnimatorSet f34595c;

    public x7(Context context) {
        super(context);
        this.f34593a = new o9[2];
        for (int i9 = 0; i9 < 2; i9++) {
            this.f34593a[i9] = new o9(context);
            this.f34593a[i9].getImageReceiver().setDelegate(new bg.x2(this, i9, 4));
            this.f34593a[i9].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i9 == 1) {
                this.f34593a[i9].setVisibility(8);
            }
            addView(this.f34593a[i9], g7.e6.c(-1.0f, -1));
        }
    }
}
