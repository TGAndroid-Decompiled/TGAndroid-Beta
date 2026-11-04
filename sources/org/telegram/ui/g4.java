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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g4 extends org.telegram.ui.Components.sj0 {
    public TLRPC.WebPage F;
    public TL_iv.pageBlockChannel G;
    public boolean H;
    public int I;
    public final boolean J;
    public int[] K;
    public int L;
    public final i4 N;
    public final Context f45515c;
    public final ArrayList d = new ArrayList();
    public final ArrayList f45516e = new ArrayList();
    public final ArrayList f45517f = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap f45518n = new HashMap();
    public final HashMap f45519r = new HashMap();
    public final HashMap f45520s = new HashMap();
    public final ArrayList f45521w = new ArrayList();
    public final HashMap f45522x = new HashMap();
    public final ArrayList f45523y = new ArrayList();
    public final HashMap E = new HashMap();
    public final xp0 M = new xp0(this, 11);

    public g4(i4 i4Var, Context context, boolean z10) {
        this.N = i4Var;
        this.f45515c = context;
        this.J = z10;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockHeader) && !i4.I(pageBlock)) {
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
            if (pageBlock instanceof x3) {
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
            if (pageBlock instanceof z3) {
                return 21;
            }
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return 22;
            }
            if (pageBlock instanceof b4) {
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
            if (pageBlock instanceof c4) {
                return 28;
            }
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return 92;
            }
            if (pageBlock instanceof v3) {
                return I(((v3) pageBlock).f50370b);
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                return I(((TL_iv.pageBlockCover) pageBlock).cover);
            }
            return 100;
        }
        return 1;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 23 && i3 != 24) {
            return false;
        }
        return true;
    }

    public final void E(TL_iv.PageBlock pageBlock, g4 g4Var) {
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f45517f;
        int i3 = 0;
        if (z10) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e10 = e4.e(this.F, pageblockphoto.photo_id);
            if (e10 != null) {
                pageblockphoto.thumb = org.telegram.messenger.w7.w(e10.sizes, 56, true, null, false);
                pageblockphoto.thumbObject = e10;
                arrayList.add(pageBlock);
            }
        } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && e4.g(g4Var.F, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a10 = e4.a(this.F, pageblockvideo.video_id);
            if (a10 != null) {
                pageblockvideo.thumb = org.telegram.messenger.w7.w(a10.thumbs, 56, true, null, false);
                pageblockvideo.thumbObject = a10;
                arrayList.add(pageBlock);
            }
        } else {
            boolean z11 = pageBlock instanceof TL_iv.pageBlockSlideshow;
            i4 i4Var = this.N;
            if (z11) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                int size = pageblockslideshow.items.size();
                while (i3 < size) {
                    TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i3);
                    pageBlock2.groupId = i4Var.Z;
                    E(pageBlock2, g4Var);
                    i3++;
                }
                i4Var.Z++;
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                int size2 = pageblockcollage.items.size();
                while (i3 < size2) {
                    TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i3);
                    pageBlock3.groupId = i4Var.Z;
                    E(pageBlock3, g4Var);
                    i3++;
                }
                i4Var.Z++;
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
            HashMap hashMap = this.f45522x;
            if (hashMap.containsKey(obj)) {
                return;
            }
            hashMap.put(obj, pageBlock);
            this.f45523y.add(obj);
        }
    }

    public final void H(int r31, u4.d1 r32, org.telegram.tgnet.tl.TL_iv.PageBlock r33, int r34, int r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.H(int, u4.d1, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean):void");
    }

    public final boolean J(v3 v3Var) {
        TL_iv.PageBlock x10 = i4.x(v3Var.f50369a);
        if (x10 instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) x10).open;
        }
        if (x10 instanceof v3) {
            v3 v3Var2 = (v3) x10;
            TL_iv.PageBlock x11 = i4.x(v3Var2.f50370b);
            if (!(x11 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) x11).open) {
                return J(v3Var2);
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
        } else if (i4.I(pageBlock)) {
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
            int i3 = 0;
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                L(null, pageblockslideshow.caption.text);
                L(null, pageblockslideshow.caption.credit);
                G(pageblockslideshow.caption.text, pageblockslideshow);
                G(pageblockslideshow.caption.credit, pageblockslideshow);
                int size = pageblockslideshow.items.size();
                while (i3 < size) {
                    K(pageblockslideshow.items.get(i3));
                    i3++;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.PageBlock pageBlock9 = (TL_iv.pageBlockPhoto) pageBlock;
                L(null, pageBlock9.caption.text);
                L(null, pageBlock9.caption.credit);
                G(pageBlock9.caption.text, pageBlock9);
                G(pageBlock9.caption.credit, pageBlock9);
            } else if (pageBlock instanceof x3) {
                x3 x3Var = (x3) pageBlock;
                TL_iv.RichText richText2 = x3Var.f51707e;
                if (richText2 != null) {
                    L(null, richText2);
                    G(x3Var.f51707e, x3Var);
                    return;
                }
                TL_iv.PageBlock pageBlock10 = x3Var.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                }
            } else if (pageBlock instanceof z3) {
                z3 z3Var = (z3) pageBlock;
                TL_iv.RichText richText3 = z3Var.f52519e;
                if (richText3 != null) {
                    L(null, richText3);
                    G(z3Var.f52519e, z3Var);
                    return;
                }
                TL_iv.PageBlock pageBlock11 = z3Var.d;
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
                while (i3 < size2) {
                    K(pageblockcollage.items.get(i3));
                    i3++;
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
                while (i3 < size3) {
                    K(pageblockdetails.blocks.get(i3));
                    i3++;
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
                for (int i3 = 0; i3 < size; i3++) {
                    L(richText2, richText2.texts.get(i3));
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
                this.h.put(lowerCase, Integer.valueOf(this.f45516e.size()));
                TL_iv.RichText richText3 = textanchor.text;
                boolean z10 = richText3 instanceof TL_iv.textPlain;
                HashMap hashMap = this.f45519r;
                if (z10) {
                    if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                        hashMap.put(lowerCase, textanchor);
                    }
                } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                    hashMap.put(lowerCase, textanchor);
                }
                this.f45518n.put(lowerCase, -1);
            }
        }
    }

    public final void M() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = this.f45516e;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i3);
            TL_iv.PageBlock x10 = i4.x(pageBlock);
            if (!(x10 instanceof v3) || J((v3) x10)) {
                arrayList.add(pageBlock);
            }
        }
        if (arrayList.size() < 100) {
            Utilities.f21387e.a(this.M);
            Utilities.f21387e.e(this.M, 100L);
        }
    }

    @Override
    public final int b() {
        int i3;
        TLRPC.WebPage webPage = this.F;
        if (webPage != null && webPage.cached_page != null) {
            i3 = this.d.size();
            if (this.F.cached_page.local == null) {
                i3++;
            }
        } else {
            i3 = 0;
        }
        if (this.J) {
            return i3 + 1;
        }
        return i3;
    }

    @Override
    public final int d(int i3) {
        TL_iv.Page page;
        if (this.J) {
            if (i3 == 0) {
                return 2147483646;
            }
            i3--;
        }
        ArrayList arrayList = this.d;
        if (i3 == arrayList.size()) {
            TLRPC.WebPage webPage = this.F;
            if (webPage != null && (page = webPage.cached_page) != null && page.web) {
                return 91;
            }
            return 90;
        }
        return I((TL_iv.PageBlock) arrayList.get(i3));
    }

    @Override
    public final void f() {
        M();
        super.f();
    }

    @Override
    public final void g(int i3) {
        M();
        super.g(i3);
    }

    @Override
    public final void j(int i3, int i10) {
        M();
        super.j(i3, i10);
    }

    @Override
    public final void k(int i3, int i10) {
        M();
        super.k(i3, i10);
    }

    @Override
    public final void n(int i3, int i10, Object obj) {
        M();
        super.n(i3, i10, obj);
    }

    @Override
    public final void o(int i3, int i10) {
        M();
        super.o(i3, i10);
    }

    @Override
    public final void p(int i3, int i10) {
        M();
        super.p(i3, i10);
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        if (this.J) {
            i3--;
        }
        int i10 = i3;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                H(d1Var.f55544f, d1Var, (TL_iv.PageBlock) arrayList.get(i10), i10, arrayList.size(), false);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        TextView textView;
        View w2Var;
        Context context = this.f45515c;
        if (i3 != 2147483646) {
            i4 i4Var = this.N;
            switch (i3) {
                case 0:
                    textView = new a2(context, i4Var, this);
                    break;
                case 1:
                    textView = new u1(context, i4Var, this);
                    break;
                case 2:
                    textView = new l1(context);
                    break;
                case 3:
                    textView = new r1(i4Var, context, this);
                    break;
                case 4:
                    textView = new r2(context, i4Var, this);
                    break;
                case 5:
                    w2Var = new w2(context, i4Var, this, 0);
                    textView = w2Var;
                    break;
                case 6:
                    textView = new g2(context, i4Var, this);
                    break;
                case 7:
                    textView = new a1(context, i4Var, this);
                    break;
                case 8:
                    textView = new p2(i4Var, context, this);
                    break;
                case 9:
                    w2Var = new b2(context, i4Var, this, 0);
                    textView = w2Var;
                    break;
                case 10:
                    textView = new z0(context, i4Var, this);
                    break;
                case 11:
                    textView = new u2(context, i4Var, this);
                    break;
                case 12:
                    textView = new w1(context, i4Var, this);
                    break;
                case 13:
                    textView = new t1(context, i4Var, this);
                    break;
                case 14:
                    textView = new f2(context, i4Var, this);
                    break;
                case 15:
                    textView = new q2(context, i4Var, this);
                    break;
                case 16:
                    textView = new s1(context, i4Var, this);
                    break;
                case 17:
                    textView = new i1(i4Var, context, this);
                    break;
                case 18:
                    w2Var = new b1(context, i4Var, this, 0);
                    textView = w2Var;
                    break;
                case 19:
                    textView = new y0(context, i4Var, this);
                    break;
                case 20:
                    textView = new v1(context, i4Var, this);
                    break;
                case 21:
                    textView = new z1(context, i4Var, this);
                    break;
                case 22:
                    textView = new x1(context, i4Var, this);
                    break;
                case 23:
                    textView = new h2(context, i4Var, this);
                    break;
                case 24:
                    textView = new k1(context, i4Var, this);
                    break;
                case 25:
                    textView = new t2(context, i4Var, this);
                    break;
                case 26:
                    textView = new i2(context, i4Var, this);
                    break;
                case 27:
                    View view = new View(context);
                    new RectF();
                    view.setImportantForAccessibility(2);
                    textView = view;
                    break;
                case 28:
                    textView = new j2(context, i4Var);
                    break;
                default:
                    switch (i3) {
                        case 90:
                            w2Var = new o3(i4Var, context, false);
                            textView = w2Var;
                            break;
                        case 91:
                            textView = new o3(i4Var, context, true);
                            break;
                        case 92:
                            textView = new y1(context, i4Var);
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
            View smVar = new org.telegram.ui.Components.sm(context, 8);
            smVar.setImportantForAccessibility(2);
            textView = smVar;
        }
        textView.setLayoutParams(new u4.p0(-1, -2));
        textView.setFocusable(true);
        return new u4.d1(textView);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        int i3;
        int i10 = d1Var.f55544f;
        if (i10 != 90 && i10 != 91) {
            return;
        }
        o3 o3Var = (o3) d1Var.f55540a;
        TL_iv.Page page = this.F.cached_page;
        if (page != null) {
            i3 = page.views;
        } else {
            i3 = 0;
        }
        TextView textView = o3Var.f48176b;
        TextView textView2 = o3Var.f48175a;
        if (i3 == 0) {
            o3Var.f48177c = false;
            textView.setVisibility(8);
            textView2.setGravity(17);
        } else {
            o3Var.f48177c = true;
            textView.setVisibility(0);
            textView2.setGravity(21);
            textView.setText(org.telegram.messenger.bd.H(',', "Views", i3));
        }
        int i11 = org.telegram.ui.ActionBar.k6.M6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.f28273y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        textView2.setBackgroundColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
        org.telegram.ui.ActionBar.r6.V(textView2, i12, null);
        org.telegram.ui.ActionBar.r6.V(textView, i12, null);
        org.telegram.ui.ActionBar.r6.j(textView2, org.telegram.ui.ActionBar.r6.h(i11, 34), null);
    }
}
