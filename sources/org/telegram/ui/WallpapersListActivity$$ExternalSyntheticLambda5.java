package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class WallpapersListActivity$$ExternalSyntheticLambda5 implements AlertDialog.OnButtonClickListener, ThemePreviewActivity.WallpaperActivityDelegate {
    public final WallpapersListActivity f$0;

    public WallpapersListActivity$$ExternalSyntheticLambda5(WallpapersListActivity wallpapersListActivity) {
        this.f$0 = wallpapersListActivity;
    }

    @Override
    public void didSetNewBackground(TLRPC.TL_wallPaper tL_wallPaper) {
        this.f$0.lambda$onItemClick$5(tL_wallPaper);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$createView$3$21();
    }
}
