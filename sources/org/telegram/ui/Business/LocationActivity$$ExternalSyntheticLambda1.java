package org.telegram.ui.Business;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda16;
import org.telegram.ui.Components.UItem;

public final class LocationActivity$$ExternalSyntheticLambda1 implements Utilities.Callback5, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final LocationActivity f$0;

    public LocationActivity$$ExternalSyntheticLambda1(LocationActivity locationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.processDone$3();
                break;
            case 2:
                this.f$0.lambda$onBackPressed$3$2(alertDialog, i);
                break;
            default:
                LocationActivity locationActivity = this.f$0;
                locationActivity.doneButtonDrawable.animateToProgress(1.0f);
                TLRPC.UserFull userFull = locationActivity.getMessagesController().getUserFull(locationActivity.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                locationActivity.getConnectionsManager().sendRequest(updatebusinesslocation, new LocationActivity$$ExternalSyntheticLambda5(locationActivity, 1));
                break;
        }
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        LocationActivity locationActivity = this.f$0;
        UItem uItem = (UItem) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i = uItem.id;
        if (i != 1 && uItem.view != locationActivity.mapPreviewContainer) {
            if (i == 2) {
                AlertDialog.Builder builder = new AlertDialog.Builder(locationActivity.getParentActivity(), 0, null);
                builder.alertDialog.title = LocaleController.getString(R.string.BusinessLocationClearTitle);
                builder.alertDialog.message = LocaleController.getString(R.string.BusinessLocationClearMessage);
                builder.setPositiveButton(LocaleController.getString(R.string.Remove), new LocationActivity$$ExternalSyntheticLambda1(locationActivity, 3));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                locationActivity.showDialog(builder.alertDialog);
                return;
            }
            return;
        }
        if (locationActivity.geo != null && uItem.view != locationActivity.mapPreviewContainer) {
            locationActivity.geo = null;
            locationActivity.listView.adapter.update(true);
            return;
        }
        org.telegram.ui.LocationActivity locationActivity2 = new org.telegram.ui.LocationActivity(8);
        if (locationActivity.geo != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = locationActivity.address;
            tL_channelLocation.geo_point = locationActivity.geo;
            locationActivity2.initialLocation = tL_channelLocation;
        }
        locationActivity2.delegate = new ArticleViewer$$ExternalSyntheticLambda16(22, locationActivity, locationActivity2);
        if (locationActivity.geo != null || TextUtils.isEmpty(locationActivity.address)) {
            locationActivity.presentFragment(locationActivity2);
            return;
        }
        AlertDialog alertDialog = new AlertDialog(locationActivity.getParentActivity(), 3, null);
        alertDialog.canCacnel = false;
        AndroidUtilities.cancelRunOnUIThread(alertDialog.showRunnable);
        AndroidUtilities.runOnUIThread(alertDialog.showRunnable, 200L);
        Utilities.searchQueue.postRunnable(new LocationActivity$$ExternalSyntheticLambda8(locationActivity, locationActivity2, alertDialog));
    }
}
