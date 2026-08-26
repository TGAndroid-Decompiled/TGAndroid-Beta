package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stars.StarsController;

public final class WallpaperCell$$ExternalSyntheticLambda1 implements View.OnLongClickListener {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public WallpaperCell$$ExternalSyntheticLambda1(WallpaperCell wallpaperCell, WallpaperCell.WallpaperView wallpaperView, int i) {
        this.f$0 = wallpaperCell;
        this.f$1 = wallpaperView;
        this.f$2 = i;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return ((WallpaperCell) this.f$0).lambda$new$1((WallpaperCell.WallpaperView) this.f$1, this.f$2, view);
            default:
                return ProfileGiftsContainer.lambda$setGiftFilterOptionsClickListeners$23((StarsController.GiftsList) this.f$0, this.f$2, (Runnable) this.f$1, view);
        }
    }

    public WallpaperCell$$ExternalSyntheticLambda1(StarsController.GiftsList giftsList, int i, Runnable runnable) {
        this.f$0 = giftsList;
        this.f$2 = i;
        this.f$1 = runnable;
    }
}
