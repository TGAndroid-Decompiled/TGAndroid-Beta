package org.telegram.tgnet;

public class TLRPC$TL_help_peerColorOption extends TLObject {
    public int channel_min_level;
    public int color_id;
    public TLRPC$help_PeerColorSet colors;
    public TLRPC$help_PeerColorSet dark_colors;
    public int flags;
    public int group_min_level;
    public boolean hidden;

    public static TLRPC$TL_help_peerColorOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1377014082 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_help_peerColorOption", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_help_peerColorOption tLRPC$TL_help_peerColorOption = new TLRPC$TL_help_peerColorOption();
        tLRPC$TL_help_peerColorOption.readParams(abstractSerializedData, z);
        return tLRPC$TL_help_peerColorOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.hidden = (readInt32 & 1) != 0;
        this.color_id = abstractSerializedData.readInt32(z);
        if ((this.flags & 2) != 0) {
            this.colors = TLRPC$help_PeerColorSet.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.dark_colors = TLRPC$help_PeerColorSet.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 8) != 0) {
            this.channel_min_level = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 16) != 0) {
            this.group_min_level = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1377014082);
        int i = this.hidden ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.color_id);
        if ((this.flags & 2) != 0) {
            this.colors.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            this.dark_colors.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(this.channel_min_level);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.group_min_level);
        }
    }
}
