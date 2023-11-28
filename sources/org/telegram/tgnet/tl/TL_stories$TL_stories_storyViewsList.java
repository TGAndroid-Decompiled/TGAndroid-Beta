package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$User;
public class TL_stories$TL_stories_storyViewsList extends TLObject {
    public int count;
    public int flags;
    public int reactions_count;
    public ArrayList<TL_stories$TL_storyView> views = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();
    public String next_offset = "";

    public static TL_stories$TL_stories_storyViewsList TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1189722604 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stories_storyViewsList", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_stories_storyViewsList tL_stories$TL_stories_storyViewsList = new TL_stories$TL_stories_storyViewsList();
        tL_stories$TL_stories_storyViewsList.readParams(abstractSerializedData, z);
        return tL_stories$TL_stories_storyViewsList;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.count = abstractSerializedData.readInt32(z);
        this.reactions_count = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TL_stories$TL_storyView TLdeserialize = TL_stories$TL_storyView.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.views.add(TLdeserialize);
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        if (readInt323 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
            return;
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt324; i2++) {
            TLRPC$User TLdeserialize2 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize2 == null) {
                return;
            }
            this.users.add(TLdeserialize2);
        }
        if ((this.flags & 1) != 0) {
            this.next_offset = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1189722604);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.count);
        abstractSerializedData.writeInt32(this.reactions_count);
        abstractSerializedData.writeInt32(481674261);
        int size = this.views.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.views.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.users.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.users.get(i2).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.next_offset);
        }
    }
}
