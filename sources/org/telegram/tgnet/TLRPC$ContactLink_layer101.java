package org.telegram.tgnet;

public abstract class TLRPC$ContactLink_layer101 extends TLObject {
    public static TLRPC$ContactLink_layer101 TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ContactLink_layer101 tLRPC$ContactLink_layer101 = i != -721239344 ? i != -17968211 ? i != 1599050311 ? null : new TLRPC$ContactLink_layer101() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(1599050311);
            }
        } : new TLRPC$ContactLink_layer101() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-17968211);
            }
        } : new TLRPC$ContactLink_layer101() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-721239344);
            }
        };
        if (tLRPC$ContactLink_layer101 == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ContactLink", Integer.valueOf(i)));
        }
        if (tLRPC$ContactLink_layer101 != null) {
            tLRPC$ContactLink_layer101.readParams(abstractSerializedData, z);
        }
        return tLRPC$ContactLink_layer101;
    }
}
