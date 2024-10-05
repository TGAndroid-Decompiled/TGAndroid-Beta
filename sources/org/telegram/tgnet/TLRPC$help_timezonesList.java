package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$help_timezonesList extends TLObject {
    public int hash;
    public ArrayList timezones = new ArrayList();

    public static TLRPC$help_timezonesList TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$help_timezonesList tLRPC$help_timezonesList = i != -1761146676 ? i != 2071260529 ? null : new TLRPC$help_timezonesList() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                if (readInt32 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                    }
                } else {
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        this.timezones.add(TLRPC$TL_timezone.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                    }
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(2071260529);
                abstractSerializedData2.writeInt32(481674261);
                int size = this.timezones.size();
                abstractSerializedData2.writeInt32(size);
                for (int i2 = 0; i2 < size; i2++) {
                    ((TLRPC$TL_timezone) this.timezones.get(i2)).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(this.hash);
            }
        } : new TLRPC$help_timezonesList() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1761146676);
            }
        };
        if (tLRPC$help_timezonesList == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in help_timezonesList", Integer.valueOf(i)));
        }
        if (tLRPC$help_timezonesList != null) {
            tLRPC$help_timezonesList.readParams(abstractSerializedData, z);
        }
        return tLRPC$help_timezonesList;
    }
}
