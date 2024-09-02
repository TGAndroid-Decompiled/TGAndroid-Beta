package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_stories$StoryItem;

public class TLRPC$WebPageAttribute extends TLObject {
    public int flags;

    public static TLRPC$WebPageAttribute TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$WebPageAttribute tLRPC$WebPageAttribute;
        switch (i) {
            case -1818605967:
                tLRPC$WebPageAttribute = new TLRPC$TL_webPageAttributeStory() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        long readInt64 = abstractSerializedData2.readInt64(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = readInt64;
                        this.id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.storyItem = TL_stories$StoryItem.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        if (this.storyItem != null) {
                            this.flags |= 1;
                        } else {
                            this.flags &= -2;
                        }
                        abstractSerializedData2.writeInt32(-1818605967);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt64(this.peer.user_id);
                        abstractSerializedData2.writeInt32(this.id);
                        if ((this.flags & 1) != 0) {
                            this.storyItem.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 781501415:
                tLRPC$WebPageAttribute = new TLRPC$TL_webPageAttributeStory();
                break;
            case 1355547603:
                tLRPC$WebPageAttribute = new TLRPC$TL_webPageAttributeStickerSet();
                break;
            case 1421174295:
                tLRPC$WebPageAttribute = new TLRPC$TL_webPageAttributeTheme();
                break;
            default:
                tLRPC$WebPageAttribute = null;
                break;
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
