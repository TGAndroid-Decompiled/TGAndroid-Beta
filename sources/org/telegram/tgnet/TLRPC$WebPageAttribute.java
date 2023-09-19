package org.telegram.tgnet;
public class TLRPC$WebPageAttribute extends TLObject {
    public int flags;

    public static TLRPC$WebPageAttribute TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$WebPageAttribute tLRPC$WebPageAttribute;
        if (i == -1818605967) {
            tLRPC$WebPageAttribute = new TLRPC$TL_webPageAttributeStory() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    ((TLRPC$TL_webPageAttributeStory) this).flags = abstractSerializedData2.readInt32(z2);
                    long readInt64 = abstractSerializedData2.readInt64(z2);
                    TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                    this.peer = tLRPC$TL_peerUser;
                    tLRPC$TL_peerUser.user_id = readInt64;
                    this.id = abstractSerializedData2.readInt32(z2);
                    if ((((TLRPC$TL_webPageAttributeStory) this).flags & 1) != 0) {
                        this.storyItem = TLRPC$StoryItem.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    if (this.storyItem != null) {
                        ((TLRPC$TL_webPageAttributeStory) this).flags |= 1;
                    } else {
                        ((TLRPC$TL_webPageAttributeStory) this).flags &= -2;
                    }
                    abstractSerializedData2.writeInt32(-1818605967);
                    abstractSerializedData2.writeInt32(((TLRPC$TL_webPageAttributeStory) this).flags);
                    abstractSerializedData2.writeInt64(this.peer.user_id);
                    abstractSerializedData2.writeInt32(this.id);
                    if ((((TLRPC$TL_webPageAttributeStory) this).flags & 1) != 0) {
                        this.storyItem.serializeToStream(abstractSerializedData2);
                    }
                }
            };
        } else if (i != 781501415) {
            tLRPC$WebPageAttribute = i != 1421174295 ? null : new TLRPC$TL_webPageAttributeTheme();
        } else {
            tLRPC$WebPageAttribute = new TLRPC$TL_webPageAttributeStory();
        }
        if (tLRPC$WebPageAttribute == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in contacts_Contacts", Integer.valueOf(i)));
        }
        if (tLRPC$WebPageAttribute != null) {
            tLRPC$WebPageAttribute.readParams(abstractSerializedData, z);
        }
        return tLRPC$WebPageAttribute;
    }
}
