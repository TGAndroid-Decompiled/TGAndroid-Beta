package org.telegram.tgnet.tl;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$Peer;

public class TL_stories$StoryReaction extends TLObject {
    public TLRPC$Message message;
    public TLRPC$Peer peer_id;
    public TL_stories$StoryItem story;

    public static TL_stories$StoryReaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$StoryReaction tL_stories$StoryReaction;
        if (i == -1146411453) {
            tL_stories$StoryReaction = new TL_stories$StoryReaction() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.message = TLRPC$Message.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1146411453);
                    this.message.serializeToStream(abstractSerializedData2);
                }
            };
        } else if (i != -808644845) {
            tL_stories$StoryReaction = i != 1620104917 ? null : new TL_stories$TL_storyReaction();
        } else {
            tL_stories$StoryReaction = new TL_stories$StoryReaction() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    TL_stories$StoryItem TLdeserialize = TL_stories$StoryItem.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.story = TLdeserialize;
                    if (TLdeserialize != null) {
                        TLdeserialize.dialogId = DialogObject.getPeerDialogId(this.peer_id);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-808644845);
                    this.peer_id.serializeToStream(abstractSerializedData2);
                    this.story.serializeToStream(abstractSerializedData2);
                }
            };
        }
        if (tL_stories$StoryReaction == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StoryReaction", Integer.valueOf(i)));
        }
        if (tL_stories$StoryReaction != null) {
            tL_stories$StoryReaction.readParams(abstractSerializedData, z);
        }
        return tL_stories$StoryReaction;
    }
}
