package org.telegram.tgnet;

public class TLRPC$TL_messages_botResults_layer153 extends TLRPC$messages_BotResults {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.gallery = (readInt32 & 1) != 0;
        this.query_id = abstractSerializedData.readInt64(z);
        if ((this.flags & 2) != 0) {
            this.next_offset = abstractSerializedData.readString(z);
        }
        if ((this.flags & 4) != 0) {
            this.switch_pm = TLRPC$TL_inlineBotSwitchPM.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$BotInlineResult TLdeserialize = TLRPC$BotInlineResult.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.results.add(TLdeserialize);
        }
        this.cache_time = abstractSerializedData.readInt32(z);
        int readInt324 = abstractSerializedData.readInt32(z);
        if (readInt324 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
            }
            return;
        }
        int readInt325 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt325; i2++) {
            TLRPC$User TLdeserialize2 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize2 == null) {
                return;
            }
            this.users.add(TLdeserialize2);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1803769784);
        int i = this.gallery ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.query_id);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.next_offset);
        }
        if ((this.flags & 4) != 0) {
            this.switch_pm.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.results.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.results.get(i2).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.cache_time);
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.users.size();
        abstractSerializedData.writeInt32(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            this.users.get(i3).serializeToStream(abstractSerializedData);
        }
    }
}
