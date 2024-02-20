package org.telegram.tgnet;
public class TLRPC$TL_account_uploadRingtone extends TLObject {
    public TLRPC$InputFile file;
    public String file_name;
    public String mime_type;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Document.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2095414366);
        this.file.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.file_name);
        abstractSerializedData.writeString(this.mime_type);
    }
}
