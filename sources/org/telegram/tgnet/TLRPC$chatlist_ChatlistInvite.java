package org.telegram.tgnet;
public abstract class TLRPC$chatlist_ChatlistInvite extends TLObject {
    public static TLRPC$chatlist_ChatlistInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$chatlist_ChatlistInvite tLRPC$TL_chatlists_chatlistInviteAlready;
        if (i == -91752871) {
            tLRPC$TL_chatlists_chatlistInviteAlready = new TLRPC$TL_chatlists_chatlistInviteAlready();
        } else {
            tLRPC$TL_chatlists_chatlistInviteAlready = i != 500007837 ? null : new TLRPC$TL_chatlists_chatlistInvite();
        }
        if (tLRPC$TL_chatlists_chatlistInviteAlready == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in chatlist_ChatlistInvite", Integer.valueOf(i)));
        }
        if (tLRPC$TL_chatlists_chatlistInviteAlready != null) {
            tLRPC$TL_chatlists_chatlistInviteAlready.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_chatlists_chatlistInviteAlready;
    }
}
