package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_channelAdminLogEventActionChangeAvailableReactions extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = -1661470870;
    public ArrayList<String> prev_value = new ArrayList<>();
    public ArrayList<String> new_value = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 == 481674261) {
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                this.prev_value.add(abstractSerializedData.readString(z));
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 == 481674261) {
                int readInt324 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt324; i2++) {
                    this.new_value.add(abstractSerializedData.readString(z));
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
        } else if (z) {
            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(481674261);
        int size = this.prev_value.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeString(this.prev_value.get(i));
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.new_value.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            abstractSerializedData.writeString(this.new_value.get(i2));
        }
    }
}
