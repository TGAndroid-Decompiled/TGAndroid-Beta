package org.telegram.tgnet;

public abstract class TLRPC$FileLocation extends TLObject {
    public int dc_id;
    public byte[] file_reference;
    public byte[] iv;
    public byte[] key;
    public int local_id;
    public long secret;
    public long volume_id;

    public static TLRPC$FileLocation TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$FileLocation tLRPC$TL_fileLocationToBeDeprecated;
        switch (i) {
            case -1132476723:
                tLRPC$TL_fileLocationToBeDeprecated = new TLRPC$TL_fileLocationToBeDeprecated();
                break;
            case 152900075:
                tLRPC$TL_fileLocationToBeDeprecated = new TLRPC$TL_fileLocation_layer97();
                break;
            case 1406570614:
                tLRPC$TL_fileLocationToBeDeprecated = new TLRPC$TL_fileLocation_layer82();
                break;
            case 1431655764:
                tLRPC$TL_fileLocationToBeDeprecated = new TLRPC$TL_fileEncryptedLocation();
                break;
            case 2086234950:
                tLRPC$TL_fileLocationToBeDeprecated = new TLRPC$TL_fileLocationUnavailable();
                break;
            default:
                tLRPC$TL_fileLocationToBeDeprecated = null;
                break;
        }
        if (tLRPC$TL_fileLocationToBeDeprecated == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in FileLocation", Integer.valueOf(i)));
        }
        if (tLRPC$TL_fileLocationToBeDeprecated != null) {
            tLRPC$TL_fileLocationToBeDeprecated.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_fileLocationToBeDeprecated;
    }
}
