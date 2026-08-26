package org.telegram.tgnet;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.DialogsBotsAdapter;
import org.telegram.ui.Components.DialogsChannelsAdapter;
import org.telegram.ui.Components.SlotsDrawable;
import org.telegram.ui.Components.UniversalAdapter;

public final class ConnectionsManager$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final boolean f$3;

    public ConnectionsManager$$ExternalSyntheticLambda12(Object obj, Object obj2, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ConnectionsManager) this.f$0).lambda$cancelRequest$10((Runnable) this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$55((String) this.f$1, this.f$2, this.f$3);
                break;
            case 2:
                ((DialogsBotsAdapter) this.f$0).lambda$searchMessages$5(this.f$2, (TLRPC.TL_messages_searchGlobal) this.f$1, this.f$3);
                break;
            case 3:
                ((DialogsChannelsAdapter) this.f$0).lambda$searchMessages$2(this.f$2, (TLRPC.TL_messages_searchGlobal) this.f$1, this.f$3);
                break;
            default:
                ((SlotsDrawable) this.f$0).lambda$setDiceNumber$8(this.f$3, this.f$2, (ChatMessageCell) this.f$1);
                break;
        }
    }

    public ConnectionsManager$$ExternalSyntheticLambda12(SlotsDrawable slotsDrawable, boolean z, int i, ChatMessageCell chatMessageCell) {
        this.$r8$classId = 4;
        this.f$0 = slotsDrawable;
        this.f$3 = z;
        this.f$2 = i;
        this.f$1 = chatMessageCell;
    }

    public ConnectionsManager$$ExternalSyntheticLambda12(UniversalAdapter universalAdapter, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, int i2) {
        this.$r8$classId = i2;
        this.f$0 = universalAdapter;
        this.f$2 = i;
        this.f$1 = tL_messages_searchGlobal;
        this.f$3 = z;
    }
}
