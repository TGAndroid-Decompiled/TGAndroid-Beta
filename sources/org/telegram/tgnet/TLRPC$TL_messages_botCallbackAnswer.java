package org.telegram.tgnet;

public class TLRPC$TL_messages_botCallbackAnswer extends TLObject {
    public static int constructor = 911761060;
    public boolean alert;
    public int cache_time;
    public int flags;
    public boolean has_url;
    public String message;
    public boolean native_ui;
    public String url;

    public static TLRPC$TL_messages_botCallbackAnswer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_botCallbackAnswer", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_botCallbackAnswer tLRPC$TL_messages_botCallbackAnswer = new TLRPC$TL_messages_botCallbackAnswer();
        tLRPC$TL_messages_botCallbackAnswer.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_botCallbackAnswer;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.alert = (readInt32 & 2) != 0;
        this.has_url = (readInt32 & 8) != 0;
        this.native_ui = (readInt32 & 16) != 0;
        if ((readInt32 & 1) != 0) {
            this.message = abstractSerializedData.readString(z);
        }
        if ((this.flags & 4) != 0) {
            this.url = abstractSerializedData.readString(z);
        }
        this.cache_time = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.alert ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.has_url ? i | 8 : i & (-9);
        this.flags = i2;
        int i3 = this.native_ui ? i2 | 16 : i2 & (-17);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.message);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.url);
        }
        abstractSerializedData.writeInt32(this.cache_time);
    }
}
