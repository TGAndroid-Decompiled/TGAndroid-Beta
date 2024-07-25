package org.telegram.tgnet;
public abstract class TLRPC$SecureFile extends TLObject {
    public static TLRPC$SecureFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecureFile tLRPC$SecureFile;
        if (i == 1679398724) {
            tLRPC$SecureFile = new TLRPC$SecureFile() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1679398724);
                }
            };
        } else {
            tLRPC$SecureFile = i != 2097791614 ? null : new TLRPC$TL_secureFile();
        }
        if (tLRPC$SecureFile == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in SecureFile", Integer.valueOf(i)));
        }
        if (tLRPC$SecureFile != null) {
            tLRPC$SecureFile.readParams(abstractSerializedData, z);
        }
        return tLRPC$SecureFile;
    }
}
