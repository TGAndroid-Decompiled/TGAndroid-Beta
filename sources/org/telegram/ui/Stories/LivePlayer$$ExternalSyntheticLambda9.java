package org.telegram.ui.Stories;

import com.google.android.exoplayer2.util.Log;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;

public final class LivePlayer$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final long f$2;
    public final int f$3;

    public LivePlayer$$ExternalSyntheticLambda9(int i, int i2, int i3, long j, Object obj) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = j;
        this.f$3 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LivePlayer livePlayer = (LivePlayer) this.f$0;
                livePlayer.getClass();
                int i = this.f$1;
                long j = this.f$2;
                String strM = i == 0 ? Log.m(j, "") : i + "_" + j + "_" + this.f$3;
                HashMap map = livePlayer.currentStreamRequestTimestamp;
                Integer num = (Integer) map.get(strM);
                if (num != null) {
                    AccountInstance.getInstance(livePlayer.currentAccount).getConnectionsManager().cancelRequest(num.intValue(), true);
                    map.remove(strM);
                }
                break;
            default:
                ((VoIPService) this.f$0).lambda$createGroupInstance$76(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
