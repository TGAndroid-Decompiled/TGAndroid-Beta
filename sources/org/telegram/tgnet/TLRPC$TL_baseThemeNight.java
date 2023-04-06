package org.telegram.tgnet;
public class TLRPC$TL_baseThemeNight extends TLRPC$BaseTheme {
    public static int constructor = -1212997976;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
