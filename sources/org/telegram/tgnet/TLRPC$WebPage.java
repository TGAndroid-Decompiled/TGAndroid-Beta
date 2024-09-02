package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$WebPage extends TLObject {
    public ArrayList<TLRPC$WebPageAttribute> attributes = new ArrayList<>();
    public String author;
    public TLRPC$Page cached_page;
    public int date;
    public String description;
    public String display_url;
    public String displayedText;
    public TLRPC$Document document;
    public int duration;
    public int embed_height;
    public String embed_type;
    public String embed_url;
    public int embed_width;
    public int flags;
    public int hash;
    public long id;
    public TLRPC$Photo photo;
    public String site_name;
    public String title;
    public String type;
    public String url;

    public static TLRPC$WebPage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$WebPage tLRPC$WebPage;
        switch (i) {
            case -2054908813:
                tLRPC$WebPage = new TLRPC$TL_webPageNotModified() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-2054908813);
                    }
                };
                break;
            case -1558273867:
                tLRPC$WebPage = new TLRPC$TL_webPage() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.url = abstractSerializedData2.readString(z2);
                        this.display_url = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.type = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.site_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.title = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.description = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.embed_url = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.embed_type = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.embed_width = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.embed_height = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 128) != 0) {
                            this.duration = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.author = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1558273867);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeString(this.url);
                        abstractSerializedData2.writeString(this.display_url);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.type);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.site_name);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.title);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.description);
                        }
                        if ((this.flags & 16) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeString(this.embed_url);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeString(this.embed_type);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.embed_width);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.embed_height);
                        }
                        if ((this.flags & 128) != 0) {
                            abstractSerializedData2.writeInt32(this.duration);
                        }
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeString(this.author);
                        }
                    }
                };
                break;
            case -1328464313:
                tLRPC$WebPage = new TLRPC$TL_webPagePending();
                break;
            case -981018084:
                tLRPC$WebPage = new TLRPC$TL_webPagePending() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-981018084);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case -897446185:
                tLRPC$WebPage = new TLRPC$TL_webPage() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.url = abstractSerializedData2.readString(z2);
                        this.display_url = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.type = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.site_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.title = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.description = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.embed_url = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.embed_type = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.embed_width = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.embed_height = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 128) != 0) {
                            this.duration = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-897446185);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeString(this.url);
                        abstractSerializedData2.writeString(this.display_url);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.type);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.site_name);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.title);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.description);
                        }
                        if ((this.flags & 16) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeString(this.embed_url);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeString(this.embed_type);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.embed_width);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.embed_height);
                        }
                        if ((this.flags & 128) != 0) {
                            abstractSerializedData2.writeInt32(this.duration);
                        }
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeString(this.author);
                        }
                        if ((this.flags & 512) != 0) {
                            this.document.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -736472729:
                tLRPC$WebPage = new TLRPC$TL_webPageUrlPending();
                break;
            case -392411726:
                tLRPC$WebPage = new TLRPC$TL_webPage();
                break;
            case -350980120:
                tLRPC$WebPage = new TLRPC$TL_webPageEmpty() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt64(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-350980120);
                        abstractSerializedData2.writeInt64(this.id);
                    }
                };
                break;
            case -94051982:
                tLRPC$WebPage = new TLRPC$TL_webPage() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.url = abstractSerializedData2.readString(z2);
                        this.display_url = abstractSerializedData2.readString(z2);
                        this.hash = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.type = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.site_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.title = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.description = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.embed_url = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.embed_type = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.embed_width = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.embed_height = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 128) != 0) {
                            this.duration = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            int readInt32 = abstractSerializedData2.readInt32(z2);
                            if (readInt32 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                                }
                                return;
                            }
                            TLRPC$TL_webPageAttributeTheme tLRPC$TL_webPageAttributeTheme = new TLRPC$TL_webPageAttributeTheme();
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$Document TLdeserialize = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                tLRPC$TL_webPageAttributeTheme.documents.add(TLdeserialize);
                            }
                            this.attributes.add(tLRPC$TL_webPageAttributeTheme);
                        }
                        if ((this.flags & 1024) != 0) {
                            this.cached_page = TLRPC$Page.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-94051982);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeString(this.url);
                        abstractSerializedData2.writeString(this.display_url);
                        abstractSerializedData2.writeInt32(this.hash);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.type);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.site_name);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.title);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.description);
                        }
                        if ((this.flags & 16) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeString(this.embed_url);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeString(this.embed_type);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.embed_width);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.embed_height);
                        }
                        if ((this.flags & 128) != 0) {
                            abstractSerializedData2.writeInt32(this.duration);
                        }
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeString(this.author);
                        }
                        if ((this.flags & 512) != 0) {
                            this.document.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            abstractSerializedData2.writeInt32(0);
                        }
                        if ((this.flags & 1024) != 0) {
                            this.cached_page.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 555358088:
                tLRPC$WebPage = new TLRPC$TL_webPageEmpty();
                break;
            case 1594340540:
                tLRPC$WebPage = new TLRPC$TL_webPage() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.url = abstractSerializedData2.readString(z2);
                        this.display_url = abstractSerializedData2.readString(z2);
                        this.hash = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.type = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.site_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.title = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.description = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.embed_url = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.embed_type = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.embed_width = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.embed_height = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 128) != 0) {
                            this.duration = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 1024) != 0) {
                            this.cached_page = TLRPC$Page.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1594340540);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeString(this.url);
                        abstractSerializedData2.writeString(this.display_url);
                        abstractSerializedData2.writeInt32(this.hash);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.type);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.site_name);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.title);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.description);
                        }
                        if ((this.flags & 16) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeString(this.embed_url);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeString(this.embed_type);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.embed_width);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.embed_height);
                        }
                        if ((this.flags & 128) != 0) {
                            abstractSerializedData2.writeInt32(this.duration);
                        }
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeString(this.author);
                        }
                        if ((this.flags & 512) != 0) {
                            this.document.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 1024) != 0) {
                            this.cached_page.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1930545681:
                tLRPC$WebPage = new TLRPC$TL_webPageNotModified();
                break;
            default:
                tLRPC$WebPage = null;
                break;
        }
        if (tLRPC$WebPage == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in WebPage", Integer.valueOf(i)));
        }
        if (tLRPC$WebPage != null) {
            tLRPC$WebPage.readParams(abstractSerializedData, z);
        }
        return tLRPC$WebPage;
    }
}
