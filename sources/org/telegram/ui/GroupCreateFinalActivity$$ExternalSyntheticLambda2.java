package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AutoDeletePopupWrapper;
import org.telegram.ui.Components.RecyclerListView;

public final class GroupCreateFinalActivity$$ExternalSyntheticLambda2 implements RecyclerListView.OnItemClickListenerExtended, LocationActivity.LocationActivityDelegate {
    public final GroupCreateFinalActivity f$0;

    public GroupCreateFinalActivity$$ExternalSyntheticLambda2(GroupCreateFinalActivity groupCreateFinalActivity) {
        this.f$0 = groupCreateFinalActivity;
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        GroupCreateFinalActivity groupCreateFinalActivity = this.f$0;
        double d = messageMedia.geo.lat;
        Location location = groupCreateFinalActivity.currentGroupCreateLocation;
        location.setLatitude(d);
        location.setLongitude(messageMedia.geo._long);
        groupCreateFinalActivity.currentGroupCreateAddress = messageMedia.address;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        GroupCreateFinalActivity groupCreateFinalActivity = this.f$0;
        if (view instanceof TextSettingsCell) {
            if (!AndroidUtilities.isMapsInstalled(groupCreateFinalActivity)) {
                return;
            }
            LocationActivity locationActivity = new LocationActivity(4);
            locationActivity.dialogId = 0L;
            locationActivity.delegate = new GroupCreateFinalActivity$$ExternalSyntheticLambda2(groupCreateFinalActivity);
            groupCreateFinalActivity.presentFragment(locationActivity);
        }
        if (!(view instanceof TextCell) || groupCreateFinalActivity.chatType == 5) {
            return;
        }
        ActionBarPopupWindow actionBarPopupWindow = groupCreateFinalActivity.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            AutoDeletePopupWrapper autoDeletePopupWrapper = new AutoDeletePopupWrapper(groupCreateFinalActivity.getParentActivity(), null, new PhotoViewer.AnonymousClass18(groupCreateFinalActivity, 21), true, 1, null);
            autoDeletePopupWrapper.updateItems(groupCreateFinalActivity.ttlPeriod);
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = autoDeletePopupWrapper.windowLayout;
            ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(actionBarPopupWindowLayout);
            groupCreateFinalActivity.popupWindow = actionBarPopupWindow2;
            actionBarPopupWindow2.pauseNotifications = true;
            actionBarPopupWindow2.dismissAnimationDuration = 220;
            actionBarPopupWindow2.setOutsideTouchable(true);
            groupCreateFinalActivity.popupWindow.setClippingEnabled(true);
            groupCreateFinalActivity.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
            groupCreateFinalActivity.popupWindow.setFocusable(true);
            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            groupCreateFinalActivity.popupWindow.setInputMethodMode(2);
            groupCreateFinalActivity.popupWindow.getContentView().setFocusableInTouchMode(true);
            groupCreateFinalActivity.popupWindow.showAtLocation(groupCreateFinalActivity.getFragmentView(), 0, (int) (view.getX() + f), (int) ((actionBarPopupWindowLayout.getMeasuredHeight() / 2.0f) + view.getY() + f2));
            groupCreateFinalActivity.popupWindow.dimBehind(0.2f);
        }
    }
}
