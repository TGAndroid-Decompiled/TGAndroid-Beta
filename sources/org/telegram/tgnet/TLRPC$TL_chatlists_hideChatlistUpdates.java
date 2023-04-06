package org.telegram.tgnet;
public class TLRPC$TL_chatlists_hideChatlistUpdates extends TLObject {
    public static int constructor = 1726252795;
    public TLRPC$TL_inputChatlistDialogFilter chatlist;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.chatlist.serializeToStream(abstractSerializedData);
    }
}
