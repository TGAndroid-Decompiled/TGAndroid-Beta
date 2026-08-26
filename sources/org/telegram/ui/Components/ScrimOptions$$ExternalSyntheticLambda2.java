package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLink;

public final class ScrimOptions$$ExternalSyntheticLambda2 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ScrimOptions$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((ScrimOptions) this.f$0).lambda$prepareBlur$6((View) this.f$1, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 1:
                ((ChatAttachAlert) this.f$0).lambda$new$35((ActionBarMenuSubItem) this.f$1, (Long) obj, (Runnable) obj2);
                break;
            case 2:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$setAttachedMedia$25((PollAttachedMediaLink) this.f$1, (TLRPC.WebPage) obj, (TLObject) obj2);
                break;
            case 3:
                ((DialogsBotsAdapter) this.f$0).lambda$searchMessages$6((TLRPC.TL_contacts_search) this.f$1, (TLRPC.TL_contacts_found) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                ((DialogsChannelsAdapter) this.f$0).lambda$searchMessages$3((TLRPC.TL_contacts_search) this.f$1, (TLRPC.TL_contacts_found) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((TranslateAlert2) this.f$0).lambda$translate$3((TLRPC.TL_textWithEntities) this.f$1, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
