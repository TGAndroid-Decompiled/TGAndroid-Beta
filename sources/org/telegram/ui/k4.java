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
public final class k4 extends org.telegram.ui.Components.il0 {
    public TLRPC.WebPage A;
    public TL_iv.pageBlockChannel B;
    public boolean C;
    public final boolean D;
    public int[] E;
    public int F;
    public final m4 H;
    public final Context f39740c;
    public final ArrayList d = new ArrayList();
    public final ArrayList f39741e = new ArrayList();
    public final ArrayList f39742f = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap f39743n = new HashMap();
    public final HashMap f39744r = new HashMap();
    public final HashMap f39745s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final HashMap f39746w = new HashMap();
    public final ArrayList f39747x = new ArrayList();
    public final HashMap f39748y = new HashMap();
    public final it0 G = new it0(this, 11);

    public k4(m4 m4Var, Context context, boolean z10) {
        this.H = m4Var;
        this.f39740c = context;
        this.D = z10;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockHeader) && !m4.K(pageBlock)) {
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
                return I(((a4) pageBlock).f36419b);
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                return I(((TL_iv.pageBlockCover) pageBlock).cover);
            }
            return 100;
        }
        return 1;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 23 && i10 != 24) {
            return false;
        }
        return true;
    }

    public final void E(TL_iv.PageBlock pageBlock, k4 k4Var) {
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f39742f;
        if (z10) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e10 = j4.e(this.A, pageblockphoto.photo_id);
            if (e10 != null) {
                pageblockphoto.thumb = FileLoader.getClosestPhotoSizeWithSize(e10.sizes, 56, true);
                pageblockphoto.thumbObject = e10;
                arrayList.add(pageBlock);
            }
        } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && j4.g(k4Var.A, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a2 = j4.a(this.A, pageblockvideo.video_id);
            if (a2 != null) {
                pageblockvideo.thumb = FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 56, true);
                pageblockvideo.thumbObject = a2;
                arrayList.add(pageBlock);
            }
        } else {
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
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                int size2 = pageblockcollage.items.size();
                while (i10 < size2) {
                    TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i10);
                    pageBlock3.groupId = m4Var.U;
                    E(pageBlock3, k4Var);
                    i10++;
                }
                m4Var.U++;
            } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(((TL_iv.pageBlockCover) pageBlock).cover, k4Var);
            }
        }
    }

    public final void F(org.telegram.ui.k4 r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k4.F(org.telegram.ui.k4, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, int):void");
    }

    public final void G(Object obj, TL_iv.PageBlock pageBlock) {
        if (!(obj instanceof TL_iv.textEmpty)) {
            HashMap hashMap = this.f39746w;
            if (hashMap.containsKey(obj)) {
                return;
            }
            hashMap.put(obj, pageBlock);
            this.f39747x.add(obj);
        }
    }

    public final void H(int r32, f2.n1 r33, org.telegram.tgnet.tl.TL_iv.PageBlock r34, int r35, int r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k4.H(int, f2.n1, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean):void");
    }

    public final boolean J(a4 a4Var) {
        TL_iv.PageBlock z10 = m4.z(a4Var.f36418a);
        if (z10 instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) z10).open;
        }
        if (z10 instanceof a4) {
            a4 a4Var2 = (a4) z10;
            TL_iv.PageBlock z11 = m4.z(a4Var2.f36419b);
            if (!(z11 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) z11).open) {
                return J(a4Var2);
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
        } else if (m4.K(pageBlock)) {
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
            } else if (pageBlock instanceof c4) {
                c4 c4Var = (c4) pageBlock;
                TL_iv.RichText richText2 = c4Var.f36984e;
                if (richText2 != null) {
                    L(null, richText2);
                    G(c4Var.f36984e, c4Var);
                    return;
                }
                TL_iv.PageBlock pageBlock10 = c4Var.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                }
            } else if (pageBlock instanceof e4) {
                e4 e4Var = (e4) pageBlock;
                TL_iv.RichText richText3 = e4Var.f37693e;
                if (richText3 != null) {
                    L(null, richText3);
                    G(e4Var.f37693e, e4Var);
                    return;
                }
                TL_iv.PageBlock pageBlock11 = e4Var.d;
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
                this.h.put(lowerCase, Integer.valueOf(this.f39741e.size()));
                TL_iv.RichText richText3 = textanchor.text;
                boolean z10 = richText3 instanceof TL_iv.textPlain;
                HashMap hashMap = this.f39744r;
                if (z10) {
                    if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                        hashMap.put(lowerCase, textanchor);
                    }
                } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                    hashMap.put(lowerCase, textanchor);
                }
                this.f39743n.put(lowerCase, -1);
            }
        }
    }

    public final void M() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = this.f39741e;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i10);
            TL_iv.PageBlock z10 = m4.z(pageBlock);
            if (!(z10 instanceof a4) || J((a4) z10)) {
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
        int i10;
        TLRPC.WebPage webPage = this.A;
        if (webPage != null && webPage.cached_page != null) {
            i10 = this.d.size();
            if (this.A.cached_page.local == null) {
                i10++;
            }
        } else {
            i10 = 0;
        }
        if (this.D) {
            return i10 + 1;
        }
        return i10;
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
        if (i10 == arrayList.size()) {
            TLRPC.WebPage webPage = this.A;
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
    public final void v(f2.n1 n1Var, int i10) {
        if (this.D) {
            i10--;
        }
        int i11 = i10;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                H(n1Var.f6436f, n1Var, (TL_iv.PageBlock) arrayList.get(i11), i11, arrayList.size(), false);
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        TextView textView;
        View b3Var;
        Context context = this.f39740c;
        if (i10 != 2147483646) {
            m4 m4Var = this.H;
            switch (i10) {
                case 0:
                    textView = new f2(context, m4Var, this);
                    break;
                case 1:
                    textView = new z1(context, m4Var, this);
                    break;
                case 2:
                    textView = new q1(context);
                    break;
                case 3:
                    textView = new w1(m4Var, context, this);
                    break;
                case 4:
                    textView = new w2(context, m4Var, this);
                    break;
                case 5:
                    b3Var = new b3(context, m4Var, this, 0);
                    textView = b3Var;
                    break;
                case 6:
                    textView = new l2(context, m4Var, this);
                    break;
                case 7:
                    textView = new f1(context, m4Var, this);
                    break;
                case 8:
                    textView = new u2(m4Var, context, this);
                    break;
                case 9:
                    b3Var = new g2(context, m4Var, this, 0);
                    textView = b3Var;
                    break;
                case 10:
                    textView = new e1(context, m4Var, this);
                    break;
                case 11:
                    textView = new z2(context, m4Var, this);
                    break;
                case 12:
                    textView = new b2(context, m4Var, this);
                    break;
                case 13:
                    textView = new y1(context, m4Var, this);
                    break;
                case 14:
                    textView = new k2(context, m4Var, this);
                    break;
                case 15:
                    textView = new v2(context, m4Var, this);
                    break;
                case 16:
                    textView = new x1(context, m4Var, this);
                    break;
                case 17:
                    textView = new n1(m4Var, context, this);
                    break;
                case 18:
                    b3Var = new g1(context, m4Var, this, 0);
                    textView = b3Var;
                    break;
                case 19:
                    textView = new d1(context, m4Var, this);
                    break;
                case 20:
                    textView = new a2(context, m4Var, this);
                    break;
                case 21:
                    textView = new e2(context, m4Var, this);
                    break;
                case 22:
                    textView = new c2(context, m4Var, this);
                    break;
                case 23:
                    textView = new m2(context, m4Var, this);
                    break;
                case 24:
                    textView = new p1(context, m4Var, this);
                    break;
                case 25:
                    textView = new y2(context, m4Var, this);
                    break;
                case 26:
                    textView = new n2(context, m4Var, this);
                    break;
                case 27:
                    View view = new View(context);
                    new RectF();
                    view.setImportantForAccessibility(2);
                    textView = view;
                    break;
                case 28:
                    textView = new o2(context, m4Var);
                    break;
                default:
                    switch (i10) {
                        case 90:
                            b3Var = new t3(m4Var, context, false);
                            textView = b3Var;
                            break;
                        case 91:
                            textView = new t3(m4Var, context, true);
                            break;
                        case 92:
                            textView = new d2(context, m4Var);
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
            View fnVar = new org.telegram.ui.Components.fn(context, 6);
            fnVar.setImportantForAccessibility(2);
            textView = fnVar;
        }
        textView.setLayoutParams(new f2.x0(-1, -2));
        textView.setFocusable(true);
        return new f2.n1(textView);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        int i10;
        int i11 = n1Var.f6436f;
        if (i11 != 90 && i11 != 91) {
            return;
        }
        t3 t3Var = (t3) n1Var.f6432a;
        TL_iv.Page page = this.A.cached_page;
        if (page != null) {
            i10 = page.views;
        } else {
            i10 = 0;
        }
        m4 m4Var = t3Var.f42534e;
        TextView textView = t3Var.f42531a;
        TextView textView2 = t3Var.f42532b;
        if (i10 == 0) {
            t3Var.f42533c = false;
            textView2.setVisibility(8);
            textView.setGravity(17);
        } else {
            t3Var.f42533c = true;
            textView2.setVisibility(0);
            textView.setGravity(21);
            textView2.setText(LocaleController.formatPluralStringComma("Views", i10));
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.M6, false);
        textView.setTextColor(m4Var.a());
        textView2.setTextColor(m4Var.a());
        textView.setBackgroundColor(Color.argb(34, Color.red(w02), Color.green(w02), Color.blue(w02)));
    }
}
