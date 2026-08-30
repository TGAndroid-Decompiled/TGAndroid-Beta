package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class x7 extends FrameLayout {
    public final p9[] f30588a;
    public int f30589b;
    public AnimatorSet f30590c;

    public x7(Context context) {
        super(context);
        this.f30588a = new p9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f30588a[i10] = new p9(context);
            this.f30588a[i10].getImageReceiver().setDelegate(new gg.m2(this, i10, 5));
            this.f30588a[i10].setRoundRadius(AndroidUtilities.dp(4.0f));
            if (i10 == 1) {
                this.f30588a[i10].setVisibility(8);
            }
            addView(this.f30588a[i10], k7.b6.c(-1.0f, -1));
        }
    }
}
