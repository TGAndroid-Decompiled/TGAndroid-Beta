package org.telegram.ui.Adapters;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class DialogsAdapter$$ExternalSyntheticLambda0 implements Comparator {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final int f$1;

    public DialogsAdapter$$ExternalSyntheticLambda0(MessagesController messagesController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesController;
        this.f$1 = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj;
        TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) obj2;
        switch (this.$r8$classId) {
            case 0:
                return DialogsAdapter.lambda$sortOnlineContacts$0(this.f$0, this.f$1, tL_contact, tL_contact2);
            default:
                return ContactsAdapter.lambda$sortOnlineContacts$0(this.f$0, this.f$1, tL_contact, tL_contact2);
        }
    }
}
