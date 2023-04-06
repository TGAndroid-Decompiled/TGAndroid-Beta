package org.telegram.tgnet;
public class TLRPC$TL_chatlists_checkChatlistInvite extends TLObject {
    public static int constructor = 1103171583;
    public String slug;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$chatlist_ChatlistInvite.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.slug);
    }
}
