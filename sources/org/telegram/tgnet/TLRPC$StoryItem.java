package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$StoryItem extends TLObject {
    public String attachPath;
    public String caption;
    public boolean close_friends;
    public boolean contacts;
    public int date;
    public long dialogId;
    public boolean edited;
    public int expire_date;
    public int fileReference;
    public String firstFramePath;
    public int flags;
    public int id;
    public boolean isPublic;
    public boolean justUploaded;
    public long lastUpdateTime;
    public TLRPC$MessageMedia media;
    public int messageId;
    public int messageType;
    public boolean min;
    public boolean noforwards;
    public boolean pinned;
    public boolean selected_contacts;
    public TLRPC$TL_storyViews views;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public ArrayList<TLRPC$PrivacyRule> privacy = new ArrayList<>();

    public static TLRPC$StoryItem TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$StoryItem tLRPC$TL_storyItem = i != -5388013 ? i != 1374088783 ? i != 1445635639 ? null : new TLRPC$TL_storyItem() : new TLRPC$TL_storyItemDeleted() : new TLRPC$TL_storyItemSkipped();
        if (tLRPC$TL_storyItem == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StoryItem", Integer.valueOf(i)));
        }
        if (tLRPC$TL_storyItem != null) {
            tLRPC$TL_storyItem.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_storyItem;
    }
}
