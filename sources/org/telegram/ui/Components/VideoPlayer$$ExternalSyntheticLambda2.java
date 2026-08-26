package org.telegram.ui.Components;

import com.google.android.exoplayer2.upstream.DataSource;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LocationActivity;

public final class VideoPlayer$$ExternalSyntheticLambda2 implements AlertsCreator.ScheduleDatePickerDelegate, LocationActivity.LocationActivityDelegate, MessagesStorage.BooleanCallback, DataSource.Factory {
    public final Object f$0;
    public final long f$1;

    public VideoPlayer$$ExternalSyntheticLambda2(Object obj, long j) {
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public DataSource createDataSource() {
        return ((VideoPlayer) this.f$0).lambda$mediaSourceFromUri$0(this.f$1);
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        ((ChatAttachAlert) this.f$0).lambda$new$27(this.f$1, z, i, i2);
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        FragmentContextView.lambda$openSharingLocation$14((LocationController.SharingLocationInfo) this.f$0, this.f$1, messageMedia, i, z, i2, j);
    }

    @Override
    public void run(boolean z) {
        ((TopicsTabsView) this.f$0).lambda$onTabLongClick$4(this.f$1, z);
    }
}
