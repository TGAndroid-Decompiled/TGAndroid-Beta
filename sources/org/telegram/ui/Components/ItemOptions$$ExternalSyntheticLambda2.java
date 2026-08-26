package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

public final class ItemOptions$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final ItemOptions f$0;
    public final Runnable f$1;

    public ItemOptions$$ExternalSyntheticLambda2(ItemOptions itemOptions, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = itemOptions;
        this.f$1 = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ItemOptions itemOptions = this.f$0;
                Runnable runnable = this.f$1;
                if (runnable != null) {
                    itemOptions.getClass();
                    runnable.run();
                }
                if (itemOptions.dismissWithButtons) {
                    itemOptions.dismiss();
                }
                break;
            case 1:
                Runnable runnable2 = this.f$1;
                ItemOptions itemOptions2 = this.f$0;
                itemOptions2.getClass();
                runnable2.run();
                if (itemOptions2.dismissWithButtons) {
                    itemOptions2.dismiss();
                }
                break;
            case 2:
                this.f$0.dismiss();
                Runnable runnable3 = this.f$1;
                if (runnable3 != null) {
                    runnable3.run();
                }
                break;
            case 3:
                Runnable runnable4 = this.f$1;
                ItemOptions itemOptions3 = this.f$0;
                itemOptions3.getClass();
                runnable4.run();
                if (itemOptions3.dismissWithButtons) {
                    itemOptions3.dismiss();
                }
                break;
            case 4:
                ItemOptions itemOptions4 = this.f$0;
                Runnable runnable5 = this.f$1;
                if (runnable5 == null) {
                    itemOptions4.getClass();
                } else {
                    int i = -itemOptions4.shiftDp;
                    itemOptions4.shiftDp = i;
                    AndroidUtilities.shakeViewSpring(view, i);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable5.run();
                }
                break;
            default:
                ItemOptions itemOptions5 = this.f$0;
                Runnable runnable6 = this.f$1;
                if (runnable6 != null) {
                    itemOptions5.getClass();
                    runnable6.run();
                }
                if (itemOptions5.dismissWithButtons) {
                    itemOptions5.dismiss();
                }
                break;
        }
    }
}
