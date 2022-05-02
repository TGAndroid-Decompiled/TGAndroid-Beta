package org.telegram.tgnet;

public class TLRPC$TL_baseThemeArctic extends TLRPC$BaseTheme {
    public static int constructor = 1527845466;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
