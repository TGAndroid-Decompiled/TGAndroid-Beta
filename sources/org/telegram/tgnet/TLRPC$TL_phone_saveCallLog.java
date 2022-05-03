package org.telegram.tgnet;

public class TLRPC$TL_phone_saveCallLog extends TLObject {
    public static int constructor = 1092913030;
    public TLRPC$InputFile file;
    public TLRPC$TL_inputPhoneCall peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        this.file.serializeToStream(abstractSerializedData);
    }
}
