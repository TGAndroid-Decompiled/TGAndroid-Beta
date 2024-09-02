package org.telegram.tgnet;

public class TLRPC$MessageExtendedMedia extends TLObject {
    public String attachPath;
    public float downloadProgress;
    public float uploadProgress;

    public static TLRPC$MessageExtendedMedia TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MessageExtendedMedia tLRPC$TL_messageExtendedMediaPreview;
        if (i == -1386050360) {
            tLRPC$TL_messageExtendedMediaPreview = new TLRPC$TL_messageExtendedMediaPreview();
        } else {
            tLRPC$TL_messageExtendedMediaPreview = i != -297296796 ? null : new TLRPC$TL_messageExtendedMedia();
        }
        if (tLRPC$TL_messageExtendedMediaPreview == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MessageExtendedMedia", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messageExtendedMediaPreview != null) {
            tLRPC$TL_messageExtendedMediaPreview.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messageExtendedMediaPreview;
    }
}
