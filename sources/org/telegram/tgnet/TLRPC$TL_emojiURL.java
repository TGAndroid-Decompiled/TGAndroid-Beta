package org.telegram.tgnet;
public class TLRPC$TL_emojiURL extends TLObject {
    public static int constructor = -1519029347;
    public String url;

    public static TLRPC$TL_emojiURL TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_emojiURL", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_emojiURL tLRPC$TL_emojiURL = new TLRPC$TL_emojiURL();
        tLRPC$TL_emojiURL.readParams(abstractSerializedData, z);
        return tLRPC$TL_emojiURL;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.url);
    }
}
