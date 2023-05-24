package org.telegram.ui;

import org.telegram.ui.ThemePreviewActivity;
public final class WallpapersListActivity$$ExternalSyntheticLambda8 implements ThemePreviewActivity.WallpaperActivityDelegate {
    public final WallpapersListActivity f$0;

    @Override
    public final void didSetNewBackground() {
        this.f$0.removeSelfFromStack();
    }
}
