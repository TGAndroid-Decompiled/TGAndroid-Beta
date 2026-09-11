package org.telegram.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g4 extends org.telegram.ui.Components.kl0 {
    public TLRPC.WebPage E;
    public TL_iv.pageBlockChannel F;
    public boolean G;
    public final boolean H;
    public int[] I;
    public int J;
    public final i4 L;
    public final Context f36549c;
    public final ArrayList d = new ArrayList();
    public final ArrayList f36550e = new ArrayList();
    public final ArrayList f36551f = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap f36552n = new HashMap();
    public final HashMap f36553r = new HashMap();
    public final HashMap f36554s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final HashMap f36555w = new HashMap();
    public final ArrayList f36556x = new ArrayList();
    public final HashMap f36557y = new HashMap();
    public final lu0 K = new lu0(this, 11);

    public g4(i4 i4Var, Context context, boolean z10) {
        this.L = i4Var;
        this.f36549c = context;
        this.H = z10;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockHeader) && !i4.K(pageBlock)) {
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
            if (pageBlock instanceof y3) {
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
            if (pageBlock instanceof a4) {
                return 21;
            }
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return 22;
            }
            if (pageBlock instanceof c4) {
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
            if (pageBlock instanceof d4) {
                return 28;
            }
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return 92;
            }
            if (pageBlock instanceof w3) {
                return I(((w3) pageBlock).f41753b);
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                return I(((TL_iv.pageBlockCover) pageBlock).cover);
            }
            return 100;
        }
        return 1;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 23 && i10 != 24) {
            return false;
        }
        return true;
    }

    public final void E(TL_iv.PageBlock pageBlock, g4 g4Var) {
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f36551f;
        if (z10) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e7 = f4.e(this.E, pageblockphoto.photo_id);
            if (e7 != null) {
                pageblockphoto.thumb = FileLoader.getClosestPhotoSizeWithSize(e7.sizes, 56, true);
                pageblockphoto.thumbObject = e7;
                arrayList.add(pageBlock);
            }
        } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && f4.g(g4Var.E, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a2 = f4.a(this.E, pageblockvideo.video_id);
            if (a2 != null) {
                pageblockvideo.thumb = FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 56, true);
                pageblockvideo.thumbObject = a2;
                arrayList.add(pageBlock);
            }
        } else {
            boolean z11 = pageBlock instanceof TL_iv.pageBlockSlideshow;
            int i10 = 0;
            i4 i4Var = this.L;
            if (z11) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                int size = pageblockslideshow.items.size();
                while (i10 < size) {
                    TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i10);
                    pageBlock2.groupId = i4Var.Y;
                    E(pageBlock2, g4Var);
                    i10++;
                }
                i4Var.Y++;
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                int size2 = pageblockcollage.items.size();
                while (i10 < size2) {
                    TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i10);
                    pageBlock3.groupId = i4Var.Y;
                    E(pageBlock3, g4Var);
                    i10++;
                }
                i4Var.Y++;
            } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(((TL_iv.pageBlockCover) pageBlock).cover, g4Var);
            }
        }
    }

    public final void F(org.telegram.ui.g4 r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.F(org.telegram.ui.g4, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, int):void");
    }

    public final void G(Object obj, TL_iv.PageBlock pageBlock) {
        if (!(obj instanceof TL_iv.textEmpty)) {
            HashMap hashMap = this.f36555w;
            if (hashMap.containsKey(obj)) {
                return;
            }
            hashMap.put(obj, pageBlock);
            this.f36556x.add(obj);
        }
    }

    public final void H(int r32, s4.c1 r33, org.telegram.tgnet.tl.TL_iv.PageBlock r34, int r35, int r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.H(int, s4.c1, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean):void");
    }

    public final boolean J(w3 w3Var) {
        TL_iv.PageBlock z10 = i4.z(w3Var.f41752a);
        if (z10 instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) z10).open;
        }
        if (z10 instanceof w3) {
            w3 w3Var2 = (w3) z10;
            TL_iv.PageBlock z11 = i4.z(w3Var2.f41753b);
            if (!(z11 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) z11).open) {
                return J(w3Var2);
            }
            return false;
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
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.pageBlockParagraph) pageBlock;
            L(null, pageBlock3.text);
            G(pageBlock3.text, pageBlock3);
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            TL_iv.PageBlock pageBlock4 = (TL_iv.pageBlockKicker) pageBlock;
            L(null, pageBlock4.text);
            G(pageBlock4.text, pageBlock4);
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            TL_iv.PageBlock pageBlock5 = (TL_iv.pageBlockFooter) pageBlock;
            L(null, pageBlock5.text);
            G(pageBlock5.text, pageBlock5);
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            TL_iv.PageBlock pageBlock6 = (TL_iv.pageBlockHeader) pageBlock;
            L(null, pageBlock6.text);
            G(pageBlock6.text, pageBlock6);
        } else if (i4.K(pageBlock)) {
            TL_iv.RichText richText = pageBlock.text;
            L(null, richText);
            G(richText, pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.PageBlock pageBlock7 = (TL_iv.pageBlockPreformatted) pageBlock;
            L(null, pageBlock7.text);
            G(pageBlock7.text, pageBlock7);
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            TL_iv.PageBlock pageBlock8 = (TL_iv.pageBlockSubheader) pageBlock;
            L(null, pageBlock8.text);
            G(pageBlock8.text, pageBlock8);
        } else {
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
            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.PageBlock pageBlock9 = (TL_iv.pageBlockPhoto) pageBlock;
                L(null, pageBlock9.caption.text);
                L(null, pageBlock9.caption.credit);
                G(pageBlock9.caption.text, pageBlock9);
                G(pageBlock9.caption.credit, pageBlock9);
            } else if (pageBlock instanceof y3) {
                y3 y3Var = (y3) pageBlock;
                TL_iv.RichText richText2 = y3Var.f42973e;
                if (richText2 != null) {
                    L(null, richText2);
                    G(y3Var.f42973e, y3Var);
                    return;
                }
                TL_iv.PageBlock pageBlock10 = y3Var.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                }
            } else if (pageBlock instanceof a4) {
                a4 a4Var = (a4) pageBlock;
                TL_iv.RichText richText3 = a4Var.f34328e;
                if (richText3 != null) {
                    L(null, richText3);
                    G(a4Var.f34328e, a4Var);
                    return;
                }
                TL_iv.PageBlock pageBlock11 = a4Var.d;
                if (pageBlock11 != null) {
                    K(pageBlock11);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
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
            } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                TL_iv.PageBlock pageBlock12 = (TL_iv.pageBlockEmbed) pageBlock;
                L(null, pageBlock12.caption.text);
                L(null, pageBlock12.caption.credit);
                G(pageBlock12.caption.text, pageBlock12);
                G(pageBlock12.caption.credit, pageBlock12);
            } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                TL_iv.PageBlock pageBlock13 = (TL_iv.pageBlockSubtitle) pageBlock;
                L(null, pageBlock13.text);
                G(pageBlock13.text, pageBlock13);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                L(null, pageblockblockquote.text);
                L(null, pageblockblockquote.caption);
                G(pageblockblockquote.text, pageblockblockquote);
                G(pageblockblockquote.caption, pageblockblockquote);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                L(null, pageblockdetails.title);
                G(pageblockdetails.title, pageblockdetails);
                int size3 = pageblockdetails.blocks.size();
                while (i10 < size3) {
                    K(pageblockdetails.blocks.get(i10));
                    i10++;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.PageBlock pageBlock14 = (TL_iv.pageBlockVideo) pageBlock;
                L(null, pageBlock14.caption.text);
                L(null, pageBlock14.caption.credit);
                G(pageBlock14.caption.text, pageBlock14);
                G(pageBlock14.caption.credit, pageBlock14);
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                L(null, pageblockpullquote.text);
                L(null, pageblockpullquote.caption);
                G(pageblockpullquote.text, pageblockpullquote);
                G(pageblockpullquote.caption, pageblockpullquote);
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                TL_iv.PageBlock pageBlock15 = (TL_iv.pageBlockAudio) pageBlock;
                L(null, pageBlock15.caption.text);
                L(null, pageBlock15.caption.credit);
                G(pageBlock15.caption.text, pageBlock15);
                G(pageBlock15.caption.credit, pageBlock15);
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
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
            } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
                TL_iv.PageBlock pageBlock16 = (TL_iv.pageBlockTitle) pageBlock;
                L(null, pageBlock16.text);
                G(pageBlock16.text, pageBlock16);
            } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                K(((TL_iv.pageBlockCover) pageBlock).cover);
            } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                TL_iv.pageBlockAuthorDate pageblockauthordate = (TL_iv.pageBlockAuthorDate) pageBlock;
                L(null, pageblockauthordate.author);
                G(pageblockauthordate.author, pageblockauthordate);
            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                TL_iv.PageBlock pageBlock17 = (TL_iv.pageBlockMap) pageBlock;
                L(null, pageBlock17.caption.text);
                L(null, pageBlock17.caption.credit);
                G(pageBlock17.caption.text, pageBlock17);
                G(pageBlock17.caption.credit, pageBlock17);
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) pageBlock;
                L(null, pageblockrelatedarticles.title);
                G(pageblockrelatedarticles.title, pageblockrelatedarticles);
            }
        }
    }

    public final void L(TL_iv.RichText richText, TL_iv.RichText richText2) {
        if (richText2 != null) {
            richText2.parentRichText = richText;
            if (richText2 instanceof TL_iv.textFixed) {
                L(richText2, ((TL_iv.textFixed) richText2).text);
            } else if (richText2 instanceof TL_iv.textItalic) {
                L(richText2, ((TL_iv.textItalic) richText2).text);
            } else if (richText2 instanceof TL_iv.textBold) {
                L(richText2, ((TL_iv.textBold) richText2).text);
            } else if (richText2 instanceof TL_iv.textUnderline) {
                L(richText2, ((TL_iv.textUnderline) richText2).text);
            } else if (richText2 instanceof TL_iv.textStrike) {
                L(richText2, ((TL_iv.textStrike) richText2).text);
            } else if (richText2 instanceof TL_iv.textEmail) {
                L(richText2, ((TL_iv.textEmail) richText2).text);
            } else if (richText2 instanceof TL_iv.textPhone) {
                L(richText2, ((TL_iv.textPhone) richText2).text);
            } else if (richText2 instanceof TL_iv.textUrl) {
                L(richText2, ((TL_iv.textUrl) richText2).text);
            } else if (richText2 instanceof TL_iv.textConcat) {
                int size = richText2.texts.size();
                for (int i10 = 0; i10 < size; i10++) {
                    L(richText2, richText2.texts.get(i10));
                }
            } else if (richText2 instanceof TL_iv.textSubscript) {
                L(richText2, ((TL_iv.textSubscript) richText2).text);
            } else if (richText2 instanceof TL_iv.textSuperscript) {
                L(richText2, ((TL_iv.textSuperscript) richText2).text);
            } else if (richText2 instanceof TL_iv.textMarked) {
                L(richText2, ((TL_iv.textMarked) richText2).text);
            } else if (richText2 instanceof TL_iv.textSpoiler) {
                L(richText2, ((TL_iv.textSpoiler) richText2).text);
            } else if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                L(richText2, textanchor.text);
                String lowerCase = textanchor.name.toLowerCase();
                this.h.put(lowerCase, Integer.valueOf(this.f36550e.size()));
                TL_iv.RichText richText3 = textanchor.text;
                boolean z10 = richText3 instanceof TL_iv.textPlain;
                HashMap hashMap = this.f36553r;
                if (z10) {
                    if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                        hashMap.put(lowerCase, textanchor);
                    }
                } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                    hashMap.put(lowerCase, textanchor);
                }
                this.f36552n.put(lowerCase, -1);
            }
        }
    }

    public final void M() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = this.f36550e;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i10);
            TL_iv.PageBlock z10 = i4.z(pageBlock);
            if (!(z10 instanceof w3) || J((w3) z10)) {
                arrayList.add(pageBlock);
            }
        }
        if (arrayList.size() < 100) {
            Utilities.globalQueue.cancelRunnable(this.K);
            Utilities.globalQueue.postRunnable(this.K, 100L);
        }
    }

    @Override
    public final int h() {
        int i10;
        TLRPC.WebPage webPage = this.E;
        if (webPage != null && webPage.cached_page != null) {
            i10 = this.d.size();
            if (this.E.cached_page.local == null) {
                i10++;
            }
        } else {
            i10 = 0;
        }
        if (this.H) {
            return i10 + 1;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        TL_iv.Page page;
        if (this.H) {
            if (i10 == 0) {
                return 2147483646;
            }
            i10--;
        }
        ArrayList arrayList = this.d;
        if (i10 == arrayList.size()) {
            TLRPC.WebPage webPage = this.E;
            if (webPage != null && (page = webPage.cached_page) != null && page.web) {
                return 91;
            }
            return 90;
        }
        return I((TL_iv.PageBlock) arrayList.get(i10));
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
    public final void v(s4.c1 c1Var, int i10) {
        if (this.H) {
            i10--;
        }
        int i11 = i10;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                H(c1Var.f45742f, c1Var, (TL_iv.PageBlock) arrayList.get(i11), i11, arrayList.size(), false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        TextView textView;
        View x2Var;
        Context context = this.f36549c;
        if (i10 != 2147483646) {
            i4 i4Var = this.L;
            switch (i10) {
                case 0:
                    textView = new c2(context, i4Var, this);
                    break;
                case 1:
                    textView = new w1(context, i4Var, this);
                    break;
                case 2:
                    textView = new n1(context);
                    break;
                case 3:
                    textView = new t1(i4Var, context, this);
                    break;
                case 4:
                    textView = new s2(context, i4Var, this);
                    break;
                case 5:
                    x2Var = new x2(context, i4Var, this, 0);
                    textView = x2Var;
                    break;
                case 6:
                    textView = new h2(context, i4Var, this);
                    break;
                case 7:
                    textView = new c1(context, i4Var, this);
                    break;
                case 8:
                    textView = new q2(i4Var, context, this);
                    break;
                case 9:
                    x2Var = new d2(context, i4Var, this, 0);
                    textView = x2Var;
                    break;
                case 10:
                    textView = new b1(context, i4Var, this);
                    break;
                case 11:
                    textView = new v2(context, i4Var, this);
                    break;
                case 12:
                    textView = new y1(context, i4Var, this);
                    break;
                case 13:
                    textView = new v1(context, i4Var, this);
                    break;
                case 14:
                    textView = new g2(context, i4Var, this);
                    break;
                case 15:
                    textView = new r2(context, i4Var, this);
                    break;
                case 16:
                    textView = new u1(context, i4Var, this);
                    break;
                case 17:
                    textView = new k1(i4Var, context, this);
                    break;
                case 18:
                    x2Var = new d1(context, i4Var, this, 0);
                    textView = x2Var;
                    break;
                case 19:
                    textView = new a1(context, i4Var, this);
                    break;
                case 20:
                    textView = new x1(context, i4Var, this);
                    break;
                case 21:
                    textView = new b2(context, i4Var, this);
                    break;
                case 22:
                    textView = new z1(context, i4Var, this);
                    break;
                case 23:
                    textView = new i2(context, i4Var, this);
                    break;
                case 24:
                    textView = new m1(context, i4Var, this);
                    break;
                case 25:
                    textView = new u2(context, i4Var, this);
                    break;
                case 26:
                    textView = new j2(context, i4Var, this);
                    break;
                case 27:
                    View view = new View(context);
                    new RectF();
                    view.setImportantForAccessibility(2);
                    textView = view;
                    break;
                case 28:
                    textView = new k2(context, i4Var);
                    break;
                default:
                    switch (i10) {
                        case 90:
                            x2Var = new p3(i4Var, context, false);
                            textView = x2Var;
                            break;
                        case 91:
                            textView = new p3(i4Var, context, true);
                            break;
                        case 92:
                            textView = new a2(context, i4Var);
                            break;
                        default:
                            TextView textView2 = new TextView(context);
                            textView2.setBackgroundColor(-65536);
                            textView2.setTextColor(-16777216);
                            textView2.setTextSize(1, 20.0f);
                            textView = textView2;
                            break;
                    }
            }
        } else {
            View jnVar = new org.telegram.ui.Components.jn(context, 8);
            jnVar.setImportantForAccessibility(2);
            textView = jnVar;
        }
        textView.setLayoutParams(new s4.p0(-1, -2));
        textView.setFocusable(true);
        return new s4.c1(textView);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11 = c1Var.f45742f;
        if (i11 != 90 && i11 != 91) {
            return;
        }
        p3 p3Var = (p3) c1Var.f45738a;
        TL_iv.Page page = this.E.cached_page;
        if (page != null) {
            i10 = page.views;
        } else {
            i10 = 0;
        }
        i4 i4Var = p3Var.f39396e;
        TextView textView = p3Var.f39393a;
        TextView textView2 = p3Var.f39394b;
        if (i10 == 0) {
            p3Var.f39395c = false;
            textView2.setVisibility(8);
            textView.setGravity(17);
        } else {
            p3Var.f39395c = true;
            textView2.setVisibility(0);
            textView.setGravity(21);
            textView2.setText(LocaleController.formatPluralStringComma("Views", i10));
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.M6, false);
        textView.setTextColor(i4Var.a());
        textView2.setTextColor(i4Var.a());
        textView.setBackgroundColor(Color.argb(34, Color.red(w02), Color.green(w02), Color.blue(w02)));
    }
}
