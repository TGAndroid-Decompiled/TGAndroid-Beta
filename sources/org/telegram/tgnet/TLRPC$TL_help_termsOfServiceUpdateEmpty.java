package org.telegram.tgnet;

public class TLRPC$TL_help_termsOfServiceUpdateEmpty extends TLRPC$help_TermsOfServiceUpdate {
    public int expires;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.expires = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-483352705);
        abstractSerializedData.writeInt32(this.expires);
    }
}
