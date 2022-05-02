package org.telegram.tgnet;

public class TLRPC$TL_jsonNull extends TLRPC$JSONValue {
    public static int constructor = 1064139624;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
