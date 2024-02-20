package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$Reaction;
public class TL_stories$TL_mediaAreaSuggestedReaction extends TL_stories$MediaArea {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.dark = (readInt32 & 1) != 0;
        this.flipped = (readInt32 & 2) != 0;
        this.coordinates = TL_stories$TL_mediaAreaCoordinates.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.reaction = TLRPC$Reaction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(340088945);
        int i = this.dark ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.flipped ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.coordinates.serializeToStream(abstractSerializedData);
        this.reaction.serializeToStream(abstractSerializedData);
    }
}
