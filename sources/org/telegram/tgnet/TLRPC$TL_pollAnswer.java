package org.telegram.tgnet;

public class TLRPC$TL_pollAnswer extends TLRPC$PollAnswer {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$TL_textWithEntities.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.option = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-15277366);
        this.text.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeByteArray(this.option);
    }
}
