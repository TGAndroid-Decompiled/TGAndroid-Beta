package org.telegram.tgnet;
public abstract class TLRPC$InputWallPaper extends TLObject {
    public static TLRPC$InputWallPaper TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputWallPaper tLRPC$TL_inputWallPaperNoFile;
        if (i == -1770371538) {
            tLRPC$TL_inputWallPaperNoFile = new TLRPC$TL_inputWallPaperNoFile();
        } else if (i == -433014407) {
            tLRPC$TL_inputWallPaperNoFile = new TLRPC$TL_inputWallPaper();
        } else {
            tLRPC$TL_inputWallPaperNoFile = i != 1913199744 ? null : new TLRPC$TL_inputWallPaperSlug();
        }
        if (tLRPC$TL_inputWallPaperNoFile == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputWallPaper", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputWallPaperNoFile != null) {
            tLRPC$TL_inputWallPaperNoFile.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputWallPaperNoFile;
    }
}
