package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_messages_dialogFilters extends TLObject {
    public ArrayList<TLRPC$DialogFilter> filters = new ArrayList<>();
    public int flags;
    public boolean tags_enabled;

    public static TLRPC$TL_messages_dialogFilters TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (718878489 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_dialogFilters", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_dialogFilters tLRPC$TL_messages_dialogFilters = new TLRPC$TL_messages_dialogFilters();
        tLRPC$TL_messages_dialogFilters.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_dialogFilters;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.tags_enabled = (readInt32 & 1) != 0;
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$DialogFilter TLdeserialize = TLRPC$DialogFilter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.filters.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(718878489);
        int i = this.tags_enabled ? this.flags | 1 : this.flags & 1;
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(481674261);
        int size = this.filters.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.filters.get(i2).serializeToStream(abstractSerializedData);
        }
    }
}
