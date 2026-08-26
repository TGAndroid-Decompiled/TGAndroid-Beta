package org.telegram.ui.Components.Premium.boosts;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class BoostRepository$$ExternalSyntheticLambda21 implements Runnable {
    public final int $r8$classId;
    public final TLRPC.Chat f$0;
    public final int f$1;
    public final ArrayList f$2;
    public final Utilities.Callback f$3;

    public BoostRepository$$ExternalSyntheticLambda21(TLRPC.Chat chat, int i, ArrayList arrayList, Utilities.Callback callback, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chat;
        this.f$1 = i;
        this.f$2 = arrayList;
        this.f$3 = callback;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = this.f$2;
                if (this.f$0 == null) {
                    if (BoostRepository.cachedGiftOptions == null) {
                        BoostRepository.cachedGiftOptions = new HashMap();
                    }
                    BoostRepository.cachedGiftOptions.put(Integer.valueOf(this.f$1), new Pair(Long.valueOf(System.currentTimeMillis()), arrayList));
                }
                this.f$3.run(arrayList);
                break;
            default:
                ArrayList arrayList2 = this.f$2;
                if (this.f$0 == null) {
                    if (BoostRepository.cachedGiftOptions == null) {
                        BoostRepository.cachedGiftOptions = new HashMap();
                    }
                    BoostRepository.cachedGiftOptions.put(Integer.valueOf(this.f$1), new Pair(Long.valueOf(System.currentTimeMillis()), arrayList2));
                }
                this.f$3.run(arrayList2);
                break;
        }
    }
}
