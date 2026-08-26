package org.telegram.ui.Adapters;

import android.location.Location;

public final class BaseLocationAdapter$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final BaseLocationAdapter f$0;
    public final String f$1;
    public final Location f$2;

    public BaseLocationAdapter$$ExternalSyntheticLambda2(BaseLocationAdapter baseLocationAdapter, String str, Location location, int i) {
        this.$r8$classId = i;
        this.f$0 = baseLocationAdapter;
        this.f$1 = str;
        this.f$2 = location;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$searchDelayed$0(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$searchDelayed$1(this.f$1, this.f$2);
                break;
        }
    }
}
