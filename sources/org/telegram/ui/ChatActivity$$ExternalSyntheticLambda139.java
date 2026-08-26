package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;

public final class ChatActivity$$ExternalSyntheticLambda139 implements ToIntFunction {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda139(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((Integer) ((HashMap) this.f$0).get((View) obj)).intValue();
            default:
                return ProfileActivity.lambda$updateOnlineCount$100((ArrayList) this.f$0, obj);
        }
    }
}
