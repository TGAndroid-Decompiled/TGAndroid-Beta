package org.telegram.tgnet;

public abstract class TLRPC$InputPhoto extends TLObject {
    public long access_hash;
    public byte[] file_reference;
    public long id;

    public static TLRPC$InputPhoto TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputPhoto tLRPC$TL_inputPhoto = i != 483901197 ? i != 1001634122 ? null : new TLRPC$TL_inputPhoto() : new TLRPC$TL_inputPhotoEmpty();
        if (tLRPC$TL_inputPhoto == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputPhoto", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputPhoto != null) {
            tLRPC$TL_inputPhoto.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputPhoto;
    }
}
