package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;

public class TL_stories$StoryViewsList extends TLObject {
    public int count;
    public int flags;
    public int forwards_count;
    public int reactions_count;
    public int views_count;
    public ArrayList<TL_stories$StoryView> views = new ArrayList<>();
    public ArrayList<TLRPC$Chat> chats = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();
    public String next_offset = "";

    public static TL_stories$StoryViewsList TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$StoryViewsList tL_stories$StoryViewsList;
        if (i != 1189722604) {
            tL_stories$StoryViewsList = i != 1507299269 ? null : new TL_stories$StoryViewsList() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.count = abstractSerializedData2.readInt32(z2);
                    this.views_count = abstractSerializedData2.readInt32(z2);
                    this.forwards_count = abstractSerializedData2.readInt32(z2);
                    this.reactions_count = abstractSerializedData2.readInt32(z2);
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TL_stories$StoryView TLdeserialize = TL_stories$StoryView.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.views.add(TLdeserialize);
                    }
                    int readInt323 = abstractSerializedData2.readInt32(z2);
                    if (readInt323 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                        }
                        return;
                    }
                    int readInt324 = abstractSerializedData2.readInt32(z2);
                    for (int i3 = 0; i3 < readInt324; i3++) {
                        TLRPC$Chat TLdeserialize2 = TLRPC$Chat.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize2 == null) {
                            return;
                        }
                        this.chats.add(TLdeserialize2);
                    }
                    int readInt325 = abstractSerializedData2.readInt32(z2);
                    if (readInt325 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                        }
                        return;
                    }
                    int readInt326 = abstractSerializedData2.readInt32(z2);
                    for (int i4 = 0; i4 < readInt326; i4++) {
                        TLRPC$User TLdeserialize3 = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize3 == null) {
                            return;
                        }
                        this.users.add(TLdeserialize3);
                    }
                    if ((this.flags & 1) != 0) {
                        this.next_offset = abstractSerializedData2.readString(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1507299269);
                    abstractSerializedData2.writeInt32(this.flags);
                    abstractSerializedData2.writeInt32(this.count);
                    abstractSerializedData2.writeInt32(this.views_count);
                    abstractSerializedData2.writeInt32(this.forwards_count);
                    abstractSerializedData2.writeInt32(this.reactions_count);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.views.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.views.get(i2).serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size2 = this.chats.size();
                    abstractSerializedData2.writeInt32(size2);
                    for (int i3 = 0; i3 < size2; i3++) {
                        this.chats.get(i3).serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size3 = this.users.size();
                    abstractSerializedData2.writeInt32(size3);
                    for (int i4 = 0; i4 < size3; i4++) {
                        this.users.get(i4).serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeString(this.next_offset);
                    }
                }
            };
        } else {
            tL_stories$StoryViewsList = new TL_stories$StoryViewsList() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.count = abstractSerializedData2.readInt32(z2);
                    this.reactions_count = abstractSerializedData2.readInt32(z2);
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TL_stories$StoryView TLdeserialize = TL_stories$StoryView.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.views.add(TLdeserialize);
                    }
                    int readInt323 = abstractSerializedData2.readInt32(z2);
                    if (readInt323 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                        }
                        return;
                    }
                    int readInt324 = abstractSerializedData2.readInt32(z2);
                    for (int i3 = 0; i3 < readInt324; i3++) {
                        TLRPC$User TLdeserialize2 = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize2 == null) {
                            return;
                        }
                        this.users.add(TLdeserialize2);
                    }
                    if ((this.flags & 1) != 0) {
                        this.next_offset = abstractSerializedData2.readString(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1189722604);
                    abstractSerializedData2.writeInt32(this.flags);
                    abstractSerializedData2.writeInt32(this.count);
                    abstractSerializedData2.writeInt32(this.reactions_count);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.views.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.views.get(i2).serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size2 = this.users.size();
                    abstractSerializedData2.writeInt32(size2);
                    for (int i3 = 0; i3 < size2; i3++) {
                        this.users.get(i3).serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeString(this.next_offset);
                    }
                }
            };
        }
        if (tL_stories$StoryViewsList == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StoryViewsList", Integer.valueOf(i)));
        }
        if (tL_stories$StoryViewsList != null) {
            tL_stories$StoryViewsList.readParams(abstractSerializedData, z);
        }
        return tL_stories$StoryViewsList;
    }
}
