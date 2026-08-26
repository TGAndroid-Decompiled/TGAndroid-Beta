package org.telegram.ui.Components;

import android.view.View;

public final class ItemOptions$$ExternalSyntheticLambda10 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final ItemOptions f$0;
    public final Runnable f$1;

    public ItemOptions$$ExternalSyntheticLambda10(ItemOptions itemOptions, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = itemOptions;
        this.f$1 = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$addChecked$3(this.f$1, view);
            default:
                return this.f$0.lambda$addBot$5(this.f$1, view);
        }
    }
}
