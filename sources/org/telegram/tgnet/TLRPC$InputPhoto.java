package org.telegram.tgnet;

public abstract class TLRPC$InputPhoto extends TLObject {
    public long access_hash;
    public byte[] file_reference;
    public long f879id;

    public static TLRPC$InputPhoto TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputPhoto tLRPC$TL_inputPhotoEmpty;
        if (i == 483901197) {
            tLRPC$TL_inputPhotoEmpty = new TLRPC$TL_inputPhotoEmpty();
        } else {
            tLRPC$TL_inputPhotoEmpty = i != 1001634122 ? null : new TLRPC$TL_inputPhoto();
        }
        if (tLRPC$TL_inputPhotoEmpty == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputPhoto", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputPhotoEmpty != null) {
            tLRPC$TL_inputPhotoEmpty.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputPhotoEmpty;
    }
}
