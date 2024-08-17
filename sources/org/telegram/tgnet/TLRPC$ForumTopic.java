package org.telegram.tgnet;

public abstract class TLRPC$ForumTopic extends TLObject {
    public static TLRPC$ForumTopic TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ForumTopic tLRPC$TL_forumTopic = i != 37687451 ? i != 1495324380 ? i != 1903173033 ? null : new TLRPC$TL_forumTopic() : new TLRPC$TL_forumTopic_layer147() : new TLRPC$TL_forumTopicDeleted();
        if (tLRPC$TL_forumTopic == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ForumTopic", Integer.valueOf(i)));
        }
        if (tLRPC$TL_forumTopic != null) {
            tLRPC$TL_forumTopic.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_forumTopic;
    }
}
