package org.telegram.ui;

import android.location.Location;
import androidx.core.util.Consumer;
import org.telegram.messenger.IMapsProvider;

public final class LocationActivity$$ExternalSyntheticLambda9 implements Consumer {
    public final int $r8$classId;
    public final LocationActivity f$0;

    public LocationActivity$$ExternalSyntheticLambda9(LocationActivity locationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onMapInit$38((Location) obj);
                break;
            default:
                this.f$0.lambda$createView$23((IMapsProvider.IMap) obj);
                break;
        }
    }
}
