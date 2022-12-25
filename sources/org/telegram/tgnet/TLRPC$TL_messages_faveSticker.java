package org.telegram.tgnet;

public class TLRPC$TL_messages_faveSticker extends TLObject {
    public static int constructor = -1174420133;
    public TLRPC$InputDocument f941id;
    public boolean unfave;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.f941id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.unfave);
    }
}
