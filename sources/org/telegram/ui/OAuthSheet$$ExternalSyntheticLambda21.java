package org.telegram.ui;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public final class OAuthSheet$$ExternalSyntheticLambda21 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final Serializable f$2;
    public final Object f$3;

    public OAuthSheet$$ExternalSyntheticLambda21(int i, Serializable serializable, Object obj, Object obj2, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = obj;
        this.f$2 = serializable;
        this.f$3 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) this.f$0;
                String str = (String) this.f$2;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$3;
                OAuthSheet.lambda$handle$18(alertDialog, (BottomSheet) this.f$1, str, resourcesProvider, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((ChatActivity) this.f$0).lambda$didPressReaction$467((TLRPC.ChannelParticipant[]) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, (TLRPC.TL_channels_channelParticipant) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((ChatActivity) this.f$0).lambda$createMenu$261((TLRPC.ChannelParticipant[]) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, (TLRPC.TL_channels_channelParticipant) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
