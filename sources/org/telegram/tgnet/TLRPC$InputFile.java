package org.telegram.tgnet;

public abstract class TLRPC$InputFile extends TLObject {
    public long id;
    public String md5_checksum;
    public String name;
    public int parts;

    public static TLRPC$InputFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputFile tLRPC$TL_inputFileStoryDocument = i != -181407105 ? i != -95482955 ? i != 1658620744 ? null : new TLRPC$TL_inputFileStoryDocument() : new TLRPC$TL_inputFileBig() : new TLRPC$TL_inputFile();
        if (tLRPC$TL_inputFileStoryDocument == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputFile", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputFileStoryDocument != null) {
            tLRPC$TL_inputFileStoryDocument.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputFileStoryDocument;
    }
}
