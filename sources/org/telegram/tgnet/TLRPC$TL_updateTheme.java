package org.telegram.tgnet;

public class TLRPC$TL_updateTheme extends TLRPC$Update {
    public static int constructor = -2112423005;
    public TLRPC$Theme theme;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.theme = TLRPC$Theme.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.theme.serializeToStream(abstractSerializedData);
    }
}
