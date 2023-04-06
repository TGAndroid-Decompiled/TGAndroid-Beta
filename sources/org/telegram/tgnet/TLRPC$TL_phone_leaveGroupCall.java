package org.telegram.tgnet;
public class TLRPC$TL_phone_leaveGroupCall extends TLObject {
    public static int constructor = 1342404601;
    public TLRPC$TL_inputGroupCall call;
    public int source;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.call.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.source);
    }
}
