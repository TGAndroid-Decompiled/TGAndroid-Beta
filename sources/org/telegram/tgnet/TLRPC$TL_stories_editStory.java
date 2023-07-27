package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_stories_editStory extends TLObject {
    public static int constructor = 716077633;
    public String caption;
    public int flags;
    public int id;
    public TLRPC$InputMedia media;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public ArrayList<TLRPC$InputPrivacyRule> privacy_rules = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & 1) != 0) {
            this.media.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.caption);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.entities.get(i).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.privacy_rules.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                this.privacy_rules.get(i2).serializeToStream(abstractSerializedData);
            }
        }
    }
}
