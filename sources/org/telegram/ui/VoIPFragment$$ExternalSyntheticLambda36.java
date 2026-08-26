package org.telegram.ui;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.DeleteMessagesBottomSheet;
import org.telegram.ui.Components.chat.ChatActivityMessageMetricsView;

public final class VoIPFragment$$ExternalSyntheticLambda36 implements Utilities.Callback2 {
    public final int $r8$classId;

    public VoIPFragment$$ExternalSyntheticLambda36(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Boolean bool = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool.booleanValue(), hashSet);
                }
                break;
            case 1:
                int i = DeleteMessagesBottomSheet.$r8$clinit;
                break;
            default:
                RectF rectF = ChatActivityMessageMetricsView.tmpRect;
                break;
        }
    }
}
