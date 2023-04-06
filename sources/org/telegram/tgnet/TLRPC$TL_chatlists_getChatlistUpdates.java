package org.telegram.tgnet;
public class TLRPC$TL_chatlists_getChatlistUpdates extends TLObject {
    public static int constructor = -1992190687;
    public TLRPC$TL_inputChatlistDialogFilter chatlist;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_chatlists_chatlistUpdates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.chatlist.serializeToStream(abstractSerializedData);
    }
}
