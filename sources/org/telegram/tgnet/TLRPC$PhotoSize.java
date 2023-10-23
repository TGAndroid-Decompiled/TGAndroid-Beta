package org.telegram.tgnet;

import android.text.TextUtils;
import java.util.ArrayList;
public abstract class TLRPC$PhotoSize extends TLObject {
    public byte[] bytes;
    public int gradientBottomColor;
    public int gradientTopColor;
    public int h;
    public TLRPC$FileLocation location;
    public int size;
    public String type;
    public int w;

    public static TLRPC$PhotoSize TLdeserialize(long j, long j2, long j3, AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PhotoSize tLRPC$TL_photoPathSize;
        switch (i) {
            case -668906175:
                tLRPC$TL_photoPathSize = new TLRPC$TL_photoPathSize();
                break;
            case -525288402:
                tLRPC$TL_photoPathSize = new TLRPC$TL_photoStrippedSize();
                break;
            case -374917894:
                tLRPC$TL_photoPathSize = new TLRPC$TL_photoCachedSize() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.type = abstractSerializedData2.readString(z2);
                        this.location = TLRPC$FileLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.w = abstractSerializedData2.readInt32(z2);
                        this.h = abstractSerializedData2.readInt32(z2);
                        this.bytes = abstractSerializedData2.readByteArray(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-374917894);
                        abstractSerializedData2.writeString(this.type);
                        this.location.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.w);
                        abstractSerializedData2.writeInt32(this.h);
                        abstractSerializedData2.writeByteArray(this.bytes);
                    }
                };
                break;
            case -96535659:
                tLRPC$TL_photoPathSize = new TLRPC$TL_photoSizeProgressive();
                break;
            case 35527382:
                tLRPC$TL_photoPathSize = new TLRPC$TL_photoCachedSize();
                break;
            case 236446268:
                tLRPC$TL_photoPathSize = new TLRPC$TL_photoSizeEmpty();
                break;
            case 1520986705:
                tLRPC$TL_photoPathSize = new TLRPC$TL_photoSizeProgressive() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.type = abstractSerializedData2.readString(z2);
                        this.location = TLRPC$FileLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.w = abstractSerializedData2.readInt32(z2);
                        this.h = abstractSerializedData2.readInt32(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            this.sizes.add(Integer.valueOf(abstractSerializedData2.readInt32(z2)));
                        }
                        if (this.sizes.isEmpty()) {
                            return;
                        }
                        ArrayList<Integer> arrayList = this.sizes;
                        this.size = arrayList.get(arrayList.size() - 1).intValue();
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1520986705);
                        abstractSerializedData2.writeString(this.type);
                        this.location.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.w);
                        abstractSerializedData2.writeInt32(this.h);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.sizes.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            abstractSerializedData2.writeInt32(this.sizes.get(i2).intValue());
                        }
                    }
                };
                break;
            case 1976012384:
                tLRPC$TL_photoPathSize = new TLRPC$TL_photoSize();
                break;
            case 2009052699:
                tLRPC$TL_photoPathSize = new TLRPC$TL_photoSize_layer127();
                break;
            default:
                tLRPC$TL_photoPathSize = null;
                break;
        }
        if (tLRPC$TL_photoPathSize == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PhotoSize", Integer.valueOf(i)));
        }
        if (tLRPC$TL_photoPathSize != null) {
            tLRPC$TL_photoPathSize.readParams(abstractSerializedData, z);
            if (tLRPC$TL_photoPathSize.location == null) {
                if (!TextUtils.isEmpty(tLRPC$TL_photoPathSize.type) && (j != 0 || j2 != 0 || j3 != 0)) {
                    TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated = new TLRPC$TL_fileLocationToBeDeprecated();
                    tLRPC$TL_photoPathSize.location = tLRPC$TL_fileLocationToBeDeprecated;
                    if (j != 0) {
                        tLRPC$TL_fileLocationToBeDeprecated.volume_id = -j;
                        tLRPC$TL_fileLocationToBeDeprecated.local_id = tLRPC$TL_photoPathSize.type.charAt(0);
                    } else if (j2 != 0) {
                        tLRPC$TL_fileLocationToBeDeprecated.volume_id = -j2;
                        tLRPC$TL_fileLocationToBeDeprecated.local_id = tLRPC$TL_photoPathSize.type.charAt(0) + 1000;
                    } else if (j3 != 0) {
                        tLRPC$TL_fileLocationToBeDeprecated.volume_id = -j3;
                        tLRPC$TL_fileLocationToBeDeprecated.local_id = tLRPC$TL_photoPathSize.type.charAt(0) + 2000;
                    }
                } else {
                    tLRPC$TL_photoPathSize.location = new TLRPC$TL_fileLocationUnavailable();
                }
            }
        }
        return tLRPC$TL_photoPathSize;
    }
}
