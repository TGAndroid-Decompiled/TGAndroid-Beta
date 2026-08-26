package org.telegram.ui.Cells;

import android.view.View;
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
        int i;
        switch (this.$r8$classId) {
            case 0:
                WallpaperCell wallpaperCell = (WallpaperCell) this.f$0;
                wallpaperCell.getClass();
                return wallpaperCell.onWallpaperLongClick(this.f$2, ((WallpaperCell.WallpaperView) this.f$1).currentWallpaper);
            default:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) this.f$0;
                giftsList.getClass();
                int i2 = this.f$2;
                if ((i2 & 15) != 0) {
                    i = 15;
                } else {
                    i = (i2 & 768) != 0 ? 768 : 0;
                }
                int i3 = giftsList.includeFlags;
                int i4 = i2 | ((~i) & i3);
                if (i3 != i4) {
                    giftsList.includeFlags = i4;
                    giftsList.invalidate(true);
                }
                ((Runnable) this.f$1).run();
                return true;
        }
    }

    public WallpaperCell$$ExternalSyntheticLambda1(StarsController.GiftsList giftsList, int i, Runnable runnable) {
        this.f$0 = giftsList;
        this.f$2 = i;
        this.f$1 = runnable;
    }
}
