package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$DraftMessage extends TLObject {
    public int date;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public boolean invert_media;
    public TLRPC$InputMedia media;
    public String message;
    public boolean no_webpage;
    public TLRPC$InputReplyTo reply_to;

    public static TLRPC$DraftMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$DraftMessage tLRPC$DraftMessage;
        switch (i) {
            case -1169445179:
                tLRPC$DraftMessage = new TLRPC$TL_draftMessageEmpty() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1169445179);
                    }
                };
                break;
            case -40996577:
                tLRPC$DraftMessage = new TLRPC$TL_draftMessage() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.no_webpage = (readInt32 & 2) != 0;
                        if ((readInt32 & 1) != 0) {
                            TLRPC$TL_inputReplyToMessage tLRPC$TL_inputReplyToMessage = new TLRPC$TL_inputReplyToMessage();
                            tLRPC$TL_inputReplyToMessage.flags |= 16;
                            tLRPC$TL_inputReplyToMessage.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                            this.reply_to = tLRPC$TL_inputReplyToMessage;
                        }
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 8) != 0) {
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
                        this.date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-40996577);
                        int i2 = this.no_webpage ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        if ((this.flags & 1) != 0) {
                            TLRPC$InputReplyTo tLRPC$InputReplyTo = this.reply_to;
                            abstractSerializedData2.writeInt32(tLRPC$InputReplyTo instanceof TLRPC$TL_inputReplyToMessage ? ((TLRPC$TL_inputReplyToMessage) tLRPC$InputReplyTo).reply_to_msg_id : 0);
                        }
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i3 = 0; i3 < size; i3++) {
                                this.entities.get(i3).serializeToStream(abstractSerializedData2);
                            }
                        }
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case 453805082:
                tLRPC$DraftMessage = new TLRPC$TL_draftMessageEmpty();
                break;
            case 1070397423:
                tLRPC$DraftMessage = new TLRPC$TL_draftMessage();
                break;
            default:
                tLRPC$DraftMessage = null;
                break;
        }
        if (tLRPC$DraftMessage == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in DraftMessage", Integer.valueOf(i)));
        }
        if (tLRPC$DraftMessage != null) {
            tLRPC$DraftMessage.readParams(abstractSerializedData, z);
        }
        return tLRPC$DraftMessage;
    }
}
