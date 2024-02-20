package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_pageBlockRelatedArticles extends TLRPC$PageBlock {
    public ArrayList<TLRPC$TL_pageRelatedArticle> articles = new ArrayList<>();
    public TLRPC$RichText title;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.title = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_pageRelatedArticle TLdeserialize = TLRPC$TL_pageRelatedArticle.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.articles.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(370236054);
        this.title.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.articles.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.articles.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
