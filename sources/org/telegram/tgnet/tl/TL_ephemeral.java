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
        public int id;
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

        public static EphemeralMessage TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (EphemeralMessage) TLObject.TLdeserialize(EphemeralMessage.class, fromConstructor(i), inputSerializedData, i, z);
        }

        private static EphemeralMessage fromConstructor(int i) {
            if (i != -1896618863) {
                if (i != -641278950) {
                    if (i != -584597783) {
                        return null;
                    }
                    return new TL_ephemeralMessage();
                }
                return new TL_ephemeralMessage_layer228();
            }
            return new TL_ephemeralMessage_layer229_old();
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
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            outputSerializedData.writeInt32(-811830693);
            int i = this.flags;
            boolean z6 = false;
            if (this.message != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 1, z);
            this.flags = flag;
            if (this.entities != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int flag2 = TLObject.setFlag(flag, 2, z2);
            this.flags = flag2;
            if (this.reply_markup != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 4, z3);
            this.flags = flag3;
            if (this.media != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 8, z4);
            this.flags = flag4;
            if (this.rich_message != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            int flag5 = TLObject.setFlag(flag4, 16, z5);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 32, this.invert_media);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 64, this.welcome);
            this.flags = flag7;
            if (this.peer != null) {
                z6 = true;
            }
            int flag8 = TLObject.setFlag(flag7, 128, z6);
            this.flags = flag8;
            outputSerializedData.writeInt32(flag8);
            if (TLObject.hasFlag(this.flags, 128)) {
                this.peer.serializeToStream(outputSerializedData);
            }
            this.receiver_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.out = TLObject.hasFlag(readInt32, 1);
            this.welcome = TLObject.hasFlag(this.flags, 32);
            this.invert_media = TLObject.hasFlag(this.flags, 128);
            this.noforwards = TLObject.hasFlag(this.flags, 4096);
            this.id = inputSerializedData.readInt32(z);
            this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.receiver_id = inputSerializedData.readInt64(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.top_msg_id = inputSerializedData.readInt32(z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.entities = Vector.deserialize(inputSerializedData, new yw6((byte) 25), z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.rich_message = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.chat_instance = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.anchor_msg_id = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            outputSerializedData.writeInt32(-584597783);
            boolean z6 = true;
            int flag = TLObject.setFlag(this.flags, 1, this.out);
            this.flags = flag;
            if (this.entities != null) {
                z = true;
            } else {
                z = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z);
            this.flags = flag2;
            if (this.media != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 8, z2);
            this.flags = flag3;
            if (this.reply_markup != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 16, z3);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 32, this.welcome);
            this.flags = flag5;
            if (this.reply_to != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag6 = TLObject.setFlag(flag5, 64, z4);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 128, this.invert_media);
            this.flags = flag7;
            if (this.rich_message != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            int flag8 = TLObject.setFlag(flag7, 256, z5);
            this.flags = flag8;
            if (this.peer_id == null) {
                z6 = false;
            }
            int flag9 = TLObject.setFlag(flag8, 512, z6);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 4096, this.noforwards);
            this.flags = flag10;
            outputSerializedData.writeInt32(flag10);
            outputSerializedData.writeInt32(this.id);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.out = TLObject.hasFlag(readInt32, 1);
            this.id = inputSerializedData.readInt32(z);
            this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.receiver_id = inputSerializedData.readInt64(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.top_msg_id = inputSerializedData.readInt32(z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.entities = Vector.deserialize(inputSerializedData, new yw6((byte) 25), z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            boolean z2;
            boolean z3;
            outputSerializedData.writeInt32(-641278950);
            boolean z4 = true;
            int flag = TLObject.setFlag(this.flags, 1, this.out);
            this.flags = flag;
            if (this.entities != null) {
                z = true;
            } else {
                z = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z);
            this.flags = flag2;
            if (this.media != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 8, z2);
            this.flags = flag3;
            if (this.reply_markup != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 16, z3);
            this.flags = flag4;
            if (this.reply_to == null) {
                z4 = false;
            }
            int flag5 = TLObject.setFlag(flag4, 64, z4);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            outputSerializedData.writeInt32(this.id);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.out = TLObject.hasFlag(readInt32, 1);
            this.welcome = TLObject.hasFlag(this.flags, 32);
            this.invert_media = TLObject.hasFlag(this.flags, 128);
            this.id = inputSerializedData.readInt32(z);
            this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.receiver_id = inputSerializedData.readInt64(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.top_msg_id = inputSerializedData.readInt32(z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.entities = Vector.deserialize(inputSerializedData, new yw6((byte) 25), z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.rich_message = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            outputSerializedData.writeInt32(-1896618863);
            boolean z5 = true;
            int flag = TLObject.setFlag(this.flags, 1, this.out);
            this.flags = flag;
            if (this.entities != null) {
                z = true;
            } else {
                z = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z);
            this.flags = flag2;
            if (this.media != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 8, z2);
            this.flags = flag3;
            if (this.reply_markup != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 16, z3);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 32, this.welcome);
            this.flags = flag5;
            if (this.reply_to != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag6 = TLObject.setFlag(flag5, 64, z4);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 128, this.invert_media);
            this.flags = flag7;
            if (this.rich_message == null) {
                z5 = false;
            }
            int flag8 = TLObject.setFlag(flag7, 256, z5);
            this.flags = flag8;
            outputSerializedData.writeInt32(flag8);
            outputSerializedData.writeInt32(this.id);
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

    public static class TL_welcomeMessages extends WelcomeMessages {
        public static final int constructor = 273664114;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.hash = inputSerializedData.readInt64(z);
            this.messages = Vector.deserialize(inputSerializedData, new yw6((byte) 26), z);
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

        public static WelcomeMessages TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (WelcomeMessages) TLObject.TLdeserialize(WelcomeMessages.class, fromConstructor(i), inputSerializedData, i, z);
        }

        private static WelcomeMessages fromConstructor(int i) {
            if (i != 273664114) {
                if (i != 1509940017) {
                    return null;
                }
                return new TL_welcomeMessagesNotModified();
            }
            return new TL_welcomeMessages();
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
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_deleteMessage extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1829312617;
        public int flags;
        public int id;
        public TLRPC.InputPeer peer;
        public TLRPC.InputUser receiver_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-1829312617);
            int i = this.flags;
            if (this.peer != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 1, z);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.peer.serializeToStream(outputSerializedData);
            }
            this.receiver_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_deleteWelcomeMessage extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -394090015;
        public int id;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-394090015);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_getCallbackAnswer extends TLMethod<TLRPC.TL_messages_botCallbackAnswer> {
        public static final int constructor = 1067738312;
        public byte[] data;
        public int flags;
        public int id;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(1067738312);
            int i = this.flags;
            if (this.data != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 2, z);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeByteArray(this.data);
            }
        }

        @Override
        public TLRPC.TL_messages_botCallbackAnswer deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.TL_messages_botCallbackAnswer.TLdeserialize(inputSerializedData, i, z);
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
        public WelcomeMessages deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return WelcomeMessages.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_reportMessage extends TLMethod<TLRPC.ReportResult> {
        public static final int constructor = -2029718849;
        public int id;
        public String message;
        public byte[] option;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2029718849);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeByteArray(this.option);
            outputSerializedData.writeString(this.message);
        }

        @Override
        public TLRPC.ReportResult deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.ReportResult.TLdeserialize(inputSerializedData, i, z);
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
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            outputSerializedData.writeInt32(-1165140171);
            int i = this.flags;
            boolean z6 = false;
            if (this.entities != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 2, z);
            this.flags = flag;
            if (this.media != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z2);
            this.flags = flag2;
            if (this.reply_markup != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 8, z3);
            this.flags = flag3;
            if (this.rich_message != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 16, z4);
            this.flags = flag4;
            if (this.reply_to != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            int flag5 = TLObject.setFlag(flag4, 32, z5);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 64, this.invert_media);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 128, this.welcome);
            this.flags = flag7;
            if (this.peer != null) {
                z6 = true;
            }
            int flag8 = TLObject.setFlag(flag7, 256, z6);
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
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_welcomeMessagesNotModified extends WelcomeMessages {
        public static final int constructor = 1509940017;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1509940017);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }
    }
}
