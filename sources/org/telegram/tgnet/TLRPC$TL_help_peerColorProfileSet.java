package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_help_peerColorProfileSet extends TLRPC$help_PeerColorSet {
    public ArrayList palette_colors = new ArrayList();
    public ArrayList bg_colors = new ArrayList();
    public ArrayList story_colors = new ArrayList();

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
            this.palette_colors.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        if (readInt323 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
            return;
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt324; i2++) {
            this.bg_colors.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
        }
        int readInt325 = abstractSerializedData.readInt32(z);
        if (readInt325 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
            }
        } else {
            int readInt326 = abstractSerializedData.readInt32(z);
            for (int i3 = 0; i3 < readInt326; i3++) {
                this.story_colors.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1987928555);
        abstractSerializedData.writeInt32(481674261);
        int size = this.palette_colors.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(((Integer) this.palette_colors.get(i)).intValue());
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.bg_colors.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            abstractSerializedData.writeInt32(((Integer) this.bg_colors.get(i2)).intValue());
        }
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.story_colors.size();
        abstractSerializedData.writeInt32(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            abstractSerializedData.writeInt32(((Integer) this.story_colors.get(i3)).intValue());
        }
    }
}
