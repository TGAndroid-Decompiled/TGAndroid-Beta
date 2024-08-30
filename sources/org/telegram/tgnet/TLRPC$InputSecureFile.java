package org.telegram.tgnet;

public abstract class TLRPC$InputSecureFile extends TLObject {
    public static TLRPC$InputSecureFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputSecureFile tLRPC$TL_inputSecureFile = i != 859091184 ? i != 1399317950 ? null : new TLRPC$TL_inputSecureFile() : new TLRPC$TL_inputSecureFileUploaded();
        if (tLRPC$TL_inputSecureFile == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputSecureFile", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputSecureFile != null) {
            tLRPC$TL_inputSecureFile.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputSecureFile;
    }
}
