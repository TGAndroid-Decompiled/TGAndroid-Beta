package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_stories$TL_publicForwardStory;
public abstract class TLRPC$PublicForward extends TLObject {
    public static TLRPC$PublicForward TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PublicForward tL_stories$TL_publicForwardStory;
        if (i != -302797360) {
            tL_stories$TL_publicForwardStory = i != 32685898 ? null : new TLRPC$TL_publicForwardMessage();
        } else {
            tL_stories$TL_publicForwardStory = new TL_stories$TL_publicForwardStory();
        }
        if (tL_stories$TL_publicForwardStory == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PublicForward", Integer.valueOf(i)));
        }
        if (tL_stories$TL_publicForwardStory != null) {
            tL_stories$TL_publicForwardStory.readParams(abstractSerializedData, z);
        }
        return tL_stories$TL_publicForwardStory;
    }
}
