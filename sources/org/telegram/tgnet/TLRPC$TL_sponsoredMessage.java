package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_sponsoredMessage extends TLObject {
    public static int constructor = 981691896;
    public int channel_post;
    public TLRPC$ChatInvite chat_invite;
    public String chat_invite_hash;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public TLRPC$Peer from_id;
    public String message;
    public byte[] random_id;
    public String start_param;

    public static TLRPC$TL_sponsoredMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_sponsoredMessage tLRPC$TL_sponsoredMessage = new TLRPC$TL_sponsoredMessage();
            tLRPC$TL_sponsoredMessage.readParams(abstractSerializedData, z);
            return tLRPC$TL_sponsoredMessage;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_sponsoredMessage", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.random_id = abstractSerializedData.readByteArray(z);
        if ((this.flags & 8) != 0) {
            this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 16) != 0) {
            this.chat_invite = TLRPC$ChatInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 16) != 0) {
            this.chat_invite_hash = abstractSerializedData.readString(z);
        }
        if ((this.flags & 4) != 0) {
            this.channel_post = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1) != 0) {
            this.start_param = abstractSerializedData.readString(z);
        }
        this.message = abstractSerializedData.readString(z);
        if ((this.flags & 2) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 == 481674261) {
                int readInt322 = abstractSerializedData.readInt32(z);
                for (int i = 0; i < readInt322; i++) {
                    TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize != null) {
                        this.entities.add(TLdeserialize);
                    } else {
                        return;
                    }
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeByteArray(this.random_id);
        if ((this.flags & 8) != 0) {
            this.from_id.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 16) != 0) {
            this.chat_invite.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeString(this.chat_invite_hash);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.channel_post);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.start_param);
        }
        abstractSerializedData.writeString(this.message);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.entities.get(i).serializeToStream(abstractSerializedData);
            }
        }
    }
}
