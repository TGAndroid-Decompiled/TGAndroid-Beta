package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
public abstract class TLRPC$Updates extends TLObject {
    public long chat_id;
    public int date;
    public int flags;
    public long from_id;
    public TLRPC$MessageFwdHeader fwd_from;
    public int id;
    public TLRPC$MessageMedia media;
    public boolean media_unread;
    public boolean mentioned;
    public String message;
    public boolean out;
    public int pts;
    public int pts_count;
    public TLRPC$MessageReplyHeader reply_to;
    public int seq;
    public int seq_start;
    public boolean silent;
    public int ttl_period;
    public TLRPC$Update update;
    public long user_id;
    public long via_bot_id;
    public ArrayList<TLRPC$Update> updates = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();
    public ArrayList<TLRPC$Chat> chats = new ArrayList<>();
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();

    public static TLRPC$Updates TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Updates tLRPC$Updates;
        switch (i) {
            case -1877614335:
                tLRPC$Updates = new TLRPC$Updates() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.pts = abstractSerializedData2.readInt32(z2);
                        this.pts_count = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            this.media = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 128) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                    }
                };
                break;
            case -484987010:
                tLRPC$Updates = new TLRPC$Updates() {
                };
                break;
            case 826001400:
                tLRPC$Updates = new TLRPC$Updates() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.user_id = abstractSerializedData2.readInt64(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        this.pts = abstractSerializedData2.readInt32(z2);
                        this.pts_count = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & LiteMode.FLAG_AUTOPLAY_GIFS) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.reply_to = TLRPC$MessageReplyHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 128) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                    }
                };
                break;
            case 1299050149:
                tLRPC$Updates = new TLRPC$Updates() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.from_id = abstractSerializedData2.readInt64(z2);
                        this.chat_id = abstractSerializedData2.readInt64(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        this.pts = abstractSerializedData2.readInt32(z2);
                        this.pts_count = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & LiteMode.FLAG_AUTOPLAY_GIFS) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.reply_to = TLRPC$MessageReplyHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 128) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                    }
                };
                break;
            case 1918567619:
                tLRPC$Updates = new TLRPC$Updates() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$Update TLdeserialize = TLRPC$Update.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.updates.add(TLdeserialize);
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
                        int readInt325 = abstractSerializedData2.readInt32(z2);
                        if (readInt325 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                            }
                            return;
                        }
                        int readInt326 = abstractSerializedData2.readInt32(z2);
                        for (int i4 = 0; i4 < readInt326; i4++) {
                            TLRPC$Chat TLdeserialize3 = TLRPC$Chat.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize3 == null) {
                                return;
                            }
                            this.chats.add(TLdeserialize3);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.seq_start = abstractSerializedData2.readInt32(z2);
                        this.seq = abstractSerializedData2.readInt32(z2);
                    }
                };
                break;
            case 1957577280:
                tLRPC$Updates = new TLRPC$TL_updates();
                break;
            case 2027216577:
                tLRPC$Updates = new TLRPC$Updates() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.update = TLRPC$Update.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                    }
                };
                break;
            default:
                tLRPC$Updates = null;
                break;
        }
        if (tLRPC$Updates == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Updates", Integer.valueOf(i)));
        }
        if (tLRPC$Updates != null) {
            tLRPC$Updates.readParams(abstractSerializedData, z);
        }
        return tLRPC$Updates;
    }
}
