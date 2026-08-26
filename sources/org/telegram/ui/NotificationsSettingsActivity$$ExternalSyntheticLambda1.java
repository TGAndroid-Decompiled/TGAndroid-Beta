package org.telegram.ui;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;

public final class NotificationsSettingsActivity$$ExternalSyntheticLambda1 implements ToDoubleFunction {
    public final int $r8$classId;

    public NotificationsSettingsActivity$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                break;
        }
        return tL_topPeer.rating;
    }
}
