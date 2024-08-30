package org.telegram.tgnet;

public abstract class TLRPC$InputDocument extends TLObject {
    public long access_hash;
    public byte[] file_reference;
    public long id;

    public static TLRPC$InputDocument TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputDocument tLRPC$TL_inputDocumentEmpty = i != 448771445 ? i != 1928391342 ? null : new TLRPC$TL_inputDocumentEmpty() : new TLRPC$TL_inputDocument();
        if (tLRPC$TL_inputDocumentEmpty == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputDocument", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputDocumentEmpty != null) {
            tLRPC$TL_inputDocumentEmpty.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputDocumentEmpty;
    }
}
