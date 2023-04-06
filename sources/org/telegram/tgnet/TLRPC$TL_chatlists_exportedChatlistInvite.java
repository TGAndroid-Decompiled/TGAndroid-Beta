package org.telegram.tgnet;
public class TLRPC$TL_chatlists_exportedChatlistInvite extends TLObject {
    public static int constructor = 283567014;
    public TLRPC$DialogFilter filter;
    public TLRPC$TL_exportedChatlistInvite invite;

    public static TLRPC$TL_chatlists_exportedChatlistInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_chatlists_exportedChatlistInvite", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_chatlists_exportedChatlistInvite tLRPC$TL_chatlists_exportedChatlistInvite = new TLRPC$TL_chatlists_exportedChatlistInvite();
        tLRPC$TL_chatlists_exportedChatlistInvite.readParams(abstractSerializedData, z);
        return tLRPC$TL_chatlists_exportedChatlistInvite;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.filter = TLRPC$DialogFilter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.invite = TLRPC$TL_exportedChatlistInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.filter.serializeToStream(abstractSerializedData);
        this.invite.serializeToStream(abstractSerializedData);
    }
}
