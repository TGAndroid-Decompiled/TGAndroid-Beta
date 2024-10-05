package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputPrivacyRule;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$Updates;

public class TL_stories$TL_stories_editStory extends TLObject {
    public String caption;
    public int flags;
    public int id;
    public TLRPC$InputMedia media;
    public TLRPC$InputPeer peer;
    public ArrayList media_areas = new ArrayList();
    public ArrayList entities = new ArrayList();
    public ArrayList privacy_rules = new ArrayList();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1249658298);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & 1) != 0) {
            this.media.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.media_areas.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                ((TL_stories$MediaArea) this.media_areas.get(i)).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.caption);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.entities.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                ((TLRPC$MessageEntity) this.entities.get(i2)).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size3 = this.privacy_rules.size();
            abstractSerializedData.writeInt32(size3);
            for (int i3 = 0; i3 < size3; i3++) {
                ((TLRPC$InputPrivacyRule) this.privacy_rules.get(i3)).serializeToStream(abstractSerializedData);
            }
        }
    }
}
