package org.telegram.tgnet;

public abstract class TLRPC$InputPhoto extends TLObject {
    public long access_hash;
    public byte[] file_reference;
    public long id;

    public static TLRPC$InputPhoto TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputPhoto tLRPC$InputPhoto;
        if (i != 483901197) {
            tLRPC$InputPhoto = i != 1001634122 ? null : new TLRPC$TL_inputPhoto();
        } else {
            tLRPC$InputPhoto = new TLRPC$TL_inputPhotoEmpty();
        }
        if (tLRPC$InputPhoto != null || !z) {
            if (tLRPC$InputPhoto != null) {
                tLRPC$InputPhoto.readParams(abstractSerializedData, z);
            }
            return tLRPC$InputPhoto;
        }
        throw new RuntimeException(String.format("can't parse magic %x in InputPhoto", Integer.valueOf(i)));
    }
}
