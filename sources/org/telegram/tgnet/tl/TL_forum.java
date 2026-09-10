package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public class TL_forum {

    public static class TL_messages_createForumTopic extends TLMethod<TLRPC.Updates> {
        public static final int constructor = 798540757;
        public int flags;
        public int icon_color;
        public long icon_emoji_id;
        public TLRPC.InputPeer peer;
        public long random_id;
        public TLRPC.InputPeer send_as;
        public String title;
        public boolean title_missing;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(798540757);
            int i10 = this.flags;
            if (this.send_as != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 4, z10);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.title_missing);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.icon_color);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.icon_emoji_id);
            }
            outputSerializedData.writeInt64(this.random_id);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.send_as.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_messages_deleteTopicHistory extends TLMethod<TLRPC.TL_messages_affectedHistory> {
        public static final int constructor = -763269360;
        public TLRPC.InputPeer peer;
        public int top_msg_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-763269360);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.top_msg_id);
        }

        @Override
        public TLRPC.TL_messages_affectedHistory deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.TL_messages_affectedHistory.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_messages_editForumTopic extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -825487052;
        public boolean closed;
        public int flags;
        public boolean hidden;
        public long icon_emoji_id;
        public TLRPC.InputPeer peer;
        public String title;
        public int topic_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-825487052);
            int i10 = this.flags;
            if (this.title != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 1, z10);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.topic_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.icon_emoji_id);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeBool(this.closed);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeBool(this.hidden);
            }
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_messages_getForumTopics extends TLMethod<TLRPC.TL_messages_forumTopics> {
        public static final int constructor = 1000635391;
        public int limit;
        public int offset_date;
        public int offset_id;
        public int offset_topic;
        public TLRPC.InputPeer peer;
        public String f17416q;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(1000635391);
            if (this.f17416q != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.f17416q);
            }
            outputSerializedData.writeInt32(this.offset_date);
            outputSerializedData.writeInt32(this.offset_id);
            outputSerializedData.writeInt32(this.offset_topic);
            outputSerializedData.writeInt32(this.limit);
        }

        @Override
        public TLRPC.TL_messages_forumTopics deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.TL_messages_forumTopics.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_messages_getForumTopicsByID extends TLMethod<TLRPC.TL_messages_forumTopics> {
        public static final int constructor = -1358280184;
        public TLRPC.InputPeer peer;
        public ArrayList<Integer> topics = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1358280184);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.topics);
        }

        @Override
        public TLRPC.TL_messages_forumTopics deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.TL_messages_forumTopics.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_messages_reorderPinnedForumTopics extends TLObject {
        public static final int constructor = 242762224;
        public boolean force;
        public ArrayList<Integer> order = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(242762224);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.force));
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.order);
        }
    }

    public static class TL_messages_updatePinnedForumTopic extends TLObject {
        public static final int constructor = 392032849;
        public TLRPC.InputPeer peer;
        public boolean pinned;
        public int topic_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(392032849);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.topic_id);
            outputSerializedData.writeBool(this.pinned);
        }
    }

    private TL_forum() {
    }
}
