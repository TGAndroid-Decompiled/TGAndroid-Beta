package org.telegram.tgnet;

public abstract class TLRPC$InputFile extends TLObject {
    public long id;
    public String md5_checksum;
    public String name;
    public int parts;

    public static TLRPC$InputFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputFile tLRPC$TL_inputFile;
        if (i == -181407105) {
            tLRPC$TL_inputFile = new TLRPC$TL_inputFile();
        } else if (i == -95482955) {
            tLRPC$TL_inputFile = new TLRPC$TL_inputFileBig();
        } else {
            tLRPC$TL_inputFile = i != 1658620744 ? null : new TLRPC$TL_inputFileStoryDocument();
        }
        if (tLRPC$TL_inputFile == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputFile", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputFile != null) {
            tLRPC$TL_inputFile.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputFile;
    }
}
