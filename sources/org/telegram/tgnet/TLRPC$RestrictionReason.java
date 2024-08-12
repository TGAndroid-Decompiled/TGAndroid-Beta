package org.telegram.tgnet;
public class TLRPC$RestrictionReason extends TLObject {
    public String platform;
    public String reason;
    public String text;

    public static TLRPC$RestrictionReason TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$RestrictionReason tLRPC$RestrictionReason = i != -797791052 ? null : new TLRPC$RestrictionReason() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.platform = abstractSerializedData2.readString(z2);
                this.reason = abstractSerializedData2.readString(z2);
                this.text = abstractSerializedData2.readString(z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-797791052);
                abstractSerializedData2.writeString(this.platform);
                abstractSerializedData2.writeString(this.reason);
                abstractSerializedData2.writeString(this.text);
            }
        };
        if (tLRPC$RestrictionReason == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in RestrictionReason", Integer.valueOf(i)));
        }
        if (tLRPC$RestrictionReason != null) {
            tLRPC$RestrictionReason.readParams(abstractSerializedData, z);
        }
        return tLRPC$RestrictionReason;
    }
}
