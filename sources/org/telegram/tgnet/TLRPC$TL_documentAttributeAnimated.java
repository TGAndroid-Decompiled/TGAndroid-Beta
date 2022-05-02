package org.telegram.tgnet;

public class TLRPC$TL_documentAttributeAnimated extends TLRPC$DocumentAttribute {
    public static int constructor = 297109817;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
