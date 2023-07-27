package org.telegram.tgnet;
public class TLRPC$TL_globalPrivacySettings extends TLObject {
    public static int constructor = 1934380235;
    public boolean archive_and_mute_new_noncontact_peers;
    public int flags;
    public boolean keep_archived_folders;
    public boolean keep_archived_unmuted;

    public static TLRPC$TL_globalPrivacySettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
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
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.archive_and_mute_new_noncontact_peers ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.keep_archived_unmuted ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.keep_archived_folders ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
    }
}
