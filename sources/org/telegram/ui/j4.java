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
public final class j4 extends org.telegram.ui.Components.vk0 {
    public TLRPC.WebPage A;
    public TL_iv.pageBlockChannel B;
    public boolean C;
    public final boolean D;
    public int[] E;
    public int F;
    public final l4 H;
    public final Context f39359c;
    public final ArrayList d = new ArrayList();
    public final ArrayList f39360e = new ArrayList();
    public final ArrayList f39361f = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap f39362n = new HashMap();
    public final HashMap f39363r = new HashMap();
    public final HashMap f39364s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final HashMap f39365w = new HashMap();
    public final ArrayList f39366x = new ArrayList();
    public final HashMap f39367y = new HashMap();
    public final kt0 G = new kt0(this, 11);

    public j4(l4 l4Var, Context context, boolean z10) {
        this.H = l4Var;
        this.f39359c = context;
        this.D = z10;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockHeader) && !l4.K(pageBlock)) {
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
            if (pageBlock instanceof b4) {
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
            if (pageBlock instanceof d4) {
                return 21;
            }
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return 22;
            }
            if (pageBlock instanceof f4) {
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
            if (pageBlock instanceof g4) {
                return 28;
            }
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return 92;
            }
            if (pageBlock instanceof z3) {
                return I(((z3) pageBlock).f45015b);
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                return I(((TL_iv.pageBlockCover) pageBlock).cover);
            }
            return 100;
        }
        return 1;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 23 && i9 != 24) {
            return false;
        }
        return true;
    }

    public final void E(TL_iv.PageBlock pageBlock, j4 j4Var) {
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f39361f;
        if (z10) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e10 = i4.e(this.A, pageblockphoto.photo_id);
            if (e10 != null) {
                pageblockphoto.thumb = FileLoader.getClosestPhotoSizeWithSize(e10.sizes, 56, true);
                pageblockphoto.thumbObject = e10;
                arrayList.add(pageBlock);
            }
        } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && i4.g(j4Var.A, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a2 = i4.a(this.A, pageblockvideo.video_id);
            if (a2 != null) {
                pageblockvideo.thumb = FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 56, true);
                pageblockvideo.thumbObject = a2;
                arrayList.add(pageBlock);
            }
        } else {
            boolean z11 = pageBlock instanceof TL_iv.pageBlockSlideshow;
            int i9 = 0;
            l4 l4Var = this.H;
            if (z11) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                int size = pageblockslideshow.items.size();
                while (i9 < size) {
                    TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i9);
                    pageBlock2.groupId = l4Var.U;
                    E(pageBlock2, j4Var);
                    i9++;
                }
                l4Var.U++;
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                int size2 = pageblockcollage.items.size();
                while (i9 < size2) {
                    TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i9);
                    pageBlock3.groupId = l4Var.U;
                    E(pageBlock3, j4Var);
                    i9++;
                }
                l4Var.U++;
            } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(((TL_iv.pageBlockCover) pageBlock).cover, j4Var);
            }
        }
    }

    public final void F(org.telegram.ui.j4 r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.F(org.telegram.ui.j4, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, int):void");
    }

    public final void G(Object obj, TL_iv.PageBlock pageBlock) {
        if (!(obj instanceof TL_iv.textEmpty)) {
            HashMap hashMap = this.f39365w;
            if (hashMap.containsKey(obj)) {
                return;
            }
            hashMap.put(obj, pageBlock);
            this.f39366x.add(obj);
        }
    }

    public final void H(int r32, f2.q1 r33, org.telegram.tgnet.tl.TL_iv.PageBlock r34, int r35, int r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.H(int, f2.q1, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean):void");
    }

    public final boolean J(z3 z3Var) {
        TL_iv.PageBlock z10 = l4.z(z3Var.f45014a);
        if (z10 instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) z10).open;
        }
        if (z10 instanceof z3) {
            z3 z3Var2 = (z3) z10;
            TL_iv.PageBlock z11 = l4.z(z3Var2.f45015b);
            if (!(z11 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) z11).open) {
                return J(z3Var2);
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
        } else if (l4.K(pageBlock)) {
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
            int i9 = 0;
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                L(null, pageblockslideshow.caption.text);
                L(null, pageblockslideshow.caption.credit);
                G(pageblockslideshow.caption.text, pageblockslideshow);
                G(pageblockslideshow.caption.credit, pageblockslideshow);
                int size = pageblockslideshow.items.size();
                while (i9 < size) {
                    K(pageblockslideshow.items.get(i9));
                    i9++;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.PageBlock pageBlock9 = (TL_iv.pageBlockPhoto) pageBlock;
                L(null, pageBlock9.caption.text);
                L(null, pageBlock9.caption.credit);
                G(pageBlock9.caption.text, pageBlock9);
                G(pageBlock9.caption.credit, pageBlock9);
            } else if (pageBlock instanceof b4) {
                b4 b4Var = (b4) pageBlock;
                TL_iv.RichText richText2 = b4Var.f36628e;
                if (richText2 != null) {
                    L(null, richText2);
                    G(b4Var.f36628e, b4Var);
                    return;
                }
                TL_iv.PageBlock pageBlock10 = b4Var.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                }
            } else if (pageBlock instanceof d4) {
                d4 d4Var = (d4) pageBlock;
                TL_iv.RichText richText3 = d4Var.f37398e;
                if (richText3 != null) {
                    L(null, richText3);
                    G(d4Var.f37398e, d4Var);
                    return;
                }
                TL_iv.PageBlock pageBlock11 = d4Var.d;
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
                while (i9 < size2) {
                    K(pageblockcollage.items.get(i9));
                    i9++;
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
                while (i9 < size3) {
                    K(pageblockdetails.blocks.get(i9));
                    i9++;
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
                for (int i10 = 0; i10 < size4; i10++) {
                    TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
                    int size5 = pagetablerow.cells.size();
                    for (int i11 = 0; i11 < size5; i11++) {
                        TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i11);
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
                for (int i9 = 0; i9 < size; i9++) {
                    L(richText2, richText2.texts.get(i9));
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
                this.h.put(lowerCase, Integer.valueOf(this.f39360e.size()));
                TL_iv.RichText richText3 = textanchor.text;
                boolean z10 = richText3 instanceof TL_iv.textPlain;
                HashMap hashMap = this.f39363r;
                if (z10) {
                    if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                        hashMap.put(lowerCase, textanchor);
                    }
                } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                    hashMap.put(lowerCase, textanchor);
                }
                this.f39362n.put(lowerCase, -1);
            }
        }
    }

    public final void M() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = this.f39360e;
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i9);
            TL_iv.PageBlock z10 = l4.z(pageBlock);
            if (!(z10 instanceof z3) || J((z3) z10)) {
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
        int i9;
        TLRPC.WebPage webPage = this.A;
        if (webPage != null && webPage.cached_page != null) {
            i9 = this.d.size();
            if (this.A.cached_page.local == null) {
                i9++;
            }
        } else {
            i9 = 0;
        }
        if (this.D) {
            return i9 + 1;
        }
        return i9;
    }

    @Override
    public final int j(int i9) {
        TL_iv.Page page;
        if (this.D) {
            if (i9 == 0) {
                return 2147483646;
            }
            i9--;
        }
        ArrayList arrayList = this.d;
        if (i9 == arrayList.size()) {
            TLRPC.WebPage webPage = this.A;
            if (webPage != null && (page = webPage.cached_page) != null && page.web) {
                return 91;
            }
            return 90;
        }
        return I((TL_iv.PageBlock) arrayList.get(i9));
    }

    @Override
    public final void l() {
        M();
        super.l();
    }

    @Override
    public final void m(int i9) {
        M();
        super.m(i9);
    }

    @Override
    public final void p(int i9, int i10) {
        M();
        super.p(i9, i10);
    }

    @Override
    public final void q(int i9, int i10) {
        M();
        super.q(i9, i10);
    }

    @Override
    public final void r(int i9, int i10, Object obj) {
        M();
        super.r(i9, i10, obj);
    }

    @Override
    public final void s(int i9, int i10) {
        M();
        super.s(i9, i10);
    }

    @Override
    public final void t(int i9, int i10) {
        M();
        super.t(i9, i10);
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        if (this.D) {
            i9--;
        }
        int i10 = i9;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                H(q1Var.f5505f, q1Var, (TL_iv.PageBlock) arrayList.get(i10), i10, arrayList.size(), false);
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        TextView textView;
        View a3Var;
        Context context = this.f39359c;
        if (i9 != 2147483646) {
            l4 l4Var = this.H;
            switch (i9) {
                case 0:
                    textView = new e2(context, l4Var, this);
                    break;
                case 1:
                    textView = new y1(context, l4Var, this);
                    break;
                case 2:
                    textView = new p1(context);
                    break;
                case 3:
                    textView = new v1(l4Var, context, this);
                    break;
                case 4:
                    textView = new v2(context, l4Var, this);
                    break;
                case 5:
                    a3Var = new a3(context, l4Var, this, 0);
                    textView = a3Var;
                    break;
                case 6:
                    textView = new k2(context, l4Var, this);
                    break;
                case 7:
                    textView = new e1(context, l4Var, this);
                    break;
                case 8:
                    textView = new t2(l4Var, context, this);
                    break;
                case 9:
                    a3Var = new f2(context, l4Var, this, 0);
                    textView = a3Var;
                    break;
                case 10:
                    textView = new d1(context, l4Var, this);
                    break;
                case 11:
                    textView = new y2(context, l4Var, this);
                    break;
                case 12:
                    textView = new a2(context, l4Var, this);
                    break;
                case 13:
                    textView = new x1(context, l4Var, this);
                    break;
                case 14:
                    textView = new j2(context, l4Var, this);
                    break;
                case 15:
                    textView = new u2(context, l4Var, this);
                    break;
                case 16:
                    textView = new w1(context, l4Var, this);
                    break;
                case 17:
                    textView = new m1(l4Var, context, this);
                    break;
                case 18:
                    a3Var = new f1(context, l4Var, this, 0);
                    textView = a3Var;
                    break;
                case 19:
                    textView = new c1(context, l4Var, this);
                    break;
                case 20:
                    textView = new z1(context, l4Var, this);
                    break;
                case 21:
                    textView = new d2(context, l4Var, this);
                    break;
                case 22:
                    textView = new b2(context, l4Var, this);
                    break;
                case 23:
                    textView = new l2(context, l4Var, this);
                    break;
                case 24:
                    textView = new o1(context, l4Var, this);
                    break;
                case 25:
                    textView = new x2(context, l4Var, this);
                    break;
                case 26:
                    textView = new m2(context, l4Var, this);
                    break;
                case 27:
                    View view = new View(context);
                    new RectF();
                    view.setImportantForAccessibility(2);
                    textView = view;
                    break;
                case 28:
                    textView = new n2(context, l4Var);
                    break;
                default:
                    switch (i9) {
                        case 90:
                            a3Var = new s3(l4Var, context, false);
                            textView = a3Var;
                            break;
                        case 91:
                            textView = new s3(l4Var, context, true);
                            break;
                        case 92:
                            textView = new c2(context, l4Var);
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
            View anVar = new org.telegram.ui.Components.an(context, 9);
            anVar.setImportantForAccessibility(2);
            textView = anVar;
        }
        textView.setLayoutParams(new f2.a1(-1, -2));
        textView.setFocusable(true);
        return new f2.q1(textView);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        int i9;
        int i10 = q1Var.f5505f;
        if (i10 != 90 && i10 != 91) {
            return;
        }
        s3 s3Var = (s3) q1Var.f5501a;
        TL_iv.Page page = this.A.cached_page;
        if (page != null) {
            i9 = page.views;
        } else {
            i9 = 0;
        }
        l4 l4Var = s3Var.f42547e;
        TextView textView = s3Var.f42544a;
        TextView textView2 = s3Var.f42545b;
        if (i9 == 0) {
            s3Var.f42546c = false;
            textView2.setVisibility(8);
            textView.setGravity(17);
        } else {
            s3Var.f42546c = true;
            textView2.setVisibility(0);
            textView.setGravity(21);
            textView2.setText(LocaleController.formatPluralStringComma("Views", i9));
        }
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.M6, false);
        textView.setTextColor(l4Var.a());
        textView2.setTextColor(l4Var.a());
        textView.setBackgroundColor(Color.argb(34, Color.red(w02), Color.green(w02), Color.blue(w02)));
    }
}
