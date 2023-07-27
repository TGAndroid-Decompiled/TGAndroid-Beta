package org.telegram.tgnet;
public class TLRPC$WebPageAttribute extends TLObject {
    public int flags;

    public static TLRPC$WebPageAttribute TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$WebPageAttribute tLRPC$TL_webPageAttributeStory;
        if (i != -1818605967) {
            tLRPC$TL_webPageAttributeStory = i != 1421174295 ? null : new TLRPC$TL_webPageAttributeTheme();
        } else {
            tLRPC$TL_webPageAttributeStory = new TLRPC$TL_webPageAttributeStory();
        }
        if (tLRPC$TL_webPageAttributeStory == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in contacts_Contacts", Integer.valueOf(i)));
        }
        if (tLRPC$TL_webPageAttributeStory != null) {
            tLRPC$TL_webPageAttributeStory.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_webPageAttributeStory;
    }
}
