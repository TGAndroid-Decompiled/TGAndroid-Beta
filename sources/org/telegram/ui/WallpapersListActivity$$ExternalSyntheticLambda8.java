package org.telegram.ui;

import org.telegram.ui.ThemePreviewActivity;
public final class WallpapersListActivity$$ExternalSyntheticLambda8 implements ThemePreviewActivity.WallpaperActivityDelegate {
    public final WallpapersListActivity f$0;

    public WallpapersListActivity$$ExternalSyntheticLambda8(WallpapersListActivity wallpapersListActivity) {
        this.f$0 = wallpapersListActivity;
    }

    @Override
    public final void didSetNewBackground() {
        this.f$0.removeSelfFromStack();
    }
}
