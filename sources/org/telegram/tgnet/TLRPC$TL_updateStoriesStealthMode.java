package org.telegram.tgnet;
public class TLRPC$TL_updateStoriesStealthMode extends TLRPC$Update {
    public static int constructor = 738741697;
    public TLRPC$TL_storiesStealthMode stealth_mode;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.stealth_mode = TLRPC$TL_storiesStealthMode.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.stealth_mode.serializeToStream(abstractSerializedData);
    }
}
