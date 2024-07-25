package org.telegram.tgnet;
public abstract class TLRPC$help_CountriesList extends TLObject {
    public static TLRPC$help_CountriesList TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$help_CountriesList tLRPC$TL_help_countriesList;
        if (i != -2016381538) {
            tLRPC$TL_help_countriesList = i != -1815339214 ? null : new TLRPC$help_CountriesList() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1815339214);
                }
            };
        } else {
            tLRPC$TL_help_countriesList = new TLRPC$TL_help_countriesList();
        }
        if (tLRPC$TL_help_countriesList == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in help_CountriesList", Integer.valueOf(i)));
        }
        if (tLRPC$TL_help_countriesList != null) {
            tLRPC$TL_help_countriesList.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_help_countriesList;
    }
}
