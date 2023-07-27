package org.telegram.tgnet;
public class TLRPC$TL_contacts_toggleStoriesHidden extends TLObject {
    public static int constructor = 1967110245;
    public boolean hidden;
    public TLRPC$InputUser id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.hidden);
    }
}
