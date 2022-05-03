package org.telegram.tgnet;

public class TLRPC$TL_folder extends TLObject {
    public static int constructor = -11252123;
    public boolean autofill_new_broadcasts;
    public boolean autofill_new_correspondents;
    public boolean autofill_public_groups;
    public int flags;
    public int id;
    public TLRPC$ChatPhoto photo;
    public String title;

    public static TLRPC$TL_folder TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_folder tLRPC$TL_folder = new TLRPC$TL_folder();
            tLRPC$TL_folder.readParams(abstractSerializedData, z);
            return tLRPC$TL_folder;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_folder", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = false;
        this.autofill_new_broadcasts = (readInt32 & 1) != 0;
        this.autofill_public_groups = (readInt32 & 2) != 0;
        if ((readInt32 & 4) != 0) {
            z2 = true;
        }
        this.autofill_new_correspondents = z2;
        this.id = abstractSerializedData.readInt32(z);
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
        abstractSerializedData.writeInt32(this.id);
        abstractSerializedData.writeString(this.title);
        if ((this.flags & 8) != 0) {
            this.photo.serializeToStream(abstractSerializedData);
        }
    }
}
