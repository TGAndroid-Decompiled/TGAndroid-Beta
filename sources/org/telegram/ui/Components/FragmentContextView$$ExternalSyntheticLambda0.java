package org.telegram.ui.Components;

import java.util.ArrayList;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.DialogsActivity;

public final class FragmentContextView$$ExternalSyntheticLambda0 implements ReplaceAnimator.Callback, AlertDialog.OnButtonClickListener, SharingLocationsAlert.SharingLocationsAlertDelegate, ActionBarMenuItem.ActionBarMenuItemDelegate {
    public final FragmentContextView f$0;

    public FragmentContextView$$ExternalSyntheticLambda0(FragmentContextView fragmentContextView) {
        this.f$0 = fragmentContextView;
    }

    @Override
    public void didSelectLocation(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.f$0.openSharingLocation(sharingLocationInfo);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        FragmentContextView fragmentContextView = this.f$0;
        BaseFragment baseFragment = fragmentContextView.fragment;
        if (!(baseFragment instanceof DialogsActivity)) {
            LocationController.getInstance(baseFragment.getCurrentAccount()).removeSharingLocation(fragmentContextView.chatActivity.getDialogId());
            return;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            LocationController.getInstance(i2).removeAllLocationSharings();
        }
    }

    @Override
    public void onForceApplyChanges() {
    }

    @Override
    public void onItemChanged$1(ReplaceAnimator replaceAnimator) {
        FragmentContextView fragmentContextView = this.f$0;
        ReplaceAnimator replaceAnimator2 = fragmentContextView.callMessagesAnimator;
        float f = 1.0f - replaceAnimator2.list.metadata.totalVisibility.now;
        fragmentContextView.titleTextView.setAlpha(f);
        fragmentContextView.titleTextView.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f));
        fragmentContextView.titleTextView.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f));
        ArrayList arrayList = replaceAnimator2.list.entries;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAnimator.Entry entry = (ListAnimator.Entry) obj;
            float fLerp = AndroidUtilities.lerp(0.7f, 1.0f, entry.getVisibility());
            FragmentContextView.CallMessageItem callMessageItem = (FragmentContextView.CallMessageItem) entry.item;
            callMessageItem.cell.setAlpha(entry.getVisibility());
            callMessageItem.cell.setScaleX(fLerp);
            callMessageItem.cell.setScaleY(fLerp);
        }
    }

    @Override
    public void onItemClick(int i) {
        FragmentContextView fragmentContextView = this.f$0;
        fragmentContextView.getClass();
        if (i >= 0) {
            float[] fArr = FragmentContextView.speeds;
            if (i >= 6) {
                return;
            }
            float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.isMusic);
            float f = fArr[i];
            MediaController.getInstance().setPlaybackSpeed(fragmentContextView.isMusic, f);
            if (playbackSpeed != f) {
                fragmentContextView.playbackSpeedChanged(playbackSpeed, f, false);
            }
        }
    }
}
