package org.telegram.tgnet;

public abstract class TLRPC$SecureFile extends TLObject {
    public static TLRPC$SecureFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecureFile tLRPC$TL_secureFile = i != 1679398724 ? i != 2097791614 ? null : new TLRPC$TL_secureFile() : new TLRPC$SecureFile() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(1679398724);
            }
        };
        if (tLRPC$TL_secureFile == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in SecureFile", Integer.valueOf(i)));
        }
        if (tLRPC$TL_secureFile != null) {
            tLRPC$TL_secureFile.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_secureFile;
    }
}
