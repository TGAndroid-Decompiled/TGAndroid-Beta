package org.telegram.ui;

import org.telegram.ui.ActionBar.Theme;
public final class ThemePreviewActivity$$ExternalSyntheticLambda20 implements Runnable {
    public static final ThemePreviewActivity$$ExternalSyntheticLambda20 INSTANCE = new ThemePreviewActivity$$ExternalSyntheticLambda20();

    private ThemePreviewActivity$$ExternalSyntheticLambda20() {
    }

    @Override
    public final void run() {
        Theme.setChangingWallpaper(false);
    }
}
