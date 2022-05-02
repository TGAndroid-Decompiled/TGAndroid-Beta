package org.telegram.tgnet;

public abstract class TLRPC$PageBlock extends TLObject {
    public boolean bottom;
    public boolean first;
    public int groupId;
    public int level;
    public int mid;
    public TLRPC$PhotoSize thumb;
    public TLObject thumbObject;

    public static TLRPC$PageBlock TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PageBlock tLRPC$PageBlock;
        switch (i) {
            case -2143067670:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockAudio();
                break;
            case -1879401953:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockSubtitle();
                break;
            case -1702174239:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockOrderedList();
                break;
            case -1538310410:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockMap();
                break;
            case -1468953147:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockEmbed();
                break;
            case -1162877472:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockAuthorDate();
                break;
            case -1085412734:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockTable();
                break;
            case -1076861716:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockHeader();
                break;
            case -1066346178:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockPreformatted();
                break;
            case -840826671:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockEmbed() {
                    public static int constructor = -840826671;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.full_width = (readInt32 & 1) != 0;
                        if ((readInt32 & 8) != 0) {
                            z3 = true;
                        }
                        this.allow_scrolling = z3;
                        if ((readInt32 & 2) != 0) {
                            this.url = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.html = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.poster_photo_id = abstractSerializedData2.readInt64(z2);
                        }
                        this.f960w = abstractSerializedData2.readInt32(z2);
                        this.f959h = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_pageCaption tLRPC$TL_pageCaption = new TLRPC$TL_pageCaption();
                        this.caption = tLRPC$TL_pageCaption;
                        tLRPC$TL_pageCaption.text = TLRPC$RichText.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.caption.credit = new TLRPC$TL_textEmpty();
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.full_width ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.allow_scrolling ? i2 | 8 : i2 & (-9);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.url);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.html);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt64(this.poster_photo_id);
                        }
                        abstractSerializedData2.writeInt32(this.f960w);
                        abstractSerializedData2.writeInt32(this.f959h);
                        this.caption.text.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -837994576:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockAnchor();
                break;
            case -650782469:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockEmbed() {
                    public static int constructor = -650782469;
                    public boolean allow_scrolling;
                    public TLRPC$RichText caption;
                    public int flags;
                    public boolean full_width;
                    public int f961h;
                    public String html;
                    public String url;
                    public int f962w;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.full_width = (readInt32 & 1) != 0;
                        if ((readInt32 & 8) != 0) {
                            z3 = true;
                        }
                        this.allow_scrolling = z3;
                        if ((readInt32 & 2) != 0) {
                            this.url = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.html = abstractSerializedData2.readString(z2);
                        }
                        this.f962w = abstractSerializedData2.readInt32(z2);
                        this.f961h = abstractSerializedData2.readInt32(z2);
                        this.caption = TLRPC$RichText.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.full_width ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.allow_scrolling ? i2 | 8 : i2 & (-9);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.url);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.html);
                        }
                        abstractSerializedData2.writeInt32(this.f962w);
                        abstractSerializedData2.writeInt32(this.f961h);
                        this.caption.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -640214938:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockVideo() {
                    public static int constructor = -640214938;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.autoplay = (readInt32 & 1) != 0;
                        if ((readInt32 & 2) != 0) {
                            z3 = true;
                        }
                        this.loop = z3;
                        this.video_id = abstractSerializedData2.readInt64(z2);
                        TLRPC$TL_pageCaption tLRPC$TL_pageCaption = new TLRPC$TL_pageCaption();
                        this.caption = tLRPC$TL_pageCaption;
                        tLRPC$TL_pageCaption.text = TLRPC$RichText.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.caption.credit = new TLRPC$TL_textEmpty();
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.autoplay ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.loop ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt64(this.video_id);
                        this.caption.text.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -618614392:
                tLRPC$PageBlock = new TLRPC$PageBlock() {
                    public static int constructor = -618614392;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -454524911:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockList();
                break;
            case -372860542:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockPhoto() {
                    public static int constructor = -372860542;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.photo_id = abstractSerializedData2.readInt64(z2);
                        TLRPC$TL_pageCaption tLRPC$TL_pageCaption = new TLRPC$TL_pageCaption();
                        this.caption = tLRPC$TL_pageCaption;
                        tLRPC$TL_pageCaption.text = TLRPC$RichText.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.caption.credit = new TLRPC$TL_textEmpty();
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.photo_id);
                        this.caption.text.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -283684427:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockChannel();
                break;
            case -248793375:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockSubheader();
                break;
            case -229005301:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockEmbedPost();
                break;
            case 52401552:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockSlideshow();
                break;
            case 145955919:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockCollage() {
                    public static int constructor = 145955919;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$PageBlock TLdeserialize = TLRPC$PageBlock.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.items.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                            TLRPC$TL_pageCaption tLRPC$TL_pageCaption = new TLRPC$TL_pageCaption();
                            this.caption = tLRPC$TL_pageCaption;
                            tLRPC$TL_pageCaption.text = TLRPC$RichText.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.caption.credit = new TLRPC$TL_textEmpty();
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.items.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.items.get(i2).serializeToStream(abstractSerializedData2);
                        }
                        this.caption.text.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 319588707:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockSlideshow() {
                    public static int constructor = 319588707;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$PageBlock TLdeserialize = TLRPC$PageBlock.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.items.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                            TLRPC$TL_pageCaption tLRPC$TL_pageCaption = new TLRPC$TL_pageCaption();
                            this.caption = tLRPC$TL_pageCaption;
                            tLRPC$TL_pageCaption.text = TLRPC$RichText.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.caption.credit = new TLRPC$TL_textEmpty();
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.items.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.items.get(i2).serializeToStream(abstractSerializedData2);
                        }
                        this.caption.text.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 324435594:
                tLRPC$PageBlock = new TLRPC$PageBlock() {
                    public static int constructor = 324435594;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 370236054:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockRelatedArticles();
                break;
            case 391759200:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockPhoto();
                break;
            case 504660880:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockKicker();
                break;
            case 641563686:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockBlockquote();
                break;
            case 690781161:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockEmbedPost() {
                    public static int constructor = 690781161;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.url = abstractSerializedData2.readString(z2);
                        this.webpage_id = abstractSerializedData2.readInt64(z2);
                        this.author_photo_id = abstractSerializedData2.readInt64(z2);
                        this.author = abstractSerializedData2.readString(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$PageBlock TLdeserialize = TLRPC$PageBlock.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.blocks.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                            TLRPC$TL_pageCaption tLRPC$TL_pageCaption = new TLRPC$TL_pageCaption();
                            this.caption = tLRPC$TL_pageCaption;
                            tLRPC$TL_pageCaption.text = TLRPC$RichText.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.caption.credit = new TLRPC$TL_textEmpty();
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.url);
                        abstractSerializedData2.writeInt64(this.webpage_id);
                        abstractSerializedData2.writeInt64(this.author_photo_id);
                        abstractSerializedData2.writeString(this.author);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.blocks.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.blocks.get(i2).serializeToStream(abstractSerializedData2);
                        }
                        this.caption.text.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 834148991:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockAudio() {
                    public static int constructor = 834148991;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.audio_id = abstractSerializedData2.readInt64(z2);
                        TLRPC$TL_pageCaption tLRPC$TL_pageCaption = new TLRPC$TL_pageCaption();
                        this.caption = tLRPC$TL_pageCaption;
                        tLRPC$TL_pageCaption.text = TLRPC$RichText.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.caption.credit = new TLRPC$TL_textEmpty();
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.audio_id);
                        this.caption.text.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 972174080:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockCover();
                break;
            case 978896884:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockList() {
                    public static int constructor = 978896884;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.ordered = abstractSerializedData2.readBool(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$RichText TLdeserialize = TLRPC$RichText.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    TLRPC$TL_pageListItemText tLRPC$TL_pageListItemText = new TLRPC$TL_pageListItemText();
                                    tLRPC$TL_pageListItemText.text = TLdeserialize;
                                    this.items.add(tLRPC$TL_pageListItemText);
                                } else {
                                    return;
                                }
                            }
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeBool(this.ordered);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.items.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            ((TLRPC$TL_pageListItemText) this.items.get(i2)).text.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1029399794:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockAuthorDate() {
                    public static int constructor = 1029399794;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        String readString = abstractSerializedData2.readString(z2);
                        TLRPC$TL_textPlain tLRPC$TL_textPlain = new TLRPC$TL_textPlain();
                        this.author = tLRPC$TL_textPlain;
                        tLRPC$TL_textPlain.text = readString;
                        this.published_date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(((TLRPC$TL_textPlain) this.author).text);
                        abstractSerializedData2.writeInt32(this.published_date);
                    }
                };
                break;
            case 1182402406:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockParagraph();
                break;
            case 1216809369:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockFooter();
                break;
            case 1329878739:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockPullquote();
                break;
            case 1705048653:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockCollage();
                break;
            case 1890305021:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockTitle();
                break;
            case 1987480557:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockDetails();
                break;
            case 2089805750:
                tLRPC$PageBlock = new TLRPC$TL_pageBlockVideo();
                break;
            default:
                tLRPC$PageBlock = null;
                break;
        }
        if (tLRPC$PageBlock != null || !z) {
            if (tLRPC$PageBlock != null) {
                tLRPC$PageBlock.readParams(abstractSerializedData, z);
            }
            return tLRPC$PageBlock;
        }
        throw new RuntimeException(String.format("can't parse magic %x in PageBlock", Integer.valueOf(i)));
    }
}
