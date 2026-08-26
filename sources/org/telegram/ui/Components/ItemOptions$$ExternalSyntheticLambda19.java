package org.telegram.ui.Components;

import android.view.View;

public final class ItemOptions$$ExternalSyntheticLambda19 implements View.OnLayoutChangeListener {
    public final int $r8$classId;
    public final Object f$0;

    public ItemOptions$$ExternalSyntheticLambda19(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$r8$classId) {
            case 0:
                ((ItemOptions) this.f$0).lambda$installFollowListeners$17(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            default:
                ((StickerTabView) this.f$0).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
