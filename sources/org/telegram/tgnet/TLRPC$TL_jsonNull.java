package org.telegram.tgnet;

public class TLRPC$TL_jsonNull extends TLRPC$JSONValue {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1064139624);
    }
}
