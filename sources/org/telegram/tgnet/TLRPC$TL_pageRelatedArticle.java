package org.telegram.tgnet;
public class TLRPC$TL_pageRelatedArticle extends TLObject {
    public String author;
    public String description;
    public int flags;
    public long photo_id;
    public int published_date;
    public String title;
    public String url;
    public long webpage_id;

    public static TLRPC$TL_pageRelatedArticle TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1282352120 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_pageRelatedArticle", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_pageRelatedArticle tLRPC$TL_pageRelatedArticle = new TLRPC$TL_pageRelatedArticle();
        tLRPC$TL_pageRelatedArticle.readParams(abstractSerializedData, z);
        return tLRPC$TL_pageRelatedArticle;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.url = abstractSerializedData.readString(z);
        this.webpage_id = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            this.title = abstractSerializedData.readString(z);
        }
        if ((this.flags & 2) != 0) {
            this.description = abstractSerializedData.readString(z);
        }
        if ((this.flags & 4) != 0) {
            this.photo_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 8) != 0) {
            this.author = abstractSerializedData.readString(z);
        }
        if ((this.flags & 16) != 0) {
            this.published_date = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1282352120);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.url);
        abstractSerializedData.writeInt64(this.webpage_id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.title);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.description);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt64(this.photo_id);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.author);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.published_date);
        }
    }
}
