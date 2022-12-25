package org.telegram.tgnet;

public abstract class TLRPC$ForumTopic extends TLObject {
    public static TLRPC$ForumTopic TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ForumTopic tLRPC$TL_forumTopicDeleted;
        if (i == 37687451) {
            tLRPC$TL_forumTopicDeleted = new TLRPC$TL_forumTopicDeleted();
        } else if (i == 1495324380) {
            tLRPC$TL_forumTopicDeleted = new TLRPC$TL_forumTopic_layer147();
        } else {
            tLRPC$TL_forumTopicDeleted = i != 1903173033 ? null : new TLRPC$TL_forumTopic();
        }
        if (tLRPC$TL_forumTopicDeleted == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ForumTopic", Integer.valueOf(i)));
        }
        if (tLRPC$TL_forumTopicDeleted != null) {
            tLRPC$TL_forumTopicDeleted.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_forumTopicDeleted;
    }
}
