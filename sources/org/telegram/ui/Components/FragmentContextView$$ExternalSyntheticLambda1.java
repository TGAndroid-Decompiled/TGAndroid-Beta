package org.telegram.ui.Components;

import org.telegram.messenger.LocationController;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;

public final class FragmentContextView$$ExternalSyntheticLambda1 implements AlertDialog.OnButtonClickListener, ActionBarMenuItem.ActionBarMenuItemDelegate, SharingLocationsAlert.SharingLocationsAlertDelegate {
    public final FragmentContextView f$0;

    public FragmentContextView$$ExternalSyntheticLambda1(FragmentContextView fragmentContextView) {
        this.f$0 = fragmentContextView;
    }

    @Override
    public void didSelectLocation(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.f$0.openSharingLocation(sharingLocationInfo);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$checkCreateView$5(alertDialog, i);
    }

    @Override
    public void onItemClick(int i) {
        this.f$0.lambda$createPlaybackSpeedButton$9(i);
    }
}
