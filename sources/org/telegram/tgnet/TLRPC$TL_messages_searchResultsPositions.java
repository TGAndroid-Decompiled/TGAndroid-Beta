package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_searchResultsPositions extends TLObject {
    public static int constructor = 1404185519;
    public int count;
    public ArrayList<TLRPC$TL_searchResultPosition> positions = new ArrayList<>();

    public static TLRPC$TL_messages_searchResultsPositions TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_searchResultsPositions", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_searchResultsPositions tLRPC$TL_messages_searchResultsPositions = new TLRPC$TL_messages_searchResultsPositions();
        tLRPC$TL_messages_searchResultsPositions.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_searchResultsPositions;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.count = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_searchResultPosition TLdeserialize = TLRPC$TL_searchResultPosition.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.positions.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.count);
        abstractSerializedData.writeInt32(481674261);
        int size = this.positions.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.positions.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
