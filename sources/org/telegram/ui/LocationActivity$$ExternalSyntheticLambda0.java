package org.telegram.ui;

import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.IMapsProvider;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Components.ProximitySheet;

public final class LocationActivity$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener, BaseLocationAdapter.BaseLocationAdapterDelegate, IMapsProvider.ITouchInterceptor, ActionBarMenuItem.ActionBarMenuItemDelegate, ProximitySheet.onRadiusPickerChange, IMapsProvider.OnCameraMoveStartedListener {
    public final int $r8$classId;
    public final LocationActivity f$0;

    public LocationActivity$$ExternalSyntheticLambda0(LocationActivity locationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
    }

    @Override
    public void didLoadSearchResult(ArrayList arrayList) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.updatePlacesMarkers(arrayList);
                break;
            default:
                this.f$0.lambda$createView$26(arrayList);
                break;
        }
    }

    @Override
    public void onCameraMoveStarted(int i) {
        this.f$0.lambda$onMapInit$37(i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showPermissionAlert$42(alertDialog, i);
                break;
            default:
                this.f$0.lambda$checkGpsEnabled$41(alertDialog, i);
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        switch (this.$r8$classId) {
            case 2:
                return this.f$0.lambda$createView$19(motionEvent, iCallableMethod);
            default:
                return this.f$0.lambda$createView$20(motionEvent, iCallableMethod);
        }
    }

    @Override
    public void onItemClick(int i) {
        this.f$0.lambda$createView$3(i);
    }

    @Override
    public boolean run(boolean z, int i) {
        return this.f$0.lambda$openProximityAlert$30(z, i);
    }
}
