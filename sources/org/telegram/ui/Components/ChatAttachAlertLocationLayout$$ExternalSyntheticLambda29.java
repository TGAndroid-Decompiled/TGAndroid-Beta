package org.telegram.ui.Components;

import android.location.Location;
import androidx.core.util.Consumer;
import org.telegram.messenger.IMapsProvider;

public final class ChatAttachAlertLocationLayout$$ExternalSyntheticLambda29 implements Consumer {
    public final int $r8$classId;
    public final ChatAttachAlertLocationLayout f$0;

    public ChatAttachAlertLocationLayout$$ExternalSyntheticLambda29(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertLocationLayout;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$14((IMapsProvider.IMap) obj);
                break;
            default:
                this.f$0.lambda$onMapInit$24((Location) obj);
                break;
        }
    }
}
