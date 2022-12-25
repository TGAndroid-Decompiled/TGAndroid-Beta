package org.telegram.tgnet;

public class TLRPC$TL_autoDownloadSettings extends TLObject {
    public static int constructor = -1896171181;
    public boolean audio_preload_next;
    public boolean disabled;
    public long file_size_max;
    public int flags;
    public boolean phonecalls_less_data;
    public int photo_size_max;
    public boolean video_preload_large;
    public long video_size_max;
    public int video_upload_maxbitrate;

    public static TLRPC$TL_autoDownloadSettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_autoDownloadSettings", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_autoDownloadSettings tLRPC$TL_autoDownloadSettings = new TLRPC$TL_autoDownloadSettings();
        tLRPC$TL_autoDownloadSettings.readParams(abstractSerializedData, z);
        return tLRPC$TL_autoDownloadSettings;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.disabled = (readInt32 & 1) != 0;
        this.video_preload_large = (readInt32 & 2) != 0;
        this.audio_preload_next = (readInt32 & 4) != 0;
        this.phonecalls_less_data = (readInt32 & 8) != 0;
        this.photo_size_max = abstractSerializedData.readInt32(z);
        this.video_size_max = abstractSerializedData.readInt64(z);
        this.file_size_max = abstractSerializedData.readInt64(z);
        this.video_upload_maxbitrate = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.disabled ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.video_preload_large ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.audio_preload_next ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.phonecalls_less_data ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        abstractSerializedData.writeInt32(i4);
        abstractSerializedData.writeInt32(this.photo_size_max);
        abstractSerializedData.writeInt64(this.video_size_max);
        abstractSerializedData.writeInt64(this.file_size_max);
        abstractSerializedData.writeInt32(this.video_upload_maxbitrate);
    }
}
