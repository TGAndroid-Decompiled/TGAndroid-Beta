package org.telegram.ui.Components;

import android.view.View;

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
                this.f$0.lambda$addProfile$12(this.f$1, view);
                break;
            case 1:
                this.f$0.lambda$addBot$4(this.f$1, view);
                break;
            case 2:
                this.f$0.lambda$addProfileCustom$13(this.f$1, view);
                break;
            case 3:
                this.f$0.lambda$add$8(this.f$1, view);
                break;
            case 4:
                this.f$0.lambda$add$1(this.f$1, view);
                break;
            case 5:
                this.f$0.lambda$addChat$6(this.f$1, view);
                break;
            case 6:
                this.f$0.lambda$putPremiumLock$9(this.f$1, view);
                break;
            case 7:
                this.f$0.lambda$addAccount$7(this.f$1, view);
                break;
            default:
                this.f$0.lambda$addChecked$2(this.f$1, view);
                break;
        }
    }
}
