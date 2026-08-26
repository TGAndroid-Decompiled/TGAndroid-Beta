package org.telegram.ui.Components;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;

public final class GroupVoipInviteAlert$$ExternalSyntheticLambda1 implements Comparator {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public GroupVoipInviteAlert$$ExternalSyntheticLambda1(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        switch (this.$r8$classId) {
            case 0:
                return ((GroupVoipInviteAlert) this.f$0).lambda$loadChatParticipants$2(this.f$1, tLObject, tLObject2);
            default:
                return GroupVoipInviteAlert.lambda$fillContacts$1((MessagesController) this.f$0, this.f$1, tLObject, tLObject2);
        }
    }
}
