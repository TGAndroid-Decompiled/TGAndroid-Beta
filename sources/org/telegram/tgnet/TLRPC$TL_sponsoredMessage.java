package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
public class TLRPC$TL_sponsoredMessage extends TLObject {
    public String additional_info;
    public TLRPC$BotApp app;
    public String button_text;
    public int channel_post;
    public TLRPC$ChatInvite chat_invite;
    public String chat_invite_hash;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public TLRPC$Peer from_id;
    public String message;
    public byte[] random_id;
    public boolean recommended;
    public boolean show_peer_photo;
    public String sponsor_info;
    public String start_param;
    public TLRPC$TL_sponsoredWebPage webpage;

    public static TLRPC$TL_sponsoredMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-313293833 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_sponsoredMessage", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_sponsoredMessage tLRPC$TL_sponsoredMessage = new TLRPC$TL_sponsoredMessage();
        tLRPC$TL_sponsoredMessage.readParams(abstractSerializedData, z);
        return tLRPC$TL_sponsoredMessage;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.recommended = (readInt32 & 32) != 0;
        this.show_peer_photo = (readInt32 & 64) != 0;
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
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            this.webpage = TLRPC$TL_sponsoredWebPage.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 1024) != 0) {
            this.app = TLRPC$BotApp.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.message = abstractSerializedData.readString(z);
        if ((this.flags & 2) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.entities.add(TLdeserialize);
            }
        }
        if ((this.flags & LiteMode.FLAG_AUTOPLAY_GIFS) != 0) {
            this.button_text = abstractSerializedData.readString(z);
        }
        if ((this.flags & 128) != 0) {
            this.sponsor_info = abstractSerializedData.readString(z);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.additional_info = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-313293833);
        int i = this.recommended ? this.flags | 32 : this.flags & (-33);
        this.flags = i;
        int i2 = this.show_peer_photo ? i | 64 : i & (-65);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
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
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            this.webpage.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1024) != 0) {
            this.app.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.message);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i3 = 0; i3 < size; i3++) {
                this.entities.get(i3).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & LiteMode.FLAG_AUTOPLAY_GIFS) != 0) {
            abstractSerializedData.writeString(this.button_text);
        }
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeString(this.sponsor_info);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            abstractSerializedData.writeString(this.additional_info);
        }
    }
}
