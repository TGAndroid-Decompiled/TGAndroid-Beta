package org.telegram.ui;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class CastSync$$ExternalSyntheticLambda1 implements PendingResult.StatusListener {
    public final int $r8$classId;

    public CastSync$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onComplete(Status status) {
        switch (this.$r8$classId) {
            case 0:
                CastSync.pending.decrementAndGet();
                break;
            case 1:
                CastSync.pending.decrementAndGet();
                break;
            case 2:
                CastSync.pending.decrementAndGet();
                break;
            case 3:
                CastSync.pending.decrementAndGet();
                break;
            default:
                CastSync.pending.decrementAndGet();
                break;
        }
    }
}
