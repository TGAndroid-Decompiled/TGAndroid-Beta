package org.telegram.ui.Adapters;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;

public final class BaseLocationAdapter$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final LocationActivitySearchAdapter f$0;
    public final String f$1;
    public final Location f$2;

    public BaseLocationAdapter$$ExternalSyntheticLambda2(LocationActivitySearchAdapter locationActivitySearchAdapter, String str, Location location, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivitySearchAdapter;
        this.f$1 = str;
        this.f$2 = location;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LocationActivitySearchAdapter locationActivitySearchAdapter = this.f$0;
                locationActivitySearchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new BaseLocationAdapter$$ExternalSyntheticLambda2(locationActivitySearchAdapter, this.f$1, this.f$2, 1));
                break;
            default:
                LocationActivitySearchAdapter locationActivitySearchAdapter2 = this.f$0;
                locationActivitySearchAdapter2.searchRunnable = null;
                locationActivitySearchAdapter2.lastSearchLocation = null;
                locationActivitySearchAdapter2.searchPlacesWithQuery(this.f$1, this.f$2, true);
                break;
        }
    }
}
