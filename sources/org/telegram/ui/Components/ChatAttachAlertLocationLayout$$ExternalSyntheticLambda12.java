package org.telegram.ui.Components;

import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.IMapsProvider;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Adapters.BaseLocationAdapter;

public final class ChatAttachAlertLocationLayout$$ExternalSyntheticLambda12 implements IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, AlertDialog.OnButtonClickListener, IMapsProvider.ITouchInterceptor, BaseLocationAdapter.BaseLocationAdapterDelegate, ActionBarMenuItem.ActionBarMenuItemDelegate {
    public final int $r8$classId;
    public final ChatAttachAlertLocationLayout f$0;

    public ChatAttachAlertLocationLayout$$ExternalSyntheticLambda12(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertLocationLayout;
    }

    @Override
    public void didLoadSearchResult(ArrayList arrayList) {
        switch (this.$r8$classId) {
            case 4:
                this.f$0.lambda$new$17(arrayList);
                break;
            default:
                this.f$0.updatePlacesMarkers(arrayList);
                break;
        }
    }

    @Override
    public void onCameraMoveStarted(int i) {
        this.f$0.lambda$onMapInit$22(i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$onMapInit$28(alertDialog, i);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        switch (this.$r8$classId) {
            case 3:
                return this.f$0.lambda$new$11(motionEvent, iCallableMethod);
            default:
                return this.f$0.lambda$new$10(motionEvent, iCallableMethod);
        }
    }

    @Override
    public void onItemClick(int i) {
        this.f$0.lambda$new$2(i);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        return this.f$0.lambda$onMapInit$25(iMarker);
    }
}
