package org.telegram.tgnet;

public abstract class TLRPC$Bool extends TLObject {
    public static TLRPC$Bool TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Bool tLRPC$Bool = i != -1720552011 ? i != -1132882121 ? null : new TLRPC$Bool() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1132882121);
            }
        } : new TLRPC$Bool() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1720552011);
            }
        };
        if (tLRPC$Bool == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Bool", Integer.valueOf(i)));
        }
        if (tLRPC$Bool != null) {
            tLRPC$Bool.readParams(abstractSerializedData, z);
        }
        return tLRPC$Bool;
    }
}
