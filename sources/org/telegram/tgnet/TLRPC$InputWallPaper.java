package org.telegram.tgnet;

public abstract class TLRPC$InputWallPaper extends TLObject {
    public static TLRPC$InputWallPaper TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputWallPaper tLRPC$TL_inputWallPaperSlug = i != -1770371538 ? i != -433014407 ? i != 1913199744 ? null : new TLRPC$TL_inputWallPaperSlug() : new TLRPC$TL_inputWallPaper() : new TLRPC$TL_inputWallPaperNoFile();
        if (tLRPC$TL_inputWallPaperSlug == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputWallPaper", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputWallPaperSlug != null) {
            tLRPC$TL_inputWallPaperSlug.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputWallPaperSlug;
    }
}
