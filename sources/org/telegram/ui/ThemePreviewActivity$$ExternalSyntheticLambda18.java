package org.telegram.ui;

import org.telegram.ui.ActionBar.Theme;
public final class ThemePreviewActivity$$ExternalSyntheticLambda18 implements Runnable {
    public static final ThemePreviewActivity$$ExternalSyntheticLambda18 INSTANCE = new ThemePreviewActivity$$ExternalSyntheticLambda18();

    private ThemePreviewActivity$$ExternalSyntheticLambda18() {
    }

    @Override
    public final void run() {
        Theme.setChangingWallpaper(false);
    }
}
