package org.telegram.tgnet;

public abstract class TLRPC$MessageExtendedMedia extends TLObject {
    public String attachPath;
    public float downloadProgress;
    public float uploadProgress;

    public static TLRPC$MessageExtendedMedia TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MessageExtendedMedia tLRPC$TL_messageExtendedMedia = i != -1386050360 ? i != -297296796 ? null : new TLRPC$TL_messageExtendedMedia() : new TLRPC$TL_messageExtendedMediaPreview();
        if (tLRPC$TL_messageExtendedMedia == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MessageExtendedMedia", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messageExtendedMedia != null) {
            tLRPC$TL_messageExtendedMedia.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messageExtendedMedia;
    }
}
