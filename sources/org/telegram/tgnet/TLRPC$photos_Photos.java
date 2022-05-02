package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$photos_Photos extends TLObject {
    public int count;
    public ArrayList<TLRPC$Photo> photos = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$photos_Photos TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$photos_Photos tLRPC$photos_Photos;
        if (i != -1916114267) {
            tLRPC$photos_Photos = i != 352657236 ? null : new TLRPC$photos_Photos() {
                public static int constructor = 352657236;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.count = abstractSerializedData2.readInt32(z2);
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 == 481674261) {
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$Photo TLdeserialize = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize != null) {
                                this.photos.add(TLdeserialize);
                            } else {
                                return;
                            }
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        if (readInt323 == 481674261) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt324; i3++) {
                                TLRPC$User TLdeserialize2 = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 != null) {
                                    this.users.add(TLdeserialize2);
                                } else {
                                    return;
                                }
                            }
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                        }
                    } else if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(this.count);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.photos.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.photos.get(i2).serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size2 = this.users.size();
                    abstractSerializedData2.writeInt32(size2);
                    for (int i3 = 0; i3 < size2; i3++) {
                        this.users.get(i3).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        } else {
            tLRPC$photos_Photos = new TLRPC$TL_photos_photos();
        }
        if (tLRPC$photos_Photos != null || !z) {
            if (tLRPC$photos_Photos != null) {
                tLRPC$photos_Photos.readParams(abstractSerializedData, z);
            }
            return tLRPC$photos_Photos;
        }
        throw new RuntimeException(String.format("can't parse magic %x in photos_Photos", Integer.valueOf(i)));
    }
}
