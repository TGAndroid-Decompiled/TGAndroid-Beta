package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_businessWorkHours extends TLObject {
    public int flags;
    public boolean open_now;
    public String timezone_id;
    public ArrayList<TLRPC$TL_businessWeeklyOpen> weekly_open = new ArrayList<>();

    public static TLRPC$TL_businessWorkHours TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != -1936543592) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_businessWorkHours", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_businessWorkHours tLRPC$TL_businessWorkHours = new TLRPC$TL_businessWorkHours();
        tLRPC$TL_businessWorkHours.readParams(abstractSerializedData, z);
        return tLRPC$TL_businessWorkHours;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.open_now = (readInt32 & 1) != 0;
        this.timezone_id = abstractSerializedData.readString(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
        } else {
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                this.weekly_open.add(TLRPC$TL_businessWeeklyOpen.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1936543592);
        int i = this.open_now ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeString(this.timezone_id);
        abstractSerializedData.writeInt32(481674261);
        int size = this.weekly_open.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.weekly_open.get(i2).serializeToStream(abstractSerializedData);
        }
    }
}
