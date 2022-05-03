package org.telegram.tgnet;

public abstract class TLRPC$InputFile extends TLObject {
    public long id;
    public String md5_checksum;
    public String name;
    public int parts;

    public static TLRPC$InputFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputFile tLRPC$InputFile;
        if (i != -181407105) {
            tLRPC$InputFile = i != -95482955 ? null : new TLRPC$TL_inputFileBig();
        } else {
            tLRPC$InputFile = new TLRPC$TL_inputFile();
        }
        if (tLRPC$InputFile != null || !z) {
            if (tLRPC$InputFile != null) {
                tLRPC$InputFile.readParams(abstractSerializedData, z);
            }
            return tLRPC$InputFile;
        }
        throw new RuntimeException(String.format("can't parse magic %x in InputFile", Integer.valueOf(i)));
    }
}
