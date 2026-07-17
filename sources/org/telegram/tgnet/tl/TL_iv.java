package org.telegram.tgnet.tl;

import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLRPC$TL_inputMediaUploadedDocument$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowUsers$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLRPC$TL_photos_photos$$ExternalSyntheticLambda0;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;

public class TL_iv {

    public static abstract class Page extends TLObject {
        public int flags;
        public File local;
        public boolean part;
        public boolean rtl;
        public String url;
        public boolean v2;
        public int views;
        public boolean web;
        public ArrayList<PageBlock> blocks = new ArrayList<>();
        public ArrayList<TLRPC.Photo> photos = new ArrayList<>();
        public ArrayList<TLRPC.Document> documents = new ArrayList<>();

        private static Page fromConstructor(int i) {
            switch (i) {
                case -1913754556:
                    return new TL_pagePart_layer67();
                case -1908433218:
                    return new TL_pagePart_layer82();
                case -1738178803:
                    return new TL_page();
                case -1366746132:
                    return new TL_page_layer110();
                case -677274263:
                    return new TL_pageFull_layer67();
                case -241590104:
                    return new TL_page_layer88();
                case 1433323434:
                    return new TL_pageFull_layer82();
                default:
                    return null;
            }
        }

        public static Page TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (Page) TLObject.TLdeserialize(Page.class, fromConstructor(i), inputSerializedData, i, z);
        }
    }

    public static class TL_page extends Page {
        public static final int constructor = -1738178803;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.part = TLObject.hasFlag(int32, 1);
            this.rtl = TLObject.hasFlag(this.flags, 2);
            this.v2 = TLObject.hasFlag(this.flags, 4);
            this.url = inputSerializedData.readString(z);
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.photos = Vector.deserialize(inputSerializedData, new TLRPC$TL_photos_photos$$ExternalSyntheticLambda0(), z);
            this.documents = Vector.deserialize(inputSerializedData, new TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0(), z);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1738178803);
            int flag = TLObject.setFlag(this.flags, 1, this.part);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.rtl);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.v2);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeString(this.url);
            Vector.serialize(outputSerializedData, this.blocks);
            Vector.serialize(outputSerializedData, this.photos);
            Vector.serialize(outputSerializedData, this.documents);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.views);
            }
        }
    }

    public static class TL_page_layer110 extends TL_page {
        public static final int constructor = -1366746132;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.part = TLObject.hasFlag(int32, 1);
            this.rtl = TLObject.hasFlag(this.flags, 2);
            this.url = inputSerializedData.readString(z);
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.photos = Vector.deserialize(inputSerializedData, new TLRPC$TL_photos_photos$$ExternalSyntheticLambda0(), z);
            this.documents = Vector.deserialize(inputSerializedData, new TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1366746132);
            int flag = TLObject.setFlag(this.flags, 1, this.part);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.rtl);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeString(this.url);
            Vector.serialize(outputSerializedData, this.blocks);
            Vector.serialize(outputSerializedData, this.photos);
            Vector.serialize(outputSerializedData, this.documents);
        }
    }

    public static class TL_page_layer88 extends TL_page {
        public static final int constructor = -241590104;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.part = TLObject.hasFlag(int32, 1);
            this.rtl = TLObject.hasFlag(this.flags, 2);
            this.v2 = TLObject.hasFlag(this.flags, 4);
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.photos = Vector.deserialize(inputSerializedData, new TLRPC$TL_photos_photos$$ExternalSyntheticLambda0(), z);
            this.documents = Vector.deserialize(inputSerializedData, new TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-241590104);
            int flag = TLObject.setFlag(this.flags, 1, this.part);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.rtl);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.v2);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            Vector.serialize(outputSerializedData, this.blocks);
            Vector.serialize(outputSerializedData, this.photos);
            Vector.serialize(outputSerializedData, this.documents);
        }
    }

    public static class TL_pagePart_layer82 extends TL_page {
        public static final int constructor = -1908433218;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.part = true;
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.photos = Vector.deserialize(inputSerializedData, new TLRPC$TL_photos_photos$$ExternalSyntheticLambda0(), z);
            this.documents = Vector.deserialize(inputSerializedData, new TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1908433218);
            Vector.serialize(outputSerializedData, this.blocks);
            Vector.serialize(outputSerializedData, this.photos);
            Vector.serialize(outputSerializedData, this.documents);
        }
    }

    public static class TL_pagePart_layer67 extends TL_pagePart_layer82 {
        public static final int constructor = -1913754556;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.part = true;
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.photos = Vector.deserialize(inputSerializedData, new TLRPC$TL_photos_photos$$ExternalSyntheticLambda0(), z);
            this.documents = Vector.deserialize(inputSerializedData, new TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1913754556);
            Vector.serialize(outputSerializedData, this.blocks);
            Vector.serialize(outputSerializedData, this.photos);
            Vector.serialize(outputSerializedData, this.documents);
        }
    }

    public static class TL_pageFull_layer82 extends TL_page {
        public static final int constructor = 1433323434;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.photos = Vector.deserialize(inputSerializedData, new TLRPC$TL_photos_photos$$ExternalSyntheticLambda0(), z);
            this.documents = Vector.deserialize(inputSerializedData, new TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1433323434);
            Vector.serialize(outputSerializedData, this.blocks);
            Vector.serialize(outputSerializedData, this.photos);
            Vector.serialize(outputSerializedData, this.documents);
        }
    }

    public static class TL_pageFull_layer67 extends TL_page {
        public static final int constructor = -677274263;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.photos = Vector.deserialize(inputSerializedData, new TLRPC$TL_photos_photos$$ExternalSyntheticLambda0(), z);
            this.documents = Vector.deserialize(inputSerializedData, new TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-677274263);
            Vector.serialize(outputSerializedData, this.blocks);
            Vector.serialize(outputSerializedData, this.photos);
            Vector.serialize(outputSerializedData, this.documents);
        }
    }

    public static class RichMessage extends TLObject {
        public static final int constructor = -1158439541;
        public int flags;
        public boolean part;
        public boolean rtl;
        public ArrayList<PageBlock> blocks = new ArrayList<>();
        public ArrayList<TLRPC.Photo> photos = new ArrayList<>();
        public ArrayList<TLRPC.Document> documents = new ArrayList<>();

        public static RichMessage TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (RichMessage) TLObject.TLdeserialize(RichMessage.class, i != -1158439541 ? null : new RichMessage(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.rtl = TLObject.hasFlag(int32, 1);
            this.part = TLObject.hasFlag(this.flags, 2);
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.photos = Vector.deserialize(inputSerializedData, new TLRPC$TL_photos_photos$$ExternalSyntheticLambda0(), z);
            this.documents = Vector.deserialize(inputSerializedData, new TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1158439541);
            int flag = TLObject.setFlag(this.flags, 1, this.rtl);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.part);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            Vector.serialize(outputSerializedData, this.blocks);
            Vector.serialize(outputSerializedData, this.photos);
            Vector.serialize(outputSerializedData, this.documents);
        }
    }

    public static class TL_inputRichMessage extends TLObject {
        public static final int constructor = -456898052;
        public int flags;
        public boolean noautolink;
        public boolean rtl;
        public ArrayList<PageBlock> blocks = new ArrayList<>();
        public ArrayList<TLRPC.InputPhoto> photos = new ArrayList<>();
        public ArrayList<TLRPC.InputDocument> documents = new ArrayList<>();
        public ArrayList<TLRPC.InputUser> users = new ArrayList<>();

        public static TL_inputRichMessage TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_inputRichMessage) TLObject.TLdeserialize(TL_inputRichMessage.class, i != -456898052 ? null : new TL_inputRichMessage(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.rtl = TLObject.hasFlag(int32, 1);
            this.noautolink = TLObject.hasFlag(this.flags, 2);
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photos = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                    @Override
                    public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                        return TLRPC.InputPhoto.TLdeserialize(inputSerializedData2, i, z2);
                    }
                }, z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.documents = Vector.deserialize(inputSerializedData, new TLRPC$TL_inputMediaUploadedDocument$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_inputPrivacyValueAllowUsers$$ExternalSyntheticLambda0(), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-456898052);
            int flag = TLObject.setFlag(this.flags, 1, this.rtl);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.noautolink);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            Vector.serialize(outputSerializedData, this.blocks);
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.photos);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                Vector.serialize(outputSerializedData, this.documents);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serialize(outputSerializedData, this.users);
            }
        }
    }

    public static abstract class RichText extends TLObject {
        public String email;
        public RichText parentRichText;
        public RichText text;
        public ArrayList<RichText> texts = new ArrayList<>();
        public String url;
        public long webpage_id;

        private static RichText fromConstructor(int i) {
            switch (i) {
                case -1769551024:
                    return new textDiff();
                case -1678197867:
                    return new textStrike();
                case -1657885545:
                    return new textMath();
                case -1570679104:
                    return new textCustomEmoji();
                case -1514906069:
                    return new textDate();
                case -1402305622:
                    return new textAutoUrl();
                case -1185513171:
                    return new textBankCard();
                case -1054465340:
                    return new textUnderline();
                case -984177571:
                    return new textAutoEmail();
                case -939827711:
                    return new textSuperscript();
                case -853225660:
                    return new textMention();
                case -653089380:
                    return new textItalic();
                case -599948721:
                    return new textEmpty();
                case -564523562:
                    return new textEmail();
                case -311786236:
                    return new textSubscript();
                case 27917308:
                    return new textMentionName();
                case 50276819:
                    return new textBotCommand();
                case 55281185:
                    return new textMarked();
                case 136105807:
                    return new textImage();
                case 483104362:
                    return new textPhone();
                case 616720265:
                    return new textAutoPhone();
                case 894777186:
                    return new textAnchor();
                case 1009288385:
                    return new textUrl();
                case 1277844834:
                    return new textSpoiler();
                case 1368728810:
                    return new textHashtag();
                case 1730456516:
                    return new textBold();
                case 1816074681:
                    return new textFixed();
                case 1950782688:
                    return new textPlain();
                case 2073958401:
                    return new textCashtag();
                case 2120376535:
                    return new textConcat();
                default:
                    return null;
            }
        }

        public static RichText TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (RichText) TLObject.TLdeserialize(RichText.class, fromConstructor(i), inputSerializedData, i, z);
        }
    }

    public static class textEmpty extends RichText {
        public static final int constructor = -599948721;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-599948721);
        }
    }

    public static class textPlain extends RichText {
        public static final int constructor = 1950782688;
        public String text;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1950782688);
            outputSerializedData.writeString(this.text);
        }
    }

    public static class textBold extends RichText {
        public static final int constructor = 1730456516;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1730456516);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textItalic extends RichText {
        public static final int constructor = -653089380;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-653089380);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textUnderline extends RichText {
        public static final int constructor = -1054465340;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1054465340);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textStrike extends RichText {
        public static final int constructor = -1678197867;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1678197867);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textFixed extends RichText {
        public static final int constructor = 1816074681;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1816074681);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textUrl extends RichText {
        public static final int constructor = 1009288385;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.url = inputSerializedData.readString(z);
            this.webpage_id = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1009288385);
            this.text.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeInt64(this.webpage_id);
        }
    }

    public static class textEmail extends RichText {
        public static final int constructor = -564523562;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.email = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-564523562);
            this.text.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.email);
        }
    }

    public static class textConcat extends RichText {
        public static final int constructor = 2120376535;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.texts = Vector.deserialize(inputSerializedData, new TL_iv$pageBlockList_layer82$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2120376535);
            Vector.serialize(outputSerializedData, this.texts);
        }
    }

    public static class textSubscript extends RichText {
        public static final int constructor = -311786236;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-311786236);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textSuperscript extends RichText {
        public static final int constructor = -939827711;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-939827711);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textMarked extends RichText {
        public static final int constructor = 55281185;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(55281185);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textPhone extends RichText {
        public static final int constructor = 483104362;
        public String phone;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.phone = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(483104362);
            this.text.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.phone);
        }
    }

    public static class textImage extends RichText {
        public static final int constructor = 136105807;
        public long document_id;
        public int h;
        public long photo_id;
        public int w;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.document_id = inputSerializedData.readInt64(z);
            this.w = inputSerializedData.readInt32(z);
            this.h = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(136105807);
            outputSerializedData.writeInt64(this.document_id);
            outputSerializedData.writeInt32(this.w);
            outputSerializedData.writeInt32(this.h);
        }
    }

    public static class textAnchor extends RichText {
        public static final int constructor = 894777186;
        public String name;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.name = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(894777186);
            this.text.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.name);
        }
    }

    public static class textMath extends RichText {
        public static final int constructor = -1657885545;
        public Bitmap bitmap;
        public int depth;
        public int h;
        public String source;
        public boolean tried;
        public int w;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.source = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1657885545);
            outputSerializedData.writeString(this.source);
        }
    }

    public static class textCustomEmoji extends RichText {
        public static final int constructor = -1570679104;
        public String alt;
        public long document_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.document_id = inputSerializedData.readInt64(z);
            this.alt = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1570679104);
            outputSerializedData.writeInt64(this.document_id);
            outputSerializedData.writeString(this.alt);
        }
    }

    public static class textSpoiler extends RichText {
        public static final int constructor = 1277844834;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1277844834);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textMention extends RichText {
        public static final int constructor = -853225660;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-853225660);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textHashtag extends RichText {
        public static final int constructor = 1368728810;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1368728810);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textBotCommand extends RichText {
        public static final int constructor = 50276819;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(50276819);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textCashtag extends RichText {
        public static final int constructor = 2073958401;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2073958401);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textAutoUrl extends RichText {
        public static final int constructor = -1402305622;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1402305622);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textAutoEmail extends RichText {
        public static final int constructor = -984177571;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-984177571);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textAutoPhone extends RichText {
        public static final int constructor = 616720265;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(616720265);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textBankCard extends RichText {
        public static final int constructor = -1185513171;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1185513171);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class textMentionName extends RichText {
        public static final int constructor = 27917308;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.user_id = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(27917308);
            this.text.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.user_id);
        }
    }

    public static class textDate extends RichText {
        public static final int constructor = -1514906069;
        public int date;
        public boolean day_of_week;
        public int flags;
        public boolean long_date;
        public boolean long_time;
        public boolean relative;
        public boolean short_date;
        public boolean short_time;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.relative = TLObject.hasFlag(int32, 1);
            this.short_time = TLObject.hasFlag(this.flags, 2);
            this.long_time = TLObject.hasFlag(this.flags, 4);
            this.short_date = TLObject.hasFlag(this.flags, 8);
            this.long_date = TLObject.hasFlag(this.flags, 16);
            this.day_of_week = TLObject.hasFlag(this.flags, 32);
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1514906069);
            int flag = TLObject.setFlag(this.flags, 1, this.relative);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.short_time);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.long_time);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.short_date);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16, this.long_date);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 32, this.day_of_week);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            this.text.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
        }
    }

    public static class textDiff extends RichText {
        public static final int constructor = -1769551024;
        public RichText old_text;
        public RichText text;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.old_text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1769551024);
            this.text.serializeToStream(outputSerializedData);
            this.old_text.serializeToStream(outputSerializedData);
        }
    }

    public static abstract class PageBlock extends TLObject {
        public boolean bottom;
        public int cachedHeight;
        public int cachedWidth;
        public PageCaption caption;
        public boolean first;
        public int groupId;
        public int level;
        public int mid;
        public int quoteLevels;
        public RichText text;
        public TLRPC.PhotoSize thumb;
        public TLObject thumbObject;

        private static PageBlock fromConstructor(int i) {
            switch (i) {
                case -2143067670:
                    return new pageBlockAudio();
                case -1879401953:
                    return new pageBlockSubtitle();
                case -1702174239:
                    return new pageBlockOrderedList_layer226();
                case -1538310410:
                    return new pageBlockMap();
                case -1468953147:
                    return new pageBlockEmbed();
                case -1254983893:
                    return new pageBlockHeading4();
                case -1162877472:
                    return new pageBlockAuthorDate();
                case -1157691601:
                    return new pageBlockHeading1();
                case -1085412734:
                    return new pageBlockTable();
                case -1076861716:
                    return new pageBlockHeader();
                case -1066346178:
                    return new pageBlockPreformatted();
                case -840826671:
                    return new pageBlockEmbed_layer82();
                case -837994576:
                    return new pageBlockAnchor();
                case -650782469:
                    return new pageBlockEmbed_layer60();
                case -640214938:
                    return new pageBlockVideo_layer82();
                case -618614392:
                    return new pageBlockDivider();
                case -608277398:
                    return new pageBlockHeading5();
                case -454524911:
                    return new pageBlockList();
                case -372860542:
                    return new pageBlockPhoto_layer82();
                case -283684427:
                    return new pageBlockChannel();
                case -248793375:
                    return new pageBlockSubheader();
                case -229005301:
                    return new pageBlockEmbedPost();
                case 52401552:
                    return new pageBlockSlideshow();
                case 145955919:
                    return new pageBlockCollage_layer82();
                case 158018284:
                    return new pageBlockHeading2();
                case 242108356:
                    return new pageBlockBlockquoteBlocks();
                case 319588707:
                    return new pageBlockSlideshow_layer82();
                case 324435594:
                    return new pageBlockUnsupported();
                case 370236054:
                    return new pageBlockRelatedArticles();
                case 391759200:
                    return new pageBlockPhoto();
                case 504660880:
                    return new pageBlockKicker();
                case 534181569:
                    return new pageBlockOrderedList();
                case 641563686:
                    return new pageBlockBlockquote();
                case 690781161:
                    return new pageBlockEmbedPost_layer82();
                case 834148991:
                    return new pageBlockAudio_layer82();
                case 972174080:
                    return new pageBlockCover();
                case 978896884:
                    return new pageBlockList_layer82();
                case 1009361890:
                    return new pageBlockThinking();
                case 1029399794:
                    return new pageBlockAuthorDate_layer60();
                case 1182402406:
                    return new pageBlockParagraph();
                case 1216809369:
                    return new pageBlockFooter();
                case 1329878739:
                    return new pageBlockPullquote();
                case 1464557951:
                    return new inputPageBlockMap();
                case 1493699616:
                    return new pageBlockMath();
                case 1705048653:
                    return new pageBlockCollage();
                case 1743204781:
                    return new pageBlockHeading3();
                case 1747599785:
                    return new pageBlockHeading6();
                case 1890305021:
                    return new pageBlockTitle();
                case 1987480557:
                    return new pageBlockDetails();
                case 2089805750:
                    return new pageBlockVideo();
                default:
                    return null;
            }
        }

        public static PageBlock TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (PageBlock) TLObject.TLdeserialize(PageBlock.class, fromConstructor(i), inputSerializedData, i, z);
        }
    }

    public static class pageBlockUnsupported extends PageBlock {
        public static final int constructor = 324435594;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(324435594);
        }
    }

    public static class pageBlockTitle extends PageBlock {
        public static final int constructor = 1890305021;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1890305021);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockSubtitle extends PageBlock {
        public static final int constructor = -1879401953;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1879401953);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockAuthorDate extends PageBlock {
        public static final int constructor = -1162877472;
        public RichText author;
        public int published_date;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.author = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.published_date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1162877472);
            this.author.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.published_date);
        }
    }

    public static class pageBlockAuthorDate_layer60 extends pageBlockAuthorDate {
        public static final int constructor = 1029399794;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            String string = inputSerializedData.readString(z);
            textPlain textplain = new textPlain();
            this.author = textplain;
            textplain.text = string;
            this.published_date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1029399794);
            outputSerializedData.writeString(((textPlain) this.author).text);
            outputSerializedData.writeInt32(this.published_date);
        }
    }

    public static class pageBlockHeader extends PageBlock {
        public static final int constructor = -1076861716;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1076861716);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockSubheader extends PageBlock {
        public static final int constructor = -248793375;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-248793375);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockParagraph extends PageBlock {
        public static final int constructor = 1182402406;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1182402406);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockPreformatted extends PageBlock {
        public static final int constructor = -1066346178;
        public String language;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.language = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1066346178);
            this.text.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.language);
        }
    }

    public static class pageBlockFooter extends PageBlock {
        public static final int constructor = 1216809369;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1216809369);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockDivider extends PageBlock {
        public static final int constructor = -618614392;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-618614392);
        }
    }

    public static class pageBlockAnchor extends PageBlock {
        public static final int constructor = -837994576;
        public String name;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.name = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-837994576);
            outputSerializedData.writeString(this.name);
        }
    }

    public static class pageBlockList extends PageBlock {
        public static final int constructor = -454524911;
        public ArrayList<PageListItem> items = new ArrayList<>();
        public boolean ordered;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.items = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_iv.PageListItem.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-454524911);
            Vector.serialize(outputSerializedData, this.items);
        }
    }

    public static class pageBlockList_layer82 extends pageBlockList {
        public static final int constructor = 978896884;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.ordered = inputSerializedData.readBool(z);
            Iterator it = Vector.deserialize(inputSerializedData, new TL_iv$pageBlockList_layer82$$ExternalSyntheticLambda0(), z).iterator();
            while (it.hasNext()) {
                RichText richText = (RichText) it.next();
                TL_pageListItemText tL_pageListItemText = new TL_pageListItemText();
                tL_pageListItemText.text = richText;
                this.items.add(tL_pageListItemText);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(978896884);
            outputSerializedData.writeBool(this.ordered);
            ArrayList arrayList = new ArrayList(this.items.size());
            Iterator<PageListItem> it = this.items.iterator();
            while (it.hasNext()) {
                PageListItem next = it.next();
                if (next instanceof TL_pageListItemText) {
                    arrayList.add(((TL_pageListItemText) next).text);
                }
            }
            Vector.serialize(outputSerializedData, arrayList);
        }
    }

    public static class pageBlockBlockquote extends PageBlock {
        public static final int constructor = 641563686;
        public RichText caption;
        public boolean collapsed;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.caption = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(641563686);
            this.text.serializeToStream(outputSerializedData);
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockBlockquoteBlocks extends PageBlock {
        public static final int constructor = 242108356;
        public ArrayList<PageBlock> blocks = new ArrayList<>();
        public RichText caption;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.caption = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(242108356);
            Vector.serialize(outputSerializedData, this.blocks);
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockPullquote extends PageBlock {
        public static final int constructor = 1329878739;
        public RichText caption;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.caption = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1329878739);
            this.text.serializeToStream(outputSerializedData);
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockPhoto extends PageBlock {
        public static final int constructor = 391759200;
        public int flags;
        public long photo_id;
        public boolean spoiler;
        public String url;
        public long webpage_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.spoiler = TLObject.hasFlag(int32, 2);
            this.photo_id = inputSerializedData.readInt64(z);
            this.caption = PageCaption.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.url = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.webpage_id = inputSerializedData.readInt64(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(391759200);
            int flag = TLObject.setFlag(this.flags, 2, this.spoiler);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.photo_id);
            this.caption.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.url);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.webpage_id);
            }
        }
    }

    public static class pageBlockPhoto_layer82 extends pageBlockPhoto {
        public static final int constructor = -372860542;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.photo_id = inputSerializedData.readInt64(z);
            PageCaption pageCaption = new PageCaption();
            this.caption = pageCaption;
            pageCaption.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.caption.credit = new textEmpty();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-372860542);
            outputSerializedData.writeInt64(this.photo_id);
            this.caption.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockVideo extends PageBlock {
        public static final int constructor = 2089805750;
        public boolean autoplay;
        public int flags;
        public boolean loop;
        public boolean spoiler;
        public long video_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.autoplay = TLObject.hasFlag(int32, 1);
            this.loop = TLObject.hasFlag(this.flags, 2);
            this.spoiler = TLObject.hasFlag(this.flags, 4);
            this.video_id = inputSerializedData.readInt64(z);
            this.caption = PageCaption.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2089805750);
            int flag = TLObject.setFlag(this.flags, 1, this.autoplay);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.loop);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.spoiler);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt64(this.video_id);
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockVideo_layer82 extends pageBlockVideo {
        public static final int constructor = -640214938;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.autoplay = TLObject.hasFlag(int32, 1);
            this.loop = TLObject.hasFlag(this.flags, 2);
            this.video_id = inputSerializedData.readInt64(z);
            PageCaption pageCaption = new PageCaption();
            this.caption = pageCaption;
            pageCaption.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.caption.credit = new textEmpty();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-640214938);
            int flag = TLObject.setFlag(this.flags, 1, this.autoplay);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.loop);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt64(this.video_id);
            this.caption.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockCover extends PageBlock {
        public static final int constructor = 972174080;
        public PageBlock cover;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.cover = PageBlock.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(972174080);
            this.cover.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockEmbed extends PageBlock {
        public static final int constructor = -1468953147;
        public boolean allow_scrolling;
        public int flags;
        public boolean full_width;
        public int h;
        public String html;
        public long poster_photo_id;
        public String url;
        public int w;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.full_width = TLObject.hasFlag(int32, 1);
            this.allow_scrolling = TLObject.hasFlag(this.flags, 8);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.url = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.html = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.poster_photo_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.w = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.h = inputSerializedData.readInt32(z);
            }
            this.caption = PageCaption.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1468953147);
            int flag = TLObject.setFlag(this.flags, 1, this.full_width);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 8, this.allow_scrolling);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.url);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.html);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.poster_photo_id);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.w);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.h);
            }
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockEmbed_layer82 extends pageBlockEmbed {
        public static final int constructor = -840826671;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.full_width = TLObject.hasFlag(int32, 1);
            this.allow_scrolling = TLObject.hasFlag(this.flags, 8);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.url = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.html = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.poster_photo_id = inputSerializedData.readInt64(z);
            }
            this.w = inputSerializedData.readInt32(z);
            this.h = inputSerializedData.readInt32(z);
            PageCaption pageCaption = new PageCaption();
            this.caption = pageCaption;
            pageCaption.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.caption.credit = new textEmpty();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-840826671);
            int flag = TLObject.setFlag(this.flags, 1, this.full_width);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 8, this.allow_scrolling);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.url);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.html);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.poster_photo_id);
            }
            outputSerializedData.writeInt32(this.w);
            outputSerializedData.writeInt32(this.h);
            this.caption.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockEmbed_layer60 extends pageBlockEmbed {
        public static final int constructor = -650782469;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.full_width = TLObject.hasFlag(int32, 1);
            this.allow_scrolling = TLObject.hasFlag(this.flags, 8);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.url = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.html = inputSerializedData.readString(z);
            }
            this.w = inputSerializedData.readInt32(z);
            this.h = inputSerializedData.readInt32(z);
            PageCaption pageCaption = new PageCaption();
            this.caption = pageCaption;
            pageCaption.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.caption.credit = new textEmpty();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-650782469);
            int flag = TLObject.setFlag(this.flags, 1, this.full_width);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 8, this.allow_scrolling);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.url);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.html);
            }
            outputSerializedData.writeInt32(this.w);
            outputSerializedData.writeInt32(this.h);
            this.caption.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockEmbedPost extends PageBlock {
        public static final int constructor = -229005301;
        public String author;
        public long author_photo_id;
        public ArrayList<PageBlock> blocks = new ArrayList<>();
        public int date;
        public String url;
        public long webpage_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.url = inputSerializedData.readString(z);
            this.webpage_id = inputSerializedData.readInt64(z);
            this.author_photo_id = inputSerializedData.readInt64(z);
            this.author = inputSerializedData.readString(z);
            this.date = inputSerializedData.readInt32(z);
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.caption = PageCaption.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-229005301);
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeInt64(this.webpage_id);
            outputSerializedData.writeInt64(this.author_photo_id);
            outputSerializedData.writeString(this.author);
            outputSerializedData.writeInt32(this.date);
            Vector.serialize(outputSerializedData, this.blocks);
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockEmbedPost_layer82 extends pageBlockEmbedPost {
        public static final int constructor = 690781161;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.url = inputSerializedData.readString(z);
            this.webpage_id = inputSerializedData.readInt64(z);
            this.author_photo_id = inputSerializedData.readInt64(z);
            this.author = inputSerializedData.readString(z);
            this.date = inputSerializedData.readInt32(z);
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            PageCaption pageCaption = new PageCaption();
            this.caption = pageCaption;
            pageCaption.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.caption.credit = new textEmpty();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(690781161);
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeInt64(this.webpage_id);
            outputSerializedData.writeInt64(this.author_photo_id);
            outputSerializedData.writeString(this.author);
            outputSerializedData.writeInt32(this.date);
            Vector.serialize(outputSerializedData, this.blocks);
            this.caption.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockCollage extends PageBlock {
        public static final int constructor = 1705048653;
        public ArrayList<PageBlock> items = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.items = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.caption = PageCaption.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1705048653);
            Vector.serialize(outputSerializedData, this.items);
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockCollage_layer82 extends pageBlockCollage {
        public static final int constructor = 145955919;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.items = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            PageCaption pageCaption = new PageCaption();
            this.caption = pageCaption;
            pageCaption.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.caption.credit = new textEmpty();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(145955919);
            Vector.serialize(outputSerializedData, this.items);
            this.caption.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockSlideshow extends PageBlock {
        public static final int constructor = 52401552;
        public ArrayList<PageBlock> items = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.items = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.caption = PageCaption.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(52401552);
            Vector.serialize(outputSerializedData, this.items);
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockSlideshow_layer82 extends pageBlockSlideshow {
        public static final int constructor = 319588707;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.items = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            PageCaption pageCaption = new PageCaption();
            this.caption = pageCaption;
            pageCaption.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.caption.credit = new textEmpty();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(319588707);
            Vector.serialize(outputSerializedData, this.items);
            this.caption.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockChannel extends PageBlock {
        public static final int constructor = -283684427;
        public TLRPC.Chat channel;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.channel = TLRPC.Chat.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-283684427);
            this.channel.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockAudio extends PageBlock {
        public static final int constructor = -2143067670;
        public long audio_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.audio_id = inputSerializedData.readInt64(z);
            this.caption = PageCaption.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2143067670);
            outputSerializedData.writeInt64(this.audio_id);
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockAudio_layer82 extends pageBlockAudio {
        public static final int constructor = 834148991;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.audio_id = inputSerializedData.readInt64(z);
            PageCaption pageCaption = new PageCaption();
            this.caption = pageCaption;
            pageCaption.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.caption.credit = new textEmpty();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(834148991);
            outputSerializedData.writeInt64(this.audio_id);
            this.caption.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockKicker extends PageBlock {
        public static final int constructor = 504660880;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(504660880);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockTable extends PageBlock {
        public static final int constructor = -1085412734;
        public boolean bordered;
        public int flags;
        public ArrayList<pageTableRow> rows = new ArrayList<>();
        public boolean striped;
        public RichText title;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.bordered = TLObject.hasFlag(int32, 1);
            this.striped = TLObject.hasFlag(this.flags, 2);
            this.title = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.rows = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_iv.pageTableRow.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1085412734);
            int flag = TLObject.setFlag(this.flags, 1, this.bordered);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.striped);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.title.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.rows);
        }
    }

    public static class pageTableRow extends TLObject {
        public static final int constructor = -524237339;
        public ArrayList<pageTableCell> cells = new ArrayList<>();

        public static pageTableRow TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (pageTableRow) TLObject.TLdeserialize(pageTableRow.class, -524237339 != i ? null : new pageTableRow(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.cells = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_iv.pageTableCell.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-524237339);
            Vector.serialize(outputSerializedData, this.cells);
        }
    }

    public static class pageTableCell extends TLObject {
        public static final int constructor = 878078826;
        public boolean align_center;
        public boolean align_right;
        public int colspan;
        public int flags;
        public boolean header;
        public int rowspan;
        public RichText text;
        public boolean valign_bottom;
        public boolean valign_middle;

        public static pageTableCell TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (pageTableCell) TLObject.TLdeserialize(pageTableCell.class, 878078826 != i ? null : new pageTableCell(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.header = TLObject.hasFlag(int32, 1);
            this.align_center = TLObject.hasFlag(this.flags, 8);
            this.align_right = TLObject.hasFlag(this.flags, 16);
            this.valign_middle = TLObject.hasFlag(this.flags, 32);
            this.valign_bottom = TLObject.hasFlag(this.flags, 64);
            if (TLObject.hasFlag(this.flags, 128)) {
                this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.colspan = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.rowspan = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(878078826);
            int flag = TLObject.setFlag(this.flags, 1, this.header);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 8, this.align_center);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 16, this.align_right);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 32, this.valign_middle);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 64, this.valign_bottom);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            if (TLObject.hasFlag(this.flags, 128)) {
                this.text.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.colspan);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt32(this.rowspan);
            }
        }
    }

    public static class pageBlockOrderedList extends PageBlock {
        public static final int constructor = 534181569;
        public int flags;
        public ArrayList<PageListOrderedItem> items = new ArrayList<>();
        public boolean reversed;
        public int start;
        public String type;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.reversed = TLObject.hasFlag(int32, 4);
            this.items = Vector.deserialize(inputSerializedData, new TL_iv$pageBlockOrderedList$$ExternalSyntheticLambda0(), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.start = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.type = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(534181569);
            int flag = TLObject.setFlag(this.flags, 4, this.reversed);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            Vector.serialize(outputSerializedData, this.items);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.start);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.type);
            }
        }
    }

    public static class pageBlockOrderedList_layer226 extends pageBlockOrderedList {
        public static final int constructor = -1702174239;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.items = Vector.deserialize(inputSerializedData, new TL_iv$pageBlockOrderedList$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1702174239);
            Vector.serialize(outputSerializedData, this.items);
        }
    }

    public static class pageBlockDetails extends PageBlock {
        public static final int constructor = 1987480557;
        public ArrayList<PageBlock> blocks = new ArrayList<>();
        public int flags;
        public boolean open;
        public RichText title;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.open = TLObject.hasFlag(int32, 1);
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            this.title = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1987480557);
            int flag = TLObject.setFlag(this.flags, 1, this.open);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            Vector.serialize(outputSerializedData, this.blocks);
            this.title.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockRelatedArticles extends PageBlock {
        public static final int constructor = 370236054;
        public ArrayList<pageRelatedArticle> articles = new ArrayList<>();
        public RichText title;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.title = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.articles = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_iv.pageRelatedArticle.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(370236054);
            this.title.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.articles);
        }
    }

    public static class pageRelatedArticle extends TLObject {
        public static final int constructor = -1282352120;
        public String author;
        public String description;
        public int flags;
        public long photo_id;
        public int published_date;
        public String title;
        public String url;
        public long webpage_id;

        public static pageRelatedArticle TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (pageRelatedArticle) TLObject.TLdeserialize(pageRelatedArticle.class, -1282352120 != i ? null : new pageRelatedArticle(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.url = inputSerializedData.readString(z);
            this.webpage_id = inputSerializedData.readInt64(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.published_date = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1282352120);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeInt64(this.webpage_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt64(this.photo_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.author);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt32(this.published_date);
            }
        }
    }

    public static class pageBlockMap extends PageBlock {
        public static final int constructor = -1538310410;
        public TLRPC.GeoPoint geo;
        public int h;
        public int w;
        public int zoom;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.geo = TLRPC.GeoPoint.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.zoom = inputSerializedData.readInt32(z);
            this.w = inputSerializedData.readInt32(z);
            this.h = inputSerializedData.readInt32(z);
            this.caption = PageCaption.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1538310410);
            this.geo.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.zoom);
            outputSerializedData.writeInt32(this.w);
            outputSerializedData.writeInt32(this.h);
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockHeading1 extends PageBlock {
        public static final int constructor = -1157691601;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1157691601);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockHeading2 extends PageBlock {
        public static final int constructor = 158018284;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(158018284);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockHeading3 extends PageBlock {
        public static final int constructor = 1743204781;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1743204781);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockHeading4 extends PageBlock {
        public static final int constructor = -1254983893;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1254983893);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockHeading5 extends PageBlock {
        public static final int constructor = -608277398;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-608277398);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockHeading6 extends PageBlock {
        public static final int constructor = 1747599785;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1747599785);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class pageBlockMath extends PageBlock {
        public static final int constructor = 1493699616;
        public String source;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.source = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1493699616);
            outputSerializedData.writeString(this.source);
        }
    }

    public static class pageBlockThinking extends PageBlock {
        public static final int constructor = 1009361890;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1009361890);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class inputPageBlockMap extends PageBlock {
        public static final int constructor = 1464557951;
        public TLRPC.InputGeoPoint geo;
        public int h;
        public int w;
        public int zoom;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.geo = TLRPC.InputGeoPoint.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.zoom = inputSerializedData.readInt32(z);
            this.w = inputSerializedData.readInt32(z);
            this.h = inputSerializedData.readInt32(z);
            this.caption = PageCaption.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1464557951);
            this.geo.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.zoom);
            outputSerializedData.writeInt32(this.w);
            outputSerializedData.writeInt32(this.h);
            this.caption.serializeToStream(outputSerializedData);
        }
    }

    public static abstract class PageListOrderedItem extends TLObject {
        public boolean checkbox;
        public boolean checked;
        public int flags;
        public String num;
        public String type;
        public int value;

        public static PageListOrderedItem TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_pageListOrderedItemBlocks;
            if (i == -1879910928) {
                tL_pageListOrderedItemBlocks = new TL_pageListOrderedItemBlocks();
            } else if (i == -1730311882) {
                tL_pageListOrderedItemBlocks = new TL_pageListOrderedItemBlocks_layer226();
            } else if (i == 352522633) {
                tL_pageListOrderedItemBlocks = new TL_pageListOrderedItemText();
            } else {
                tL_pageListOrderedItemBlocks = i != 1577484359 ? null : new TL_pageListOrderedItemText_layer226();
            }
            return (PageListOrderedItem) TLObject.TLdeserialize(PageListOrderedItem.class, tL_pageListOrderedItemBlocks, inputSerializedData, i, z);
        }
    }

    public static class TL_pageListOrderedItemText extends PageListOrderedItem {
        public static final int constructor = 352522633;
        public RichText text;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.checkbox = TLObject.hasFlag(int32, 1);
            this.checked = TLObject.hasFlag(this.flags, 2);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.num = inputSerializedData.readString(z);
            }
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.value = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.type = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(352522633);
            int flag = TLObject.setFlag(this.flags, 1, this.checkbox);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.checked);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.num != null);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 16, this.type != null);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.num);
            }
            this.text.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.value);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeString(this.type);
            }
        }
    }

    public static class TL_pageListOrderedItemText_layer226 extends TL_pageListOrderedItemText {
        public static final int constructor = 1577484359;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.num = inputSerializedData.readString(z);
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1577484359);
            outputSerializedData.writeString(this.num);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_pageListOrderedItemBlocks extends PageListOrderedItem {
        public static final int constructor = -1879910928;
        public ArrayList<PageBlock> blocks = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.checkbox = TLObject.hasFlag(int32, 1);
            this.checked = TLObject.hasFlag(this.flags, 2);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.num = inputSerializedData.readString(z);
            }
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.value = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.type = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1879910928);
            int flag = TLObject.setFlag(this.flags, 1, this.checkbox);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.checked);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.num != null);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 16, this.type != null);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.num);
            }
            Vector.serialize(outputSerializedData, this.blocks);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.value);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeString(this.type);
            }
        }
    }

    public static class TL_pageListOrderedItemBlocks_layer226 extends TL_pageListOrderedItemBlocks {
        public static final int constructor = -1730311882;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.num = inputSerializedData.readString(z);
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1730311882);
            outputSerializedData.writeString(this.num);
            Vector.serialize(outputSerializedData, this.blocks);
        }
    }

    public static abstract class PageListItem extends TLObject {
        public boolean checkbox;
        public boolean checked;
        public int flags;

        public static PageListItem TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_pageListItemText_layer226;
            if (i == -1188055347) {
                tL_pageListItemText_layer226 = new TL_pageListItemText_layer226();
            } else if (i == 635466748) {
                tL_pageListItemText_layer226 = new TL_pageListItemBlocks_226();
            } else if (i == 794323004) {
                tL_pageListItemText_layer226 = new TL_pageListItemText();
            } else {
                tL_pageListItemText_layer226 = i != 1674209194 ? null : new TL_pageListItemBlocks();
            }
            return (PageListItem) TLObject.TLdeserialize(PageListItem.class, tL_pageListItemText_layer226, inputSerializedData, i, z);
        }
    }

    public static class TL_pageListItemText extends PageListItem {
        public static final int constructor = 794323004;
        public RichText text;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.checkbox = TLObject.hasFlag(int32, 1);
            this.checked = TLObject.hasFlag(this.flags, 2);
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(794323004);
            int flag = TLObject.setFlag(this.flags, 1, this.checkbox);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.checked);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_pageListItemText_layer226 extends TL_pageListItemText {
        public static final int constructor = -1188055347;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1188055347);
            this.text.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_pageListItemBlocks extends PageListItem {
        public static final int constructor = 1674209194;
        public ArrayList<PageBlock> blocks = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.checkbox = TLObject.hasFlag(int32, 1);
            this.checked = TLObject.hasFlag(this.flags, 2);
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1674209194);
            int flag = TLObject.setFlag(this.flags, 1, this.checkbox);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.checked);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            Vector.serialize(outputSerializedData, this.blocks);
        }
    }

    public static class TL_pageListItemBlocks_226 extends TL_pageListItemBlocks {
        public static final int constructor = 635466748;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.blocks = Vector.deserialize(inputSerializedData, new TL_iv$RichMessage$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(635466748);
            Vector.serialize(outputSerializedData, this.blocks);
        }
    }

    public static class PageCaption extends TLObject {
        public static final int constructor = 1869903447;
        public RichText credit;
        public RichText text;

        public static PageCaption TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (PageCaption) TLObject.TLdeserialize(PageCaption.class, 1869903447 != i ? null : new PageCaption(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.credit = RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1869903447);
            this.text.serializeToStream(outputSerializedData);
            this.credit.serializeToStream(outputSerializedData);
        }
    }

    public static class getRichMessage extends TLMethod<TLRPC.messages_Messages> {
        public static final int constructor = 1343580623;
        public int id;
        public TLRPC.InputPeer peer;

        @Override
        public TLRPC.messages_Messages deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.messages_Messages.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1343580623);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
        }
    }
}
