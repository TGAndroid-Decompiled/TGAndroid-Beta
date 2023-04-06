package org.telegram.tgnet;
public class TLRPC$TL_chatlists_getLeaveChatlistSuggestions extends TLObject {
    public static int constructor = -37955820;
    public TLRPC$TL_inputChatlistDialogFilter chatlist;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
        int readInt32 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt32; i2++) {
            TLRPC$Peer TLdeserialize = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return tLRPC$Vector;
            }
            tLRPC$Vector.objects.add(TLdeserialize);
        }
        return tLRPC$Vector;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.chatlist.serializeToStream(abstractSerializedData);
    }
}
