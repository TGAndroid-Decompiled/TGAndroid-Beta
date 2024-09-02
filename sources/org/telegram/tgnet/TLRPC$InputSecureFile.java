package org.telegram.tgnet;

public abstract class TLRPC$InputSecureFile extends TLObject {
    public static TLRPC$InputSecureFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputSecureFile tLRPC$TL_inputSecureFileUploaded;
        if (i == 859091184) {
            tLRPC$TL_inputSecureFileUploaded = new TLRPC$TL_inputSecureFileUploaded();
        } else {
            tLRPC$TL_inputSecureFileUploaded = i != 1399317950 ? null : new TLRPC$TL_inputSecureFile();
        }
        if (tLRPC$TL_inputSecureFileUploaded == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputSecureFile", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputSecureFileUploaded != null) {
            tLRPC$TL_inputSecureFileUploaded.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputSecureFileUploaded;
    }
}
