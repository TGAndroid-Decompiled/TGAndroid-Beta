package org.telegram.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class k4 extends org.telegram.ui.Components.yk0 {
    public TLRPC.WebPage A;
    public TL_iv.pageBlockChannel B;
    public boolean C;
    public final boolean D;
    public int[] E;
    public int F;
    public final m4 H;

    public final Context f39589c;
    public final ArrayList d = new ArrayList();

    public final ArrayList f39590e = new ArrayList();

    public final ArrayList f39591f = new ArrayList();
    public final HashMap h = new HashMap();

    public final HashMap f39592n = new HashMap();

    public final HashMap f39593r = new HashMap();

    public final HashMap f39594s = new HashMap();
    public final ArrayList v = new ArrayList();

    public final HashMap f39595w = new HashMap();

    public final ArrayList f39596x = new ArrayList();

    public final HashMap f39597y = new HashMap();
    public final lt0 G = new lt0(this, 11);

    public k4(m4 m4Var, Context context, boolean z10) {
        this.H = m4Var;
        this.f39589c = context;
        this.D = z10;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if ((pageBlock instanceof TL_iv.pageBlockHeader) || m4.K(pageBlock)) {
            return 1;
        }
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            return 2;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            return 3;
        }
        if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            return 4;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return 5;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return 6;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return 7;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return 8;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            return 9;
        }
        if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            return 10;
        }
        if (pageBlock instanceof TL_iv.pageBlockTitle) {
            return 11;
        }
        if (pageBlock instanceof c4) {
            return 12;
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return 13;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return 14;
        }
        if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            return 15;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            return 16;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return 17;
        }
        if (pageBlock instanceof TL_iv.pageBlockChannel) {
            return 18;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            return 19;
        }
        if (pageBlock instanceof TL_iv.pageBlockKicker) {
            return 20;
        }
        if (pageBlock instanceof e4) {
            return 21;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return 22;
        }
        if (pageBlock instanceof g4) {
            return 23;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            return 24;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            return 25;
        }
        if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
            return 26;
        }
        if (pageBlock instanceof h4) {
            return 28;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            return 92;
        }
        if (pageBlock instanceof a4) {
            return I(((a4) pageBlock).f36370b);
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return I(((TL_iv.pageBlockCover) pageBlock).cover);
        }
        return 100;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 23 || i10 == 24;
    }

    public final void E(TL_iv.PageBlock pageBlock, k4 k4Var) {
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f39591f;
        if (z10) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo photoE = j4.e(this.A, pageblockphoto.photo_id);
            if (photoE != null) {
                pageblockphoto.thumb = FileLoader.getClosestPhotoSizeWithSize(photoE.sizes, 56, true);
                pageblockphoto.thumbObject = photoE;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && j4.g(k4Var.A, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document documentA = j4.a(this.A, pageblockvideo.video_id);
            if (documentA != null) {
                pageblockvideo.thumb = FileLoader.getClosestPhotoSizeWithSize(documentA.thumbs, 56, true);
                pageblockvideo.thumbObject = documentA;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        boolean z11 = pageBlock instanceof TL_iv.pageBlockSlideshow;
        int i10 = 0;
        m4 m4Var = this.H;
        if (z11) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            int size = pageblockslideshow.items.size();
            while (i10 < size) {
                TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i10);
                pageBlock2.groupId = m4Var.U;
                E(pageBlock2, k4Var);
                i10++;
            }
            m4Var.U++;
            return;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(((TL_iv.pageBlockCover) pageBlock).cover, k4Var);
                return;
            }
            return;
        }
        TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
        int size2 = pageblockcollage.items.size();
        while (i10 < size2) {
            TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i10);
            pageBlock3.groupId = m4Var.U;
            E(pageBlock3, k4Var);
            i10++;
        }
        m4Var.U++;
    }

    public final void F(k4 k4Var, TL_iv.PageBlock pageBlock, int i10, int i11, int i12) {
        k4 k4Var2;
        ArrayList arrayList;
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        TL_iv.PageBlock pageBlock2;
        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks;
        int size;
        int i13;
        e4 e4Var;
        k4 k4Var3;
        Object obj3;
        int i14;
        TL_iv.PageBlock pageBlock3;
        k4 k4Var4 = this;
        k4 k4Var5 = k4Var;
        boolean z10 = pageBlock instanceof a4;
        TL_iv.PageBlock pageBlock4 = z10 ? ((a4) pageBlock).f36370b : pageBlock;
        if (!(pageBlock4 instanceof TL_iv.pageBlockList) && !(pageBlock4 instanceof TL_iv.pageBlockOrderedList)) {
            k4Var4.K(pageBlock4);
            k4Var4.E(pageBlock4, k4Var5);
        }
        TL_iv.PageBlock pageBlockZ = m4.z(pageBlock4);
        if (pageBlockZ instanceof TL_iv.pageBlockUnsupported) {
            return;
        }
        boolean z11 = pageBlockZ instanceof TL_iv.pageBlockAnchor;
        HashMap map = k4Var4.h;
        ArrayList arrayList3 = k4Var4.f39590e;
        if (z11) {
            map.put(((TL_iv.pageBlockAnchor) pageBlockZ).name.toLowerCase(), Integer.valueOf(arrayList3.size()));
            return;
        }
        if ((pageBlockZ instanceof TL_iv.pageBlockTitle) || (pageBlockZ instanceof TL_iv.pageBlockHeader) || m4.K(pageBlockZ)) {
            String strReplaceAll = m4.B(pageBlockZ.text).toString().toLowerCase().replaceAll("[\\[\\]\\(\\)\\{\\}]", "").replaceAll(" ", "-");
            if (!map.containsKey(strReplaceAll)) {
                map.put(strReplaceAll, Integer.valueOf(arrayList3.size()));
            }
        }
        boolean z12 = pageBlockZ instanceof TL_iv.pageBlockList;
        if (!z12 && !(pageBlockZ instanceof TL_iv.pageBlockOrderedList)) {
            arrayList3.add(pageBlock);
        }
        int i15 = 0;
        int i16 = 1;
        if (pageBlockZ instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlockZ;
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            int i17 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
            pageBlockZ.mid = i17;
            tL_message.f22401id = i17;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(k4Var4.H.T).getClientUserId();
            peer.user_id = clientUserId;
            tL_peerUser.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            TLRPC.WebPage webPage = k4Var4.A;
            tL_messageMediaDocument.webpage = webPage;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = j4.a(webPage, pageblockaudio.audio_id);
            tL_message.flags |= 768;
            MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
            k4Var4.v.add(messageObject);
            k4Var4.f39594s.put(pageblockaudio, messageObject);
            String musicAuthor = messageObject.getMusicAuthor(false);
            String musicTitle = messageObject.getMusicTitle(false);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                return;
            }
            if (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) {
                if (TextUtils.isEmpty(musicTitle)) {
                    k4Var4.G(musicAuthor, pageBlockZ);
                    return;
                } else {
                    k4Var4.G(musicTitle, pageBlockZ);
                    return;
                }
            }
            k4Var4.G(musicAuthor + " - " + musicTitle, pageBlockZ);
            return;
        }
        if (pageBlockZ instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlockZ;
            if (pageblockblockquoteblocks.blocks.isEmpty()) {
                return;
            }
            int iMax = Math.max(0, pageBlockZ.level);
            int i18 = pageBlockZ.quoteLevels;
            boolean z13 = (i18 == 0 && pageBlockZ.level <= 0) || pageBlockZ.bottom;
            pageBlockZ.level = -1;
            int size2 = pageblockblockquoteblocks.blocks.size();
            int i19 = 0;
            while (i19 < size2) {
                TL_iv.PageBlock pageBlock5 = pageblockblockquoteblocks.blocks.get(i19);
                if (!(pageBlock5 instanceof TL_iv.pageBlockUnsupported)) {
                    if (pageBlock5 instanceof TL_iv.pageBlockAnchor) {
                        map.put(((TL_iv.pageBlockAnchor) pageBlock5).name.toLowerCase(), Integer.valueOf(arrayList3.size()));
                    } else {
                        pageBlock5.level = iMax + 1;
                        pageBlock5.quoteLevels = (1 << iMax) | i18;
                        pageBlock5.bottom = i19 == size2 + (-1) && z13;
                        k4Var4.F(k4Var5, pageBlock5, i10, i11, i12);
                    }
                }
                i19++;
            }
            return;
        }
        if (pageBlockZ instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) pageBlockZ;
            if (pageblockembedpost.blocks.isEmpty()) {
                return;
            }
            pageBlockZ.level = -1;
            while (i15 < pageblockembedpost.blocks.size()) {
                TL_iv.PageBlock pageBlock6 = pageblockembedpost.blocks.get(i15);
                if (!(pageBlock6 instanceof TL_iv.pageBlockUnsupported)) {
                    if (pageBlock6 instanceof TL_iv.pageBlockAnchor) {
                        map.put(((TL_iv.pageBlockAnchor) pageBlock6).name.toLowerCase(), Integer.valueOf(arrayList3.size()));
                    } else {
                        pageBlock6.level = 1;
                        if (i15 == pageblockembedpost.blocks.size() - 1) {
                            pageBlock6.bottom = true;
                        }
                        arrayList3.add(pageBlock6);
                        k4Var4.E(pageBlock6, k4Var5);
                    }
                }
                i15++;
            }
            if (TextUtils.isEmpty(m4.B(pageblockembedpost.caption.text)) && TextUtils.isEmpty(m4.B(pageblockembedpost.caption.credit))) {
                return;
            }
            b4 b4Var = new b4();
            b4Var.caption = pageblockembedpost.caption;
            arrayList3.add(b4Var);
            return;
        }
        if (pageBlockZ instanceof TL_iv.pageBlockRelatedArticles) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) pageBlockZ;
            arrayList3.add(arrayList3.size() - 1, new h4());
            int size3 = pageblockrelatedarticles.articles.size();
            while (i15 < size3) {
                g4 g4Var = new g4();
                g4Var.f38307a = pageblockrelatedarticles;
                g4Var.f38308b = i15;
                arrayList3.add(g4Var);
                i15++;
            }
            if (i12 == 0) {
                arrayList3.add(new h4());
                return;
            }
            return;
        }
        if (pageBlockZ instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlockZ;
            int size4 = pageblockdetails.blocks.size();
            while (i15 < size4) {
                a4 a4Var = new a4();
                a4Var.f36369a = pageBlock;
                a4Var.f36370b = pageblockdetails.blocks.get(i15);
                k4Var4.F(k4Var5, m4.j0(pageBlock, a4Var), i10 + 1, i11, i12);
                i15++;
                k4Var5 = k4Var;
            }
            return;
        }
        String str = "%d.";
        if (z12) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlockZ;
            d4 d4Var = new d4();
            d4Var.f37250a = pageblocklist;
            d4Var.f37254f = i11;
            int size5 = pageblocklist.items.size();
            int i20 = 0;
            while (i20 < size5) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i20);
                c4 c4Var = new c4();
                c4Var.f36934j = i20;
                c4Var.f36930c = d4Var;
                if (!pageblocklist.ordered) {
                    k4Var3 = k4Var4;
                    c4Var.f36932f = "•";
                } else if (k4Var3.C) {
                    k4Var3 = k4Var4;
                    Object[] objArr = new Object[i16];
                    objArr[0] = Integer.valueOf(i20 + 1);
                    c4Var.f36932f = String.format(".%d", objArr);
                } else {
                    k4Var3 = k4Var4;
                    Object[] objArr2 = new Object[i16];
                    objArr2[0] = Integer.valueOf(i20 + 1);
                    c4Var.f36932f = String.format("%d.", objArr2);
                }
                ArrayList arrayList4 = d4Var.f37251b;
                arrayList4.add(c4Var);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    c4Var.f36931e = tL_pageListItemText.text;
                    c4Var.f36928a = tL_pageListItemText.checkbox;
                    c4Var.f36929b = tL_pageListItemText.checked;
                    obj3 = pageListItem;
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                    c4Var.f36928a = tL_pageListItemBlocks.checkbox;
                    c4Var.f36929b = tL_pageListItemBlocks.checked;
                    if (tL_pageListItemBlocks.blocks.isEmpty()) {
                        obj3 = pageListItem;
                        TL_iv.TL_pageListItemText tL_pageListItemText2 = new TL_iv.TL_pageListItemText();
                        TL_iv.textPlain textplain = new TL_iv.textPlain();
                        textplain.text = " ";
                        tL_pageListItemText2.text = textplain;
                        obj3 = tL_pageListItemText2;
                    } else {
                        obj3 = pageListItem;
                        c4Var.d = tL_pageListItemBlocks.blocks.get(0);
                        obj3 = pageListItem;
                    }
                }
                obj3 = pageListItem;
                Object obj4 = obj3;
                if (z10) {
                    int i21 = i20;
                    a4 a4Var2 = new a4();
                    a4Var2.f36369a = ((a4) pageBlock).f36369a;
                    a4Var2.f36370b = c4Var;
                    i14 = i21;
                    k4Var3.F(k4Var, a4Var2, i10, i11 + 1, i12);
                } else {
                    i14 = i20;
                    if (i14 == 0) {
                        if (pageBlock instanceof c4) {
                            pageBlock3 = c4Var;
                            ((c4) pageBlock).d = c4Var;
                        } else if (pageBlock instanceof e4) {
                            pageBlock3 = c4Var;
                            pageBlock3 = c4Var;
                            ((e4) pageBlock).d = c4Var;
                        }
                        pageBlock3 = pageBlock;
                    }
                    pageBlock3 = c4Var;
                    pageBlock3 = c4Var;
                    pageBlock3 = c4Var;
                    F(k4Var, pageBlock3, i10, i11 + 1, i12);
                }
                if (obj4 instanceof TL_iv.TL_pageListItemBlocks) {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks2 = (TL_iv.TL_pageListItemBlocks) obj4;
                    int i22 = 1;
                    for (int size6 = tL_pageListItemBlocks2.blocks.size(); i22 < size6; size6 = size6) {
                        c4 c4Var2 = new c4();
                        c4Var2.d = tL_pageListItemBlocks2.blocks.get(i22);
                        c4Var2.f36930c = d4Var;
                        if (z10) {
                            a4 a4Var3 = new a4();
                            a4Var3.f36369a = ((a4) pageBlock).f36369a;
                            a4Var3.f36370b = c4Var2;
                            F(k4Var, a4Var3, i10, i11 + 1, i12);
                            c4Var2 = c4Var2;
                        } else {
                            F(k4Var, c4Var2, i10, i11 + 1, i12);
                        }
                        arrayList4.add(c4Var2);
                        i22++;
                    }
                }
                k4Var3 = this;
                i20 = i14 + 1;
                size5 = size5;
                i16 = 1;
            }
            k4Var3 = k4Var4;
            return;
        }
        if (pageBlockZ instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlockZ;
            f4 f4Var = new f4();
            f4Var.f37932e = i11;
            int size7 = pageblockorderedlist.items.size();
            int i23 = 0;
            while (i23 < size7) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i23);
                e4 e4Var2 = new e4();
                e4Var2.f37619j = i23;
                e4Var2.f37615c = f4Var;
                ArrayList arrayList5 = f4Var.f37929a;
                arrayList5.add(e4Var2);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                    arrayList = arrayList5;
                    e4Var2.f37616e = tL_pageListOrderedItemText.text;
                    e4Var2.f37613a = tL_pageListOrderedItemText.checkbox;
                    e4Var2.f37614b = tL_pageListOrderedItemText.checked;
                    if (TextUtils.isEmpty(tL_pageListOrderedItemText.num)) {
                        if (k4Var2.C) {
                            k4Var2 = k4Var4;
                            e4Var2.f37617f = String.format(".%d", Integer.valueOf(i23 + 1));
                        } else {
                            k4Var2 = k4Var4;
                            e4Var2.f37617f = String.format(str, Integer.valueOf(i23 + 1));
                        }
                    } else if (k4Var2.C) {
                        k4Var2 = k4Var4;
                        e4Var2.f37617f = "." + tL_pageListOrderedItemText.num;
                    } else {
                        k4Var2 = k4Var4;
                        e4Var2.f37617f = a9.p.p(new StringBuilder(), tL_pageListOrderedItemText.num, ".");
                    }
                } else {
                    arrayList = arrayList5;
                    if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks2 = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                        e4Var2.f37613a = tL_pageListOrderedItemBlocks2.checkbox;
                        e4Var2.f37614b = tL_pageListOrderedItemBlocks2.checked;
                        if (tL_pageListOrderedItemBlocks2.blocks.isEmpty()) {
                            k4Var2 = k4Var4;
                            TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText2 = new TL_iv.TL_pageListOrderedItemText();
                            TL_iv.textPlain textplain2 = new TL_iv.textPlain();
                            textplain2.text = " ";
                            tL_pageListOrderedItemText2.text = textplain2;
                            obj = tL_pageListOrderedItemText2;
                        } else {
                            k4Var2 = k4Var4;
                            e4Var2.d = tL_pageListOrderedItemBlocks2.blocks.get(0);
                            obj = pageListOrderedItem;
                        }
                        if (TextUtils.isEmpty(tL_pageListOrderedItemBlocks2.num)) {
                            if (k4Var2.C) {
                                e4Var2.f37617f = String.format(".%d", Integer.valueOf(i23 + 1));
                            } else {
                                e4Var2.f37617f = String.format(str, Integer.valueOf(i23 + 1));
                            }
                        } else if (k4Var2.C) {
                            e4Var2.f37617f = "." + tL_pageListOrderedItemBlocks2.num;
                        } else {
                            e4Var2.f37617f = a9.p.p(new StringBuilder(), tL_pageListOrderedItemBlocks2.num, ".");
                        }
                    }
                    if (z10) {
                        obj2 = obj;
                        obj2 = obj;
                        obj2 = obj;
                        obj2 = obj;
                        a4 a4Var4 = new a4();
                        a4Var4.f36369a = ((a4) pageBlock).f36369a;
                        a4Var4.f36370b = e4Var2;
                        arrayList2 = arrayList;
                        k4Var2.F(k4Var, a4Var4, i10, i11 + 1, i12);
                    } else {
                        obj2 = obj;
                        obj2 = obj;
                        obj2 = obj;
                        obj2 = obj;
                        arrayList2 = arrayList;
                        if (i23 == 0) {
                            if (pageBlock instanceof c4) {
                                pageBlock2 = e4Var2;
                                ((c4) pageBlock).d = e4Var2;
                            } else if (pageBlock instanceof e4) {
                                pageBlock2 = e4Var2;
                                pageBlock2 = e4Var2;
                                ((e4) pageBlock).d = e4Var2;
                            }
                            pageBlock2 = pageBlock;
                        }
                        pageBlock2 = e4Var2;
                        pageBlock2 = e4Var2;
                        pageBlock2 = e4Var2;
                        F(k4Var, pageBlock2, i10, i11 + 1, i12);
                    }
                    if (obj2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) obj2;
                        i13 = 1;
                        for (size = tL_pageListOrderedItemBlocks.blocks.size(); i13 < size; size = size) {
                            e4Var = new e4();
                            e4Var.d = tL_pageListOrderedItemBlocks.blocks.get(i13);
                            e4Var.f37615c = f4Var;
                            if (z10) {
                                a4 a4Var5 = new a4();
                                a4Var5.f36369a = ((a4) pageBlock).f36369a;
                                a4Var5.f36370b = e4Var;
                                F(k4Var, a4Var5, i10, i11 + 1, i12);
                                e4Var = e4Var;
                            } else {
                                F(k4Var, e4Var, i10, i11 + 1, i12);
                            }
                            arrayList2.add(e4Var);
                            i13++;
                        }
                    }
                    i23++;
                    k4Var2 = this;
                    str = str;
                    z10 = z10;
                }
                k4Var2 = k4Var4;
                obj2 = pageListOrderedItem;
                if (z10) {
                    obj2 = obj;
                    obj2 = obj;
                    obj2 = obj;
                    obj2 = obj;
                    a4 a4Var6 = new a4();
                    a4Var6.f36369a = ((a4) pageBlock).f36369a;
                    a4Var6.f36370b = e4Var2;
                    arrayList2 = arrayList;
                    k4Var2.F(k4Var, a4Var6, i10, i11 + 1, i12);
                } else {
                    obj2 = obj;
                    obj2 = obj;
                    obj2 = obj;
                    obj2 = obj;
                    arrayList2 = arrayList;
                    if (i23 == 0) {
                        if (pageBlock instanceof c4) {
                            pageBlock2 = e4Var2;
                            ((c4) pageBlock).d = e4Var2;
                        } else if (pageBlock instanceof e4) {
                            pageBlock2 = e4Var2;
                            pageBlock2 = e4Var2;
                            ((e4) pageBlock).d = e4Var2;
                        }
                        pageBlock2 = pageBlock;
                    }
                    pageBlock2 = e4Var2;
                    pageBlock2 = e4Var2;
                    pageBlock2 = e4Var2;
                    F(k4Var, pageBlock2, i10, i11 + 1, i12);
                }
                if (obj2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) obj2;
                    i13 = 1;
                    while (i13 < size) {
                        e4Var = new e4();
                        e4Var.d = tL_pageListOrderedItemBlocks.blocks.get(i13);
                        e4Var.f37615c = f4Var;
                        if (z10) {
                            a4 a4Var7 = new a4();
                            a4Var7.f36369a = ((a4) pageBlock).f36369a;
                            a4Var7.f36370b = e4Var;
                            F(k4Var, a4Var7, i10, i11 + 1, i12);
                            e4Var = e4Var;
                        } else {
                            F(k4Var, e4Var, i10, i11 + 1, i12);
                        }
                        arrayList2.add(e4Var);
                        i13++;
                    }
                }
                i23++;
                k4Var2 = this;
                str = str;
                z10 = z10;
            }
            k4Var2 = k4Var4;
        }
    }

    public final void G(Object obj, TL_iv.PageBlock pageBlock) {
        if (obj instanceof TL_iv.textEmpty) {
            return;
        }
        HashMap map = this.f39595w;
        if (map.containsKey(obj)) {
            return;
        }
        map.put(obj, pageBlock);
        this.f39596x.add(obj);
    }

    public final void H(int i10, f2.o1 o1Var, TL_iv.PageBlock pageBlock, int i11, int i12, boolean z10) {
        TLRPC.Photo photo;
        ?? r10;
        float f10;
        float f11;
        TLRPC.Document documentA;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        boolean z11;
        float f12;
        float f13;
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockCover;
        TL_iv.PageBlock pageBlock2 = z13 ? ((TL_iv.pageBlockCover) pageBlock).cover : pageBlock instanceof a4 ? ((a4) pageBlock).f36370b : pageBlock;
        if (i10 == 92) {
            ((d2) o1Var.f5789a).setBlock((TL_iv.pageBlockMath) pageBlock2);
            return;
        }
        if (i10 == 100) {
            ((TextView) o1Var.f5789a).setText("unsupported block " + pageBlock2);
            return;
        }
        switch (i10) {
            case 0:
                ((f2) o1Var.f5789a).setBlock((TL_iv.pageBlockParagraph) pageBlock2);
                break;
            case 1:
                ((z1) o1Var.f5789a).setBlock(pageBlock2);
                break;
            case 2:
                break;
            case 3:
                w1 w1Var = (w1) o1Var.f5789a;
                TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock2;
                TL_iv.pageBlockEmbed pageblockembed2 = w1Var.v;
                w1Var.v = pageblockembed;
                v1 v1Var = w1Var.f43561a;
                if (v1Var != null) {
                    photo = null;
                    r10 = 0;
                    v1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                } else {
                    photo = null;
                    r10 = 0;
                }
                TL_iv.pageBlockEmbed pageblockembed3 = w1Var.v;
                if (pageblockembed2 != pageblockembed3) {
                    w1Var.f43568s = r10;
                    v1 v1Var2 = w1Var.f43561a;
                    if (v1Var2 != 0) {
                        if (pageblockembed3.allow_scrolling) {
                            v1Var2.setVerticalScrollBarEnabled(true);
                            w1Var.f43561a.setHorizontalScrollBarEnabled(true);
                        } else {
                            v1Var2.setVerticalScrollBarEnabled(r10);
                            w1Var.f43561a.setHorizontalScrollBarEnabled(r10);
                        }
                    }
                    w1Var.f43567r = r10;
                    v1 v1Var3 = w1Var.f43561a;
                    if (v1Var3 != null) {
                        try {
                            v1Var3.loadUrl("about:blank");
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    try {
                        TL_iv.pageBlockEmbed pageblockembed4 = w1Var.v;
                        String str = pageblockembed4.html;
                        if (str != null) {
                            v1 v1Var4 = w1Var.f43561a;
                            if (v1Var4 != null) {
                                v1Var4.loadDataWithBaseURL("https://telegram.org/embed", str, "text/html", "UTF-8", null);
                                w1Var.f43561a.setVisibility(0);
                            }
                            org.telegram.ui.Components.i81 i81Var = w1Var.f43562b;
                            if (i81Var != null) {
                                i81Var.setVisibility(4);
                                w1Var.f43562b.g(null, null, null, null, false);
                            }
                        } else {
                            long j10 = pageblockembed4.poster_photo_id;
                            if (w1Var.f43562b.g(pageblockembed.url, j10 != 0 ? j4.e(w1Var.f43569w.A, j10) : photo, w1Var.f43569w.A, null, false)) {
                                v1 v1Var5 = w1Var.f43561a;
                                if (v1Var5 != null) {
                                    v1Var5.setVisibility(4);
                                    w1Var.f43561a.stopLoading();
                                    w1Var.f43561a.loadUrl("about:blank");
                                }
                                org.telegram.ui.Components.i81 i81Var2 = w1Var.f43562b;
                                if (i81Var2 != null) {
                                    i81Var2.setVisibility(0);
                                }
                            } else {
                                v1 v1Var6 = w1Var.f43561a;
                                if (v1Var6 != null) {
                                    v1Var6.setVisibility(0);
                                    HashMap map = new HashMap();
                                    map.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                                    w1Var.f43561a.loadUrl(w1Var.v.url, map);
                                }
                                org.telegram.ui.Components.i81 i81Var3 = w1Var.f43562b;
                                if (i81Var3 != null) {
                                    i81Var3.setVisibility(4);
                                    w1Var.f43562b.g(null, null, null, null, false);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                w1Var.requestLayout();
                break;
            case 4:
                ((w2) o1Var.f5789a).setBlock((TL_iv.pageBlockSubtitle) pageBlock2);
                break;
            case 5:
                b3 b3Var = (b3) o1Var.f5789a;
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock2;
                b3Var.b(pageblockvideo, (c3) this.H.f37294y.f(pageblockvideo.video_id), z10, i11 == 0);
                TL_iv.pageBlockChannel pageblockchannel = this.B;
                g1 g1Var = b3Var.f36689s;
                b3Var.J = pageBlock;
                if (pageblockchannel != null && z13) {
                    g1Var.setBlock(pageblockchannel);
                    g1Var.setVisibility(0);
                    break;
                }
                break;
            case 6:
                ((l2) o1Var.f5789a).setBlock((TL_iv.pageBlockPullquote) pageBlock2);
                break;
            case 7:
                ((f1) o1Var.f5789a).setBlock((TL_iv.pageBlockBlockquote) pageBlock2);
                break;
            case 8:
                u2 u2Var = (u2) o1Var.f5789a;
                u2Var.d = (TL_iv.pageBlockSlideshow) pageBlock2;
                u2Var.f43069b.g();
                p2 p2Var = u2Var.f43068a;
                p2Var.x(0, false);
                p2Var.forceLayout();
                u2Var.requestLayout();
                break;
            case 9:
                g2 g2Var = (g2) o1Var.f5789a;
                g2Var.a((TL_iv.pageBlockPhoto) pageBlock2, this.A, z10, i11 == 0);
                g2Var.setParentBlock(pageBlock);
                break;
            case 10:
                ((e1) o1Var.f5789a).setBlock((TL_iv.pageBlockAuthorDate) pageBlock2);
                break;
            case 11:
                ((z2) o1Var.f5789a).setBlock((TL_iv.pageBlockTitle) pageBlock2);
                break;
            case 12:
                ((b2) o1Var.f5789a).setBlock((c4) pageBlock2);
                break;
            case 13:
                ((y1) o1Var.f5789a).setBlock((TL_iv.pageBlockFooter) pageBlock2);
                break;
            case 14:
                ((k2) o1Var.f5789a).setBlock((TL_iv.pageBlockPreformatted) pageBlock2);
                break;
            case 15:
                ((v2) o1Var.f5789a).setBlock((TL_iv.pageBlockSubheader) pageBlock2);
                break;
            case 16:
                ((x1) o1Var.f5789a).setBlock((TL_iv.pageBlockEmbedPost) pageBlock2);
                break;
            case 17:
                n1 n1Var = (n1) o1Var.f5789a;
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock2;
                if (n1Var.f40634s != pageblockcollage) {
                    n1Var.f40634s = pageblockcollage;
                    m1 m1Var = n1Var.v;
                    int i13 = m1Var.f40284c;
                    ArrayList arrayList = m1Var.f40282a;
                    arrayList.clear();
                    HashMap map2 = m1Var.f40283b;
                    map2.clear();
                    n1 n1Var2 = m1Var.d;
                    TL_iv.pageBlockCollage pageblockcollage2 = n1Var2.f40634s;
                    k4 k4Var = n1Var2.f40635w;
                    int size = pageblockcollage2.items.size();
                    if (size > 1) {
                        StringBuilder sb2 = new StringBuilder();
                        float f14 = 1.0f;
                        boolean z14 = false;
                        for (int i14 = 0; i14 < size; i14++) {
                            TL_iv.PageBlock pageBlock3 = n1Var2.f40634s.items.get(i14);
                            if (pageBlock3 instanceof TL_iv.pageBlockPhoto) {
                                TLRPC.Photo photoE = j4.e(k4Var.A, ((TL_iv.pageBlockPhoto) pageBlock3).photo_id);
                                if (photoE != null) {
                                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoE.sizes, AndroidUtilities.getPhotoSize());
                                    MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
                                    if (i14 == size - 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    groupedMessagePosition.last = z11;
                                    if (closestPhotoSizeWithSize == null) {
                                        f12 = 1.0f;
                                    } else {
                                        f12 = closestPhotoSizeWithSize.f22405w / closestPhotoSizeWithSize.h;
                                    }
                                    groupedMessagePosition.aspectRatio = f12;
                                    if (f12 > 1.2f) {
                                        sb2.append("w");
                                    } else if (f12 < 0.8f) {
                                        sb2.append("n");
                                    } else {
                                        sb2.append("q");
                                    }
                                    f13 = groupedMessagePosition.aspectRatio;
                                    f14 += f13;
                                    if (f13 > 2.0f) {
                                        z14 = true;
                                    }
                                    map2.put(pageBlock3, groupedMessagePosition);
                                    arrayList.add(groupedMessagePosition);
                                }
                            } else if ((pageBlock3 instanceof TL_iv.pageBlockVideo) && (documentA = j4.a(k4Var.A, ((TL_iv.pageBlockVideo) pageBlock3).video_id)) != null) {
                                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(documentA.thumbs, 90);
                                MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                                if (i14 == size - 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                groupedMessagePosition2.last = z11;
                                if (closestPhotoSizeWithSize == null) {
                                    f12 = 1.0f;
                                } else {
                                    f12 = closestPhotoSizeWithSize.f22405w / closestPhotoSizeWithSize.h;
                                }
                                groupedMessagePosition2.aspectRatio = f12;
                                if (f12 > 1.2f) {
                                    sb2.append("w");
                                } else if (f12 < 0.8f) {
                                    sb2.append("n");
                                } else {
                                    sb2.append("q");
                                }
                                f13 = groupedMessagePosition2.aspectRatio;
                                f14 += f13;
                                if (f13 > 2.0f) {
                                    z14 = true;
                                }
                                map2.put(pageBlock3, groupedMessagePosition2);
                                arrayList.add(groupedMessagePosition2);
                            }
                        }
                        int iDp = AndroidUtilities.dp(120.0f);
                        float fDp = AndroidUtilities.dp(120.0f);
                        Point point = AndroidUtilities.displaySize;
                        float f15 = i13;
                        int iMin = (int) (fDp / (Math.min(point.x, point.y) / f15));
                        float fDp2 = AndroidUtilities.dp(40.0f);
                        Point point2 = AndroidUtilities.displaySize;
                        int iMin2 = (int) (fDp2 / (Math.min(point2.x, point2.y) / f15));
                        float f16 = f15 / 814.0f;
                        float f17 = f14 / size;
                        if (z14 || !(size == 2 || size == 3 || size == 4)) {
                            int size2 = arrayList.size();
                            float[] fArr = new float[size2];
                            for (int i15 = 0; i15 < size; i15++) {
                                if (f17 > 1.1f) {
                                    fArr[i15] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList.get(i15)).aspectRatio);
                                } else {
                                    fArr[i15] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList.get(i15)).aspectRatio);
                                }
                                fArr[i15] = Math.max(0.66667f, Math.min(1.7f, fArr[i15]));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (int i16 = 1; i16 < size2; i16++) {
                                int i17 = size2 - i16;
                                if (i16 <= 3 && i17 <= 3) {
                                    float fA = m1Var.a(fArr, 0, i16);
                                    float fA2 = m1Var.a(fArr, i16, size2);
                                    l1 l1Var = new l1();
                                    l1Var.f39910a = new int[]{i16, i17};
                                    l1Var.f39911b = new float[]{fA, fA2};
                                    arrayList2.add(l1Var);
                                }
                            }
                            for (int i18 = 1; i18 < size2 - 1; i18++) {
                                int i19 = 1;
                                while (true) {
                                    int i20 = size2 - i18;
                                    if (i19 < i20) {
                                        int i21 = i20 - i19;
                                        if (i18 <= 3) {
                                            if (i19 <= (f17 < 0.85f ? 4 : 3) && i21 <= 3) {
                                                float fA3 = m1Var.a(fArr, 0, i18);
                                                int i22 = i18 + i19;
                                                float fA4 = m1Var.a(fArr, i18, i22);
                                                float fA5 = m1Var.a(fArr, i22, size2);
                                                l1 l1Var2 = new l1();
                                                l1Var2.f39910a = new int[]{i18, i19, i21};
                                                l1Var2.f39911b = new float[]{fA3, fA4, fA5};
                                                arrayList2.add(l1Var2);
                                            }
                                        }
                                        i19++;
                                        i13 = i13;
                                    }
                                }
                            }
                            int i23 = i13;
                            for (int i24 = 1; i24 < size2 - 2; i24++) {
                                int i25 = 1;
                                while (true) {
                                    int i26 = size2 - i24;
                                    if (i25 < i26) {
                                        int i27 = 1;
                                        while (true) {
                                            int i28 = i26 - i25;
                                            if (i27 < i28) {
                                                int i29 = i28 - i27;
                                                if (i24 <= 3 && i25 <= 3 && i27 <= 3 && i29 <= 3) {
                                                    float fA6 = m1Var.a(fArr, 0, i24);
                                                    int i30 = i24 + i25;
                                                    float fA7 = m1Var.a(fArr, i24, i30);
                                                    int i31 = i30 + i27;
                                                    float fA8 = m1Var.a(fArr, i30, i31);
                                                    float fA9 = m1Var.a(fArr, i31, size2);
                                                    l1 l1Var3 = new l1();
                                                    l1Var3.f39910a = new int[]{i24, i25, i27, i29};
                                                    l1Var3.f39911b = new float[]{fA6, fA7, fA8, fA9};
                                                    arrayList2.add(l1Var3);
                                                }
                                                i27++;
                                                i26 = i26;
                                                m1Var = m1Var;
                                            }
                                        }
                                        i25++;
                                    }
                                }
                            }
                            float f18 = (i23 / 3) * 4;
                            l1 l1Var4 = null;
                            int i32 = 0;
                            float f19 = 0.0f;
                            while (i32 < arrayList2.size()) {
                                l1 l1Var5 = (l1) arrayList2.get(i32);
                                float f20 = Float.MAX_VALUE;
                                int i33 = 0;
                                float f21 = 0.0f;
                                while (true) {
                                    float[] fArr2 = l1Var5.f39911b;
                                    float f22 = f18;
                                    if (i33 < fArr2.length) {
                                        float f23 = fArr2[i33];
                                        f21 += f23;
                                        if (f23 < f20) {
                                            f20 = f23;
                                        }
                                        i33++;
                                        f18 = f22;
                                    } else {
                                        float fAbs = Math.abs(f21 - f22);
                                        int[] iArr = l1Var5.f39910a;
                                        if (iArr.length > 1) {
                                            int i34 = iArr[0];
                                            int i35 = iArr[1];
                                            if (i34 <= i35) {
                                                f10 = fAbs;
                                                if (iArr.length <= 2 || i35 <= iArr[2]) {
                                                    if (iArr.length <= 3 || iArr[2] <= iArr[3]) {
                                                    }
                                                    if (f20 < iMin) {
                                                        f11 *= 1.5f;
                                                    }
                                                    if (l1Var4 != null || f11 < f19) {
                                                        f19 = f11;
                                                        l1Var4 = l1Var5;
                                                    }
                                                    i32++;
                                                    f18 = f22;
                                                }
                                                f11 = f10 * 1.2f;
                                                if (f20 < iMin) {
                                                    f11 *= 1.5f;
                                                }
                                                if (l1Var4 != null) {
                                                    f19 = f11;
                                                    l1Var4 = l1Var5;
                                                } else {
                                                    f19 = f11;
                                                    l1Var4 = l1Var5;
                                                }
                                                i32++;
                                                f18 = f22;
                                            } else {
                                                f10 = fAbs;
                                            }
                                            f11 = f10 * 1.2f;
                                            if (f20 < iMin) {
                                                f11 *= 1.5f;
                                            }
                                            if (l1Var4 != null) {
                                                f19 = f11;
                                                l1Var4 = l1Var5;
                                            } else {
                                                f19 = f11;
                                                l1Var4 = l1Var5;
                                            }
                                            i32++;
                                            f18 = f22;
                                        } else {
                                            f10 = fAbs;
                                        }
                                        f11 = f10;
                                        if (f20 < iMin) {
                                            f11 *= 1.5f;
                                        }
                                        if (l1Var4 != null) {
                                            f19 = f11;
                                            l1Var4 = l1Var5;
                                        } else {
                                            f19 = f11;
                                            l1Var4 = l1Var5;
                                        }
                                        i32++;
                                        f18 = f22;
                                    }
                                }
                            }
                            if (l1Var4 != null) {
                                int[] iArr2 = l1Var4.f39910a;
                                int i36 = 0;
                                int i37 = 0;
                                while (i36 < iArr2.length) {
                                    int i38 = iArr2[i36];
                                    float f24 = l1Var4.f39911b[i36];
                                    int i39 = i37;
                                    int i40 = i23;
                                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                                    int i41 = 0;
                                    while (i41 < i38) {
                                        int i42 = (int) (fArr[i39] * f24);
                                        i40 -= i42;
                                        MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList.get(i39);
                                        int i43 = i36 == 0 ? 4 : 0;
                                        l1 l1Var6 = l1Var4;
                                        if (i36 == iArr2.length - 1) {
                                            i43 |= 8;
                                        }
                                        if (i41 == 0) {
                                            i43 |= 1;
                                        }
                                        if (i41 == i38 - 1) {
                                            i43 |= 2;
                                            groupedMessagePosition3 = groupedMessagePosition4;
                                        }
                                        int i44 = i41;
                                        groupedMessagePosition4.set(i44, i41, i36, i36, i42, f24 / 814.0f, i43);
                                        i39++;
                                        i41 = i44 + 1;
                                        l1Var4 = l1Var6;
                                    }
                                    groupedMessagePosition3.pw += i40;
                                    groupedMessagePosition3.spanSize += i40;
                                    i36++;
                                    l1Var4 = l1Var4;
                                    i37 = i39;
                                }
                            }
                        } else if (size == 2) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList.get(1);
                            String string = sb2.toString();
                            if (string.equals("ww") && f17 > ((double) f16) * 1.4d) {
                                float f25 = groupedMessagePosition5.aspectRatio;
                                float f26 = groupedMessagePosition6.aspectRatio;
                                if (f25 - f26 < 0.2d) {
                                    float fRound = Math.round(Math.min(f15 / f25, Math.min(f15 / f26, 407.0f))) / 814.0f;
                                    groupedMessagePosition5.set(0, 0, 0, 0, m1Var.f40284c, fRound, 7);
                                    groupedMessagePosition6.set(0, 0, 1, 1, m1Var.f40284c, fRound, 11);
                                }
                            }
                            String str2 = string;
                            if (str2.equals("ww") || str2.equals("qq")) {
                                int i45 = i13 / 2;
                                float f27 = i45;
                                float fRound2 = Math.round(Math.min(f27 / groupedMessagePosition5.aspectRatio, Math.min(f27 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                                groupedMessagePosition5.set(0, 0, 0, 0, i45, fRound2, 13);
                                groupedMessagePosition6.set(1, 1, 0, 0, i45, fRound2, 14);
                            } else {
                                float f28 = groupedMessagePosition5.aspectRatio;
                                int iMax = (int) Math.max(f15 * 0.4f, Math.round((f15 / f28) / ((1.0f / groupedMessagePosition6.aspectRatio) + (1.0f / f28))));
                                int i46 = i13 - iMax;
                                if (i46 < iMin) {
                                    iMax -= iMin - i46;
                                } else {
                                    iMin = i46;
                                }
                                float fMin = Math.min(814.0f, Math.round(Math.min(iMin / groupedMessagePosition5.aspectRatio, iMax / groupedMessagePosition6.aspectRatio))) / 814.0f;
                                groupedMessagePosition5.set(0, 0, 0, 0, iMin, fMin, 13);
                                groupedMessagePosition6.set(1, 1, 0, 0, iMax, fMin, 14);
                            }
                        } else if (size == 3) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList.get(1);
                            MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList.get(2);
                            if (sb2.charAt(0) == 'n') {
                                float f29 = groupedMessagePosition8.aspectRatio;
                                float fMin2 = Math.min(407.0f, Math.round((f29 * f15) / (groupedMessagePosition9.aspectRatio + f29)));
                                float f30 = 814.0f - fMin2;
                                int iMax2 = (int) Math.max(iMin, Math.min(f15 * 0.5f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * fMin2, groupedMessagePosition8.aspectRatio * f30))));
                                int iRound = Math.round(Math.min((groupedMessagePosition7.aspectRatio * 814.0f) + iMin2, i13 - iMax2));
                                groupedMessagePosition7.set(0, 0, 0, 1, iRound, 1.0f, 13);
                                float f31 = f30 / 814.0f;
                                groupedMessagePosition8.set(1, 1, 0, 0, iMax2, f31, 6);
                                float f32 = fMin2 / 814.0f;
                                groupedMessagePosition9.set(0, 1, 1, 1, iMax2, f32, 10);
                                groupedMessagePosition9.spanSize = i13;
                                groupedMessagePosition7.siblingHeights = new float[]{f32, f31};
                                groupedMessagePosition8.spanSize = i13 - iRound;
                                groupedMessagePosition9.leftSpanOffset = iRound;
                            } else {
                                float fRound3 = Math.round(Math.min(f15 / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                                groupedMessagePosition7.set(0, 1, 0, 0, m1Var.f40284c, fRound3, 7);
                                int i47 = i13 / 2;
                                float f33 = i47;
                                float fMin3 = Math.min(814.0f - fRound3, Math.round(Math.min(f33 / groupedMessagePosition8.aspectRatio, f33 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                                groupedMessagePosition8.set(0, 0, 1, 1, i47, fMin3, 9);
                                groupedMessagePosition9.set(1, 1, 1, 1, i47, fMin3, 10);
                            }
                        } else if (size == 4) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList.get(1);
                            MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList.get(2);
                            MessageObject.GroupedMessagePosition groupedMessagePosition13 = (MessageObject.GroupedMessagePosition) arrayList.get(3);
                            if (sb2.charAt(0) == 'w') {
                                float fRound4 = Math.round(Math.min(f15 / groupedMessagePosition10.aspectRatio, 537.24005f)) / 814.0f;
                                groupedMessagePosition10.set(0, 2, 0, 0, m1Var.f40284c, fRound4, 7);
                                float fRound5 = Math.round(f15 / ((groupedMessagePosition11.aspectRatio + groupedMessagePosition12.aspectRatio) + groupedMessagePosition13.aspectRatio));
                                float f34 = iMin;
                                int iMax3 = (int) Math.max(f34, Math.min(f15 * 0.4f, groupedMessagePosition11.aspectRatio * fRound5));
                                int iMax4 = (int) Math.max(Math.max(f34, 0.33f * f15), groupedMessagePosition13.aspectRatio * fRound5);
                                float fMin4 = Math.min(814.0f - fRound4, fRound5) / 814.0f;
                                groupedMessagePosition11.set(0, 0, 1, 1, iMax3, fMin4, 9);
                                groupedMessagePosition12.set(1, 1, 1, 1, (i13 - iMax3) - iMax4, fMin4, 8);
                                groupedMessagePosition13.set(2, 2, 1, 1, iMax4, fMin4, 10);
                            } else {
                                int iMax5 = Math.max(iMin, Math.round(814.0f / ((1.0f / ((MessageObject.GroupedMessagePosition) arrayList.get(3)).aspectRatio) + ((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition11.aspectRatio)))));
                                float f35 = iDp;
                                float f36 = iMax5;
                                float fMin5 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition11.aspectRatio) / 814.0f);
                                float fMin6 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition12.aspectRatio) / 814.0f);
                                float f37 = (1.0f - fMin5) - fMin6;
                                int iRound2 = Math.round(Math.min((814.0f * groupedMessagePosition10.aspectRatio) + iMin2, i13 - iMax5));
                                groupedMessagePosition10.set(0, 0, 0, 2, iRound2, fMin5 + fMin6 + f37, 13);
                                groupedMessagePosition11.set(1, 1, 0, 0, iMax5, fMin5, 6);
                                groupedMessagePosition12.set(0, 1, 1, 1, iMax5, fMin6, 2);
                                groupedMessagePosition12.spanSize = i13;
                                groupedMessagePosition13.set(0, 1, 2, 2, iMax5, f37, 10);
                                groupedMessagePosition13.spanSize = i13;
                                groupedMessagePosition11.spanSize = i13 - iRound2;
                                groupedMessagePosition12.leftSpanOffset = iRound2;
                                groupedMessagePosition13.leftSpanOffset = iRound2;
                                groupedMessagePosition10.siblingHeights = new float[]{fMin5, fMin6, f37};
                            }
                        }
                        for (int i48 = 0; i48 < size; i48++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList.get(i48);
                            if ((groupedMessagePosition14.flags & 1) != 0) {
                                groupedMessagePosition14.edge = true;
                            }
                        }
                    }
                }
                n1Var.f40628b.l();
                n1Var.f40627a.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                n1Var.requestLayout();
                break;
            case 18:
                ((g1) o1Var.f5789a).setBlock((TL_iv.pageBlockChannel) pageBlock2);
                break;
            case 19:
                d1 d1Var = (d1) o1Var.f5789a;
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock2;
                z12 = i11 == 0;
                d70 d70Var = d1Var.f37219a;
                d1Var.G = pageblockaudio;
                MessageObject messageObject = (MessageObject) d1Var.f37220b.f39594s.get(pageblockaudio);
                d1Var.I = messageObject;
                if (messageObject != null) {
                    d1Var.H = messageObject.getDocument();
                }
                d1Var.h = z12;
                org.telegram.ui.Components.mn0 mn0Var = d1Var.f37223f;
                int i49 = org.telegram.ui.ActionBar.g6.f23364ud;
                ((m4) d70Var).getClass();
                int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i49, false);
                int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23380vd, false);
                int i50 = org.telegram.ui.ActionBar.g6.f23412xd;
                mn0Var.h(iW0, iW1, org.telegram.ui.ActionBar.g6.w0(null, i50, false), org.telegram.ui.ActionBar.g6.w0(null, i50, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.wd, false));
                d1Var.a(false);
                d1Var.requestLayout();
                break;
            case 20:
                ((a2) o1Var.f5789a).setBlock((TL_iv.pageBlockKicker) pageBlock2);
                break;
            case 21:
                ((e2) o1Var.f5789a).setBlock((e4) pageBlock2);
                break;
            case 22:
                c2 c2Var = (c2) o1Var.f5789a;
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock2;
                z12 = i11 == 0;
                c2Var.f36922x = pageblockmap;
                c2Var.h = z12;
                c2Var.requestLayout();
                break;
            case 23:
                m2 m2Var = (m2) o1Var.f5789a;
                TLRPC.WebPage webPage = this.A;
                m2Var.f40295n = (g4) pageBlock2;
                m2Var.f40296r = webPage;
                m2Var.requestLayout();
                break;
            case 24:
                ((p1) o1Var.f5789a).setBlock((TL_iv.pageBlockDetails) pageBlock2);
                break;
            case 25:
                ((y2) o1Var.f5789a).setBlock((TL_iv.pageBlockTable) pageBlock2);
                break;
            case 26:
                ((n2) o1Var.f5789a).setBlock((TL_iv.pageBlockRelatedArticles) pageBlock2);
                break;
            case 27:
                break;
        }
    }

    public final boolean J(a4 a4Var) {
        TL_iv.PageBlock pageBlockZ = m4.z(a4Var.f36369a);
        if (pageBlockZ instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) pageBlockZ).open;
        }
        if (!(pageBlockZ instanceof a4)) {
            return false;
        }
        a4 a4Var2 = (a4) pageBlockZ;
        TL_iv.PageBlock pageBlockZ2 = m4.z(a4Var2.f36370b);
        if (!(pageBlockZ2 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) pageBlockZ2).open) {
            return J(a4Var2);
        }
        return false;
    }

    public final void K(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageBlock pageBlock2 = (TL_iv.pageBlockEmbedPost) pageBlock;
            L(null, pageBlock2.caption.text);
            L(null, pageBlock2.caption.credit);
            G(pageBlock2.caption.text, pageBlock2);
            G(pageBlock2.caption.credit, pageBlock2);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.pageBlockParagraph) pageBlock;
            L(null, pageBlock3.text);
            G(pageBlock3.text, pageBlock3);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockKicker) {
            TL_iv.PageBlock pageBlock4 = (TL_iv.pageBlockKicker) pageBlock;
            L(null, pageBlock4.text);
            G(pageBlock4.text, pageBlock4);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            TL_iv.PageBlock pageBlock5 = (TL_iv.pageBlockFooter) pageBlock;
            L(null, pageBlock5.text);
            G(pageBlock5.text, pageBlock5);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeader) {
            TL_iv.PageBlock pageBlock6 = (TL_iv.pageBlockHeader) pageBlock;
            L(null, pageBlock6.text);
            G(pageBlock6.text, pageBlock6);
            return;
        }
        if (m4.K(pageBlock)) {
            TL_iv.RichText richText = pageBlock.text;
            L(null, richText);
            G(richText, pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.PageBlock pageBlock7 = (TL_iv.pageBlockPreformatted) pageBlock;
            L(null, pageBlock7.text);
            G(pageBlock7.text, pageBlock7);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            TL_iv.PageBlock pageBlock8 = (TL_iv.pageBlockSubheader) pageBlock;
            L(null, pageBlock8.text);
            G(pageBlock8.text, pageBlock8);
            return;
        }
        int i10 = 0;
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            L(null, pageblockslideshow.caption.text);
            L(null, pageblockslideshow.caption.credit);
            G(pageblockslideshow.caption.text, pageblockslideshow);
            G(pageblockslideshow.caption.credit, pageblockslideshow);
            int size = pageblockslideshow.items.size();
            while (i10 < size) {
                K(pageblockslideshow.items.get(i10));
                i10++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.PageBlock pageBlock9 = (TL_iv.pageBlockPhoto) pageBlock;
            L(null, pageBlock9.caption.text);
            L(null, pageBlock9.caption.credit);
            G(pageBlock9.caption.text, pageBlock9);
            G(pageBlock9.caption.credit, pageBlock9);
            return;
        }
        if (pageBlock instanceof c4) {
            c4 c4Var = (c4) pageBlock;
            TL_iv.RichText richText2 = c4Var.f36931e;
            if (richText2 != null) {
                L(null, richText2);
                G(c4Var.f36931e, c4Var);
                return;
            } else {
                TL_iv.PageBlock pageBlock10 = c4Var.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                    return;
                }
                return;
            }
        }
        if (pageBlock instanceof e4) {
            e4 e4Var = (e4) pageBlock;
            TL_iv.RichText richText3 = e4Var.f37616e;
            if (richText3 != null) {
                L(null, richText3);
                G(e4Var.f37616e, e4Var);
                return;
            } else {
                TL_iv.PageBlock pageBlock11 = e4Var.d;
                if (pageBlock11 != null) {
                    K(pageBlock11);
                    return;
                }
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            L(null, pageblockcollage.caption.text);
            L(null, pageblockcollage.caption.credit);
            G(pageblockcollage.caption.text, pageblockcollage);
            G(pageblockcollage.caption.credit, pageblockcollage);
            int size2 = pageblockcollage.items.size();
            while (i10 < size2) {
                K(pageblockcollage.items.get(i10));
                i10++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.PageBlock pageBlock12 = (TL_iv.pageBlockEmbed) pageBlock;
            L(null, pageBlock12.caption.text);
            L(null, pageBlock12.caption.credit);
            G(pageBlock12.caption.text, pageBlock12);
            G(pageBlock12.caption.credit, pageBlock12);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            TL_iv.PageBlock pageBlock13 = (TL_iv.pageBlockSubtitle) pageBlock;
            L(null, pageBlock13.text);
            G(pageBlock13.text, pageBlock13);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            L(null, pageblockblockquote.text);
            L(null, pageblockblockquote.caption);
            G(pageblockblockquote.text, pageblockblockquote);
            G(pageblockblockquote.caption, pageblockblockquote);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            L(null, pageblockdetails.title);
            G(pageblockdetails.title, pageblockdetails);
            int size3 = pageblockdetails.blocks.size();
            while (i10 < size3) {
                K(pageblockdetails.blocks.get(i10));
                i10++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.PageBlock pageBlock14 = (TL_iv.pageBlockVideo) pageBlock;
            L(null, pageBlock14.caption.text);
            L(null, pageBlock14.caption.credit);
            G(pageBlock14.caption.text, pageBlock14);
            G(pageBlock14.caption.credit, pageBlock14);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            L(null, pageblockpullquote.text);
            L(null, pageblockpullquote.caption);
            G(pageblockpullquote.text, pageblockpullquote);
            G(pageblockpullquote.caption, pageblockpullquote);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.PageBlock pageBlock15 = (TL_iv.pageBlockAudio) pageBlock;
            L(null, pageBlock15.caption.text);
            L(null, pageBlock15.caption.credit);
            G(pageBlock15.caption.text, pageBlock15);
            G(pageBlock15.caption.credit, pageBlock15);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            L(null, pageblocktable.title);
            G(pageblocktable.title, pageblocktable);
            int size4 = pageblocktable.rows.size();
            for (int i11 = 0; i11 < size4; i11++) {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i11);
                int size5 = pagetablerow.cells.size();
                for (int i12 = 0; i12 < size5; i12++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i12);
                    L(null, pagetablecell.text);
                    G(pagetablecell.text, pageblocktable);
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTitle) {
            TL_iv.PageBlock pageBlock16 = (TL_iv.pageBlockTitle) pageBlock;
            L(null, pageBlock16.text);
            G(pageBlock16.text, pageBlock16);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            K(((TL_iv.pageBlockCover) pageBlock).cover);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            TL_iv.pageBlockAuthorDate pageblockauthordate = (TL_iv.pageBlockAuthorDate) pageBlock;
            L(null, pageblockauthordate.author);
            G(pageblockauthordate.author, pageblockauthordate);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                TL_iv.PageBlock pageBlock17 = (TL_iv.pageBlockMap) pageBlock;
                L(null, pageBlock17.caption.text);
                L(null, pageBlock17.caption.credit);
                G(pageBlock17.caption.text, pageBlock17);
                G(pageBlock17.caption.credit, pageBlock17);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) pageBlock;
                L(null, pageblockrelatedarticles.title);
                G(pageblockrelatedarticles.title, pageblockrelatedarticles);
            }
        }
    }

    public final void L(TL_iv.RichText richText, TL_iv.RichText richText2) {
        if (richText2 == null) {
            return;
        }
        richText2.parentRichText = richText;
        if (richText2 instanceof TL_iv.textFixed) {
            L(richText2, ((TL_iv.textFixed) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textItalic) {
            L(richText2, ((TL_iv.textItalic) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textBold) {
            L(richText2, ((TL_iv.textBold) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            L(richText2, ((TL_iv.textUnderline) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textStrike) {
            L(richText2, ((TL_iv.textStrike) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textEmail) {
            L(richText2, ((TL_iv.textEmail) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            L(richText2, ((TL_iv.textPhone) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textUrl) {
            L(richText2, ((TL_iv.textUrl) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textConcat) {
            int size = richText2.texts.size();
            for (int i10 = 0; i10 < size; i10++) {
                L(richText2, richText2.texts.get(i10));
            }
            return;
        }
        if (richText2 instanceof TL_iv.textSubscript) {
            L(richText2, ((TL_iv.textSubscript) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            L(richText2, ((TL_iv.textSuperscript) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textMarked) {
            L(richText2, ((TL_iv.textMarked) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            L(richText2, ((TL_iv.textSpoiler) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            L(richText2, textanchor.text);
            String lowerCase = textanchor.name.toLowerCase();
            this.h.put(lowerCase, Integer.valueOf(this.f39590e.size()));
            TL_iv.RichText richText3 = textanchor.text;
            boolean z10 = richText3 instanceof TL_iv.textPlain;
            HashMap map = this.f39593r;
            if (z10) {
                if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                    map.put(lowerCase, textanchor);
                }
            } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                map.put(lowerCase, textanchor);
            }
            this.f39592n.put(lowerCase, -1);
        }
    }

    public final void M() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = this.f39590e;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i10);
            TL_iv.PageBlock pageBlockZ = m4.z(pageBlock);
            if (!(pageBlockZ instanceof a4) || J((a4) pageBlockZ)) {
                arrayList.add(pageBlock);
            }
        }
        if (arrayList.size() < 100) {
            Utilities.globalQueue.cancelRunnable(this.G);
            Utilities.globalQueue.postRunnable(this.G, 100L);
        }
    }

    @Override
    public final int h() {
        int size;
        TLRPC.WebPage webPage = this.A;
        if (webPage == null || webPage.cached_page == null) {
            size = 0;
        } else {
            size = this.d.size();
            if (this.A.cached_page.local == null) {
                size++;
            }
        }
        return this.D ? size + 1 : size;
    }

    @Override
    public final int j(int i10) {
        TL_iv.Page page;
        if (this.D) {
            if (i10 == 0) {
                return 2147483646;
            }
            i10--;
        }
        ArrayList arrayList = this.d;
        if (i10 != arrayList.size()) {
            return I((TL_iv.PageBlock) arrayList.get(i10));
        }
        TLRPC.WebPage webPage = this.A;
        return (webPage == null || (page = webPage.cached_page) == null || !page.web) ? 90 : 91;
    }

    @Override
    public final void l() {
        M();
        super.l();
    }

    @Override
    public final void m(int i10) {
        M();
        super.m(i10);
    }

    @Override
    public final void p(int i10, int i11) {
        M();
        super.p(i10, i11);
    }

    @Override
    public final void q(int i10, int i11) {
        M();
        super.q(i10, i11);
    }

    @Override
    public final void r(int i10, int i11, Object obj) {
        M();
        super.r(i10, i11, obj);
    }

    @Override
    public final void s(int i10, int i11) {
        M();
        super.s(i10, i11);
    }

    @Override
    public final void t(int i10, int i11) {
        M();
        super.t(i10, i11);
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (this.D) {
            i10--;
        }
        int i11 = i10;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                H(o1Var.f5793f, o1Var, (TL_iv.PageBlock) arrayList.get(i11), i11, arrayList.size(), false);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View f2Var;
        View b3Var;
        Context context = this.f39589c;
        if (i10 != 2147483646) {
            m4 m4Var = this.H;
            switch (i10) {
                case 0:
                    f2Var = new f2(context, m4Var, this);
                    break;
                case 1:
                    f2Var = new z1(context, m4Var, this);
                    break;
                case 2:
                    f2Var = new q1(context);
                    break;
                case 3:
                    f2Var = new w1(m4Var, context, this);
                    break;
                case 4:
                    f2Var = new w2(context, m4Var, this);
                    break;
                case 5:
                    b3Var = new b3(context, m4Var, this, 0);
                    f2Var = b3Var;
                    break;
                case 6:
                    f2Var = new l2(context, m4Var, this);
                    break;
                case 7:
                    f2Var = new f1(context, m4Var, this);
                    break;
                case 8:
                    f2Var = new u2(m4Var, context, this);
                    break;
                case 9:
                    b3Var = new g2(context, m4Var, this, 0);
                    f2Var = b3Var;
                    break;
                case 10:
                    f2Var = new e1(context, m4Var, this);
                    break;
                case 11:
                    f2Var = new z2(context, m4Var, this);
                    break;
                case 12:
                    f2Var = new b2(context, m4Var, this);
                    break;
                case 13:
                    f2Var = new y1(context, m4Var, this);
                    break;
                case 14:
                    f2Var = new k2(context, m4Var, this);
                    break;
                case 15:
                    f2Var = new v2(context, m4Var, this);
                    break;
                case 16:
                    f2Var = new x1(context, m4Var, this);
                    break;
                case 17:
                    f2Var = new n1(m4Var, context, this);
                    break;
                case 18:
                    b3Var = new g1(context, m4Var, this, 0);
                    f2Var = b3Var;
                    break;
                case 19:
                    f2Var = new d1(context, m4Var, this);
                    break;
                case 20:
                    f2Var = new a2(context, m4Var, this);
                    break;
                case 21:
                    f2Var = new e2(context, m4Var, this);
                    break;
                case 22:
                    f2Var = new c2(context, m4Var, this);
                    break;
                case 23:
                    f2Var = new m2(context, m4Var, this);
                    break;
                case 24:
                    f2Var = new p1(context, m4Var, this);
                    break;
                case 25:
                    f2Var = new y2(context, m4Var, this);
                    break;
                case 26:
                    f2Var = new n2(context, m4Var, this);
                    break;
                case 27:
                    o1 o1Var = new o1(context);
                    new RectF();
                    o1Var.setImportantForAccessibility(2);
                    f2Var = o1Var;
                    break;
                case 28:
                    f2Var = new o2(context, m4Var);
                    break;
                default:
                    switch (i10) {
                        case 90:
                            b3Var = new t3(m4Var, context, false);
                            f2Var = b3Var;
                            break;
                        case 91:
                            f2Var = new t3(m4Var, context, true);
                            break;
                        case 92:
                            f2Var = new d2(context, m4Var);
                            break;
                        default:
                            TextView textView = new TextView(context);
                            textView.setBackgroundColor(-65536);
                            textView.setTextColor(-16777216);
                            textView.setTextSize(1, 20.0f);
                            f2Var = textView;
                            break;
                    }
                    break;
            }
        } else {
            org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(context, 7);
            zmVar.setImportantForAccessibility(2);
            f2Var = zmVar;
        }
        f2Var.setLayoutParams(new f2.y0(-1, -2));
        f2Var.setFocusable(true);
        return new org.telegram.ui.Components.lk0(f2Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        if (i10 == 90 || i10 == 91) {
            t3 t3Var = (t3) o1Var.f5789a;
            TL_iv.Page page = this.A.cached_page;
            int i11 = page != null ? page.views : 0;
            m4 m4Var = t3Var.f42770e;
            TextView textView = t3Var.f42767a;
            TextView textView2 = t3Var.f42768b;
            if (i11 == 0) {
                t3Var.f42769c = false;
                textView2.setVisibility(8);
                textView.setGravity(17);
            } else {
                t3Var.f42769c = true;
                textView2.setVisibility(0);
                textView.setGravity(21);
                textView2.setText(LocaleController.formatPluralStringComma("Views", i11));
            }
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.M6, false);
            textView.setTextColor(m4Var.a());
            textView2.setTextColor(m4Var.a());
            textView.setBackgroundColor(Color.argb(34, Color.red(iW0), Color.green(iW0), Color.blue(iW0)));
        }
    }
}
