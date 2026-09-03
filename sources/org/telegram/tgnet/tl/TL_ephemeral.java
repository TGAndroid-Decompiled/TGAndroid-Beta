package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
public class TL_ephemeral {

    public static abstract class EphemeralMessage extends TLObject {
        public int anchor_msg_id;
        public long chat_instance;
        public int date;
        public ArrayList<TLRPC.MessageEntity> entities;
        public int flags;
        public TLRPC.Peer from_id;
        public int f19370id;
        public boolean invert_media;
        public TLRPC.MessageMedia media;
        public String message;
        public boolean noforwards;
        public boolean out;
        public TLRPC.Peer peer_id;
        public long receiver_id;
        public TLRPC.ReplyMarkup reply_markup;
        public TLRPC.MessageReplyHeader reply_to;
        public TL_iv.RichMessage rich_message;
        public int top_msg_id;
        public long via_bot_id;
        public boolean welcome;

        public static EphemeralMessage TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return (EphemeralMessage) TLObject.TLdeserialize(EphemeralMessage.class, fromConstructor(i10), inputSerializedData, i10, z4);
        }

        private static EphemeralMessage fromConstructor(int i10) {
            if (i10 != -1896618863) {
                if (i10 != -641278950) {
                    if (i10 != -584597783) {
                        return null;
                    }
                    return new TL_ephemeralMessage();
                }
                return new TL_ephemeralMessage_layer228();
            }
            return new TL_ephemeralMessage_layer229_old();
        }
    }

    public static class TL_deleteAllWelcomeMessages extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 1934595873;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1934595873);
            this.peer.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_deleteMessage extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1829312617;
        public int flags;
        public int f19371id;
        public TLRPC.InputPeer peer;
        public TLRPC.InputUser receiver_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            outputSerializedData.writeInt32(-1829312617);
            int i10 = this.flags;
            if (this.peer != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag = TLObject.setFlag(i10, 1, z4);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.peer.serializeToStream(outputSerializedData);
            }
            this.receiver_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f19371id);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_deleteWelcomeMessage extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -394090015;
        public int f19372id;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-394090015);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f19372id);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_editMessage extends TLRPC.TL_messages_editMessage {
        public static final int constructor = -811830693;
        public int flags;
        public boolean invert_media;
        public TLRPC.InputUser receiver_id;
        public boolean welcome;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            outputSerializedData.writeInt32(-811830693);
            int i10 = this.flags;
            boolean z14 = false;
            if (this.message != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag = TLObject.setFlag(i10, 1, z4);
            this.flags = flag;
            if (this.entities != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag2 = TLObject.setFlag(flag, 2, z10);
            this.flags = flag2;
            if (this.reply_markup != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 4, z11);
            this.flags = flag3;
            if (this.media != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 8, z12);
            this.flags = flag4;
            if (this.rich_message != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int flag5 = TLObject.setFlag(flag4, 16, z13);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 32, this.invert_media);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 64, this.welcome);
            this.flags = flag7;
            if (this.peer != null) {
                z14 = true;
            }
            int flag8 = TLObject.setFlag(flag7, 128, z14);
            this.flags = flag8;
            outputSerializedData.writeInt32(flag8);
            if (TLObject.hasFlag(this.flags, 128)) {
                this.peer.serializeToStream(outputSerializedData);
            }
            this.receiver_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f19242id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.message);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.rich_message.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_ephemeralMessage extends EphemeralMessage {
        public static final int constructor = -584597783;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.out = TLObject.hasFlag(readInt32, 1);
            this.welcome = TLObject.hasFlag(this.flags, 32);
            this.invert_media = TLObject.hasFlag(this.flags, 128);
            this.noforwards = TLObject.hasFlag(this.flags, 4096);
            this.f19370id = inputSerializedData.readInt32(z4);
            this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.receiver_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.top_msg_id = inputSerializedData.readInt32(z4);
            }
            this.date = inputSerializedData.readInt32(z4);
            this.message = inputSerializedData.readString(z4);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z4);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.rich_message = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.chat_instance = inputSerializedData.readInt64(z4);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.anchor_msg_id = inputSerializedData.readInt32(z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            outputSerializedData.writeInt32(-584597783);
            boolean z14 = true;
            int flag = TLObject.setFlag(this.flags, 1, this.out);
            this.flags = flag;
            if (this.entities != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z4);
            this.flags = flag2;
            if (this.media != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 8, z10);
            this.flags = flag3;
            if (this.reply_markup != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 16, z11);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 32, this.welcome);
            this.flags = flag5;
            if (this.reply_to != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            int flag6 = TLObject.setFlag(flag5, 64, z12);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 128, this.invert_media);
            this.flags = flag7;
            if (this.rich_message != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int flag8 = TLObject.setFlag(flag7, 256, z13);
            this.flags = flag8;
            if (this.peer_id == null) {
                z14 = false;
            }
            int flag9 = TLObject.setFlag(flag8, 512, z14);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 4096, this.noforwards);
            this.flags = flag10;
            outputSerializedData.writeInt32(flag10);
            outputSerializedData.writeInt32(this.f19370id);
            this.from_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.peer_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt64(this.receiver_id);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.top_msg_id);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.rich_message.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt64(this.chat_instance);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt32(this.anchor_msg_id);
            }
        }
    }

    public static class TL_ephemeralMessage_layer228 extends TL_ephemeralMessage {
        public static final int constructor = -641278950;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.out = TLObject.hasFlag(readInt32, 1);
            this.f19370id = inputSerializedData.readInt32(z4);
            this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.receiver_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.top_msg_id = inputSerializedData.readInt32(z4);
            }
            this.date = inputSerializedData.readInt32(z4);
            this.message = inputSerializedData.readString(z4);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z4);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            boolean z10;
            boolean z11;
            outputSerializedData.writeInt32(-641278950);
            boolean z12 = true;
            int flag = TLObject.setFlag(this.flags, 1, this.out);
            this.flags = flag;
            if (this.entities != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z4);
            this.flags = flag2;
            if (this.media != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 8, z10);
            this.flags = flag3;
            if (this.reply_markup != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 16, z11);
            this.flags = flag4;
            if (this.reply_to == null) {
                z12 = false;
            }
            int flag5 = TLObject.setFlag(flag4, 64, z12);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            outputSerializedData.writeInt32(this.f19370id);
            this.from_id.serializeToStream(outputSerializedData);
            this.peer_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.receiver_id);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.top_msg_id);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_ephemeralMessage_layer229_old extends TL_ephemeralMessage {
        public static final int constructor = -1896618863;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.out = TLObject.hasFlag(readInt32, 1);
            this.welcome = TLObject.hasFlag(this.flags, 32);
            this.invert_media = TLObject.hasFlag(this.flags, 128);
            this.f19370id = inputSerializedData.readInt32(z4);
            this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.receiver_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.top_msg_id = inputSerializedData.readInt32(z4);
            }
            this.date = inputSerializedData.readInt32(z4);
            this.message = inputSerializedData.readString(z4);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z4);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.rich_message = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            boolean z10;
            boolean z11;
            boolean z12;
            outputSerializedData.writeInt32(-1896618863);
            boolean z13 = true;
            int flag = TLObject.setFlag(this.flags, 1, this.out);
            this.flags = flag;
            if (this.entities != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z4);
            this.flags = flag2;
            if (this.media != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 8, z10);
            this.flags = flag3;
            if (this.reply_markup != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 16, z11);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 32, this.welcome);
            this.flags = flag5;
            if (this.reply_to != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            int flag6 = TLObject.setFlag(flag5, 64, z12);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 128, this.invert_media);
            this.flags = flag7;
            if (this.rich_message == null) {
                z13 = false;
            }
            int flag8 = TLObject.setFlag(flag7, 256, z13);
            this.flags = flag8;
            outputSerializedData.writeInt32(flag8);
            outputSerializedData.writeInt32(this.f19370id);
            this.from_id.serializeToStream(outputSerializedData);
            this.peer_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.receiver_id);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.top_msg_id);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.rich_message.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_getCallbackAnswer extends TLMethod<TLRPC.TL_messages_botCallbackAnswer> {
        public static final int constructor = 1067738312;
        public byte[] data;
        public int flags;
        public int f19373id;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            outputSerializedData.writeInt32(1067738312);
            int i10 = this.flags;
            if (this.data != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag = TLObject.setFlag(i10, 2, z4);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f19373id);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeByteArray(this.data);
            }
        }

        @Override
        public TLRPC.TL_messages_botCallbackAnswer deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.TL_messages_botCallbackAnswer.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_getWelcomeMessages extends TLMethod<WelcomeMessages> {
        public static final int constructor = -610614899;
        public long hash;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-610614899);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override
        public WelcomeMessages deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return WelcomeMessages.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_reportMessage extends TLMethod<TLRPC.ReportResult> {
        public static final int constructor = -2029718849;
        public int f19374id;
        public String message;
        public byte[] option;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2029718849);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f19374id);
            outputSerializedData.writeByteArray(this.option);
            outputSerializedData.writeString(this.message);
        }

        @Override
        public TLRPC.ReportResult deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.ReportResult.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_sendMessage extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -1165140171;
        public boolean anchor;
        public ArrayList<TLRPC.MessageEntity> entities;
        public int flags;
        public boolean invert_media;
        public TLRPC.InputMedia media;
        public String message;
        public TLRPC.InputPeer peer;
        public long query_id;
        public long random_id;
        public TLRPC.InputUser receiver_id;
        public TLRPC.ReplyMarkup reply_markup;
        public TLRPC.InputReplyTo reply_to;
        public TL_iv.TL_inputRichMessage rich_message;
        public boolean welcome;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            outputSerializedData.writeInt32(-1165140171);
            int i10 = this.flags;
            boolean z14 = false;
            if (this.entities != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag = TLObject.setFlag(i10, 2, z4);
            this.flags = flag;
            if (this.media != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z10);
            this.flags = flag2;
            if (this.reply_markup != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 8, z11);
            this.flags = flag3;
            if (this.rich_message != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 16, z12);
            this.flags = flag4;
            if (this.reply_to != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int flag5 = TLObject.setFlag(flag4, 32, z13);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 64, this.invert_media);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 128, this.welcome);
            this.flags = flag7;
            if (this.peer != null) {
                z14 = true;
            }
            int flag8 = TLObject.setFlag(flag7, 256, z14);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 512, this.anchor);
            this.flags = flag9;
            outputSerializedData.writeInt32(flag9);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.peer.serializeToStream(outputSerializedData);
            }
            this.receiver_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.query_id);
            }
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.rich_message.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt64(this.random_id);
            if (TLObject.hasFlag(this.flags, 32)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_welcomeMessages extends WelcomeMessages {
        public static final int constructor = 273664114;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.hash = inputSerializedData.readInt64(z4);
            this.messages = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(29), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(273664114);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.messages);
        }
    }

    public static abstract class WelcomeMessages extends TLObject {
        public long hash;
        public ArrayList<EphemeralMessage> messages = new ArrayList<>();

        public static WelcomeMessages TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return (WelcomeMessages) TLObject.TLdeserialize(WelcomeMessages.class, fromConstructor(i10), inputSerializedData, i10, z4);
        }

        private static WelcomeMessages fromConstructor(int i10) {
            if (i10 != 273664114) {
                if (i10 != 1509940017) {
                    return null;
                }
                return new TL_welcomeMessagesNotModified();
            }
            return new TL_welcomeMessages();
        }
    }

    public static class TL_welcomeMessagesNotModified extends WelcomeMessages {
        public static final int constructor = 1509940017;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1509940017);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
        }
    }
}
