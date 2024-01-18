package org.telegram.tgnet;
public class TLRPC$TL_globalPrivacySettings extends TLObject {
    public boolean archive_and_mute_new_noncontact_peers;
    public int flags;
    public boolean hide_read_marks;
    public boolean keep_archived_folders;
    public boolean keep_archived_unmuted;
    public boolean new_noncontact_peers_require_premium;

    public static TLRPC$TL_globalPrivacySettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1934380235 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_globalPrivacySettings", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_globalPrivacySettings tLRPC$TL_globalPrivacySettings = new TLRPC$TL_globalPrivacySettings();
        tLRPC$TL_globalPrivacySettings.readParams(abstractSerializedData, z);
        return tLRPC$TL_globalPrivacySettings;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.archive_and_mute_new_noncontact_peers = (readInt32 & 1) != 0;
        this.keep_archived_unmuted = (readInt32 & 2) != 0;
        this.keep_archived_folders = (readInt32 & 4) != 0;
        this.hide_read_marks = (readInt32 & 8) != 0;
        this.new_noncontact_peers_require_premium = (readInt32 & 16) != 0;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1934380235);
        int i = this.archive_and_mute_new_noncontact_peers ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.keep_archived_unmuted ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.keep_archived_folders ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.hide_read_marks ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.new_noncontact_peers_require_premium ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        abstractSerializedData.writeInt32(i5);
    }
}
