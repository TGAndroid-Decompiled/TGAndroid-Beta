package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_help_peerColorSet extends TLRPC$help_PeerColorSet {
    public ArrayList<Integer> colors = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.colors.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(639736408);
        abstractSerializedData.writeInt32(481674261);
        int size = this.colors.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(this.colors.get(i).intValue());
        }
    }
}
