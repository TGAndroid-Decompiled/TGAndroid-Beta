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
        TLRPC$FileLocation tLRPC$FileLocation;
        switch (i) {
            case -1132476723:
                tLRPC$FileLocation = new TLRPC$TL_fileLocationToBeDeprecated();
                break;
            case 152900075:
                tLRPC$FileLocation = new TLRPC$TL_fileLocation_layer97();
                break;
            case 1406570614:
                tLRPC$FileLocation = new TLRPC$TL_fileLocation_layer82();
                break;
            case 1431655764:
                tLRPC$FileLocation = new TLRPC$TL_fileEncryptedLocation();
                break;
            case 2086234950:
                tLRPC$FileLocation = new TLRPC$TL_fileLocationUnavailable();
                break;
            default:
                tLRPC$FileLocation = null;
                break;
        }
        if (tLRPC$FileLocation != null || !z) {
            if (tLRPC$FileLocation != null) {
                tLRPC$FileLocation.readParams(abstractSerializedData, z);
            }
            return tLRPC$FileLocation;
        }
        throw new RuntimeException(String.format("can't parse magic %x in FileLocation", Integer.valueOf(i)));
    }
}
