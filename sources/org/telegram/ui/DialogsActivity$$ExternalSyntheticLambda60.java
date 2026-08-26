package org.telegram.ui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class DialogsActivity$$ExternalSyntheticLambda60 implements Utilities.Callback {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Serializable f$1;
    public final Object f$2;
    public final Object f$3;

    public DialogsActivity$$ExternalSyntheticLambda60(int i, Serializable serializable, Object obj, Object obj2, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = serializable;
        this.f$2 = obj;
        this.f$3 = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((DialogsActivity) this.f$0).lambda$createGroupForThis$67((Long) this.f$1, (ChannelCreateActivity) this.f$2, (BaseFragment) this.f$3, (Runnable) obj);
                break;
            case 1:
                ((ChannelColorActivity) this.f$0).lambda$buttonClick$7((boolean[]) this.f$1, (int[]) this.f$2, (int[]) this.f$3, (TLRPC.TL_error) obj);
                break;
            case 2:
                ((SelectAnimatedEmojiDialog) this.f$0).lambda$search$25((String[]) this.f$1, (String) this.f$2, (LinkedHashSet) this.f$3, (Runnable) obj);
                break;
            default:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.f$0;
                ArrayList arrayList = (ArrayList) this.f$2;
                selectAnimatedEmojiDialog.lambda$search$29((String) this.f$1, arrayList, (HashMap) this.f$3, (Runnable) obj);
                break;
        }
    }
}
