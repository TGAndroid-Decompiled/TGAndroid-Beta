package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_chatlists$chatlist_ChatlistInvite extends TLObject {
    public static TL_chatlists$chatlist_ChatlistInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_chatlists$chatlist_ChatlistInvite tL_chatlists$TL_chatlists_chatlistInviteAlready;
        if (i == -91752871) {
            tL_chatlists$TL_chatlists_chatlistInviteAlready = new TL_chatlists$TL_chatlists_chatlistInviteAlready();
        } else {
            tL_chatlists$TL_chatlists_chatlistInviteAlready = i != 500007837 ? null : new TL_chatlists$TL_chatlists_chatlistInvite();
        }
        if (tL_chatlists$TL_chatlists_chatlistInviteAlready == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in chatlist_ChatlistInvite", Integer.valueOf(i)));
        }
        if (tL_chatlists$TL_chatlists_chatlistInviteAlready != null) {
            tL_chatlists$TL_chatlists_chatlistInviteAlready.readParams(abstractSerializedData, z);
        }
        return tL_chatlists$TL_chatlists_chatlistInviteAlready;
    }
}
