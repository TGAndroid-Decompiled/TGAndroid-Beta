package org.telegram.tgnet;
public class TLRPC$TL_baseThemeClassic extends TLRPC$BaseTheme {
    public static int constructor = -1012849566;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
