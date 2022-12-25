package org.telegram.tgnet;

public class TLRPC$TL_folder extends TLObject {
    public static int constructor = -11252123;
    public boolean autofill_new_broadcasts;
    public boolean autofill_new_correspondents;
    public boolean autofill_public_groups;
    public int flags;
    public int f909id;
    public TLRPC$ChatPhoto photo;
    public String title;

    public static TLRPC$TL_folder TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_folder", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_folder tLRPC$TL_folder = new TLRPC$TL_folder();
        tLRPC$TL_folder.readParams(abstractSerializedData, z);
        return tLRPC$TL_folder;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.autofill_new_broadcasts = (readInt32 & 1) != 0;
        this.autofill_public_groups = (readInt32 & 2) != 0;
        this.autofill_new_correspondents = (readInt32 & 4) != 0;
        this.f909id = abstractSerializedData.readInt32(z);
        this.title = abstractSerializedData.readString(z);
        if ((this.flags & 8) != 0) {
            this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.autofill_new_broadcasts ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.autofill_public_groups ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.autofill_new_correspondents ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        abstractSerializedData.writeInt32(this.f909id);
        abstractSerializedData.writeString(this.title);
        if ((this.flags & 8) != 0) {
            this.photo.serializeToStream(abstractSerializedData);
        }
    }
}
