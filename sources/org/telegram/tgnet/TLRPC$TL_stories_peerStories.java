package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_stories_peerStories extends TLObject {
    public static int constructor = -890861720;
    public TLRPC$PeerStories stories;
    public ArrayList<TLRPC$Chat> chats = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_stories_peerStories TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stories_peerStories", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_stories_peerStories tLRPC$TL_stories_peerStories = new TLRPC$TL_stories_peerStories();
        tLRPC$TL_stories_peerStories.readParams(abstractSerializedData, z);
        return tLRPC$TL_stories_peerStories;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.stories = TLRPC$PeerStories.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$Chat TLdeserialize = TLRPC$Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.chats.add(TLdeserialize);
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
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.stories.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.chats.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.chats.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.users.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.users.get(i2).serializeToStream(abstractSerializedData);
        }
    }
}